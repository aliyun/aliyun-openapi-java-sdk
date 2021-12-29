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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeCACertificatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCACertificatesResponse extends AcsResponse {

	private String requestId;

	private List<CACertificate> cACertificates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CACertificate> getCACertificates() {
		return this.cACertificates;
	}

	public void setCACertificates(List<CACertificate> cACertificates) {
		this.cACertificates = cACertificates;
	}

	public static class CACertificate {

		private Long createTimeStamp;

		private String standardType;

		private String expireTime;

		private String createTime;

		private Integer encryptionKeyLength;

		private Long expireTimeStamp;

		private String cACertificateId;

		private String regionId;

		private String encryptionAlgorithm;

		private String fingerprint;

		private String resourceGroupId;

		private String commonName;

		private String cACertificateName;

		private List<Tag> tags;

		public Long getCreateTimeStamp() {
			return this.createTimeStamp;
		}

		public void setCreateTimeStamp(Long createTimeStamp) {
			this.createTimeStamp = createTimeStamp;
		}

		public String getStandardType() {
			return this.standardType;
		}

		public void setStandardType(String standardType) {
			this.standardType = standardType;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Integer getEncryptionKeyLength() {
			return this.encryptionKeyLength;
		}

		public void setEncryptionKeyLength(Integer encryptionKeyLength) {
			this.encryptionKeyLength = encryptionKeyLength;
		}

		public Long getExpireTimeStamp() {
			return this.expireTimeStamp;
		}

		public void setExpireTimeStamp(Long expireTimeStamp) {
			this.expireTimeStamp = expireTimeStamp;
		}

		public String getCACertificateId() {
			return this.cACertificateId;
		}

		public void setCACertificateId(String cACertificateId) {
			this.cACertificateId = cACertificateId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEncryptionAlgorithm() {
			return this.encryptionAlgorithm;
		}

		public void setEncryptionAlgorithm(String encryptionAlgorithm) {
			this.encryptionAlgorithm = encryptionAlgorithm;
		}

		public String getFingerprint() {
			return this.fingerprint;
		}

		public void setFingerprint(String fingerprint) {
			this.fingerprint = fingerprint;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCommonName() {
			return this.commonName;
		}

		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}

		public String getCACertificateName() {
			return this.cACertificateName;
		}

		public void setCACertificateName(String cACertificateName) {
			this.cACertificateName = cACertificateName;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String tagValue;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}
	}

	@Override
	public DescribeCACertificatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCACertificatesResponseUnmarshaller.unmarshall(this, context);
	}
}
