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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.DescribePricingModuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePricingModuleResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Module> moduleList;

		private List<Attribute> attributeList;

		public List<Module> getModuleList() {
			return this.moduleList;
		}

		public void setModuleList(List<Module> moduleList) {
			this.moduleList = moduleList;
		}

		public List<Attribute> getAttributeList() {
			return this.attributeList;
		}

		public void setAttributeList(List<Attribute> attributeList) {
			this.attributeList = attributeList;
		}

		public static class Module {

			private String moduleCode;

			private String moduleName;

			private String priceType;

			private String currency;

			private List<String> configList;

			public String getModuleCode() {
				return this.moduleCode;
			}

			public void setModuleCode(String moduleCode) {
				this.moduleCode = moduleCode;
			}

			public String getModuleName() {
				return this.moduleName;
			}

			public void setModuleName(String moduleName) {
				this.moduleName = moduleName;
			}

			public String getPriceType() {
				return this.priceType;
			}

			public void setPriceType(String priceType) {
				this.priceType = priceType;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public List<String> getConfigList() {
				return this.configList;
			}

			public void setConfigList(List<String> configList) {
				this.configList = configList;
			}
		}

		public static class Attribute {

			private String code;

			private String name;

			private String unit;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}
		}
	}

	@Override
	public DescribePricingModuleResponse getInstance(UnmarshallerContext context) {
		return	DescribePricingModuleResponseUnmarshaller.unmarshall(this, context);
	}
}
