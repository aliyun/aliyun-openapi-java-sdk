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
import com.aliyuncs.ecs.transform.v20140526.DescribePortRangeListsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePortRangeListsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<PortRangeList> portRangeLists;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PortRangeList> getPortRangeLists() {
		return this.portRangeLists;
	}

	public void setPortRangeLists(List<PortRangeList> portRangeLists) {
		this.portRangeLists = portRangeLists;
	}

	public static class PortRangeList {

		private String portRangeListId;

		private String portRangeListName;

		private Integer maxEntries;

		private Integer associationCount;

		private String description;

		private String creationTime;

		private String resourceGroupId;

		private List<Tag> tags;

		public String getPortRangeListId() {
			return this.portRangeListId;
		}

		public void setPortRangeListId(String portRangeListId) {
			this.portRangeListId = portRangeListId;
		}

		public String getPortRangeListName() {
			return this.portRangeListName;
		}

		public void setPortRangeListName(String portRangeListName) {
			this.portRangeListName = portRangeListName;
		}

		public Integer getMaxEntries() {
			return this.maxEntries;
		}

		public void setMaxEntries(Integer maxEntries) {
			this.maxEntries = maxEntries;
		}

		public Integer getAssociationCount() {
			return this.associationCount;
		}

		public void setAssociationCount(Integer associationCount) {
			this.associationCount = associationCount;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
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
	public DescribePortRangeListsResponse getInstance(UnmarshallerContext context) {
		return	DescribePortRangeListsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
