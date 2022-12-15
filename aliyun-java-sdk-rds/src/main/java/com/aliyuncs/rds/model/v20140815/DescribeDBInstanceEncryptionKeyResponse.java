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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceEncryptionKeyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceEncryptionKeyResponse extends AcsResponse {

	private String deleteDate;

	private String requestId;

	private String description;

	private String origin;

	private String materialExpireTime;

	private String encryptionKeyStatus;

	private String keyUsage;

	private String encryptionKey;

	private String creator;

	private List<EncryptionKeyInfo> encryptionKeyList;

	public String getDeleteDate() {
		return this.deleteDate;
	}

	public void setDeleteDate(String deleteDate) {
		this.deleteDate = deleteDate;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getMaterialExpireTime() {
		return this.materialExpireTime;
	}

	public void setMaterialExpireTime(String materialExpireTime) {
		this.materialExpireTime = materialExpireTime;
	}

	public String getEncryptionKeyStatus() {
		return this.encryptionKeyStatus;
	}

	public void setEncryptionKeyStatus(String encryptionKeyStatus) {
		this.encryptionKeyStatus = encryptionKeyStatus;
	}

	public String getKeyUsage() {
		return this.keyUsage;
	}

	public void setKeyUsage(String keyUsage) {
		this.keyUsage = keyUsage;
	}

	public String getEncryptionKey() {
		return this.encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public List<EncryptionKeyInfo> getEncryptionKeyList() {
		return this.encryptionKeyList;
	}

	public void setEncryptionKeyList(List<EncryptionKeyInfo> encryptionKeyList) {
		this.encryptionKeyList = encryptionKeyList;
	}

	public static class EncryptionKeyInfo {

		private String keyType;

		private String encryptionKey;

		private String description;

		private String keyUsage;

		private String deleteDate;

		private String creator;

		private String encryptionKeyStatus;

		private String origin;

		private String materialExpireTime;

		private String aliasName;

		private String usedBy;

		public String getKeyType() {
			return this.keyType;
		}

		public void setKeyType(String keyType) {
			this.keyType = keyType;
		}

		public String getEncryptionKey() {
			return this.encryptionKey;
		}

		public void setEncryptionKey(String encryptionKey) {
			this.encryptionKey = encryptionKey;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getKeyUsage() {
			return this.keyUsage;
		}

		public void setKeyUsage(String keyUsage) {
			this.keyUsage = keyUsage;
		}

		public String getDeleteDate() {
			return this.deleteDate;
		}

		public void setDeleteDate(String deleteDate) {
			this.deleteDate = deleteDate;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getEncryptionKeyStatus() {
			return this.encryptionKeyStatus;
		}

		public void setEncryptionKeyStatus(String encryptionKeyStatus) {
			this.encryptionKeyStatus = encryptionKeyStatus;
		}

		public String getOrigin() {
			return this.origin;
		}

		public void setOrigin(String origin) {
			this.origin = origin;
		}

		public String getMaterialExpireTime() {
			return this.materialExpireTime;
		}

		public void setMaterialExpireTime(String materialExpireTime) {
			this.materialExpireTime = materialExpireTime;
		}

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		public String getUsedBy() {
			return this.usedBy;
		}

		public void setUsedBy(String usedBy) {
			this.usedBy = usedBy;
		}
	}

	@Override
	public DescribeDBInstanceEncryptionKeyResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceEncryptionKeyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
