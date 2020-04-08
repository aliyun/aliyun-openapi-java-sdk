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

package com.aliyuncs.cassandra.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cassandra.transform.v20190101.DescribeBackupPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPlansResponse extends AcsResponse {

	private String requestId;

	private List<BackupPlan> backupPlans;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BackupPlan> getBackupPlans() {
		return this.backupPlans;
	}

	public void setBackupPlans(List<BackupPlan> backupPlans) {
		this.backupPlans = backupPlans;
	}

	public static class BackupPlan {

		private String clusterId;

		private String dataCenterId;

		private String createdTime;

		private String backupTime;

		private String backupPeriod;

		private Integer retentionPeriod;

		private Boolean active;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getDataCenterId() {
			return this.dataCenterId;
		}

		public void setDataCenterId(String dataCenterId) {
			this.dataCenterId = dataCenterId;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getBackupTime() {
			return this.backupTime;
		}

		public void setBackupTime(String backupTime) {
			this.backupTime = backupTime;
		}

		public String getBackupPeriod() {
			return this.backupPeriod;
		}

		public void setBackupPeriod(String backupPeriod) {
			this.backupPeriod = backupPeriod;
		}

		public Integer getRetentionPeriod() {
			return this.retentionPeriod;
		}

		public void setRetentionPeriod(Integer retentionPeriod) {
			this.retentionPeriod = retentionPeriod;
		}

		public Boolean getActive() {
			return this.active;
		}

		public void setActive(Boolean active) {
			this.active = active;
		}
	}

	@Override
	public DescribeBackupPlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPlansResponseUnmarshaller.unmarshall(this, context);
	}
}
