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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RenewChangeInstanceRequest extends RpcAcsRequest<RenewChangeInstanceResponse> {
	   

	private String productCode;

	private String clientToken;

	private String productType;

	private String instanceId;

	private Long renewPeriod;

	private List<Parameter> parameters;
	public RenewChangeInstanceRequest() {
		super("BssOpenApi", "2017-12-14", "RenewChangeInstance", "bssopenapi");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
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

	public Long getRenewPeriod() {
		return this.renewPeriod;
	}

	public void setRenewPeriod(Long renewPeriod) {
		this.renewPeriod = renewPeriod;
		if(renewPeriod != null){
			putQueryParameter("RenewPeriod", renewPeriod.toString());
		}
	}

	public List<Parameter> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;	
		if (parameters != null) {
			for (int depth1 = 0; depth1 < parameters.size(); depth1++) {
				putQueryParameter("Parameter." + (depth1 + 1) + ".Code" , parameters.get(depth1).getCode());
				putQueryParameter("Parameter." + (depth1 + 1) + ".Value" , parameters.get(depth1).getValue());
			}
		}	
	}

	public static class Parameter {

		private String code;

		private String value;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<RenewChangeInstanceResponse> getResponseClass() {
		return RenewChangeInstanceResponse.class;
	}

}
