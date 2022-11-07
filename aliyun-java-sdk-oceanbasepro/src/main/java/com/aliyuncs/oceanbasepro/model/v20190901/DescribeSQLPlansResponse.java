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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeSQLPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLPlansResponse extends AcsResponse {

	private String requestId;

	private List<Data> sQLPlans;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getSQLPlans() {
		return this.sQLPlans;
	}

	public void setSQLPlans(List<Data> sQLPlans) {
		this.sQLPlans = sQLPlans;
	}

	public static class Data {

		private Integer hitCount;

		private String outlineData;

		private Float avgExecutionMS;

		private String planUnionHash;

		private Long outlineId;

		private Long avgExecutionTimeMS;

		private Integer planId;

		private Long outlineTime;

		private String outlineTimeUTCString;

		private String planFull;

		private String nodeIp;

		private Integer mergedVersion;

		private String querySQL;

		private String firstLoadTimeUTCString;

		private Long firstLoadTime;

		private String planInfo;

		public Integer getHitCount() {
			return this.hitCount;
		}

		public void setHitCount(Integer hitCount) {
			this.hitCount = hitCount;
		}

		public String getOutlineData() {
			return this.outlineData;
		}

		public void setOutlineData(String outlineData) {
			this.outlineData = outlineData;
		}

		public Float getAvgExecutionMS() {
			return this.avgExecutionMS;
		}

		public void setAvgExecutionMS(Float avgExecutionMS) {
			this.avgExecutionMS = avgExecutionMS;
		}

		public String getPlanUnionHash() {
			return this.planUnionHash;
		}

		public void setPlanUnionHash(String planUnionHash) {
			this.planUnionHash = planUnionHash;
		}

		public Long getOutlineId() {
			return this.outlineId;
		}

		public void setOutlineId(Long outlineId) {
			this.outlineId = outlineId;
		}

		public Long getAvgExecutionTimeMS() {
			return this.avgExecutionTimeMS;
		}

		public void setAvgExecutionTimeMS(Long avgExecutionTimeMS) {
			this.avgExecutionTimeMS = avgExecutionTimeMS;
		}

		public Integer getPlanId() {
			return this.planId;
		}

		public void setPlanId(Integer planId) {
			this.planId = planId;
		}

		public Long getOutlineTime() {
			return this.outlineTime;
		}

		public void setOutlineTime(Long outlineTime) {
			this.outlineTime = outlineTime;
		}

		public String getOutlineTimeUTCString() {
			return this.outlineTimeUTCString;
		}

		public void setOutlineTimeUTCString(String outlineTimeUTCString) {
			this.outlineTimeUTCString = outlineTimeUTCString;
		}

		public String getPlanFull() {
			return this.planFull;
		}

		public void setPlanFull(String planFull) {
			this.planFull = planFull;
		}

		public String getNodeIp() {
			return this.nodeIp;
		}

		public void setNodeIp(String nodeIp) {
			this.nodeIp = nodeIp;
		}

		public Integer getMergedVersion() {
			return this.mergedVersion;
		}

		public void setMergedVersion(Integer mergedVersion) {
			this.mergedVersion = mergedVersion;
		}

		public String getQuerySQL() {
			return this.querySQL;
		}

		public void setQuerySQL(String querySQL) {
			this.querySQL = querySQL;
		}

		public String getFirstLoadTimeUTCString() {
			return this.firstLoadTimeUTCString;
		}

		public void setFirstLoadTimeUTCString(String firstLoadTimeUTCString) {
			this.firstLoadTimeUTCString = firstLoadTimeUTCString;
		}

		public Long getFirstLoadTime() {
			return this.firstLoadTime;
		}

		public void setFirstLoadTime(Long firstLoadTime) {
			this.firstLoadTime = firstLoadTime;
		}

		public String getPlanInfo() {
			return this.planInfo;
		}

		public void setPlanInfo(String planInfo) {
			this.planInfo = planInfo;
		}
	}

	@Override
	public DescribeSQLPlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeSQLPlansResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
