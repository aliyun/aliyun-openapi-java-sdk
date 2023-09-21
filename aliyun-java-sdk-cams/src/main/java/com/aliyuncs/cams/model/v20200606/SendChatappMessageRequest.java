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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendChatappMessageRequest extends RpcAcsRequest<SendChatappMessageResponse> {
	   

	@SerializedName("productAction")
	private ProductAction productAction;

	private String messageType;

	private String language;

	private String custWabaId;

	private String type;

	private String fallBackContent;

	private String content;

	@SerializedName("templateParams")
	private Map<String,String> templateParams;

	@SerializedName("payload")
	private List<String> payload;

	private String channelType;

	private String from;

	private String tag;

	private String fallBackRule;

	private String trackingData;

	private String taskId;

	private String isvCode;

	private String contextMessageId;

	private String label;

	private String fallBackId;

	private Integer ttl;

	private Integer fallBackDuration;

	private String custSpaceId;

	private String to;

	private String templateCode;
	public SendChatappMessageRequest() {
		super("cams", "2020-06-06", "SendChatappMessage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public ProductAction getProductAction() {
		return this.productAction;
	}

	public void setProductAction(ProductAction productAction) {
		this.productAction = productAction;	
		if (productAction != null) {
			putBodyParameter("ProductAction" , new Gson().toJson(productAction));
		}	
	}

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
		if(messageType != null){
			putBodyParameter("MessageType", messageType);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putBodyParameter("Language", language);
		}
	}

	public String getCustWabaId() {
		return this.custWabaId;
	}

	public void setCustWabaId(String custWabaId) {
		this.custWabaId = custWabaId;
		if(custWabaId != null){
			putBodyParameter("CustWabaId", custWabaId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getFallBackContent() {
		return this.fallBackContent;
	}

	public void setFallBackContent(String fallBackContent) {
		this.fallBackContent = fallBackContent;
		if(fallBackContent != null){
			putBodyParameter("FallBackContent", fallBackContent);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public Map<String,String> getTemplateParams() {
		return this.templateParams;
	}

	public void setTemplateParams(Map<String,String> templateParams) {
		this.templateParams = templateParams;	
		if (templateParams != null) {
			putBodyParameter("TemplateParams" , new Gson().toJson(templateParams));
		}	
	}

	public List<String> getPayload() {
		return this.payload;
	}

	public void setPayload(List<String> payload) {
		this.payload = payload;	
		if (payload != null) {
			putQueryParameter("Payload" , new Gson().toJson(payload));
		}	
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
		if(channelType != null){
			putBodyParameter("ChannelType", channelType);
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putBodyParameter("From", from);
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putBodyParameter("Tag", tag);
		}
	}

	public String getFallBackRule() {
		return this.fallBackRule;
	}

	public void setFallBackRule(String fallBackRule) {
		this.fallBackRule = fallBackRule;
		if(fallBackRule != null){
			putBodyParameter("FallBackRule", fallBackRule);
		}
	}

	public String getTrackingData() {
		return this.trackingData;
	}

	public void setTrackingData(String trackingData) {
		this.trackingData = trackingData;
		if(trackingData != null){
			putBodyParameter("TrackingData", trackingData);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	public String getIsvCode() {
		return this.isvCode;
	}

	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
		if(isvCode != null){
			putBodyParameter("IsvCode", isvCode);
		}
	}

	public String getContextMessageId() {
		return this.contextMessageId;
	}

	public void setContextMessageId(String contextMessageId) {
		this.contextMessageId = contextMessageId;
		if(contextMessageId != null){
			putBodyParameter("ContextMessageId", contextMessageId);
		}
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
		if(label != null){
			putBodyParameter("Label", label);
		}
	}

	public String getFallBackId() {
		return this.fallBackId;
	}

	public void setFallBackId(String fallBackId) {
		this.fallBackId = fallBackId;
		if(fallBackId != null){
			putBodyParameter("FallBackId", fallBackId);
		}
	}

	public Integer getTtl() {
		return this.ttl;
	}

	public void setTtl(Integer ttl) {
		this.ttl = ttl;
		if(ttl != null){
			putBodyParameter("Ttl", ttl.toString());
		}
	}

	public Integer getFallBackDuration() {
		return this.fallBackDuration;
	}

	public void setFallBackDuration(Integer fallBackDuration) {
		this.fallBackDuration = fallBackDuration;
		if(fallBackDuration != null){
			putBodyParameter("FallBackDuration", fallBackDuration.toString());
		}
	}

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putBodyParameter("CustSpaceId", custSpaceId);
		}
	}

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
		if(to != null){
			putBodyParameter("To", to);
		}
	}

	public String getTemplateCode() {
		return this.templateCode;
	}

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
		if(templateCode != null){
			putBodyParameter("TemplateCode", templateCode);
		}
	}

	public static class ProductAction {

		@SerializedName("ThumbnailProductRetailerId")
		private String thumbnailProductRetailerId;

		@SerializedName("Sections")
		private List<SectionsItem> sections;

		public String getThumbnailProductRetailerId() {
			return this.thumbnailProductRetailerId;
		}

		public void setThumbnailProductRetailerId(String thumbnailProductRetailerId) {
			this.thumbnailProductRetailerId = thumbnailProductRetailerId;
		}

		public List<SectionsItem> getSections() {
			return this.sections;
		}

		public void setSections(List<SectionsItem> sections) {
			this.sections = sections;
		}

		public static class SectionsItem {

			@SerializedName("Title")
			private String title;

			@SerializedName("ProductItems")
			private List<ProductItemsItem> productItems;

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public List<ProductItemsItem> getProductItems() {
				return this.productItems;
			}

			public void setProductItems(List<ProductItemsItem> productItems) {
				this.productItems = productItems;
			}

			public static class ProductItemsItem {

				@SerializedName("ProductRetailerId")
				private String productRetailerId;

				public String getProductRetailerId() {
					return this.productRetailerId;
				}

				public void setProductRetailerId(String productRetailerId) {
					this.productRetailerId = productRetailerId;
				}
			}
		}
	}

	@Override
	public Class<SendChatappMessageResponse> getResponseClass() {
		return SendChatappMessageResponse.class;
	}

}
