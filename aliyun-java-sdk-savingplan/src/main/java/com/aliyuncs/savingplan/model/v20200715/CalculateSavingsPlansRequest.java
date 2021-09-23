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

package com.aliyuncs.savingplan.model.v20200715;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CalculateSavingsPlansRequest extends RpcAcsRequest<CalculateSavingsPlansResponse> {
	   

	private String fromAppCode;

	private List<Instance> instances;

	private String specCode;

	private String requestId;

	private String payMode;

	private String fromAppName;

	private String spnType;

	private String commodityCode;

	private String cycle;

	private String userId;
	public CalculateSavingsPlansRequest() {
		super("savingplan", "2020-07-15", "CalculateSavingsPlans", "savingplan");
		setMethod(MethodType.POST);
	}

	public String getFromAppCode() {
		return this.fromAppCode;
	}

	public void setFromAppCode(String fromAppCode) {
		this.fromAppCode = fromAppCode;
		if(fromAppCode != null){
			putQueryParameter("FromAppCode", fromAppCode);
		}
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;	
		if (instances != null) {
			for (int depth1 = 0; depth1 < instances.size(); depth1++) {
				putBodyParameter("Instance." + (depth1 + 1) + ".Quantity" , instances.get(depth1).getQuantity());
				putBodyParameter("Instance." + (depth1 + 1) + ".SpecCode" , instances.get(depth1).getSpecCode());
				if (instances.get(depth1).getModules() != null) {
					for (int depth2 = 0; depth2 < instances.get(depth1).getModules().size(); depth2++) {
						putBodyParameter("Instance." + (depth1 + 1) + ".Module." + (depth2 + 1) + ".ComponentCode" , instances.get(depth1).getModules().get(depth2).getComponentCode());
						if (instances.get(depth1).getModules().get(depth2).getPropertys() != null) {
							for (int depth3 = 0; depth3 < instances.get(depth1).getModules().get(depth2).getPropertys().size(); depth3++) {
								putBodyParameter("Instance." + (depth1 + 1) + ".Module." + (depth2 + 1) + ".Property." + (depth3 + 1) + ".Code" , instances.get(depth1).getModules().get(depth2).getPropertys().get(depth3).getCode());
								putBodyParameter("Instance." + (depth1 + 1) + ".Module." + (depth2 + 1) + ".Property." + (depth3 + 1) + ".Value" , instances.get(depth1).getModules().get(depth2).getPropertys().get(depth3).getValue());
							}
						}
					}
				}
				putBodyParameter("Instance." + (depth1 + 1) + ".CommodityCode" , instances.get(depth1).getCommodityCode());
			}
		}	
	}

	public String getSpecCode() {
		return this.specCode;
	}

	public void setSpecCode(String specCode) {
		this.specCode = specCode;
		if(specCode != null){
			putQueryParameter("SpecCode", specCode);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getPayMode() {
		return this.payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
		if(payMode != null){
			putQueryParameter("PayMode", payMode);
		}
	}

	public String getFromAppName() {
		return this.fromAppName;
	}

	public void setFromAppName(String fromAppName) {
		this.fromAppName = fromAppName;
		if(fromAppName != null){
			putQueryParameter("FromAppName", fromAppName);
		}
	}

	public String getSpnType() {
		return this.spnType;
	}

	public void setSpnType(String spnType) {
		this.spnType = spnType;
		if(spnType != null){
			putQueryParameter("SpnType", spnType);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
		if(cycle != null){
			putQueryParameter("Cycle", cycle);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public static class Instance {

		private Integer quantity;

		private String specCode;

		private List<Module> modules;

		private String commodityCode;

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getSpecCode() {
			return this.specCode;
		}

		public void setSpecCode(String specCode) {
			this.specCode = specCode;
		}

		public List<Module> getModules() {
			return this.modules;
		}

		public void setModules(List<Module> modules) {
			this.modules = modules;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public static class Module {

			private String componentCode;

			private List<Property> propertys;

			public String getComponentCode() {
				return this.componentCode;
			}

			public void setComponentCode(String componentCode) {
				this.componentCode = componentCode;
			}

			public List<Property> getPropertys() {
				return this.propertys;
			}

			public void setPropertys(List<Property> propertys) {
				this.propertys = propertys;
			}

			public static class Property {

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
		}
	}

	@Override
	public Class<CalculateSavingsPlansResponse> getResponseClass() {
		return CalculateSavingsPlansResponse.class;
	}

}
