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
import com.aliyuncs.hbr.transform.v20170908.DescribeHanaBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHanaBackupsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<HanaBackup> hanaBackups;

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

	public List<HanaBackup> getHanaBackups() {
		return this.hanaBackups;
	}

	public void setHanaBackups(List<HanaBackup> hanaBackups) {
		this.hanaBackups = hanaBackups;
	}

	public static class HanaBackup {

		private String databaseName;

		private Long backupId;

		private String host;

		private Integer port;

		private String serviceName;

		private String entryTypeName;

		private String sysStartTime;

		private String utcStartTime;

		private String sysEndTime;

		private String utcEndTime;

		private String stateName;

		private Long backupSize;

		private Long transferedSize;

		private String comment;

		private String message;

		private String systemId;

		private Long duration;

		private String backupPrefix;

		private String destinationPath;

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public Long getBackupId() {
			return this.backupId;
		}

		public void setBackupId(Long backupId) {
			this.backupId = backupId;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getEntryTypeName() {
			return this.entryTypeName;
		}

		public void setEntryTypeName(String entryTypeName) {
			this.entryTypeName = entryTypeName;
		}

		public String getSysStartTime() {
			return this.sysStartTime;
		}

		public void setSysStartTime(String sysStartTime) {
			this.sysStartTime = sysStartTime;
		}

		public String getUtcStartTime() {
			return this.utcStartTime;
		}

		public void setUtcStartTime(String utcStartTime) {
			this.utcStartTime = utcStartTime;
		}

		public String getSysEndTime() {
			return this.sysEndTime;
		}

		public void setSysEndTime(String sysEndTime) {
			this.sysEndTime = sysEndTime;
		}

		public String getUtcEndTime() {
			return this.utcEndTime;
		}

		public void setUtcEndTime(String utcEndTime) {
			this.utcEndTime = utcEndTime;
		}

		public String getStateName() {
			return this.stateName;
		}

		public void setStateName(String stateName) {
			this.stateName = stateName;
		}

		public Long getBackupSize() {
			return this.backupSize;
		}

		public void setBackupSize(Long backupSize) {
			this.backupSize = backupSize;
		}

		public Long getTransferedSize() {
			return this.transferedSize;
		}

		public void setTransferedSize(Long transferedSize) {
			this.transferedSize = transferedSize;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getSystemId() {
			return this.systemId;
		}

		public void setSystemId(String systemId) {
			this.systemId = systemId;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public String getBackupPrefix() {
			return this.backupPrefix;
		}

		public void setBackupPrefix(String backupPrefix) {
			this.backupPrefix = backupPrefix;
		}

		public String getDestinationPath() {
			return this.destinationPath;
		}

		public void setDestinationPath(String destinationPath) {
			this.destinationPath = destinationPath;
		}
	}

	@Override
	public DescribeHanaBackupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeHanaBackupsResponseUnmarshaller.unmarshall(this, context);
	}
}
