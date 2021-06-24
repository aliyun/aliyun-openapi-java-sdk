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

	private Integer pageSize;

	private String requestId;

	private Integer total;

	private Integer pageNo;

	private List<MigrateLog> migrateLogs;

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

	public List<MigrateLog> getMigrateLogs() {
		return this.migrateLogs;
	}

	public void setMigrateLogs(List<MigrateLog> migrateLogs) {
		this.migrateLogs = migrateLogs;
	}

	public static class MigrateLog {

		private String status;

		private String srcNcIp;

		private String instanceId;

		private String destNcId;

		private String srcNcId;

		private String modifiedTime;

		private String destNcIp;

		private Long retCode;

		private String createdTime;

		private String reason;

		private Long id;

		private Long rate;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSrcNcIp() {
			return this.srcNcIp;
		}

		public void setSrcNcIp(String srcNcIp) {
			this.srcNcIp = srcNcIp;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDestNcId() {
			return this.destNcId;
		}

		public void setDestNcId(String destNcId) {
			this.destNcId = destNcId;
		}

		public String getSrcNcId() {
			return this.srcNcId;
		}

		public void setSrcNcId(String srcNcId) {
			this.srcNcId = srcNcId;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
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

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getRate() {
			return this.rate;
		}

		public void setRate(Long rate) {
			this.rate = rate;
		}
	}

	@Override
	public OpsQueryInstanceMigrateLogResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryInstanceMigrateLogResponseUnmarshaller.unmarshall(this, context);
	}
}
