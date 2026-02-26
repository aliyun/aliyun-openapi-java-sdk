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
import com.aliyuncs.sas.transform.v20181203.DescribeImageInfoListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageInfoListResponse extends AcsResponse {

	private String requestId;

	private List<ImageInfo> imageInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageInfo> getImageInfos() {
		return this.imageInfos;
	}

	public void setImageInfos(List<ImageInfo> imageInfos) {
		this.imageInfos = imageInfos;
	}

	public static class ImageInfo {

		private String status;

		private String endpoints;

		private String riskStatus;

		private String vulStatus;

		private Long imageCreate;

		private String alarmStatus;

		private String digest;

		private String registryType;

		private Long imageUpdate;

		private String tag;

		private String instanceId;

		private String repoType;

		private String regionId;

		private String uuid;

		private Long imageSize;

		private String repoId;

		private Integer tagImmutable;

		private Integer vulCount;

		private Integer alarmCount;

		private String imageId;

		private String repoName;

		private String repoNamespace;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(String endpoints) {
			this.endpoints = endpoints;
		}

		public String getRiskStatus() {
			return this.riskStatus;
		}

		public void setRiskStatus(String riskStatus) {
			this.riskStatus = riskStatus;
		}

		public String getVulStatus() {
			return this.vulStatus;
		}

		public void setVulStatus(String vulStatus) {
			this.vulStatus = vulStatus;
		}

		public Long getImageCreate() {
			return this.imageCreate;
		}

		public void setImageCreate(Long imageCreate) {
			this.imageCreate = imageCreate;
		}

		public String getAlarmStatus() {
			return this.alarmStatus;
		}

		public void setAlarmStatus(String alarmStatus) {
			this.alarmStatus = alarmStatus;
		}

		public String getDigest() {
			return this.digest;
		}

		public void setDigest(String digest) {
			this.digest = digest;
		}

		public String getRegistryType() {
			return this.registryType;
		}

		public void setRegistryType(String registryType) {
			this.registryType = registryType;
		}

		public Long getImageUpdate() {
			return this.imageUpdate;
		}

		public void setImageUpdate(Long imageUpdate) {
			this.imageUpdate = imageUpdate;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRepoType() {
			return this.repoType;
		}

		public void setRepoType(String repoType) {
			this.repoType = repoType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Long getImageSize() {
			return this.imageSize;
		}

		public void setImageSize(Long imageSize) {
			this.imageSize = imageSize;
		}

		public String getRepoId() {
			return this.repoId;
		}

		public void setRepoId(String repoId) {
			this.repoId = repoId;
		}

		public Integer getTagImmutable() {
			return this.tagImmutable;
		}

		public void setTagImmutable(Integer tagImmutable) {
			this.tagImmutable = tagImmutable;
		}

		public Integer getVulCount() {
			return this.vulCount;
		}

		public void setVulCount(Integer vulCount) {
			this.vulCount = vulCount;
		}

		public Integer getAlarmCount() {
			return this.alarmCount;
		}

		public void setAlarmCount(Integer alarmCount) {
			this.alarmCount = alarmCount;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getRepoName() {
			return this.repoName;
		}

		public void setRepoName(String repoName) {
			this.repoName = repoName;
		}

		public String getRepoNamespace() {
			return this.repoNamespace;
		}

		public void setRepoNamespace(String repoNamespace) {
			this.repoNamespace = repoNamespace;
		}
	}

	@Override
	public DescribeImageInfoListResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageInfoListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
