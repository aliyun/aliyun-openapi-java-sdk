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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAuditCallbackRequest extends RpcAcsRequest<UpdateAuditCallbackResponse> {
	   

	private String seed;

	private String callback;
	public UpdateAuditCallbackRequest() {
		super("Green", "2017-08-23", "UpdateAuditCallback", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSeed() {
		return this.seed;
	}

	public void setSeed(String seed) {
		this.seed = seed;
		if(seed != null){
			putQueryParameter("Seed", seed);
		}
	}

	public String getCallback() {
		return this.callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
		if(callback != null){
			putQueryParameter("Callback", callback);
		}
	}

	@Override
	public Class<UpdateAuditCallbackResponse> getResponseClass() {
		return UpdateAuditCallbackResponse.class;
	}

}
