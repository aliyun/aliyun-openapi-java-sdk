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
import com.aliyuncs.bssopenapi.transform.v20171214.QuerySkuPriceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySkuPriceListResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private SkuPricePage skuPricePage;

		public SkuPricePage getSkuPricePage() {
			return this.skuPricePage;
		}

		public void setSkuPricePage(SkuPricePage skuPricePage) {
			this.skuPricePage = skuPricePage;
		}

		public static class SkuPricePage {

			private Integer totalCount;

			private String nextPageToken;

			private List<SkuPricePageDTO> skuPriceList;

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public String getNextPageToken() {
				return this.nextPageToken;
			}

			public void setNextPageToken(String nextPageToken) {
				this.nextPageToken = nextPageToken;
			}

			public List<SkuPricePageDTO> getSkuPriceList() {
				return this.skuPriceList;
			}

			public void setSkuPriceList(List<SkuPricePageDTO> skuPriceList) {
				this.skuPriceList = skuPriceList;
			}

			public static class SkuPricePageDTO {

				private String skuCode;

				private Map<Object,Object> skuFactorMap;

				private List<CSkuPriceDTO> cskuPriceList;

				public String getSkuCode() {
					return this.skuCode;
				}

				public void setSkuCode(String skuCode) {
					this.skuCode = skuCode;
				}

				public Map<Object,Object> getSkuFactorMap() {
					return this.skuFactorMap;
				}

				public void setSkuFactorMap(Map<Object,Object> skuFactorMap) {
					this.skuFactorMap = skuFactorMap;
				}

				public List<CSkuPriceDTO> getCskuPriceList() {
					return this.cskuPriceList;
				}

				public void setCskuPriceList(List<CSkuPriceDTO> cskuPriceList) {
					this.cskuPriceList = cskuPriceList;
				}

				public static class CSkuPriceDTO {

					private String cskuCode;

					private String currency;

					private String usageUnit;

					private String priceType;

					private String priceMode;

					private String price;

					private String priceUnit;

					private List<RangeDTO> rangeList;

					public String getCskuCode() {
						return this.cskuCode;
					}

					public void setCskuCode(String cskuCode) {
						this.cskuCode = cskuCode;
					}

					public String getCurrency() {
						return this.currency;
					}

					public void setCurrency(String currency) {
						this.currency = currency;
					}

					public String getUsageUnit() {
						return this.usageUnit;
					}

					public void setUsageUnit(String usageUnit) {
						this.usageUnit = usageUnit;
					}

					public String getPriceType() {
						return this.priceType;
					}

					public void setPriceType(String priceType) {
						this.priceType = priceType;
					}

					public String getPriceMode() {
						return this.priceMode;
					}

					public void setPriceMode(String priceMode) {
						this.priceMode = priceMode;
					}

					public String getPrice() {
						return this.price;
					}

					public void setPrice(String price) {
						this.price = price;
					}

					public String getPriceUnit() {
						return this.priceUnit;
					}

					public void setPriceUnit(String priceUnit) {
						this.priceUnit = priceUnit;
					}

					public List<RangeDTO> getRangeList() {
						return this.rangeList;
					}

					public void setRangeList(List<RangeDTO> rangeList) {
						this.rangeList = rangeList;
					}

					public static class RangeDTO {

						private String factorCode;

						private String min;

						private String max;

						private String type;

						public String getFactorCode() {
							return this.factorCode;
						}

						public void setFactorCode(String factorCode) {
							this.factorCode = factorCode;
						}

						public String getMin() {
							return this.min;
						}

						public void setMin(String min) {
							this.min = min;
						}

						public String getMax() {
							return this.max;
						}

						public void setMax(String max) {
							this.max = max;
						}

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}
					}
				}
			}
		}
	}

	@Override
	public QuerySkuPriceListResponse getInstance(UnmarshallerContext context) {
		return	QuerySkuPriceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
