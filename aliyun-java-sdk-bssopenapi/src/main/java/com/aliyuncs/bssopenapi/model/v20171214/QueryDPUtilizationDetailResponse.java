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
import com.aliyuncs.bssopenapi.transform.v20171214.QueryDPUtilizationDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDPUtilizationDetailResponse extends AcsResponse {

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

		private String nextToken;

		private List<DetailListItem> detailList;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<DetailListItem> getDetailList() {
			return this.detailList;
		}

		public void setDetailList(List<DetailListItem> detailList) {
			this.detailList = detailList;
		}

		public static class DetailListItem {

			private Long uid;

			private String instanceId;

			private String instanceSpec;

			private String deductedInstanceId;

			private String deductedCommodityCode;

			private String deductedProductDetail;

			private String resCode;

			private String deductDate;

			private Float deductQuantity;

			private Float deductMeasure;

			private Float deductHours;

			private Float deductFactorTotal;

			private String region;

			private Long shareUid;

			public Long getUid() {
				return this.uid;
			}

			public void setUid(Long uid) {
				this.uid = uid;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
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

			public String getDeductedProductDetail() {
				return this.deductedProductDetail;
			}

			public void setDeductedProductDetail(String deductedProductDetail) {
				this.deductedProductDetail = deductedProductDetail;
			}

			public String getResCode() {
				return this.resCode;
			}

			public void setResCode(String resCode) {
				this.resCode = resCode;
			}

			public String getDeductDate() {
				return this.deductDate;
			}

			public void setDeductDate(String deductDate) {
				this.deductDate = deductDate;
			}

			public Float getDeductQuantity() {
				return this.deductQuantity;
			}

			public void setDeductQuantity(Float deductQuantity) {
				this.deductQuantity = deductQuantity;
			}

			public Float getDeductMeasure() {
				return this.deductMeasure;
			}

			public void setDeductMeasure(Float deductMeasure) {
				this.deductMeasure = deductMeasure;
			}

			public Float getDeductHours() {
				return this.deductHours;
			}

			public void setDeductHours(Float deductHours) {
				this.deductHours = deductHours;
			}

			public Float getDeductFactorTotal() {
				return this.deductFactorTotal;
			}

			public void setDeductFactorTotal(Float deductFactorTotal) {
				this.deductFactorTotal = deductFactorTotal;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Long getShareUid() {
				return this.shareUid;
			}

			public void setShareUid(Long shareUid) {
				this.shareUid = shareUid;
			}
		}
	}

	@Override
	public QueryDPUtilizationDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryDPUtilizationDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
