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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryGuideItemGroupWithOutInventoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryGuideItemGroupWithOutInventoryResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Long pageSize;

	private Long pageNumber;

	private Long totalCount;

	private List<Item> itemList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Item> getItemList() {
		return this.itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public static class Item {

		private String itemId;

		private String lmItemId;

		private String itemTitle;

		private String mainPicUrl;

		private String itemUrl;

		private Long priceCent;

		private Long points;

		private Long pointsAmount;

		private Long pointPrice;

		private String reservePrice;

		private Map<Object,Object> customizedAttributeMap;

		private String whitePicUrl;

		private List<String> tags;

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getLmItemId() {
			return this.lmItemId;
		}

		public void setLmItemId(String lmItemId) {
			this.lmItemId = lmItemId;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getMainPicUrl() {
			return this.mainPicUrl;
		}

		public void setMainPicUrl(String mainPicUrl) {
			this.mainPicUrl = mainPicUrl;
		}

		public String getItemUrl() {
			return this.itemUrl;
		}

		public void setItemUrl(String itemUrl) {
			this.itemUrl = itemUrl;
		}

		public Long getPriceCent() {
			return this.priceCent;
		}

		public void setPriceCent(Long priceCent) {
			this.priceCent = priceCent;
		}

		public Long getPoints() {
			return this.points;
		}

		public void setPoints(Long points) {
			this.points = points;
		}

		public Long getPointsAmount() {
			return this.pointsAmount;
		}

		public void setPointsAmount(Long pointsAmount) {
			this.pointsAmount = pointsAmount;
		}

		public Long getPointPrice() {
			return this.pointPrice;
		}

		public void setPointPrice(Long pointPrice) {
			this.pointPrice = pointPrice;
		}

		public String getReservePrice() {
			return this.reservePrice;
		}

		public void setReservePrice(String reservePrice) {
			this.reservePrice = reservePrice;
		}

		public Map<Object,Object> getCustomizedAttributeMap() {
			return this.customizedAttributeMap;
		}

		public void setCustomizedAttributeMap(Map<Object,Object> customizedAttributeMap) {
			this.customizedAttributeMap = customizedAttributeMap;
		}

		public String getWhitePicUrl() {
			return this.whitePicUrl;
		}

		public void setWhitePicUrl(String whitePicUrl) {
			this.whitePicUrl = whitePicUrl;
		}

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}
	}

	@Override
	public QueryGuideItemGroupWithOutInventoryResponse getInstance(UnmarshallerContext context) {
		return	QueryGuideItemGroupWithOutInventoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
