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
import com.aliyuncs.bssopenapi.transform.v20171214.QueryPriceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPriceListResponse extends AcsResponse {

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

		private String currency;

		private List<Module> modules;

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public List<Module> getModules() {
			return this.modules;
		}

		public void setModules(List<Module> modules) {
			this.modules = modules;
		}

		public static class Module {

			private String moduleCode;

			private String region;

			private String config;

			private String priceUnitQuantity;

			private String priceUnit;

			private List<TierPrice> tierPrices;

			public String getModuleCode() {
				return this.moduleCode;
			}

			public void setModuleCode(String moduleCode) {
				this.moduleCode = moduleCode;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getConfig() {
				return this.config;
			}

			public void setConfig(String config) {
				this.config = config;
			}

			public String getPriceUnitQuantity() {
				return this.priceUnitQuantity;
			}

			public void setPriceUnitQuantity(String priceUnitQuantity) {
				this.priceUnitQuantity = priceUnitQuantity;
			}

			public String getPriceUnit() {
				return this.priceUnit;
			}

			public void setPriceUnit(String priceUnit) {
				this.priceUnit = priceUnit;
			}

			public List<TierPrice> getTierPrices() {
				return this.tierPrices;
			}

			public void setTierPrices(List<TierPrice> tierPrices) {
				this.tierPrices = tierPrices;
			}

			public static class TierPrice {

				private String tierStart;

				private String startSymbol;

				private String tierEnd;

				private String endSymbol;

				private String tierType;

				private String priceType;

				private String price;

				public String getTierStart() {
					return this.tierStart;
				}

				public void setTierStart(String tierStart) {
					this.tierStart = tierStart;
				}

				public String getStartSymbol() {
					return this.startSymbol;
				}

				public void setStartSymbol(String startSymbol) {
					this.startSymbol = startSymbol;
				}

				public String getTierEnd() {
					return this.tierEnd;
				}

				public void setTierEnd(String tierEnd) {
					this.tierEnd = tierEnd;
				}

				public String getEndSymbol() {
					return this.endSymbol;
				}

				public void setEndSymbol(String endSymbol) {
					this.endSymbol = endSymbol;
				}

				public String getTierType() {
					return this.tierType;
				}

				public void setTierType(String tierType) {
					this.tierType = tierType;
				}

				public String getPriceType() {
					return this.priceType;
				}

				public void setPriceType(String priceType) {
					this.priceType = priceType;
				}

				public String getPrice() {
					return this.price;
				}

				public void setPrice(String price) {
					this.price = price;
				}
			}
		}
	}

	@Override
	public QueryPriceListResponse getInstance(UnmarshallerContext context) {
		return	QueryPriceListResponseUnmarshaller.unmarshall(this, context);
	}
}
