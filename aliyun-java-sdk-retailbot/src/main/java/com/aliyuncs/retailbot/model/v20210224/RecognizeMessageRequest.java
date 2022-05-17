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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RecognizeMessageRequest extends RpcAcsRequest<RecognizeMessageResponse> {
	   

	private String serviceMode;

	private String focusOrderId;

	@SerializedName("expectedSlots")
	private List<ExpectedSlots> expectedSlots;

	private String focusItemId;

	@SerializedName("clientInfo")
	private ClientInfo clientInfo;

	private String userNick;

	private String sessionId;

	private String userId;

	private String content;

	private String sellerNick;

	private Boolean stressTesting;

	private String staffId;

	private String staffNick;

	private String chatId;

	@SerializedName("packages")
	private List<Packages> packages;

	private String robotCode;

	private String contentType;

	private String sellerId;

	private Integer round;

	@SerializedName("orders")
	private List<Orders> orders;

	@SerializedName("extraContent")
	private Map<String,String> extraContent;

	@SerializedName("items")
	private List<Items> items;
	public RecognizeMessageRequest() {
		super("RetailBot", "2021-02-24", "RecognizeMessage");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getServiceMode() {
		return this.serviceMode;
	}

	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
		if(serviceMode != null){
			putBodyParameter("ServiceMode", serviceMode);
		}
	}

	public String getFocusOrderId() {
		return this.focusOrderId;
	}

	public void setFocusOrderId(String focusOrderId) {
		this.focusOrderId = focusOrderId;
		if(focusOrderId != null){
			putBodyParameter("FocusOrderId", focusOrderId);
		}
	}

	public List<ExpectedSlots> getExpectedSlots() {
		return this.expectedSlots;
	}

	public void setExpectedSlots(List<ExpectedSlots> expectedSlots) {
		this.expectedSlots = expectedSlots;	
		if (expectedSlots != null) {
			putBodyParameter("ExpectedSlots" , new Gson().toJson(expectedSlots));
		}	
	}

	public String getFocusItemId() {
		return this.focusItemId;
	}

	public void setFocusItemId(String focusItemId) {
		this.focusItemId = focusItemId;
		if(focusItemId != null){
			putBodyParameter("FocusItemId", focusItemId);
		}
	}

	public ClientInfo getClientInfo() {
		return this.clientInfo;
	}

	public void setClientInfo(ClientInfo clientInfo) {
		this.clientInfo = clientInfo;	
		if (clientInfo != null) {
			putBodyParameter("ClientInfo" , new Gson().toJson(clientInfo));
		}	
	}

	public String getUserNick() {
		return this.userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
		if(userNick != null){
			putBodyParameter("UserNick", userNick);
		}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putBodyParameter("SessionId", sessionId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
		if(sellerNick != null){
			putBodyParameter("SellerNick", sellerNick);
		}
	}

	public Boolean getStressTesting() {
		return this.stressTesting;
	}

	public void setStressTesting(Boolean stressTesting) {
		this.stressTesting = stressTesting;
		if(stressTesting != null){
			putBodyParameter("StressTesting", stressTesting.toString());
		}
	}

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
		if(staffId != null){
			putBodyParameter("StaffId", staffId);
		}
	}

	public String getStaffNick() {
		return this.staffNick;
	}

	public void setStaffNick(String staffNick) {
		this.staffNick = staffNick;
		if(staffNick != null){
			putBodyParameter("StaffNick", staffNick);
		}
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
		if(chatId != null){
			putBodyParameter("ChatId", chatId);
		}
	}

	public List<Packages> getPackages() {
		return this.packages;
	}

	public void setPackages(List<Packages> packages) {
		this.packages = packages;	
		if (packages != null) {
			putBodyParameter("Packages" , new Gson().toJson(packages));
		}	
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
		if(contentType != null){
			putBodyParameter("ContentType", contentType);
		}
	}

	public String getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
		if(sellerId != null){
			putBodyParameter("SellerId", sellerId);
		}
	}

	public Integer getRound() {
		return this.round;
	}

	public void setRound(Integer round) {
		this.round = round;
		if(round != null){
			putBodyParameter("Round", round.toString());
		}
	}

	public List<Orders> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;	
		if (orders != null) {
			putBodyParameter("Orders" , new Gson().toJson(orders));
		}	
	}

	public Map<String,String> getExtraContent() {
		return this.extraContent;
	}

	public void setExtraContent(Map<String,String> extraContent) {
		this.extraContent = extraContent;	
		if (extraContent != null) {
			putBodyParameter("ExtraContent" , new Gson().toJson(extraContent));
		}	
	}

	public List<Items> getItems() {
		return this.items;
	}

	public void setItems(List<Items> items) {
		this.items = items;	
		if (items != null) {
			putBodyParameter("Items" , new Gson().toJson(items));
		}	
	}

	public static class ExpectedSlots {

		@SerializedName("SlotKey")
		private String slotKey;

		public String getSlotKey() {
			return this.slotKey;
		}

		public void setSlotKey(String slotKey) {
			this.slotKey = slotKey;
		}
	}

	public static class ClientInfo {

		@SerializedName("ClientVersion")
		private String clientVersion;

		@SerializedName("ClientApp")
		private String clientApp;

		@SerializedName("ClientOs")
		private String clientOs;

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public String getClientApp() {
			return this.clientApp;
		}

		public void setClientApp(String clientApp) {
			this.clientApp = clientApp;
		}

		public String getClientOs() {
			return this.clientOs;
		}

		public void setClientOs(String clientOs) {
			this.clientOs = clientOs;
		}
	}

	public static class Packages {

		@SerializedName("PackageCode")
		private String packageCode;

		@SerializedName("PackageVersion")
		private String packageVersion;

		public String getPackageCode() {
			return this.packageCode;
		}

		public void setPackageCode(String packageCode) {
			this.packageCode = packageCode;
		}

		public String getPackageVersion() {
			return this.packageVersion;
		}

		public void setPackageVersion(String packageVersion) {
			this.packageVersion = packageVersion;
		}
	}

	public static class Orders {

		@SerializedName("BuyerRateStatus")
		private String buyerRateStatus;

		@SerializedName("CreateTime")
		private Long createTime;

		@SerializedName("OrderId")
		private String orderId;

		@SerializedName("ItemTitle")
		private String itemTitle;

		@SerializedName("Count")
		private Integer count;

		@SerializedName("PayTime")
		private Long payTime;

		@SerializedName("BuyerId")
		private String buyerId;

		@SerializedName("ParentOrderId")
		private String parentOrderId;

		@SerializedName("ItemId")
		private String itemId;

		@SerializedName("SkuProperty")
		private String skuProperty;

		@SerializedName("SellerId")
		private String sellerId;

		@SerializedName("RefundStatus")
		private String refundStatus;

		@SerializedName("ItemPic")
		private String itemPic;

		@SerializedName("LogisticsStatus")
		private String logisticsStatus;

		@SerializedName("Price")
		private Float price;

		@SerializedName("PayStatus")
		private String payStatus;

		public String getBuyerRateStatus() {
			return this.buyerRateStatus;
		}

		public void setBuyerRateStatus(String buyerRateStatus) {
			this.buyerRateStatus = buyerRateStatus;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Long getPayTime() {
			return this.payTime;
		}

		public void setPayTime(Long payTime) {
			this.payTime = payTime;
		}

		public String getBuyerId() {
			return this.buyerId;
		}

		public void setBuyerId(String buyerId) {
			this.buyerId = buyerId;
		}

		public String getParentOrderId() {
			return this.parentOrderId;
		}

		public void setParentOrderId(String parentOrderId) {
			this.parentOrderId = parentOrderId;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getSkuProperty() {
			return this.skuProperty;
		}

		public void setSkuProperty(String skuProperty) {
			this.skuProperty = skuProperty;
		}

		public String getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
		}

		public String getRefundStatus() {
			return this.refundStatus;
		}

		public void setRefundStatus(String refundStatus) {
			this.refundStatus = refundStatus;
		}

		public String getItemPic() {
			return this.itemPic;
		}

		public void setItemPic(String itemPic) {
			this.itemPic = itemPic;
		}

		public String getLogisticsStatus() {
			return this.logisticsStatus;
		}

		public void setLogisticsStatus(String logisticsStatus) {
			this.logisticsStatus = logisticsStatus;
		}

		public Float getPrice() {
			return this.price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

		public String getPayStatus() {
			return this.payStatus;
		}

		public void setPayStatus(String payStatus) {
			this.payStatus = payStatus;
		}
	}

	public static class Items {

		@SerializedName("PicUrl")
		private String picUrl;

		@SerializedName("ItemId")
		private String itemId;

		@SerializedName("SellerId")
		private String sellerId;

		@SerializedName("Price")
		private Float price;

		@SerializedName("Property")
		private Map<String,String> property;

		@SerializedName("Title")
		private String title;

		@SerializedName("CategoryId")
		private String categoryId;

		@SerializedName("ShopCategoryIds")
		private List<String> shopCategoryIds;

		public String getPicUrl() {
			return this.picUrl;
		}

		public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
		}

		public Float getPrice() {
			return this.price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

		public Map<String,String> getProperty() {
			return this.property;
		}

		public void setProperty(Map<String,String> property) {
			this.property = property;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}

		public List<String> getShopCategoryIds() {
			return this.shopCategoryIds;
		}

		public void setShopCategoryIds(List<String> shopCategoryIds) {
			this.shopCategoryIds = shopCategoryIds;
		}
	}

	@Override
	public Class<RecognizeMessageResponse> getResponseClass() {
		return RecognizeMessageResponse.class;
	}

}
