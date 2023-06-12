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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListPrivateAccessTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrivateAccessTagsResponse extends AcsResponse {

	private String requestId;

	private Integer totalNum;

	private List<Tag> tags;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public static class Tag {

		private String tagId;

		private String name;

		private String description;

		private String tagType;

		private String createTime;

		private List<String> applicationIds;

		private List<String> policyIds;

		public String getTagId() {
			return this.tagId;
		}

		public void setTagId(String tagId) {
			this.tagId = tagId;
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

		public String getTagType() {
			return this.tagType;
		}

		public void setTagType(String tagType) {
			this.tagType = tagType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<String> getApplicationIds() {
			return this.applicationIds;
		}

		public void setApplicationIds(List<String> applicationIds) {
			this.applicationIds = applicationIds;
		}

		public List<String> getPolicyIds() {
			return this.policyIds;
		}

		public void setPolicyIds(List<String> policyIds) {
			this.policyIds = policyIds;
		}
	}

	@Override
	public ListPrivateAccessTagsResponse getInstance(UnmarshallerContext context) {
		return	ListPrivateAccessTagsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
