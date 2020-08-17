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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeMyCatDbListRequest extends RpcAcsRequest<DescribeMyCatDbListResponse> {
	   

	private String schemaUrl;

	private String ruleUrl;
	public DescribeMyCatDbListRequest() {
		super("Drds", "2019-01-23", "DescribeMyCatDbList", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSchemaUrl() {
		return this.schemaUrl;
	}

	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
		if(schemaUrl != null){
			putQueryParameter("SchemaUrl", schemaUrl);
		}
	}

	public String getRuleUrl() {
		return this.ruleUrl;
	}

	public void setRuleUrl(String ruleUrl) {
		this.ruleUrl = ruleUrl;
		if(ruleUrl != null){
			putQueryParameter("RuleUrl", ruleUrl);
		}
	}

	@Override
	public Class<DescribeMyCatDbListResponse> getResponseClass() {
		return DescribeMyCatDbListResponse.class;
	}

}
