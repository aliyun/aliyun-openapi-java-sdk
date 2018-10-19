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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryGuideItemGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryGuideItemGroupResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String subCode;

	private String subMessage;

	private Boolean success;

	private List<ItemInfo> guideItemGroup;

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

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return this.subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ItemInfo> getGuideItemGroup() {
		return this.guideItemGroup;
	}

	public void setGuideItemGroup(List<ItemInfo> guideItemGroup) {
		this.guideItemGroup = guideItemGroup;
	}

	public static class ItemInfo {

		private Long itemId;

		private String itemTitle;

		private String mainPicUrl;

		private String itemUrl;

		private Long priceCent;

		private Long points;

		private Long reservePrice;

		private Long pointsAmount;

		private Long pointPrice;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
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

		public Long getReservePrice() {
			return this.reservePrice;
		}

		public void setReservePrice(Long reservePrice) {
			this.reservePrice = reservePrice;
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
	}

	@Override
	public QueryGuideItemGroupResponse getInstance(UnmarshallerContext context) {
		return	QueryGuideItemGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
