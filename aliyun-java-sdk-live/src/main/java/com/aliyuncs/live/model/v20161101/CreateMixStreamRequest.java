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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMixStreamRequest extends RpcAcsRequest<CreateMixStreamResponse> {
	   

	private String outputConfig;

	private String layoutId;

	private String domainName;

	private String inputStreamList;

	private Long ownerId;

	private String callbackConfig;
	public CreateMixStreamRequest() {
		super("live", "2016-11-01", "CreateMixStream", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOutputConfig() {
		return this.outputConfig;
	}

	public void setOutputConfig(String outputConfig) {
		this.outputConfig = outputConfig;
		if(outputConfig != null){
			putQueryParameter("OutputConfig", outputConfig);
		}
	}

	public String getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
		if(layoutId != null){
			putQueryParameter("LayoutId", layoutId);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getInputStreamList() {
		return this.inputStreamList;
	}

	public void setInputStreamList(String inputStreamList) {
		this.inputStreamList = inputStreamList;
		if(inputStreamList != null){
			putQueryParameter("InputStreamList", inputStreamList);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getCallbackConfig() {
		return this.callbackConfig;
	}

	public void setCallbackConfig(String callbackConfig) {
		this.callbackConfig = callbackConfig;
		if(callbackConfig != null){
			putQueryParameter("CallbackConfig", callbackConfig);
		}
	}

	@Override
	public Class<CreateMixStreamResponse> getResponseClass() {
		return CreateMixStreamResponse.class;
	}

}
