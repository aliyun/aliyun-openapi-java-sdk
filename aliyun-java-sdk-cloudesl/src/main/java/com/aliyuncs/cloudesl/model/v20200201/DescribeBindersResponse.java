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

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribeBindersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBindersResponse extends AcsResponse {

	private String errorMessage;

	private String errorCode;

	private Integer totalCount;

	private String message;

	private Integer pageSize;

	private String dynamicCode;

	private String code;

	private String dynamicMessage;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<EslItemBindInfo> eslItemBindInfos;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<EslItemBindInfo> getEslItemBindInfos() {
		return this.eslItemBindInfos;
	}

	public void setEslItemBindInfos(List<EslItemBindInfo> eslItemBindInfos) {
		this.eslItemBindInfos = eslItemBindInfos;
	}

	public static class EslItemBindInfo {

		private String promotionText;

		private String bindId;

		private String storeId;

		private String templateId;

		private String eslPic;

		private String eslStatus;

		private String itemTitle;

		private String originalPrice;

		private String templateSceneId;

		private String gmtModified;

		private String actionPrice;

		private String priceUnit;

		private String eslConnectAp;

		private String skuId;

		private String eslBarCode;

		private String itemShortTitle;

		private Boolean bePromotion;

		private String eslModel;

		private String itemBarCode;

		private String itemId;

		private String promotionStart;

		private String promotionEnd;

		public String getPromotionText() {
			return this.promotionText;
		}

		public void setPromotionText(String promotionText) {
			this.promotionText = promotionText;
		}

		public String getBindId() {
			return this.bindId;
		}

		public void setBindId(String bindId) {
			this.bindId = bindId;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getEslPic() {
			return this.eslPic;
		}

		public void setEslPic(String eslPic) {
			this.eslPic = eslPic;
		}

		public String getEslStatus() {
			return this.eslStatus;
		}

		public void setEslStatus(String eslStatus) {
			this.eslStatus = eslStatus;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(String originalPrice) {
			this.originalPrice = originalPrice;
		}

		public String getTemplateSceneId() {
			return this.templateSceneId;
		}

		public void setTemplateSceneId(String templateSceneId) {
			this.templateSceneId = templateSceneId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getActionPrice() {
			return this.actionPrice;
		}

		public void setActionPrice(String actionPrice) {
			this.actionPrice = actionPrice;
		}

		public String getPriceUnit() {
			return this.priceUnit;
		}

		public void setPriceUnit(String priceUnit) {
			this.priceUnit = priceUnit;
		}

		public String getEslConnectAp() {
			return this.eslConnectAp;
		}

		public void setEslConnectAp(String eslConnectAp) {
			this.eslConnectAp = eslConnectAp;
		}

		public String getSkuId() {
			return this.skuId;
		}

		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}

		public String getEslBarCode() {
			return this.eslBarCode;
		}

		public void setEslBarCode(String eslBarCode) {
			this.eslBarCode = eslBarCode;
		}

		public String getItemShortTitle() {
			return this.itemShortTitle;
		}

		public void setItemShortTitle(String itemShortTitle) {
			this.itemShortTitle = itemShortTitle;
		}

		public Boolean getBePromotion() {
			return this.bePromotion;
		}

		public void setBePromotion(Boolean bePromotion) {
			this.bePromotion = bePromotion;
		}

		public String getEslModel() {
			return this.eslModel;
		}

		public void setEslModel(String eslModel) {
			this.eslModel = eslModel;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getPromotionStart() {
			return this.promotionStart;
		}

		public void setPromotionStart(String promotionStart) {
			this.promotionStart = promotionStart;
		}

		public String getPromotionEnd() {
			return this.promotionEnd;
		}

		public void setPromotionEnd(String promotionEnd) {
			this.promotionEnd = promotionEnd;
		}
	}

	@Override
	public DescribeBindersResponse getInstance(UnmarshallerContext context) {
		return	DescribeBindersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
