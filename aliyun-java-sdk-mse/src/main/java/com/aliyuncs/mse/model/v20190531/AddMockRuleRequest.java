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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddMockRuleRequest extends RpcAcsRequest<AddMockRuleResponse> {
	   

	private String extraJson;

	private String providerAppId;

	private String source;

	private Boolean enable;

	private String scMockItems;

	private String providerAppName;

	private String consumerAppIds;

	private String dubboMockItems;

	private String name;

	private String region;
	public AddMockRuleRequest() {
		super("mse", "2019-05-31", "AddMockRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraJson() {
		return this.extraJson;
	}

	public void setExtraJson(String extraJson) {
		this.extraJson = extraJson;
		if(extraJson != null){
			putQueryParameter("ExtraJson", extraJson);
		}
	}

	public String getProviderAppId() {
		return this.providerAppId;
	}

	public void setProviderAppId(String providerAppId) {
		this.providerAppId = providerAppId;
		if(providerAppId != null){
			putQueryParameter("ProviderAppId", providerAppId);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
		}
	}

	public String getScMockItems() {
		return this.scMockItems;
	}

	public void setScMockItems(String scMockItems) {
		this.scMockItems = scMockItems;
		if(scMockItems != null){
			putQueryParameter("ScMockItems", scMockItems);
		}
	}

	public String getProviderAppName() {
		return this.providerAppName;
	}

	public void setProviderAppName(String providerAppName) {
		this.providerAppName = providerAppName;
		if(providerAppName != null){
			putQueryParameter("ProviderAppName", providerAppName);
		}
	}

	public String getConsumerAppIds() {
		return this.consumerAppIds;
	}

	public void setConsumerAppIds(String consumerAppIds) {
		this.consumerAppIds = consumerAppIds;
		if(consumerAppIds != null){
			putQueryParameter("ConsumerAppIds", consumerAppIds);
		}
	}

	public String getDubboMockItems() {
		return this.dubboMockItems;
	}

	public void setDubboMockItems(String dubboMockItems) {
		this.dubboMockItems = dubboMockItems;
		if(dubboMockItems != null){
			putQueryParameter("DubboMockItems", dubboMockItems);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<AddMockRuleResponse> getResponseClass() {
		return AddMockRuleResponse.class;
	}

}
