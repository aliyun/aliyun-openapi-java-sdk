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
import com.aliyuncs.ecs.transform.v20140526.DescribeTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTagsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<Tag> tags;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

		private ResourceTypeCount resourceTypeCount;

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

		public ResourceTypeCount getResourceTypeCount() {
			return this.resourceTypeCount;
		}

		public void setResourceTypeCount(ResourceTypeCount resourceTypeCount) {
			this.resourceTypeCount = resourceTypeCount;
		}

		public static class ResourceTypeCount {

			private Integer instance;

			private Integer disk;

			private Integer volume;

			private Integer image;

			private Integer snapshot;

			private Integer securitygroup;

			private Integer launchTemplate;

			private Integer eni;

			private Integer ddh;

			private Integer keyPair;

			public Integer getInstance() {
				return this.instance;
			}

			public void setInstance(Integer instance) {
				this.instance = instance;
			}

			public Integer getDisk() {
				return this.disk;
			}

			public void setDisk(Integer disk) {
				this.disk = disk;
			}

			public Integer getVolume() {
				return this.volume;
			}

			public void setVolume(Integer volume) {
				this.volume = volume;
			}

			public Integer getImage() {
				return this.image;
			}

			public void setImage(Integer image) {
				this.image = image;
			}

			public Integer getSnapshot() {
				return this.snapshot;
			}

			public void setSnapshot(Integer snapshot) {
				this.snapshot = snapshot;
			}

			public Integer getSecuritygroup() {
				return this.securitygroup;
			}

			public void setSecuritygroup(Integer securitygroup) {
				this.securitygroup = securitygroup;
			}

			public Integer getLaunchTemplate() {
				return this.launchTemplate;
			}

			public void setLaunchTemplate(Integer launchTemplate) {
				this.launchTemplate = launchTemplate;
			}

			public Integer getEni() {
				return this.eni;
			}

			public void setEni(Integer eni) {
				this.eni = eni;
			}

			public Integer getDdh() {
				return this.ddh;
			}

			public void setDdh(Integer ddh) {
				this.ddh = ddh;
			}

			public Integer getKeyPair() {
				return this.keyPair;
			}

			public void setKeyPair(Integer keyPair) {
				this.keyPair = keyPair;
			}
		}
	}

	@Override
	public DescribeTagsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTagsResponseUnmarshaller.unmarshall(this, context);
	}
}
