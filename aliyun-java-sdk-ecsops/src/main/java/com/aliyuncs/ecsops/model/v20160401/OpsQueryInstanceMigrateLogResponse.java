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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryInstanceMigrateLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryInstanceMigrateLogResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNo;

	private Integer pageSize;

	private List<MigrateLog> migrateLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<MigrateLog> getMigrateLogs() {
		return this.migrateLogs;
	}

	public void setMigrateLogs(List<MigrateLog> migrateLogs) {
		this.migrateLogs = migrateLogs;
	}

	public static class MigrateLog {

		private Long id;

		private String instanceId;

		private String srcNcId;

		private String destNcId;

		private Long rate;

		private String status;

		private String createdTime;

		private String modifiedTime;

		private String reason;

		private String srcNcIp;

		private String destNcIp;

		private Long retCode;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSrcNcId() {
			return this.srcNcId;
		}

		public void setSrcNcId(String srcNcId) {
			this.srcNcId = srcNcId;
		}

		public String getDestNcId() {
			return this.destNcId;
		}

		public void setDestNcId(String destNcId) {
			this.destNcId = destNcId;
		}

		public Long getRate() {
			return this.rate;
		}

		public void setRate(Long rate) {
			this.rate = rate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getSrcNcIp() {
			return this.srcNcIp;
		}

		public void setSrcNcIp(String srcNcIp) {
			this.srcNcIp = srcNcIp;
		}

		public String getDestNcIp() {
			return this.destNcIp;
		}

		public void setDestNcIp(String destNcIp) {
			this.destNcIp = destNcIp;
		}

		public Long getRetCode() {
			return this.retCode;
		}

		public void setRetCode(Long retCode) {
			this.retCode = retCode;
		}
	}

	@Override
	public OpsQueryInstanceMigrateLogResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryInstanceMigrateLogResponseUnmarshaller.unmarshall(this, context);
	}
}
