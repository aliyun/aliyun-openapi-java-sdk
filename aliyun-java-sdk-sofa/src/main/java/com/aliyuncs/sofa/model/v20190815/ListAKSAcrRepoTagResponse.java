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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListAKSAcrRepoTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAKSAcrRepoTagResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private TagList tagList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public TagList getTagList() {
		return this.tagList;
	}

	public void setTagList(TagList tagList) {
		this.tagList = tagList;
	}

	public static class TagList {

		private Long page;

		private Long pageSize;

		private Long total;

		private List<TagsItem> tags;

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public static class TagsItem {

			private String digest;

			private Long imageCreate;

			private String imageId;

			private Long imageSize;

			private Long imageUpdate;

			private String status;

			private String tag;

			public String getDigest() {
				return this.digest;
			}

			public void setDigest(String digest) {
				this.digest = digest;
			}

			public Long getImageCreate() {
				return this.imageCreate;
			}

			public void setImageCreate(Long imageCreate) {
				this.imageCreate = imageCreate;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public Long getImageSize() {
				return this.imageSize;
			}

			public void setImageSize(Long imageSize) {
				this.imageSize = imageSize;
			}

			public Long getImageUpdate() {
				return this.imageUpdate;
			}

			public void setImageUpdate(Long imageUpdate) {
				this.imageUpdate = imageUpdate;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}
		}
	}

	@Override
	public ListAKSAcrRepoTagResponse getInstance(UnmarshallerContext context) {
		return	ListAKSAcrRepoTagResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
