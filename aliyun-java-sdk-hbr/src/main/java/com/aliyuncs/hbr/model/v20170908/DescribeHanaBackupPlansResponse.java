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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeHanaBackupPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHanaBackupPlansResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<HanaBackupPlan> hanaBackupPlans;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<HanaBackupPlan> getHanaBackupPlans() {
		return this.hanaBackupPlans;
	}

	public void setHanaBackupPlans(List<HanaBackupPlan> hanaBackupPlans) {
		this.hanaBackupPlans = hanaBackupPlans;
	}

	public static class HanaBackupPlan {

		private String planId;

		private String planName;

		private String backupType;

		private String databaseName;

		private String backupPrefix;

		private String schedule;

		private Boolean disabled;

		private String vaultId;

		private String clusterId;

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getPlanName() {
			return this.planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public String getBackupType() {
			return this.backupType;
		}

		public void setBackupType(String backupType) {
			this.backupType = backupType;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getBackupPrefix() {
			return this.backupPrefix;
		}

		public void setBackupPrefix(String backupPrefix) {
			this.backupPrefix = backupPrefix;
		}

		public String getSchedule() {
			return this.schedule;
		}

		public void setSchedule(String schedule) {
			this.schedule = schedule;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}
	}

	@Override
	public DescribeHanaBackupPlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeHanaBackupPlansResponseUnmarshaller.unmarshall(this, context);
	}
}
