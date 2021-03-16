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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeFailedDeploymentStatusInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeFailedDeploymentStatusInfoResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<FailedDeployStatusInfoItem> failedDeployStatusInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<FailedDeployStatusInfoItem> getFailedDeployStatusInfo() {
		return this.failedDeployStatusInfo;
	}

	public void setFailedDeployStatusInfo(List<FailedDeployStatusInfoItem> failedDeployStatusInfo) {
		this.failedDeployStatusInfo = failedDeployStatusInfo;
	}

	public static class FailedDeployStatusInfoItem {

		private String planId;

		private String batchNo;

		private String resourceId;

		private String ncIp;

		private String reason;

		private String rawReason;

		private String reasonDetail;

		private String gmtCreated;

		private String gmtModified;

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getBatchNo() {
			return this.batchNo;
		}

		public void setBatchNo(String batchNo) {
			this.batchNo = batchNo;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getRawReason() {
			return this.rawReason;
		}

		public void setRawReason(String rawReason) {
			this.rawReason = rawReason;
		}

		public String getReasonDetail() {
			return this.reasonDetail;
		}

		public void setReasonDetail(String reasonDetail) {
			this.reasonDetail = reasonDetail;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public OpsDescribeFailedDeploymentStatusInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeFailedDeploymentStatusInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
