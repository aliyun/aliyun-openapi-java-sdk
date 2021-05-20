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

package com.aliyuncs.quotas.model.v20200510;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quotas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetProductQuotaDimensionRequest extends RpcAcsRequest<GetProductQuotaDimensionResponse> {
	   

	private String productCode;

	private List<DependentDimensions> dependentDimensionss;

	private String dimensionKey;
	public GetProductQuotaDimensionRequest() {
		super("quotas", "2020-05-10", "GetProductQuotaDimension", "quotas");
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
			putBodyParameter("ProductCode", productCode);
		}
	}

	public List<DependentDimensions> getDependentDimensionss() {
		return this.dependentDimensionss;
	}

	public void setDependentDimensionss(List<DependentDimensions> dependentDimensionss) {
		this.dependentDimensionss = dependentDimensionss;	
		if (dependentDimensionss != null) {
			for (int depth1 = 0; depth1 < dependentDimensionss.size(); depth1++) {
				putBodyParameter("DependentDimensions." + (depth1 + 1) + ".Key" , dependentDimensionss.get(depth1).getKey());
				putBodyParameter("DependentDimensions." + (depth1 + 1) + ".Value" , dependentDimensionss.get(depth1).getValue());
			}
		}	
	}

	public String getDimensionKey() {
		return this.dimensionKey;
	}

	public void setDimensionKey(String dimensionKey) {
		this.dimensionKey = dimensionKey;
		if(dimensionKey != null){
			putBodyParameter("DimensionKey", dimensionKey);
		}
	}

	public static class DependentDimensions {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<GetProductQuotaDimensionResponse> getResponseClass() {
		return GetProductQuotaDimensionResponse.class;
	}

}
