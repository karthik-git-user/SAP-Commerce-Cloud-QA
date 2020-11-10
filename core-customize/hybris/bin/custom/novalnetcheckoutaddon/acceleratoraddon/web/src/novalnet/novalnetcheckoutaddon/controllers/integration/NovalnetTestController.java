/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package novalnet.novalnetcheckoutaddon.controllers.integration;

import de.hybris.platform.acceleratorservices.payment.PaymentService;
import de.hybris.platform.yacceleratorstorefront.controllers.integration.BaseIntegrationController;
//~ import de.hybris.platform.sap.core.odata.util.ODataClientService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpHeaders;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.Date;
import java.util.regex.*;
import java.text.DecimalFormat;
import java.math.*;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;

import org.json.JSONObject;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Set;
import java.security.MessageDigest;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

import org.springframework.web.method.HandlerMethod;

import de.hybris.platform.util.localization.Localization;
import de.hybris.platform.store.BaseStoreModel;
import de.hybris.platform.addonsupport.interceptors.BeforeControllerHandlerAdaptee;
import de.hybris.platform.util.Config;
import org.apache.log4j.Logger;
import novalnet.novalnetcheckoutaddon.facades.NovalnetFacade;
import de.hybris.novalnet.core.model.NovalnetCallbackInfoModel;
import de.hybris.novalnet.core.model.NovalnetPaymentInfoModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.UserService;

import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * Controller to handle merchant callbacks from a subscription provider
 */
@Controller
public class NovalnetTestController extends BaseIntegrationController
{
	private static final Logger LOG = Logger.getLogger(NovalnetTestController.class);
	@Resource(name = "acceleratorPaymentService")
	private PaymentService acceleratorPaymentService;
	
	private boolean testMode = false;

    @Resource(name = "novalnetFacade")
    NovalnetFacade novalnetFacade;


	@RequestMapping(value = "/integration/test/novalnet", method = RequestMethod.POST)
	public boolean handleCallback(final HttpServletRequest request, final HttpServletResponse response)
	{
		System.out.println("============================== came in 1 ==================================");
		return true;
	}
	
	@RequestMapping(value = "/integration/test/novalnet", method = RequestMethod.GET)
	public void processPost(final HttpServletRequest request, final HttpServletResponse response)
	{
		System.out.println("============================== came in 2 ==================================");
		response.setStatus(HttpServletResponse.SC_OK);
	}
}
