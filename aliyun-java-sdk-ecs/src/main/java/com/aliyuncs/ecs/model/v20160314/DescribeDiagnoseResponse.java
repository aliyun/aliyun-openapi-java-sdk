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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeDiagnoseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnoseResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<DiagnoseInstance> diagnoseInstances;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DiagnoseInstance> getDiagnoseInstances() {
		return this.diagnoseInstances;
	}

	public void setDiagnoseInstances(List<DiagnoseInstance> diagnoseInstances) {
		this.diagnoseInstances = diagnoseInstances;
	}

	public static class DiagnoseInstance {

		private String status;

		private String creationTime;

		private String expireTime;

		private String diagnoseId;

		private String product;

		private Integer star;

		private String instanceTypeName;

		private String networkType;

		private String modificationTime;

		private Integer period;

		private String instanceChargeType;

		private String regionId;

		private Integer amount;

		private String diskCategory;

		private String errorCode;

		private String periodUnit;

		private String mark;

		private String diagnoseRequestId;

		private String izNo;

		private String solutions;

		private String diagnoseAction;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getDiagnoseId() {
			return this.diagnoseId;
		}

		public void setDiagnoseId(String diagnoseId) {
			this.diagnoseId = diagnoseId;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public Integer getStar() {
			return this.star;
		}

		public void setStar(Integer star) {
			this.star = star;
		}

		public String getInstanceTypeName() {
			return this.instanceTypeName;
		}

		public void setInstanceTypeName(String instanceTypeName) {
			this.instanceTypeName = instanceTypeName;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getAmount() {
			return this.amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public String getDiskCategory() {
			return this.diskCategory;
		}

		public void setDiskCategory(String diskCategory) {
			this.diskCategory = diskCategory;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public String getMark() {
			return this.mark;
		}

		public void setMark(String mark) {
			this.mark = mark;
		}

		public String getDiagnoseRequestId() {
			return this.diagnoseRequestId;
		}

		public void setDiagnoseRequestId(String diagnoseRequestId) {
			this.diagnoseRequestId = diagnoseRequestId;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public String getSolutions() {
			return this.solutions;
		}

		public void setSolutions(String solutions) {
			this.solutions = solutions;
		}

		public String getDiagnoseAction() {
			return this.diagnoseAction;
		}

		public void setDiagnoseAction(String diagnoseAction) {
			this.diagnoseAction = diagnoseAction;
		}
	}

	@Override
	public DescribeDiagnoseResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnoseResponseUnmarshaller.unmarshall(this, context);
	}
}
