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
package com.aliyuncs.green.model.v20161206;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PluginAntispamFeedbackRequest extends RpcAcsRequest<PluginAntispamFeedbackResponse> {
	
	public PluginAntispamFeedbackRequest() {
		super("Green", "2016-12-06", "PluginAntispamFeedback", "green");
		setMethod(MethodType.POST);
	}

	private String clientVersion;

	private String actionResult;

	private List<String> idss;

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		putQueryParameter("ClientVersion", clientVersion);
	}

	public String getActionResult() {
		return this.actionResult;
	}

	public void setActionResult(String actionResult) {
		this.actionResult = actionResult;
		putQueryParameter("ActionResult", actionResult);
	}

	public List<String> getIdss() {
		return this.idss;
	}

	public void setIdss(List<String> idss) {
		this.idss = idss;	
		for (int i = 0; i < idss.size(); i++) {
			putQueryParameter("Ids." + (i + 1) , idss.get(i));
		}	
	}

	@Override
	public Class<PluginAntispamFeedbackResponse> getResponseClass() {
		return PluginAntispamFeedbackResponse.class;
	}

}
