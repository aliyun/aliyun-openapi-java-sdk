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

package com.aliyuncs.openitag.model.v20220616;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openitag.transform.v20220616.GetTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String details;

	private Boolean success;

	private String errorCode;

	private Template template;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Template getTemplate() {
		return this.template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public static class Template {

		private String gmtCreateTime;

		private String gmtModifiedTime;

		private String templateId;

		private String templateName;

		private String description;

		private Map<Object,Object> exif;

		private String status;

		private String type;

		private String classify;

		private String tenantId;

		private String sharedMode;

		private List<QuestionConfigsItem> questionConfigs;

		private List<String> tags;

		private List<String> abandonReasons;

		private Creator creator;

		private Modifier modifier;

		private ViewConfigs viewConfigs;

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getGmtModifiedTime() {
			return this.gmtModifiedTime;
		}

		public void setGmtModifiedTime(String gmtModifiedTime) {
			this.gmtModifiedTime = gmtModifiedTime;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Map<Object,Object> getExif() {
			return this.exif;
		}

		public void setExif(Map<Object,Object> exif) {
			this.exif = exif;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getClassify() {
			return this.classify;
		}

		public void setClassify(String classify) {
			this.classify = classify;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getSharedMode() {
			return this.sharedMode;
		}

		public void setSharedMode(String sharedMode) {
			this.sharedMode = sharedMode;
		}

		public List<QuestionConfigsItem> getQuestionConfigs() {
			return this.questionConfigs;
		}

		public void setQuestionConfigs(List<QuestionConfigsItem> questionConfigs) {
			this.questionConfigs = questionConfigs;
		}

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}

		public List<String> getAbandonReasons() {
			return this.abandonReasons;
		}

		public void setAbandonReasons(List<String> abandonReasons) {
			this.abandonReasons = abandonReasons;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public Modifier getModifier() {
			return this.modifier;
		}

		public void setModifier(Modifier modifier) {
			this.modifier = modifier;
		}

		public ViewConfigs getViewConfigs() {
			return this.viewConfigs;
		}

		public void setViewConfigs(ViewConfigs viewConfigs) {
			this.viewConfigs = viewConfigs;
		}

		public static class QuestionConfigsItem {

			private String markTitle;

			private String markTitleAlias;

			private String type;

			private Boolean mustFill;

			private Boolean display;

			private Boolean selected;

			private String selectGroup;

			private String defaultResult;

			private String rule;

			private Boolean canSelect;

			private Map<Object,Object> exif;

			private String hotKeyMap;

			private String questionId;

			private List<OptionsItem> options;

			private List<String> children;

			private List<String> preOptions;

			public String getMarkTitle() {
				return this.markTitle;
			}

			public void setMarkTitle(String markTitle) {
				this.markTitle = markTitle;
			}

			public String getMarkTitleAlias() {
				return this.markTitleAlias;
			}

			public void setMarkTitleAlias(String markTitleAlias) {
				this.markTitleAlias = markTitleAlias;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Boolean getMustFill() {
				return this.mustFill;
			}

			public void setMustFill(Boolean mustFill) {
				this.mustFill = mustFill;
			}

			public Boolean getDisplay() {
				return this.display;
			}

			public void setDisplay(Boolean display) {
				this.display = display;
			}

			public Boolean getSelected() {
				return this.selected;
			}

			public void setSelected(Boolean selected) {
				this.selected = selected;
			}

			public String getSelectGroup() {
				return this.selectGroup;
			}

			public void setSelectGroup(String selectGroup) {
				this.selectGroup = selectGroup;
			}

			public String getDefaultResult() {
				return this.defaultResult;
			}

			public void setDefaultResult(String defaultResult) {
				this.defaultResult = defaultResult;
			}

			public String getRule() {
				return this.rule;
			}

			public void setRule(String rule) {
				this.rule = rule;
			}

			public Boolean getCanSelect() {
				return this.canSelect;
			}

			public void setCanSelect(Boolean canSelect) {
				this.canSelect = canSelect;
			}

			public Map<Object,Object> getExif() {
				return this.exif;
			}

			public void setExif(Map<Object,Object> exif) {
				this.exif = exif;
			}

			public String getHotKeyMap() {
				return this.hotKeyMap;
			}

			public void setHotKeyMap(String hotKeyMap) {
				this.hotKeyMap = hotKeyMap;
			}

			public String getQuestionId() {
				return this.questionId;
			}

			public void setQuestionId(String questionId) {
				this.questionId = questionId;
			}

			public List<OptionsItem> getOptions() {
				return this.options;
			}

			public void setOptions(List<OptionsItem> options) {
				this.options = options;
			}

			public List<String> getChildren() {
				return this.children;
			}

			public void setChildren(List<String> children) {
				this.children = children;
			}

			public List<String> getPreOptions() {
				return this.preOptions;
			}

			public void setPreOptions(List<String> preOptions) {
				this.preOptions = preOptions;
			}

			public static class OptionsItem {

				private String label;

				private String key;

				private String shortcut;

				private String color;

				private String remark;

				private List<String> children1;

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getShortcut() {
					return this.shortcut;
				}

				public void setShortcut(String shortcut) {
					this.shortcut = shortcut;
				}

				public String getColor() {
					return this.color;
				}

				public void setColor(String color) {
					this.color = color;
				}

				public String getRemark() {
					return this.remark;
				}

				public void setRemark(String remark) {
					this.remark = remark;
				}

				public List<String> getChildren1() {
					return this.children1;
				}

				public void setChildren1(List<String> children1) {
					this.children1 = children1;
				}
			}
		}

		public static class Creator {

			private Long userId;

			private String accountType;

			private String accountNo;

			private String userName;

			private String role;

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public String getAccountNo() {
				return this.accountNo;
			}

			public void setAccountNo(String accountNo) {
				this.accountNo = accountNo;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}
		}

		public static class Modifier {

			private Long userId;

			private String accountType;

			private String accountNo;

			private String userName;

			private String role;

			public Long getUserId() {
				return this.userId;
			}

			public void setUserId(Long userId) {
				this.userId = userId;
			}

			public String getAccountType() {
				return this.accountType;
			}

			public void setAccountType(String accountType) {
				this.accountType = accountType;
			}

			public String getAccountNo() {
				return this.accountNo;
			}

			public void setAccountNo(String accountNo) {
				this.accountNo = accountNo;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}
		}

		public static class ViewConfigs {

			private List<ViewPluginsItem> viewPlugins;

			public List<ViewPluginsItem> getViewPlugins() {
				return this.viewPlugins;
			}

			public void setViewPlugins(List<ViewPluginsItem> viewPlugins) {
				this.viewPlugins = viewPlugins;
			}

			public static class ViewPluginsItem {

				private String type;

				private Boolean corsProxy;

				private Boolean hide;

				private String convertor;

				private Map<Object,Object> plugins;

				private Map<Object,Object> exif;

				private String bindField;

				private Boolean displayOriImg;

				private List<String> relationQuestionIds;

				private VisitInfo visitInfo;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Boolean getCorsProxy() {
					return this.corsProxy;
				}

				public void setCorsProxy(Boolean corsProxy) {
					this.corsProxy = corsProxy;
				}

				public Boolean getHide() {
					return this.hide;
				}

				public void setHide(Boolean hide) {
					this.hide = hide;
				}

				public String getConvertor() {
					return this.convertor;
				}

				public void setConvertor(String convertor) {
					this.convertor = convertor;
				}

				public Map<Object,Object> getPlugins() {
					return this.plugins;
				}

				public void setPlugins(Map<Object,Object> plugins) {
					this.plugins = plugins;
				}

				public Map<Object,Object> getExif() {
					return this.exif;
				}

				public void setExif(Map<Object,Object> exif) {
					this.exif = exif;
				}

				public String getBindField() {
					return this.bindField;
				}

				public void setBindField(String bindField) {
					this.bindField = bindField;
				}

				public Boolean getDisplayOriImg() {
					return this.displayOriImg;
				}

				public void setDisplayOriImg(Boolean displayOriImg) {
					this.displayOriImg = displayOriImg;
				}

				public List<String> getRelationQuestionIds() {
					return this.relationQuestionIds;
				}

				public void setRelationQuestionIds(List<String> relationQuestionIds) {
					this.relationQuestionIds = relationQuestionIds;
				}

				public VisitInfo getVisitInfo() {
					return this.visitInfo;
				}

				public void setVisitInfo(VisitInfo visitInfo) {
					this.visitInfo = visitInfo;
				}

				public static class VisitInfo {

					private Map<Object,Object> ossConf;

					private Map<Object,Object> aftsConf;

					public Map<Object,Object> getOssConf() {
						return this.ossConf;
					}

					public void setOssConf(Map<Object,Object> ossConf) {
						this.ossConf = ossConf;
					}

					public Map<Object,Object> getAftsConf() {
						return this.aftsConf;
					}

					public void setAftsConf(Map<Object,Object> aftsConf) {
						this.aftsConf = aftsConf;
					}
				}
			}
		}
	}

	@Override
	public GetTemplateResponse getInstance(UnmarshallerContext context) {
		return	GetTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
