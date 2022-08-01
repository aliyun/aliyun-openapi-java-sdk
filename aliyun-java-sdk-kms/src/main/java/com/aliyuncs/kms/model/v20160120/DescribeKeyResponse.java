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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.DescribeKeyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKeyResponse extends AcsResponse {

	private String requestId;

	private KeyMetadata keyMetadata;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public KeyMetadata getKeyMetadata() {
		return this.keyMetadata;
	}

	public void setKeyMetadata(KeyMetadata keyMetadata) {
		this.keyMetadata = keyMetadata;
	}

	public static class KeyMetadata {

		private String deletionProtection;

		private String keyId;

		private String nextRotationDate;

		private String keyState;

		private String rotationInterval;

		private String arn;

		private String creator;

		private String lastRotationDate;

		private String deleteDate;

		private String primaryKeyVersion;

		private String description;

		private String keySpec;

		private String origin;

		private String materialExpireTime;

		private String deletionProtectionDescription;

		private String automaticRotation;

		private String protectionLevel;

		private String keyUsage;

		private String creationDate;

		private String dKMSInstanceId;

		public String getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(String deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public String getKeyId() {
			return this.keyId;
		}

		public void setKeyId(String keyId) {
			this.keyId = keyId;
		}

		public String getNextRotationDate() {
			return this.nextRotationDate;
		}

		public void setNextRotationDate(String nextRotationDate) {
			this.nextRotationDate = nextRotationDate;
		}

		public String getKeyState() {
			return this.keyState;
		}

		public void setKeyState(String keyState) {
			this.keyState = keyState;
		}

		public String getRotationInterval() {
			return this.rotationInterval;
		}

		public void setRotationInterval(String rotationInterval) {
			this.rotationInterval = rotationInterval;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getLastRotationDate() {
			return this.lastRotationDate;
		}

		public void setLastRotationDate(String lastRotationDate) {
			this.lastRotationDate = lastRotationDate;
		}

		public String getDeleteDate() {
			return this.deleteDate;
		}

		public void setDeleteDate(String deleteDate) {
			this.deleteDate = deleteDate;
		}

		public String getPrimaryKeyVersion() {
			return this.primaryKeyVersion;
		}

		public void setPrimaryKeyVersion(String primaryKeyVersion) {
			this.primaryKeyVersion = primaryKeyVersion;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getKeySpec() {
			return this.keySpec;
		}

		public void setKeySpec(String keySpec) {
			this.keySpec = keySpec;
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

		public String getDeletionProtectionDescription() {
			return this.deletionProtectionDescription;
		}

		public void setDeletionProtectionDescription(String deletionProtectionDescription) {
			this.deletionProtectionDescription = deletionProtectionDescription;
		}

		public String getAutomaticRotation() {
			return this.automaticRotation;
		}

		public void setAutomaticRotation(String automaticRotation) {
			this.automaticRotation = automaticRotation;
		}

		public String getProtectionLevel() {
			return this.protectionLevel;
		}

		public void setProtectionLevel(String protectionLevel) {
			this.protectionLevel = protectionLevel;
		}

		public String getKeyUsage() {
			return this.keyUsage;
		}

		public void setKeyUsage(String keyUsage) {
			this.keyUsage = keyUsage;
		}

		public String getCreationDate() {
			return this.creationDate;
		}

		public void setCreationDate(String creationDate) {
			this.creationDate = creationDate;
		}

		public String getDKMSInstanceId() {
			return this.dKMSInstanceId;
		}

		public void setDKMSInstanceId(String dKMSInstanceId) {
			this.dKMSInstanceId = dKMSInstanceId;
		}
	}

	@Override
	public DescribeKeyResponse getInstance(UnmarshallerContext context) {
		return	DescribeKeyResponseUnmarshaller.unmarshall(this, context);
	}
}
