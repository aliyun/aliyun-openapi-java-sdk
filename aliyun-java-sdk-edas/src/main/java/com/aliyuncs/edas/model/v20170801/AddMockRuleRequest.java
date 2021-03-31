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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddMockRuleRequest extends RoaAcsRequest<AddMockRuleResponse> {
	   

	private String scMockItemJson;

	private String dubboMockItemJson;

	private String extraJson;

	private String providerAppId;

	private String source;

	private String providerAppName;

	private Boolean enable;

	private String name;

	private String namespace;

	private String consumerAppsJson;

	private String region;
	public AddMockRuleRequest() {
		super("Edas", "2017-08-01", "AddMockRule", "Edas");
		setUriPattern("/pop/sp/api/mock/addMockRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScMockItemJson() {
		return this.scMockItemJson;
	}

	public void setScMockItemJson(String scMockItemJson) {
		this.scMockItemJson = scMockItemJson;
		if(scMockItemJson != null){
			putQueryParameter("ScMockItemJson", scMockItemJson);
		}
	}

	public String getDubboMockItemJson() {
		return this.dubboMockItemJson;
	}

	public void setDubboMockItemJson(String dubboMockItemJson) {
		this.dubboMockItemJson = dubboMockItemJson;
		if(dubboMockItemJson != null){
			putQueryParameter("DubboMockItemJson", dubboMockItemJson);
		}
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

	public String getProviderAppName() {
		return this.providerAppName;
	}

	public void setProviderAppName(String providerAppName) {
		this.providerAppName = providerAppName;
		if(providerAppName != null){
			putQueryParameter("ProviderAppName", providerAppName);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getConsumerAppsJson() {
		return this.consumerAppsJson;
	}

	public void setConsumerAppsJson(String consumerAppsJson) {
		this.consumerAppsJson = consumerAppsJson;
		if(consumerAppsJson != null){
			putQueryParameter("ConsumerAppsJson", consumerAppsJson);
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
