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
public class UpdateMockRuleRequest extends RoaAcsRequest<UpdateMockRuleResponse> {
	   

	private String scMockItemJson;

	private String dubboMockItemJson;

	private String extraJson;

	private String name;

	private String id;

	private String region;
	public UpdateMockRuleRequest() {
		super("Edas", "2017-08-01", "UpdateMockRule", "Edas");
		setUriPattern("/pop/sp/api/mock/updateMockRule");
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
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
	public Class<UpdateMockRuleResponse> getResponseClass() {
		return UpdateMockRuleResponse.class;
	}

}
