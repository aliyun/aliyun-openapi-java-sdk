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

package com.aliyuncs.airec.model.v20181012;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20181012.ListSceneItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSceneItemsResponse extends AcsResponse {

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

		private List<DetailItem> detail;

		private Total total;

		public List<DetailItem> getDetail() {
			return this.detail;
		}

		public void setDetail(List<DetailItem> detail) {
			this.detail = detail;
		}

		public Total getTotal() {
			return this.total;
		}

		public void setTotal(Total total) {
			this.total = total;
		}

		public static class DetailItem {

			private String itemId;

			private String itemType;

			private String expireTime;

			private String categoryPath;

			private String pubTime;

			private String brandId;

			private String shopId;

			private String title;

			private String status;

			private String duration;

			private String author;

			private String channel;

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

			public String getBrandId() {
				return this.brandId;
			}

			public void setBrandId(String brandId) {
				this.brandId = brandId;
			}

			public String getShopId() {
				return this.shopId;
			}

			public void setShopId(String shopId) {
				this.shopId = shopId;
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

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public String getAuthor() {
				return this.author;
			}

			public void setAuthor(String author) {
				this.author = author;
			}

			public String getChannel() {
				return this.channel;
			}

			public void setChannel(String channel) {
				this.channel = channel;
			}
		}

		public static class Total {

			private Long instanceRecommendItem;

			private Long sceneRecommendItem;

			private Long weightItem;

			private Long sceneWeightItem;

			private Long totalCount;

			public Long getInstanceRecommendItem() {
				return this.instanceRecommendItem;
			}

			public void setInstanceRecommendItem(Long instanceRecommendItem) {
				this.instanceRecommendItem = instanceRecommendItem;
			}

			public Long getSceneRecommendItem() {
				return this.sceneRecommendItem;
			}

			public void setSceneRecommendItem(Long sceneRecommendItem) {
				this.sceneRecommendItem = sceneRecommendItem;
			}

			public Long getWeightItem() {
				return this.weightItem;
			}

			public void setWeightItem(Long weightItem) {
				this.weightItem = weightItem;
			}

			public Long getSceneWeightItem() {
				return this.sceneWeightItem;
			}

			public void setSceneWeightItem(Long sceneWeightItem) {
				this.sceneWeightItem = sceneWeightItem;
			}

			public Long getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Long totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public ListSceneItemsResponse getInstance(UnmarshallerContext context) {
		return	ListSceneItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
