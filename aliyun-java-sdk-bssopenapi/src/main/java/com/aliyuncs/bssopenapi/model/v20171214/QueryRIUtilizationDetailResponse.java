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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryRIUtilizationDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRIUtilizationDetailResponse extends AcsResponse {

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

		private Long pageNum;

		private Long pageSize;

		private Long totalCount;

		private List<DetailListItem> detailList;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<DetailListItem> getDetailList() {
			return this.detailList;
		}

		public void setDetailList(List<DetailListItem> detailList) {
			this.detailList = detailList;
		}

		public static class DetailListItem {

			private String rIInstanceId;

			private String instanceSpec;

			private String deductedInstanceId;

			private String deductedCommodityCode;

			private String deductDate;

			private String deductHours;

			private String deductedProductDetail;

			private Float deductQuantity;

			private Float deductFactorTotal;

			public String getRIInstanceId() {
				return this.rIInstanceId;
			}

			public void setRIInstanceId(String rIInstanceId) {
				this.rIInstanceId = rIInstanceId;
			}

			public String getInstanceSpec() {
				return this.instanceSpec;
			}

			public void setInstanceSpec(String instanceSpec) {
				this.instanceSpec = instanceSpec;
			}

			public String getDeductedInstanceId() {
				return this.deductedInstanceId;
			}

			public void setDeductedInstanceId(String deductedInstanceId) {
				this.deductedInstanceId = deductedInstanceId;
			}

			public String getDeductedCommodityCode() {
				return this.deductedCommodityCode;
			}

			public void setDeductedCommodityCode(String deductedCommodityCode) {
				this.deductedCommodityCode = deductedCommodityCode;
			}

			public String getDeductDate() {
				return this.deductDate;
			}

			public void setDeductDate(String deductDate) {
				this.deductDate = deductDate;
			}

			public String getDeductHours() {
				return this.deductHours;
			}

			public void setDeductHours(String deductHours) {
				this.deductHours = deductHours;
			}

			public String getDeductedProductDetail() {
				return this.deductedProductDetail;
			}

			public void setDeductedProductDetail(String deductedProductDetail) {
				this.deductedProductDetail = deductedProductDetail;
			}

			public Float getDeductQuantity() {
				return this.deductQuantity;
			}

			public void setDeductQuantity(Float deductQuantity) {
				this.deductQuantity = deductQuantity;
			}

			public Float getDeductFactorTotal() {
				return this.deductFactorTotal;
			}

			public void setDeductFactorTotal(Float deductFactorTotal) {
				this.deductFactorTotal = deductFactorTotal;
			}
		}
	}

	@Override
	public QueryRIUtilizationDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryRIUtilizationDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
