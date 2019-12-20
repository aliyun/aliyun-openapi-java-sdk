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
import com.aliyuncs.linkedmall.transform.v20180116.RenderOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RenderOrderResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String subCode;

	private String subMessage;

	private String logsId;

	private Boolean success;

	private Long totalCount;

	private Model model;

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

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private List<RenderOrderInfosItem> renderOrderInfos;

		public List<RenderOrderInfosItem> getRenderOrderInfos() {
			return this.renderOrderInfos;
		}

		public void setRenderOrderInfos(List<RenderOrderInfosItem> renderOrderInfos) {
			this.renderOrderInfos = renderOrderInfos;
		}

		public static class RenderOrderInfosItem {

			private Map<Object,Object> extInfo;

			private List<LmItemInfosItem> lmItemInfos;

			private List<DeliveryInfosItem> deliveryInfos;

			public Map<Object,Object> getExtInfo() {
				return this.extInfo;
			}

			public void setExtInfo(Map<Object,Object> extInfo) {
				this.extInfo = extInfo;
			}

			public List<LmItemInfosItem> getLmItemInfos() {
				return this.lmItemInfos;
			}

			public void setLmItemInfos(List<LmItemInfosItem> lmItemInfos) {
				this.lmItemInfos = lmItemInfos;
			}

			public List<DeliveryInfosItem> getDeliveryInfos() {
				return this.deliveryInfos;
			}

			public void setDeliveryInfos(List<DeliveryInfosItem> deliveryInfos) {
				this.deliveryInfos = deliveryInfos;
			}

			public static class LmItemInfosItem {

				private Long itemId;

				private Long skuId;

				private Integer quantity;

				private Boolean canSell;

				private String message;

				private String itemName;

				private String skuName;

				private String lmItemId;

				private Long sellerId;

				private String sellerNick;

				private Long cash;

				private Long points;

				private Long actualPrice;

				private String itemPicUrl;

				private String message1;

				public Long getItemId() {
					return this.itemId;
				}

				public void setItemId(Long itemId) {
					this.itemId = itemId;
				}

				public Long getSkuId() {
					return this.skuId;
				}

				public void setSkuId(Long skuId) {
					this.skuId = skuId;
				}

				public Integer getQuantity() {
					return this.quantity;
				}

				public void setQuantity(Integer quantity) {
					this.quantity = quantity;
				}

				public Boolean getCanSell() {
					return this.canSell;
				}

				public void setCanSell(Boolean canSell) {
					this.canSell = canSell;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public String getItemName() {
					return this.itemName;
				}

				public void setItemName(String itemName) {
					this.itemName = itemName;
				}

				public String getSkuName() {
					return this.skuName;
				}

				public void setSkuName(String skuName) {
					this.skuName = skuName;
				}

				public String getLmItemId() {
					return this.lmItemId;
				}

				public void setLmItemId(String lmItemId) {
					this.lmItemId = lmItemId;
				}

				public Long getSellerId() {
					return this.sellerId;
				}

				public void setSellerId(Long sellerId) {
					this.sellerId = sellerId;
				}

				public String getSellerNick() {
					return this.sellerNick;
				}

				public void setSellerNick(String sellerNick) {
					this.sellerNick = sellerNick;
				}

				public Long getCash() {
					return this.cash;
				}

				public void setCash(Long cash) {
					this.cash = cash;
				}

				public Long getPoints() {
					return this.points;
				}

				public void setPoints(Long points) {
					this.points = points;
				}

				public Long getActualPrice() {
					return this.actualPrice;
				}

				public void setActualPrice(Long actualPrice) {
					this.actualPrice = actualPrice;
				}

				public String getItemPicUrl() {
					return this.itemPicUrl;
				}

				public void setItemPicUrl(String itemPicUrl) {
					this.itemPicUrl = itemPicUrl;
				}

				public String getMessage1() {
					return this.message1;
				}

				public void setMessage1(String message1) {
					this.message1 = message1;
				}
			}

			public static class DeliveryInfosItem {

				private String id;

				private String displayName;

				private Long postFee;

				private Long serviceType;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public Long getPostFee() {
					return this.postFee;
				}

				public void setPostFee(Long postFee) {
					this.postFee = postFee;
				}

				public Long getServiceType() {
					return this.serviceType;
				}

				public void setServiceType(Long serviceType) {
					this.serviceType = serviceType;
				}
			}
		}
	}

	@Override
	public RenderOrderResponse getInstance(UnmarshallerContext context) {
		return	RenderOrderResponseUnmarshaller.unmarshall(this, context);
	}
}
