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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.ListFlowControlTaskItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowControlTaskItemsResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String totalCount;

		private String validCount;

		private List<DetailItem> detail;

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public String getValidCount() {
			return this.validCount;
		}

		public void setValidCount(String validCount) {
			this.validCount = validCount;
		}

		public List<DetailItem> getDetail() {
			return this.detail;
		}

		public void setDetail(List<DetailItem> detail) {
			this.detail = detail;
		}

		public static class DetailItem {

			private String author;

			private String duration;

			private String itemId;

			private String itemType;

			private String expireTime;

			private String categoryPath;

			private String pubTime;

			private String lastModifyTime;

			private String channel;

			private String weight;

			private String title;

			private String status;

			public String getAuthor() {
				return this.author;
			}

			public void setAuthor(String author) {
				this.author = author;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public String getItemId() {
				return this.itemId;
			}

			public void setItemId(String itemId) {
				this.itemId = itemId;
			}

			public String getItemType() {
				return this.itemType;
			}

			public void setItemType(String itemType) {
				this.itemType = itemType;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public String getCategoryPath() {
				return this.categoryPath;
			}

			public void setCategoryPath(String categoryPath) {
				this.categoryPath = categoryPath;
			}

			public String getPubTime() {
				return this.pubTime;
			}

			public void setPubTime(String pubTime) {
				this.pubTime = pubTime;
			}

			public String getLastModifyTime() {
				return this.lastModifyTime;
			}

			public void setLastModifyTime(String lastModifyTime) {
				this.lastModifyTime = lastModifyTime;
			}

			public String getChannel() {
				return this.channel;
			}

			public void setChannel(String channel) {
				this.channel = channel;
			}

			public String getWeight() {
				return this.weight;
			}

			public void setWeight(String weight) {
				this.weight = weight;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public ListFlowControlTaskItemsResponse getInstance(UnmarshallerContext context) {
		return	ListFlowControlTaskItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
