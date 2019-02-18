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
import com.aliyuncs.ecs.transform.v20140526.DescribeLaunchTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLaunchTemplatesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<LaunchTemplateSet> launchTemplateSets;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<LaunchTemplateSet> getLaunchTemplateSets() {
		return this.launchTemplateSets;
	}

	public void setLaunchTemplateSets(List<LaunchTemplateSet> launchTemplateSets) {
		this.launchTemplateSets = launchTemplateSets;
	}

	public static class LaunchTemplateSet {

		private String createTime;

		private String modifiedTime;

		private String launchTemplateId;

		private String launchTemplateName;

		private Long defaultVersionNumber;

		private Long latestVersionNumber;

		private String createdBy;

		private String resourceGroupId;

		private List<Tag> tags;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getLaunchTemplateId() {
			return this.launchTemplateId;
		}

		public void setLaunchTemplateId(String launchTemplateId) {
			this.launchTemplateId = launchTemplateId;
		}

		public String getLaunchTemplateName() {
			return this.launchTemplateName;
		}

		public void setLaunchTemplateName(String launchTemplateName) {
			this.launchTemplateName = launchTemplateName;
		}

		public Long getDefaultVersionNumber() {
			return this.defaultVersionNumber;
		}

		public void setDefaultVersionNumber(Long defaultVersionNumber) {
			this.defaultVersionNumber = defaultVersionNumber;
		}

		public Long getLatestVersionNumber() {
			return this.latestVersionNumber;
		}

		public void setLatestVersionNumber(Long latestVersionNumber) {
			this.latestVersionNumber = latestVersionNumber;
		}

		public String getCreatedBy() {
			return this.createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
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
	public DescribeLaunchTemplatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeLaunchTemplatesResponseUnmarshaller.unmarshall(this, context);
	}
}
