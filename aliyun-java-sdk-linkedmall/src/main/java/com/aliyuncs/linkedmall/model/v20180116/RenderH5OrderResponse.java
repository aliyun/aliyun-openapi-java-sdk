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
import com.aliyuncs.linkedmall.transform.v20180116.RenderH5OrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RenderH5OrderResponse extends AcsResponse {

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

		private Long buyerCurrentPoints;

		private Map<Object,Object> extInfo;

		private List<LmItemInfo> lmItemInfoList;

		private List<DeliveryInfo> deliveryInfoList;

		private List<AddressInfo> addressInfoList;

		private InvoiceInfo invoiceInfo;

		public Long getBuyerCurrentPoints() {
			return this.buyerCurrentPoints;
		}

		public void setBuyerCurrentPoints(Long buyerCurrentPoints) {
			this.buyerCurrentPoints = buyerCurrentPoints;
		}

		public Map<Object,Object> getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(Map<Object,Object> extInfo) {
			this.extInfo = extInfo;
		}

		public List<LmItemInfo> getLmItemInfoList() {
			return this.lmItemInfoList;
		}

		public void setLmItemInfoList(List<LmItemInfo> lmItemInfoList) {
			this.lmItemInfoList = lmItemInfoList;
		}

		public List<DeliveryInfo> getDeliveryInfoList() {
			return this.deliveryInfoList;
		}

		public void setDeliveryInfoList(List<DeliveryInfo> deliveryInfoList) {
			this.deliveryInfoList = deliveryInfoList;
		}

		public List<AddressInfo> getAddressInfoList() {
			return this.addressInfoList;
		}

		public void setAddressInfoList(List<AddressInfo> addressInfoList) {
			this.addressInfoList = addressInfoList;
		}

		public InvoiceInfo getInvoiceInfo() {
			return this.invoiceInfo;
		}

		public void setInvoiceInfo(InvoiceInfo invoiceInfo) {
			this.invoiceInfo = invoiceInfo;
		}

		public static class LmItemInfo {

			private String lmItemId;

			private Long itemId;

			private String itemName;

			private String skuName;

			private Long skuId;

			private Long sellerId;

			private String tbShopName;

			private String sellerNick;

			private Long cash;

			private Long points;

			private Long actualPrice;

			private Integer quantity;

			private String itemUrl;

			private String itemPicUrl;

			private Boolean canSell;

			private String message;

			private String virtualItemType;

			private Map<Object,Object> features;

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

			public Long getSkuId() {
				return this.skuId;
			}

			public void setSkuId(Long skuId) {
				this.skuId = skuId;
			}

			public Long getSellerId() {
				return this.sellerId;
			}

			public void setSellerId(Long sellerId) {
				this.sellerId = sellerId;
			}

			public String getTbShopName() {
				return this.tbShopName;
			}

			public void setTbShopName(String tbShopName) {
				this.tbShopName = tbShopName;
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

			public Integer getQuantity() {
				return this.quantity;
			}

			public void setQuantity(Integer quantity) {
				this.quantity = quantity;
			}

			public String getItemUrl() {
				return this.itemUrl;
			}

			public void setItemUrl(String itemUrl) {
				this.itemUrl = itemUrl;
			}

			public String getItemPicUrl() {
				return this.itemPicUrl;
			}

			public void setItemPicUrl(String itemPicUrl) {
				this.itemPicUrl = itemPicUrl;
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

			public String getVirtualItemType() {
				return this.virtualItemType;
			}

			public void setVirtualItemType(String virtualItemType) {
				this.virtualItemType = virtualItemType;
			}

			public Map<Object,Object> getFeatures() {
				return this.features;
			}

			public void setFeatures(Map<Object,Object> features) {
				this.features = features;
			}
		}

		public static class DeliveryInfo {

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

		public static class AddressInfo {

			private Long addressId;

			private String receiver;

			private String receiverPhone;

			private String addressDetail;

			private String divisionCode;

			private Boolean _default;

			public Long getAddressId() {
				return this.addressId;
			}

			public void setAddressId(Long addressId) {
				this.addressId = addressId;
			}

			public String getReceiver() {
				return this.receiver;
			}

			public void setReceiver(String receiver) {
				this.receiver = receiver;
			}

			public String getReceiverPhone() {
				return this.receiverPhone;
			}

			public void setReceiverPhone(String receiverPhone) {
				this.receiverPhone = receiverPhone;
			}

			public String getAddressDetail() {
				return this.addressDetail;
			}

			public void setAddressDetail(String addressDetail) {
				this.addressDetail = addressDetail;
			}

			public String getDivisionCode() {
				return this.divisionCode;
			}

			public void setDivisionCode(String divisionCode) {
				this.divisionCode = divisionCode;
			}

			public Boolean get_Default() {
				return this._default;
			}

			public void set_Default(Boolean _default) {
				this._default = _default;
			}
		}

		public static class InvoiceInfo {

			private String type;

			private String desc;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDesc() {
				return this.desc;
			}

			public void setDesc(String desc) {
				this.desc = desc;
			}
		}
	}

	@Override
	public RenderH5OrderResponse getInstance(UnmarshallerContext context) {
		return	RenderH5OrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
