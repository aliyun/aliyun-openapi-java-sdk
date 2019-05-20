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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.QueryNumber400RealNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryNumber400RealNameResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Number400RealNameDomain> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<Number400RealNameDomain> getList() {
			return this.list;
		}

		public void setList(List<Number400RealNameDomain> list) {
			this.list = list;
		}

		public static class Number400RealNameDomain {

			private String corpName;

			private List<Number400CorpIdentifyDomain> number400CorpIdentify;

			public String getCorpName() {
				return this.corpName;
			}

			public void setCorpName(String corpName) {
				this.corpName = corpName;
			}

			public List<Number400CorpIdentifyDomain> getNumber400CorpIdentify() {
				return this.number400CorpIdentify;
			}

			public void setNumber400CorpIdentify(List<Number400CorpIdentifyDomain> number400CorpIdentify) {
				this.number400CorpIdentify = number400CorpIdentify;
			}

			public static class Number400CorpIdentifyDomain {

				private String corpName;

				private Long specId;

				private String specName;

				private Integer remainCount;

				private Integer buyCountLimit;

				private Long realNameInsId;

				private Boolean canModifyIdentify;

				private String orderId;

				private List<Number400Domain> cuteNumbers;

				public String getCorpName() {
					return this.corpName;
				}

				public void setCorpName(String corpName) {
					this.corpName = corpName;
				}

				public Long getSpecId() {
					return this.specId;
				}

				public void setSpecId(Long specId) {
					this.specId = specId;
				}

				public String getSpecName() {
					return this.specName;
				}

				public void setSpecName(String specName) {
					this.specName = specName;
				}

				public Integer getRemainCount() {
					return this.remainCount;
				}

				public void setRemainCount(Integer remainCount) {
					this.remainCount = remainCount;
				}

				public Integer getBuyCountLimit() {
					return this.buyCountLimit;
				}

				public void setBuyCountLimit(Integer buyCountLimit) {
					this.buyCountLimit = buyCountLimit;
				}

				public Long getRealNameInsId() {
					return this.realNameInsId;
				}

				public void setRealNameInsId(Long realNameInsId) {
					this.realNameInsId = realNameInsId;
				}

				public Boolean getCanModifyIdentify() {
					return this.canModifyIdentify;
				}

				public void setCanModifyIdentify(Boolean canModifyIdentify) {
					this.canModifyIdentify = canModifyIdentify;
				}

				public String getOrderId() {
					return this.orderId;
				}

				public void setOrderId(String orderId) {
					this.orderId = orderId;
				}

				public List<Number400Domain> getCuteNumbers() {
					return this.cuteNumbers;
				}

				public void setCuteNumbers(List<Number400Domain> cuteNumbers) {
					this.cuteNumbers = cuteNumbers;
				}

				public static class Number400Domain {

					private String level;

					private LevelDomain levelDomain;

					public String getLevel() {
						return this.level;
					}

					public void setLevel(String level) {
						this.level = level;
					}

					public LevelDomain getLevelDomain() {
						return this.levelDomain;
					}

					public void setLevelDomain(LevelDomain levelDomain) {
						this.levelDomain = levelDomain;
					}

					public static class LevelDomain {

						private Integer price;

						private String description;

						private String stockCount;

						private Integer level;

						public Integer getPrice() {
							return this.price;
						}

						public void setPrice(Integer price) {
							this.price = price;
						}

						public String getDescription() {
							return this.description;
						}

						public void setDescription(String description) {
							this.description = description;
						}

						public String getStockCount() {
							return this.stockCount;
						}

						public void setStockCount(String stockCount) {
							this.stockCount = stockCount;
						}

						public Integer getLevel() {
							return this.level;
						}

						public void setLevel(Integer level) {
							this.level = level;
						}
					}
				}
			}
		}
	}

	@Override
	public QueryNumber400RealNameResponse getInstance(UnmarshallerContext context) {
		return	QueryNumber400RealNameResponseUnmarshaller.unmarshall(this, context);
	}
}
