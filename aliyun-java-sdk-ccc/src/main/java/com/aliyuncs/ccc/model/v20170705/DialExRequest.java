/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DialExRequest extends RpcAcsRequest<DialExResponse> {
	
	public DialExRequest() {
		super("CCC", "2017-07-05", "DialEx");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String callee;

	private String routPoint;

	private String caller;

	private String instanceId;

	private String provider;

	private Integer answerMode;

	public String getCallee() {
		return this.callee;
	}

	public void setCallee(String callee) {
		this.callee = callee;
		if(callee != null){
			putQueryParameter("Callee", callee);
		}
	}

	public String getRoutPoint() {
		return this.routPoint;
	}

	public void setRoutPoint(String routPoint) {
		this.routPoint = routPoint;
		if(routPoint != null){
			putQueryParameter("RoutPoint", routPoint);
		}
	}

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("Caller", caller);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
		if(provider != null){
			putQueryParameter("Provider", provider);
		}
	}

	public Integer getAnswerMode() {
		return this.answerMode;
	}

	public void setAnswerMode(Integer answerMode) {
		this.answerMode = answerMode;
		if(answerMode != null){
			putQueryParameter("AnswerMode", answerMode.toString());
		}
	}

	@Override
	public Class<DialExResponse> getResponseClass() {
		return DialExResponse.class;
	}

}
