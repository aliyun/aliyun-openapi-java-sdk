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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeImageGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeImageGroupsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<ImageGroup> imageGroups;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<ImageGroup> getImageGroups() {
		return this.imageGroups;
	}

	public void setImageGroups(List<ImageGroup> imageGroups) {
		this.imageGroups = imageGroups;
	}

	public static class ImageGroup {

		private String creationTime;

		private String publishState;

		private String imageGroup;

		private String publishTag;

		private String modifyTime;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getPublishState() {
			return this.publishState;
		}

		public void setPublishState(String publishState) {
			this.publishState = publishState;
		}

		public String getImageGroup() {
			return this.imageGroup;
		}

		public void setImageGroup(String imageGroup) {
			this.imageGroup = imageGroup;
		}

		public String getPublishTag() {
			return this.publishTag;
		}

		public void setPublishTag(String publishTag) {
			this.publishTag = publishTag;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public OpsDescribeImageGroupsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeImageGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
