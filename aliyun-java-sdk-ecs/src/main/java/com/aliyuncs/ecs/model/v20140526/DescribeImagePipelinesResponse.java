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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeImagePipelinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImagePipelinesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<ImagePipelineSet> imagePipeline;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ImagePipelineSet> getImagePipeline() {
		return this.imagePipeline;
	}

	public void setImagePipeline(List<ImagePipelineSet> imagePipeline) {
		this.imagePipeline = imagePipeline;
	}

	public static class ImagePipelineSet {

		private String creationTime;

		private String imagePipelineId;

		private String name;

		private String description;

		private String baseImageType;

		private String baseImage;

		private String imageName;

		private String vSwitchId;

		private String instanceType;

		private Integer internetMaxBandwidthOut;

		private Integer systemDiskSize;

		private Boolean deleteInstanceOnFailure;

		private String buildContent;

		private String resourceGroupId;

		private List<Tag> tags;

		private List<String> addAccounts;

		private List<String> toRegionIds;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getImagePipelineId() {
			return this.imagePipelineId;
		}

		public void setImagePipelineId(String imagePipelineId) {
			this.imagePipelineId = imagePipelineId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBaseImageType() {
			return this.baseImageType;
		}

		public void setBaseImageType(String baseImageType) {
			this.baseImageType = baseImageType;
		}

		public String getBaseImage() {
			return this.baseImage;
		}

		public void setBaseImage(String baseImage) {
			this.baseImage = baseImage;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public Boolean getDeleteInstanceOnFailure() {
			return this.deleteInstanceOnFailure;
		}

		public void setDeleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
			this.deleteInstanceOnFailure = deleteInstanceOnFailure;
		}

		public String getBuildContent() {
			return this.buildContent;
		}

		public void setBuildContent(String buildContent) {
			this.buildContent = buildContent;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getAddAccounts() {
			return this.addAccounts;
		}

		public void setAddAccounts(List<String> addAccounts) {
			this.addAccounts = addAccounts;
		}

		public List<String> getToRegionIds() {
			return this.toRegionIds;
		}

		public void setToRegionIds(List<String> toRegionIds) {
			this.toRegionIds = toRegionIds;
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public DescribeImagePipelinesResponse getInstance(UnmarshallerContext context) {
		return	DescribeImagePipelinesResponseUnmarshaller.unmarshall(this, context);
	}
}
