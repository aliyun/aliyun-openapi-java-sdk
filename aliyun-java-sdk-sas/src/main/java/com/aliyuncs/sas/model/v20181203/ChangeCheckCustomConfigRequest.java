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
public class ChangeCheckCustomConfigRequest extends RpcAcsRequest<ChangeCheckCustomConfigResponse> {
	   

	private Long checkId;

	private List<CustomConfigs> customConfigss;
	public ChangeCheckCustomConfigRequest() {
		super("Sas", "2018-12-03", "ChangeCheckCustomConfig");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getCheckId() {
		return this.checkId;
	}

	public void setCheckId(Long checkId) {
		this.checkId = checkId;
		if(checkId != null){
			putQueryParameter("CheckId", checkId.toString());
		}
	}

	public List<CustomConfigs> getCustomConfigss() {
		return this.customConfigss;
	}

	public void setCustomConfigss(List<CustomConfigs> customConfigss) {
		this.customConfigss = customConfigss;	
		if (customConfigss != null) {
			for (int depth1 = 0; depth1 < customConfigss.size(); depth1++) {
				putQueryParameter("CustomConfigs." + (depth1 + 1) + ".Name" , customConfigss.get(depth1).getName());
				putQueryParameter("CustomConfigs." + (depth1 + 1) + ".Value" , customConfigss.get(depth1).getValue());
				putQueryParameter("CustomConfigs." + (depth1 + 1) + ".Operation" , customConfigss.get(depth1).getOperation());
			}
		}	
	}

	public static class CustomConfigs {

		private String name;

		private String value;

		private String operation;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}
	}

	@Override
	public Class<ChangeCheckCustomConfigResponse> getResponseClass() {
		return ChangeCheckCustomConfigResponse.class;
	}

}
