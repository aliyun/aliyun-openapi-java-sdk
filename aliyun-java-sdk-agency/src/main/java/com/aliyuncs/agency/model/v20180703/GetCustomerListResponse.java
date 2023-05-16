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

package com.aliyuncs.agency.model.v20180703;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180703.GetCustomerListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCustomerListResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private Data data;

	private PageInfo pageInfo;

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

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Data {

		private List<FxCustomerReportDTO> list;

		public List<FxCustomerReportDTO> getList() {
			return this.list;
		}

		public void setList(List<FxCustomerReportDTO> list) {
			this.list = list;
		}

		public static class FxCustomerReportDTO {

			private String reportedTime;

			private Integer hasAccount;

			private String expireTime;

			private Long cid;

			private String customerName;

			private Integer customerStatus;

			private Integer customerType;

			private String customerGcLevel;

			private List<String> customerUids;

			private GcLevelAmountInfo gcLevelAmountInfo;

			public String getReportedTime() {
				return this.reportedTime;
			}

			public void setReportedTime(String reportedTime) {
				this.reportedTime = reportedTime;
			}

			public Integer getHasAccount() {
				return this.hasAccount;
			}

			public void setHasAccount(Integer hasAccount) {
				this.hasAccount = hasAccount;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public Long getCid() {
				return this.cid;
			}

			public void setCid(Long cid) {
				this.cid = cid;
			}

			public String getCustomerName() {
				return this.customerName;
			}

			public void setCustomerName(String customerName) {
				this.customerName = customerName;
			}

			public Integer getCustomerStatus() {
				return this.customerStatus;
			}

			public void setCustomerStatus(Integer customerStatus) {
				this.customerStatus = customerStatus;
			}

			public Integer getCustomerType() {
				return this.customerType;
			}

			public void setCustomerType(Integer customerType) {
				this.customerType = customerType;
			}

			public String getCustomerGcLevel() {
				return this.customerGcLevel;
			}

			public void setCustomerGcLevel(String customerGcLevel) {
				this.customerGcLevel = customerGcLevel;
			}

			public List<String> getCustomerUids() {
				return this.customerUids;
			}

			public void setCustomerUids(List<String> customerUids) {
				this.customerUids = customerUids;
			}

			public GcLevelAmountInfo getGcLevelAmountInfo() {
				return this.gcLevelAmountInfo;
			}

			public void setGcLevelAmountInfo(GcLevelAmountInfo gcLevelAmountInfo) {
				this.gcLevelAmountInfo = gcLevelAmountInfo;
			}

			public static class GcLevelAmountInfo {

				private String threeMonthAmount;

				private Boolean showOne;

				private Boolean showThree;

				private Boolean showSix;

				private String twelveMonthAmount;

				private String oneMonthAmount;

				private String sixMonthAmount;

				public String getThreeMonthAmount() {
					return this.threeMonthAmount;
				}

				public void setThreeMonthAmount(String threeMonthAmount) {
					this.threeMonthAmount = threeMonthAmount;
				}

				public Boolean getShowOne() {
					return this.showOne;
				}

				public void setShowOne(Boolean showOne) {
					this.showOne = showOne;
				}

				public Boolean getShowThree() {
					return this.showThree;
				}

				public void setShowThree(Boolean showThree) {
					this.showThree = showThree;
				}

				public Boolean getShowSix() {
					return this.showSix;
				}

				public void setShowSix(Boolean showSix) {
					this.showSix = showSix;
				}

				public String getTwelveMonthAmount() {
					return this.twelveMonthAmount;
				}

				public void setTwelveMonthAmount(String twelveMonthAmount) {
					this.twelveMonthAmount = twelveMonthAmount;
				}

				public String getOneMonthAmount() {
					return this.oneMonthAmount;
				}

				public void setOneMonthAmount(String oneMonthAmount) {
					this.oneMonthAmount = oneMonthAmount;
				}

				public String getSixMonthAmount() {
					return this.sixMonthAmount;
				}

				public void setSixMonthAmount(String sixMonthAmount) {
					this.sixMonthAmount = sixMonthAmount;
				}
			}
		}
	}

	public static class PageInfo {

		private Integer pageSize;

		private Integer total;

		private Integer page;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}
	}

	@Override
	public GetCustomerListResponse getInstance(UnmarshallerContext context) {
		return	GetCustomerListResponseUnmarshaller.unmarshall(this, context);
	}
}
