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
import com.aliyuncs.hbr.transform.v20170908.GetVaultListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVaultListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private List<Vault> vaults;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Vault> getVaults() {
		return this.vaults;
	}

	public void setVaults(List<Vault> vaults) {
		this.vaults = vaults;
	}

	public static class Vault {

		private String vaultId;

		private String vaultRegionId;

		private String vaultName;

		private String vaultType;

		private String vaultStorageClass;

		private String replicationSourceVaultId;

		private String replicationSourceRegionId;

		private Boolean replication;

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getVaultRegionId() {
			return this.vaultRegionId;
		}

		public void setVaultRegionId(String vaultRegionId) {
			this.vaultRegionId = vaultRegionId;
		}

		public String getVaultName() {
			return this.vaultName;
		}

		public void setVaultName(String vaultName) {
			this.vaultName = vaultName;
		}

		public String getVaultType() {
			return this.vaultType;
		}

		public void setVaultType(String vaultType) {
			this.vaultType = vaultType;
		}

		public String getVaultStorageClass() {
			return this.vaultStorageClass;
		}

		public void setVaultStorageClass(String vaultStorageClass) {
			this.vaultStorageClass = vaultStorageClass;
		}

		public String getReplicationSourceVaultId() {
			return this.replicationSourceVaultId;
		}

		public void setReplicationSourceVaultId(String replicationSourceVaultId) {
			this.replicationSourceVaultId = replicationSourceVaultId;
		}

		public String getReplicationSourceRegionId() {
			return this.replicationSourceRegionId;
		}

		public void setReplicationSourceRegionId(String replicationSourceRegionId) {
			this.replicationSourceRegionId = replicationSourceRegionId;
		}

		public Boolean getReplication() {
			return this.replication;
		}

		public void setReplication(Boolean replication) {
			this.replication = replication;
		}
	}

	@Override
	public GetVaultListResponse getInstance(UnmarshallerContext context) {
		return	GetVaultListResponseUnmarshaller.unmarshall(this, context);
	}
}
