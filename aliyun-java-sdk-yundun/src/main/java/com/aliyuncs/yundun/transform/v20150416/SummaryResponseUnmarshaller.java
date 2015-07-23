/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.yundun.transform.v20150416;

import com.aliyuncs.yundun.model.v20150416.SummaryResponse;
import com.aliyuncs.yundun.model.v20150416.SummaryResponse.Ddos;
import com.aliyuncs.yundun.model.v20150416.SummaryResponse.BruteForce;
import com.aliyuncs.yundun.model.v20150416.SummaryResponse.Webshell;
import com.aliyuncs.yundun.model.v20150416.SummaryResponse.RemoteLogin;
import com.aliyuncs.yundun.model.v20150416.SummaryResponse.WebAttack;
import com.aliyuncs.yundun.model.v20150416.SummaryResponse.WebLeak;
import com.aliyuncs.transform.UnmarshallerContext;


public class SummaryResponseUnmarshaller {

	public static SummaryResponse unmarshall(SummaryResponse summaryResponse, UnmarshallerContext context) {
		
		summaryResponse.setRequestId(context.stringValue("SummaryResponse.RequestId"));
		summaryResponse.setStatus(context.longValue("SummaryResponse.Status"));
		summaryResponse.setAbnormalHostCount(context.longValue("SummaryResponse.AbnormalHostCount"));

		Ddos  ddos = new Ddos();
		ddos.setCount(context.longValue("SummaryResponse.Ddos.Count"));
		ddos.setHostCount(context.longValue("SummaryResponse.Ddos.HostCount"));
		summaryResponse.setDdos(ddos);

		BruteForce  bruteForce = new BruteForce();
		bruteForce.setCount(context.longValue("SummaryResponse.BruteForce.Count"));
		bruteForce.setHostCount(context.longValue("SummaryResponse.BruteForce.HostCount"));
		summaryResponse.setBruteForce(bruteForce);

		Webshell  webshell = new Webshell();
		webshell.setCount(context.longValue("SummaryResponse.Webshell.Count"));
		webshell.setHostCount(context.longValue("SummaryResponse.Webshell.HostCount"));
		summaryResponse.setWebshell(webshell);

		RemoteLogin  remoteLogin = new RemoteLogin();
		remoteLogin.setCount(context.longValue("SummaryResponse.RemoteLogin.Count"));
		remoteLogin.setHostCount(context.longValue("SummaryResponse.RemoteLogin.HostCount"));
		summaryResponse.setRemoteLogin(remoteLogin);

		WebAttack  webAttack = new WebAttack();
		webAttack.setCount(context.longValue("SummaryResponse.WebAttack.Count"));
		webAttack.setHostCount(context.longValue("SummaryResponse.WebAttack.HostCount"));
		summaryResponse.setWebAttack(webAttack);

		WebLeak  webLeak = new WebLeak();
		webLeak.setCount(context.longValue("SummaryResponse.WebLeak.Count"));
		webLeak.setHostCount(context.longValue("SummaryResponse.WebLeak.HostCount"));
		summaryResponse.setWebLeak(webLeak);
	 
	 	return summaryResponse;
	}
}