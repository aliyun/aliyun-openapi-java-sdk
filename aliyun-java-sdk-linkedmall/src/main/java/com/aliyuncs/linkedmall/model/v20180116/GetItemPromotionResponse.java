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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.GetItemPromotionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetItemPromotionResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String subCode;

	private String subMessage;

	private Boolean success;

	private ItemPromotionModel itemPromotionModel;

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

	public ItemPromotionModel getItemPromotionModel() {
		return this.itemPromotionModel;
	}

	public void setItemPromotionModel(ItemPromotionModel itemPromotionModel) {
		this.itemPromotionModel = itemPromotionModel;
	}

	public static class ItemPromotionModel {

		private String lmItemId;

		private Long itemId;

		private Boolean promotionFlag;

		private String promotionId;

		private String promotionName;

		private String promotionDesc;

		private String startTime;

		private String endTime;

		private Map<Object,Object> skuPromotion;

		private Map<Object,Object> extInfo;

		public String getLmItemId() {
			return this.lmItemId;
		}

		public void setLmItemId(String lmItemId) {
			this.lmItemId = lmItemId;
		}

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public Boolean getPromotionFlag() {
			return this.promotionFlag;
		}

		public void setPromotionFlag(Boolean promotionFlag) {
			this.promotionFlag = promotionFlag;
		}

		public String getPromotionId() {
			return this.promotionId;
		}

		public void setPromotionId(String promotionId) {
			this.promotionId = promotionId;
		}

		public String getPromotionName() {
			return this.promotionName;
		}

		public void setPromotionName(String promotionName) {
			this.promotionName = promotionName;
		}

		public String getPromotionDesc() {
			return this.promotionDesc;
		}

		public void setPromotionDesc(String promotionDesc) {
			this.promotionDesc = promotionDesc;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Map<Object,Object> getSkuPromotion() {
			return this.skuPromotion;
		}

		public void setSkuPromotion(Map<Object,Object> skuPromotion) {
			this.skuPromotion = skuPromotion;
		}

		public Map<Object,Object> getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(Map<Object,Object> extInfo) {
			this.extInfo = extInfo;
		}
	}

	@Override
	public GetItemPromotionResponse getInstance(UnmarshallerContext context) {
		return	GetItemPromotionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
