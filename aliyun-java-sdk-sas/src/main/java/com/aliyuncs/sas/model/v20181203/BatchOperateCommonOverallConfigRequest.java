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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchOperateCommonOverallConfigRequest extends RpcAcsRequest<BatchOperateCommonOverallConfigResponse> {
	   

	private List<String> typeLists;

	private String config;
	public BatchOperateCommonOverallConfigRequest() {
		super("Sas", "2018-12-03", "BatchOperateCommonOverallConfig", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getTypeLists() {
		return this.typeLists;
	}

	public void setTypeLists(List<String> typeLists) {
		this.typeLists = typeLists;	
		if (typeLists != null) {
			for (int i = 0; i < typeLists.size(); i++) {
				putQueryParameter("TypeList." + (i + 1) , typeLists.get(i));
			}
		}	
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putQueryParameter("Config", config);
		}
	}

	@Override
	public Class<BatchOperateCommonOverallConfigResponse> getResponseClass() {
		return BatchOperateCommonOverallConfigResponse.class;
	}

}
