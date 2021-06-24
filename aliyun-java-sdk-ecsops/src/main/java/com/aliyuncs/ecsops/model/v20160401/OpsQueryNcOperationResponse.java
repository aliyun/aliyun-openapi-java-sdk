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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryNcOperationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryNcOperationResponse extends AcsResponse {

	private Integer totalCnt;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<NcOpsDetail> ncOpsDetailList;

	public Integer getTotalCnt() {
		return this.totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
	}

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

	public List<NcOpsDetail> getNcOpsDetailList() {
		return this.ncOpsDetailList;
	}

	public void setNcOpsDetailList(List<NcOpsDetail> ncOpsDetailList) {
		this.ncOpsDetailList = ncOpsDetailList;
	}

	public static class NcOpsDetail {

		private String action;

		private String firstMatchTime;

		private String machineType;

		private String firstOpsTime;

		private String opsRuleName;

		private String ncIp;

		private String cnSn;

		private String isRateLimited;

		private String description;

		private String targetFeatures;

		private String region;

		private String clusterName;

		private Integer hitCnt;

		private Integer rateLimitedTime;

		private String reason;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getFirstMatchTime() {
			return this.firstMatchTime;
		}

		public void setFirstMatchTime(String firstMatchTime) {
			this.firstMatchTime = firstMatchTime;
		}

		public String getMachineType() {
			return this.machineType;
		}

		public void setMachineType(String machineType) {
			this.machineType = machineType;
		}

		public String getFirstOpsTime() {
			return this.firstOpsTime;
		}

		public void setFirstOpsTime(String firstOpsTime) {
			this.firstOpsTime = firstOpsTime;
		}

		public String getOpsRuleName() {
			return this.opsRuleName;
		}

		public void setOpsRuleName(String opsRuleName) {
			this.opsRuleName = opsRuleName;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getCnSn() {
			return this.cnSn;
		}

		public void setCnSn(String cnSn) {
			this.cnSn = cnSn;
		}

		public String getIsRateLimited() {
			return this.isRateLimited;
		}

		public void setIsRateLimited(String isRateLimited) {
			this.isRateLimited = isRateLimited;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTargetFeatures() {
			return this.targetFeatures;
		}

		public void setTargetFeatures(String targetFeatures) {
			this.targetFeatures = targetFeatures;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Integer getHitCnt() {
			return this.hitCnt;
		}

		public void setHitCnt(Integer hitCnt) {
			this.hitCnt = hitCnt;
		}

		public Integer getRateLimitedTime() {
			return this.rateLimitedTime;
		}

		public void setRateLimitedTime(Integer rateLimitedTime) {
			this.rateLimitedTime = rateLimitedTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	@Override
	public OpsQueryNcOperationResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryNcOperationResponseUnmarshaller.unmarshall(this, context);
	}
}
