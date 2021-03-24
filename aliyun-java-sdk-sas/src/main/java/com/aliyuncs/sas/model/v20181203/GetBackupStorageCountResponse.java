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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetBackupStorageCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBackupStorageCountResponse extends AcsResponse {

	private String requestId;

	private BackupStorageCount backupStorageCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public BackupStorageCount getBackupStorageCount() {
		return this.backupStorageCount;
	}

	public void setBackupStorageCount(BackupStorageCount backupStorageCount) {
		this.backupStorageCount = backupStorageCount;
	}

	public static class BackupStorageCount {

		private Long buyStorageByte;

		private Long usageStorageByte;

		private Integer overflow;

		public Long getBuyStorageByte() {
			return this.buyStorageByte;
		}

		public void setBuyStorageByte(Long buyStorageByte) {
			this.buyStorageByte = buyStorageByte;
		}

		public Long getUsageStorageByte() {
			return this.usageStorageByte;
		}

		public void setUsageStorageByte(Long usageStorageByte) {
			this.usageStorageByte = usageStorageByte;
		}

		public Integer getOverflow() {
			return this.overflow;
		}

		public void setOverflow(Integer overflow) {
			this.overflow = overflow;
		}
	}

	@Override
	public GetBackupStorageCountResponse getInstance(UnmarshallerContext context) {
		return	GetBackupStorageCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
