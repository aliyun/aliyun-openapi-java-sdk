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
import com.aliyuncs.bssopenapi.transform.v20171214.QueryResourcePackageInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryResourcePackageInstancesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer page;

	private Integer pageSize;

	private Integer total;

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

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String hostId;

		private String pageNum;

		private String pageSize;

		private String totalCount;

		private List<Instance> instances;

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public String getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(String pageNum) {
			this.pageNum = pageNum;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public List<Instance> getInstances() {
			return this.instances;
		}

		public void setInstances(List<Instance> instances) {
			this.instances = instances;
		}

		public static class Instance {

			private String instanceId;

			private String region;

			private String totalAmount;

			private String totalAmountUnit;

			private String remainingAmount;

			private String remainingAmountUnit;

			private String effectiveTime;

			private String expiryTime;

			private String remark;

			private String packageType;

			private String status;

			private String deductType;

			private List<String> applicableProducts;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getTotalAmount() {
				return this.totalAmount;
			}

			public void setTotalAmount(String totalAmount) {
				this.totalAmount = totalAmount;
			}

			public String getTotalAmountUnit() {
				return this.totalAmountUnit;
			}

			public void setTotalAmountUnit(String totalAmountUnit) {
				this.totalAmountUnit = totalAmountUnit;
			}

			public String getRemainingAmount() {
				return this.remainingAmount;
			}

			public void setRemainingAmount(String remainingAmount) {
				this.remainingAmount = remainingAmount;
			}

			public String getRemainingAmountUnit() {
				return this.remainingAmountUnit;
			}

			public void setRemainingAmountUnit(String remainingAmountUnit) {
				this.remainingAmountUnit = remainingAmountUnit;
			}

			public String getEffectiveTime() {
				return this.effectiveTime;
			}

			public void setEffectiveTime(String effectiveTime) {
				this.effectiveTime = effectiveTime;
			}

			public String getExpiryTime() {
				return this.expiryTime;
			}

			public void setExpiryTime(String expiryTime) {
				this.expiryTime = expiryTime;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getPackageType() {
				return this.packageType;
			}

			public void setPackageType(String packageType) {
				this.packageType = packageType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDeductType() {
				return this.deductType;
			}

			public void setDeductType(String deductType) {
				this.deductType = deductType;
			}

			public List<String> getApplicableProducts() {
				return this.applicableProducts;
			}

			public void setApplicableProducts(List<String> applicableProducts) {
				this.applicableProducts = applicableProducts;
			}
		}
	}

	@Override
	public QueryResourcePackageInstancesResponse getInstance(UnmarshallerContext context) {
		return	QueryResourcePackageInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
