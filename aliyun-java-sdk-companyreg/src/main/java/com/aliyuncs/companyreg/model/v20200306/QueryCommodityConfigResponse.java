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

package com.aliyuncs.companyreg.model.v20200306;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20200306.QueryCommodityConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCommodityConfigResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer type;

		private String commodityCode;

		private String description;

		private String protocolUrl;

		private String iconUrl;

		private String productLine;

		private String startingPrice;

		private List<CommodityModulesItem> commodityModules;

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getProtocolUrl() {
			return this.protocolUrl;
		}

		public void setProtocolUrl(String protocolUrl) {
			this.protocolUrl = protocolUrl;
		}

		public String getIconUrl() {
			return this.iconUrl;
		}

		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}

		public String getProductLine() {
			return this.productLine;
		}

		public void setProductLine(String productLine) {
			this.productLine = productLine;
		}

		public String getStartingPrice() {
			return this.startingPrice;
		}

		public void setStartingPrice(String startingPrice) {
			this.startingPrice = startingPrice;
		}

		public List<CommodityModulesItem> getCommodityModules() {
			return this.commodityModules;
		}

		public void setCommodityModules(List<CommodityModulesItem> commodityModules) {
			this.commodityModules = commodityModules;
		}

		public static class CommodityModulesItem {

			private String moduleName;

			private String lxModuleCode;

			private String moduleTip;

			private String moduleDescription;

			private String moduleUrl;

			private String moduleCode;

			private String moduleType;

			private Integer sortNumber;

			private String moduleValue;

			public String getModuleName() {
				return this.moduleName;
			}

			public void setModuleName(String moduleName) {
				this.moduleName = moduleName;
			}

			public String getLxModuleCode() {
				return this.lxModuleCode;
			}

			public void setLxModuleCode(String lxModuleCode) {
				this.lxModuleCode = lxModuleCode;
			}

			public String getModuleTip() {
				return this.moduleTip;
			}

			public void setModuleTip(String moduleTip) {
				this.moduleTip = moduleTip;
			}

			public String getModuleDescription() {
				return this.moduleDescription;
			}

			public void setModuleDescription(String moduleDescription) {
				this.moduleDescription = moduleDescription;
			}

			public String getModuleUrl() {
				return this.moduleUrl;
			}

			public void setModuleUrl(String moduleUrl) {
				this.moduleUrl = moduleUrl;
			}

			public String getModuleCode() {
				return this.moduleCode;
			}

			public void setModuleCode(String moduleCode) {
				this.moduleCode = moduleCode;
			}

			public String getModuleType() {
				return this.moduleType;
			}

			public void setModuleType(String moduleType) {
				this.moduleType = moduleType;
			}

			public Integer getSortNumber() {
				return this.sortNumber;
			}

			public void setSortNumber(Integer sortNumber) {
				this.sortNumber = sortNumber;
			}

			public String getModuleValue() {
				return this.moduleValue;
			}

			public void setModuleValue(String moduleValue) {
				this.moduleValue = moduleValue;
			}
		}
	}

	@Override
	public QueryCommodityConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryCommodityConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
