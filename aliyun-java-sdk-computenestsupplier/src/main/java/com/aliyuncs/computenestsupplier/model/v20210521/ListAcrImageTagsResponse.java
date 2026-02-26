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

package com.aliyuncs.computenestsupplier.model.v20210521;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.ListAcrImageTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAcrImageTagsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private Integer totalCount;

	private List<ImagesItem> images;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ImagesItem> getImages() {
		return this.images;
	}

	public void setImages(List<ImagesItem> images) {
		this.images = images;
	}

	public static class ImagesItem {

		private String tag;

		private String imageSize;

		private String createTime;

		private String modifiedTime;

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getImageSize() {
			return this.imageSize;
		}

		public void setImageSize(String imageSize) {
			this.imageSize = imageSize;
		}

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
	}

	@Override
	public ListAcrImageTagsResponse getInstance(UnmarshallerContext context) {
		return	ListAcrImageTagsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
