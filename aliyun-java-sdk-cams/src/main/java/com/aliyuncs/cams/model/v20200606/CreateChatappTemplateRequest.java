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
public class CreateChatappTemplateRequest extends RpcAcsRequest<CreateChatappTemplateResponse> {
	   

	@SerializedName("components")
	private List<Components> components;

	private String language;

	private String custWabaId;

	@SerializedName("example")
	private Map<String,String> example;

	private String templateType;

	private String isvCode;

	private String custSpaceId;

	private String name;

	private Boolean allowCategoryChange;

	private String category;

	private Integer messageSendTtlSeconds;
	public CreateChatappTemplateRequest() {
		super("cams", "2020-06-06", "CreateChatappTemplate", "cams");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Components> getComponents() {
		return this.components;
	}

	public void setComponents(List<Components> components) {
		this.components = components;	
		if (components != null) {
			putBodyParameter("Components" , new Gson().toJson(components));
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

	public Map<String,String> getExample() {
		return this.example;
	}

	public void setExample(Map<String,String> example) {
		this.example = example;	
		if (example != null) {
			putBodyParameter("Example" , new Gson().toJson(example));
		}	
	}

	public String getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(String templateType) {
		this.templateType = templateType;
		if(templateType != null){
			putBodyParameter("TemplateType", templateType);
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

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putBodyParameter("CustSpaceId", custSpaceId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Boolean getAllowCategoryChange() {
		return this.allowCategoryChange;
	}

	public void setAllowCategoryChange(Boolean allowCategoryChange) {
		this.allowCategoryChange = allowCategoryChange;
		if(allowCategoryChange != null){
			putBodyParameter("AllowCategoryChange", allowCategoryChange.toString());
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putBodyParameter("Category", category);
		}
	}

	public Integer getMessageSendTtlSeconds() {
		return this.messageSendTtlSeconds;
	}

	public void setMessageSendTtlSeconds(Integer messageSendTtlSeconds) {
		this.messageSendTtlSeconds = messageSendTtlSeconds;
		if(messageSendTtlSeconds != null){
			putBodyParameter("MessageSendTtlSeconds", messageSendTtlSeconds.toString());
		}
	}

	public static class Components {

		@SerializedName("Type")
		private String type;

		@SerializedName("Text")
		private String text;

		@SerializedName("Format")
		private String format;

		@SerializedName("Url")
		private String url;

		@SerializedName("Caption")
		private String caption;

		@SerializedName("FileName")
		private String fileName;

		@SerializedName("Buttons")
		private List<ButtonsItem> buttons;

		@SerializedName("ThumbUrl")
		private String thumbUrl;

		@SerializedName("Duration")
		private Integer duration;

		@SerializedName("FileType")
		private String fileType;

		@SerializedName("CodeExpirationMinutes")
		private Integer codeExpirationMinutes;

		@SerializedName("AddSecretRecommendation")
		private Boolean addSecretRecommendation;

		@SerializedName("HasExpiration")
		private Boolean hasExpiration;

		@SerializedName("Cards")
		private List<CardsItem> cards;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getFormat() {
			return this.format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getCaption() {
			return this.caption;
		}

		public void setCaption(String caption) {
			this.caption = caption;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public List<ButtonsItem> getButtons() {
			return this.buttons;
		}

		public void setButtons(List<ButtonsItem> buttons) {
			this.buttons = buttons;
		}

		public String getThumbUrl() {
			return this.thumbUrl;
		}

		public void setThumbUrl(String thumbUrl) {
			this.thumbUrl = thumbUrl;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getFileType() {
			return this.fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}

		public Integer getCodeExpirationMinutes() {
			return this.codeExpirationMinutes;
		}

		public void setCodeExpirationMinutes(Integer codeExpirationMinutes) {
			this.codeExpirationMinutes = codeExpirationMinutes;
		}

		public Boolean getAddSecretRecommendation() {
			return this.addSecretRecommendation;
		}

		public void setAddSecretRecommendation(Boolean addSecretRecommendation) {
			this.addSecretRecommendation = addSecretRecommendation;
		}

		public Boolean getHasExpiration() {
			return this.hasExpiration;
		}

		public void setHasExpiration(Boolean hasExpiration) {
			this.hasExpiration = hasExpiration;
		}

		public List<CardsItem> getCards() {
			return this.cards;
		}

		public void setCards(List<CardsItem> cards) {
			this.cards = cards;
		}

		public static class ButtonsItem {

			@SerializedName("Type")
			private String type;

			@SerializedName("Text")
			private String text;

			@SerializedName("PhoneNumber")
			private String phoneNumber;

			@SerializedName("Url")
			private String url;

			@SerializedName("UrlType")
			private String urlType;

			@SerializedName("SignatureHash")
			private String signatureHash;

			@SerializedName("PackageName")
			private String packageName;

			@SerializedName("AutofillText")
			private String autofillText;

			@SerializedName("IsOptOut")
			private Boolean isOptOut;

			@SerializedName("CouponCode")
			private String couponCode;

			@SerializedName("FlowId")
			private String flowId;

			@SerializedName("FlowAction")
			private String flowAction;

			@SerializedName("NavigateScreen")
			private String navigateScreen;

			@SerializedName("SupportedApps")
			private List<SupportedAppsItem> supportedApps;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getUrlType() {
				return this.urlType;
			}

			public void setUrlType(String urlType) {
				this.urlType = urlType;
			}

			public String getSignatureHash() {
				return this.signatureHash;
			}

			public void setSignatureHash(String signatureHash) {
				this.signatureHash = signatureHash;
			}

			public String getPackageName() {
				return this.packageName;
			}

			public void setPackageName(String packageName) {
				this.packageName = packageName;
			}

			public String getAutofillText() {
				return this.autofillText;
			}

			public void setAutofillText(String autofillText) {
				this.autofillText = autofillText;
			}

			public Boolean getIsOptOut() {
				return this.isOptOut;
			}

			public void setIsOptOut(Boolean isOptOut) {
				this.isOptOut = isOptOut;
			}

			public String getCouponCode() {
				return this.couponCode;
			}

			public void setCouponCode(String couponCode) {
				this.couponCode = couponCode;
			}

			public String getFlowId() {
				return this.flowId;
			}

			public void setFlowId(String flowId) {
				this.flowId = flowId;
			}

			public String getFlowAction() {
				return this.flowAction;
			}

			public void setFlowAction(String flowAction) {
				this.flowAction = flowAction;
			}

			public String getNavigateScreen() {
				return this.navigateScreen;
			}

			public void setNavigateScreen(String navigateScreen) {
				this.navigateScreen = navigateScreen;
			}

			public List<SupportedAppsItem> getSupportedApps() {
				return this.supportedApps;
			}

			public void setSupportedApps(List<SupportedAppsItem> supportedApps) {
				this.supportedApps = supportedApps;
			}

			public static class SupportedAppsItem {

				@SerializedName("SignatureHash")
				private String signatureHash;

				@SerializedName("PackageName")
				private String packageName;

				public String getSignatureHash() {
					return this.signatureHash;
				}

				public void setSignatureHash(String signatureHash) {
					this.signatureHash = signatureHash;
				}

				public String getPackageName() {
					return this.packageName;
				}

				public void setPackageName(String packageName) {
					this.packageName = packageName;
				}
			}
		}

		public static class CardsItem {

			@SerializedName("CardComponents")
			private List<CardComponentsItem> cardComponents;

			public List<CardComponentsItem> getCardComponents() {
				return this.cardComponents;
			}

			public void setCardComponents(List<CardComponentsItem> cardComponents) {
				this.cardComponents = cardComponents;
			}

			public static class CardComponentsItem {

				@SerializedName("Type")
				private String type;

				@SerializedName("Format")
				private String format;

				@SerializedName("Text")
				private String text;

				@SerializedName("Url")
				private String url;

				@SerializedName("Buttons")
				private List<ButtonsItem> buttons;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}

				public List<ButtonsItem> getButtons() {
					return this.buttons;
				}

				public void setButtons(List<ButtonsItem> buttons) {
					this.buttons = buttons;
				}

				public static class ButtonsItem {

					@SerializedName("Text")
					private String text;

					@SerializedName("Type")
					private String type;

					@SerializedName("Url")
					private String url;

					@SerializedName("UrlType")
					private String urlType;

					@SerializedName("PhoneNumber")
					private String phoneNumber;

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getUrl() {
						return this.url;
					}

					public void setUrl(String url) {
						this.url = url;
					}

					public String getUrlType() {
						return this.urlType;
					}

					public void setUrlType(String urlType) {
						this.urlType = urlType;
					}

					public String getPhoneNumber() {
						return this.phoneNumber;
					}

					public void setPhoneNumber(String phoneNumber) {
						this.phoneNumber = phoneNumber;
					}
				}
			}
		}
	}

	@Override
	public Class<CreateChatappTemplateResponse> getResponseClass() {
		return CreateChatappTemplateResponse.class;
	}

}
