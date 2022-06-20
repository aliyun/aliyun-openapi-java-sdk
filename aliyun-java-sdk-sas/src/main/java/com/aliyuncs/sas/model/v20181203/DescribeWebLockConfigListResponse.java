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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeWebLockConfigListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebLockConfigListResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<ConfigInfo> configList;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ConfigInfo> getConfigList() {
		return this.configList;
	}

	public void setConfigList(List<ConfigInfo> configList) {
		this.configList = configList;
	}

	public static class ConfigInfo {

		private String exclusiveDir;

		private String uuid;

		private String inclusiveFileType;

		private String defenceMode;

		private String exclusiveFileType;

		private String inclusiveFile;

		private String mode;

		private String dir;

		private String exclusiveFile;

		private String id;

		private String localBackupDir;

		public String getExclusiveDir() {
			return this.exclusiveDir;
		}

		public void setExclusiveDir(String exclusiveDir) {
			this.exclusiveDir = exclusiveDir;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getInclusiveFileType() {
			return this.inclusiveFileType;
		}

		public void setInclusiveFileType(String inclusiveFileType) {
			this.inclusiveFileType = inclusiveFileType;
		}

		public String getDefenceMode() {
			return this.defenceMode;
		}

		public void setDefenceMode(String defenceMode) {
			this.defenceMode = defenceMode;
		}

		public String getExclusiveFileType() {
			return this.exclusiveFileType;
		}

		public void setExclusiveFileType(String exclusiveFileType) {
			this.exclusiveFileType = exclusiveFileType;
		}

		public String getInclusiveFile() {
			return this.inclusiveFile;
		}

		public void setInclusiveFile(String inclusiveFile) {
			this.inclusiveFile = inclusiveFile;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getDir() {
			return this.dir;
		}

		public void setDir(String dir) {
			this.dir = dir;
		}

		public String getExclusiveFile() {
			return this.exclusiveFile;
		}

		public void setExclusiveFile(String exclusiveFile) {
			this.exclusiveFile = exclusiveFile;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLocalBackupDir() {
			return this.localBackupDir;
		}

		public void setLocalBackupDir(String localBackupDir) {
			this.localBackupDir = localBackupDir;
		}
	}

	@Override
	public DescribeWebLockConfigListResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebLockConfigListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
