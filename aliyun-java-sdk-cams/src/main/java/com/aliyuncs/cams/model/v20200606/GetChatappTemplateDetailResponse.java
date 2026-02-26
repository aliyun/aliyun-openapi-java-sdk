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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.GetChatappTemplateDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetChatappTemplateDetailResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String accessDeniedDetail;

	private Data data;

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

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String category;

		private String templateCode;

		private String name;

		private String language;

		private Map<Object,Object> example;

		private String auditStatus;

		private String templateType;

		private String qualityScore;

		private Integer messageSendTtlSeconds;

		private String reason;

		private List<Component> components;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getTemplateCode() {
			return this.templateCode;
		}

		public void setTemplateCode(String templateCode) {
			this.templateCode = templateCode;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLanguage() {
			return this.language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public Map<Object,Object> getExample() {
			return this.example;
		}

		public void setExample(Map<Object,Object> example) {
			this.example = example;
		}

		public String getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(String auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public String getQualityScore() {
			return this.qualityScore;
		}

		public void setQualityScore(String qualityScore) {
			this.qualityScore = qualityScore;
		}

		public Integer getMessageSendTtlSeconds() {
			return this.messageSendTtlSeconds;
		}

		public void setMessageSendTtlSeconds(Integer messageSendTtlSeconds) {
			this.messageSendTtlSeconds = messageSendTtlSeconds;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public List<Component> getComponents() {
			return this.components;
		}

		public void setComponents(List<Component> components) {
			this.components = components;
		}

		public static class Component {

			private String type;

			private String url;

			private String text;

			private String caption;

			private String fileName;

			private String format;

			private String thumbUrl;

			private Integer duration;

			private String fileType;

			private String latitude;

			private String longitude;

			private String locationName;

			private String locationAddress;

			private Boolean addSecretRecommendation;

			private Integer codeExpirationMinutes;

			private Boolean hasExpiration;

			private String offerExpirationTimeMs;

			private List<Button> buttons;

			private List<轮播卡片列表> cards;

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

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
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

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
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

			public String getLatitude() {
				return this.latitude;
			}

			public void setLatitude(String latitude) {
				this.latitude = latitude;
			}

			public String getLongitude() {
				return this.longitude;
			}

			public void setLongitude(String longitude) {
				this.longitude = longitude;
			}

			public String getLocationName() {
				return this.locationName;
			}

			public void setLocationName(String locationName) {
				this.locationName = locationName;
			}

			public String getLocationAddress() {
				return this.locationAddress;
			}

			public void setLocationAddress(String locationAddress) {
				this.locationAddress = locationAddress;
			}

			public Boolean getAddSecretRecommendation() {
				return this.addSecretRecommendation;
			}

			public void setAddSecretRecommendation(Boolean addSecretRecommendation) {
				this.addSecretRecommendation = addSecretRecommendation;
			}

			public Integer getCodeExpirationMinutes() {
				return this.codeExpirationMinutes;
			}

			public void setCodeExpirationMinutes(Integer codeExpirationMinutes) {
				this.codeExpirationMinutes = codeExpirationMinutes;
			}

			public Boolean getHasExpiration() {
				return this.hasExpiration;
			}

			public void setHasExpiration(Boolean hasExpiration) {
				this.hasExpiration = hasExpiration;
			}

			public String getOfferExpirationTimeMs() {
				return this.offerExpirationTimeMs;
			}

			public void setOfferExpirationTimeMs(String offerExpirationTimeMs) {
				this.offerExpirationTimeMs = offerExpirationTimeMs;
			}

			public List<Button> getButtons() {
				return this.buttons;
			}

			public void setButtons(List<Button> buttons) {
				this.buttons = buttons;
			}

			public List<轮播卡片列表> getCards() {
				return this.cards;
			}

			public void setCards(List<轮播卡片列表> cards) {
				this.cards = cards;
			}

			public static class Button {

				private String type;

				private String text;

				private String phoneNumber;

				private String url;

				private String urlType;

				private String signatureHash;

				private String packageName;

				private String autofillText;

				private Boolean isOptOut;

				private String couponCode;

				private String flowId;

				private String flowAction;

				private String navigateScreen;

				private List<SupportedAppsItem> supportedApps;

				private ExtendAttrs extendAttrs;

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

				public ExtendAttrs getExtendAttrs() {
					return this.extendAttrs;
				}

				public void setExtendAttrs(ExtendAttrs extendAttrs) {
					this.extendAttrs = extendAttrs;
				}

				public static class SupportedAppsItem {

					private String signatureHash;

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

				public static class ExtendAttrs {

					private String nextTemplateCode;

					private String nextTemplateName;

					private String nextLanguageCode;

					private String action;

					private String intentCode;

					public String getNextTemplateCode() {
						return this.nextTemplateCode;
					}

					public void setNextTemplateCode(String nextTemplateCode) {
						this.nextTemplateCode = nextTemplateCode;
					}

					public String getNextTemplateName() {
						return this.nextTemplateName;
					}

					public void setNextTemplateName(String nextTemplateName) {
						this.nextTemplateName = nextTemplateName;
					}

					public String getNextLanguageCode() {
						return this.nextLanguageCode;
					}

					public void setNextLanguageCode(String nextLanguageCode) {
						this.nextLanguageCode = nextLanguageCode;
					}

					public String getAction() {
						return this.action;
					}

					public void setAction(String action) {
						this.action = action;
					}

					public String getIntentCode() {
						return this.intentCode;
					}

					public void setIntentCode(String intentCode) {
						this.intentCode = intentCode;
					}
				}
			}

			public static class 轮播卡片列表 {

				private List<卡片控件列表> cardComponents;

				public List<卡片控件列表> getCardComponents() {
					return this.cardComponents;
				}

				public void setCardComponents(List<卡片控件列表> cardComponents) {
					this.cardComponents = cardComponents;
				}

				public static class 卡片控件列表 {

					private String type;

					private String text;

					private String url;

					private String format;

					private List<卡片按钮列表> buttons1;

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

					public String getUrl() {
						return this.url;
					}

					public void setUrl(String url) {
						this.url = url;
					}

					public String getFormat() {
						return this.format;
					}

					public void setFormat(String format) {
						this.format = format;
					}

					public List<卡片按钮列表> getButtons1() {
						return this.buttons1;
					}

					public void setButtons1(List<卡片按钮列表> buttons1) {
						this.buttons1 = buttons1;
					}

					public static class 卡片按钮列表 {

						private String type;

						private String text;

						private String url;

						private String urlType;

						private String phoneNumber;

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
	}

	@Override
	public GetChatappTemplateDetailResponse getInstance(UnmarshallerContext context) {
		return	GetChatappTemplateDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
