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

package com.aliyuncs.rtc.model.v20180111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rtc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMAURuleRequest extends RpcAcsRequest<CreateMAURuleResponse> {
	   

	private String useridPrefix;

	private String channelPrefix;

	private Long ownerId;

	private Long mauTemplateId;

	private String appId;

	private String callBack;
	public CreateMAURuleRequest() {
		super("rtc", "2018-01-11", "CreateMAURule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUseridPrefix() {
		return this.useridPrefix;
	}

	public void setUseridPrefix(String useridPrefix) {
		this.useridPrefix = useridPrefix;
		if(useridPrefix != null){
			putQueryParameter("UseridPrefix", useridPrefix);
		}
	}

	public String getChannelPrefix() {
		return this.channelPrefix;
	}

	public void setChannelPrefix(String channelPrefix) {
		this.channelPrefix = channelPrefix;
		if(channelPrefix != null){
			putQueryParameter("ChannelPrefix", channelPrefix);
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

	public Long getMauTemplateId() {
		return this.mauTemplateId;
	}

	public void setMauTemplateId(Long mauTemplateId) {
		this.mauTemplateId = mauTemplateId;
		if(mauTemplateId != null){
			putQueryParameter("MauTemplateId", mauTemplateId.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getCallBack() {
		return this.callBack;
	}

	public void setCallBack(String callBack) {
		this.callBack = callBack;
		if(callBack != null){
			putQueryParameter("CallBack", callBack);
		}
	}

	@Override
	public Class<CreateMAURuleResponse> getResponseClass() {
		return CreateMAURuleResponse.class;
	}

}
