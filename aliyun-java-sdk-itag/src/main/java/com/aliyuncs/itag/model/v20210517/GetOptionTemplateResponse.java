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

package com.aliyuncs.itag.model.v20210517;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.GetOptionTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOptionTemplateResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String msg;

	private String errInfo;

	private Boolean succ;

	private String errorCode;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String id;

		private String name;

		private String tntInstId;

		private String description;

		private Map<Object,Object> exif;

		private Integer status;

		private String sharedMode;

		private String type;

		private String classify;

		private String gmtCreate;

		private String gmtModified;

		private List<QuestionConfigDTO> questionConfigs;

		private List<String> tags;

		private List<String> abandonReasons;

		private ViewConfigs viewConfigs;

		private Creator creator;

		private Modifier modifier;

		private RobotConfig robotConfig;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTntInstId() {
			return this.tntInstId;
		}

		public void setTntInstId(String tntInstId) {
			this.tntInstId = tntInstId;
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

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getSharedMode() {
			return this.sharedMode;
		}

		public void setSharedMode(String sharedMode) {
			this.sharedMode = sharedMode;
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

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public List<QuestionConfigDTO> getQuestionConfigs() {
			return this.questionConfigs;
		}

		public void setQuestionConfigs(List<QuestionConfigDTO> questionConfigs) {
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

		public ViewConfigs getViewConfigs() {
			return this.viewConfigs;
		}

		public void setViewConfigs(ViewConfigs viewConfigs) {
			this.viewConfigs = viewConfigs;
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

		public RobotConfig getRobotConfig() {
			return this.robotConfig;
		}

		public void setRobotConfig(RobotConfig robotConfig) {
			this.robotConfig = robotConfig;
		}

		public static class QuestionConfigDTO {

			private String id;

			private String markTitle;

			private String markTitleAlias;

			private String type;

			private Boolean mustFill;

			private Boolean display;

			private Boolean selected;

			private String selectGroup;

			private String defaultResult;

			private String rule;

			private Map<Object,Object> exif;

			private List<QuestionOption> options;

			private List<TemplateRobotConfig> robotConfigs;

			private List<String> children;

			private List<String> preOptions;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

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

			public Map<Object,Object> getExif() {
				return this.exif;
			}

			public void setExif(Map<Object,Object> exif) {
				this.exif = exif;
			}

			public List<QuestionOption> getOptions() {
				return this.options;
			}

			public void setOptions(List<QuestionOption> options) {
				this.options = options;
			}

			public List<TemplateRobotConfig> getRobotConfigs() {
				return this.robotConfigs;
			}

			public void setRobotConfigs(List<TemplateRobotConfig> robotConfigs) {
				this.robotConfigs = robotConfigs;
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

			public static class QuestionOption {

				private String label;

				private String key;

				private String shortcut;

				private String color;

				private String value;

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

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public List<String> getChildren1() {
					return this.children1;
				}

				public void setChildren1(List<String> children1) {
					this.children1 = children1;
				}
			}

			public static class TemplateRobotConfig {

				private String robotId;

				private String questionId;

				private String stage;

				private String type;

				private String resultPath;

				private String defaultResult;

				private List<RobotParam> params;

				public String getRobotId() {
					return this.robotId;
				}

				public void setRobotId(String robotId) {
					this.robotId = robotId;
				}

				public String getQuestionId() {
					return this.questionId;
				}

				public void setQuestionId(String questionId) {
					this.questionId = questionId;
				}

				public String getStage() {
					return this.stage;
				}

				public void setStage(String stage) {
					this.stage = stage;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getResultPath() {
					return this.resultPath;
				}

				public void setResultPath(String resultPath) {
					this.resultPath = resultPath;
				}

				public String getDefaultResult() {
					return this.defaultResult;
				}

				public void setDefaultResult(String defaultResult) {
					this.defaultResult = defaultResult;
				}

				public List<RobotParam> getParams() {
					return this.params;
				}

				public void setParams(List<RobotParam> params) {
					this.params = params;
				}

				public static class RobotParam {

					private String paramName;

					private String dataField;

					private String defaultResult;

					private String serviceId;

					private Boolean mustFill;

					public String getParamName() {
						return this.paramName;
					}

					public void setParamName(String paramName) {
						this.paramName = paramName;
					}

					public String getDataField() {
						return this.dataField;
					}

					public void setDataField(String dataField) {
						this.dataField = dataField;
					}

					public String getDefaultResult() {
						return this.defaultResult;
					}

					public void setDefaultResult(String defaultResult) {
						this.defaultResult = defaultResult;
					}

					public String getServiceId() {
						return this.serviceId;
					}

					public void setServiceId(String serviceId) {
						this.serviceId = serviceId;
					}

					public Boolean getMustFill() {
						return this.mustFill;
					}

					public void setMustFill(Boolean mustFill) {
						this.mustFill = mustFill;
					}
				}
			}
		}

		public static class ViewConfigs {

			private List<DisplayFieldDTO> fields;

			public List<DisplayFieldDTO> getFields() {
				return this.fields;
			}

			public void setFields(List<DisplayFieldDTO> fields) {
				this.fields = fields;
			}

			public static class DisplayFieldDTO {

				private String fieldName;

				private String type;

				private Boolean corsProxy;

				private Boolean hide;

				private String convertor;

				private Map<Object,Object> plugins;

				private String fieldNames;

				private List<String> relationQuestionIds;

				private VisitInfo visitInfo;

				public String getFieldName() {
					return this.fieldName;
				}

				public void setFieldName(String fieldName) {
					this.fieldName = fieldName;
				}

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

				public String getFieldNames() {
					return this.fieldNames;
				}

				public void setFieldNames(String fieldNames) {
					this.fieldNames = fieldNames;
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

					private OssConf ossConf;

					private AftsConf aftsConf;

					public OssConf getOssConf() {
						return this.ossConf;
					}

					public void setOssConf(OssConf ossConf) {
						this.ossConf = ossConf;
					}

					public AftsConf getAftsConf() {
						return this.aftsConf;
					}

					public void setAftsConf(AftsConf aftsConf) {
						this.aftsConf = aftsConf;
					}

					public static class OssConf {

						private String ossEndpoint;

						private String ossAk;

						private String ossAs;

						private String ossOwner;

						private String ossBucket;

						private String folder;

						private Long expiredTime;

						public String getOssEndpoint() {
							return this.ossEndpoint;
						}

						public void setOssEndpoint(String ossEndpoint) {
							this.ossEndpoint = ossEndpoint;
						}

						public String getOssAk() {
							return this.ossAk;
						}

						public void setOssAk(String ossAk) {
							this.ossAk = ossAk;
						}

						public String getOssAs() {
							return this.ossAs;
						}

						public void setOssAs(String ossAs) {
							this.ossAs = ossAs;
						}

						public String getOssOwner() {
							return this.ossOwner;
						}

						public void setOssOwner(String ossOwner) {
							this.ossOwner = ossOwner;
						}

						public String getOssBucket() {
							return this.ossBucket;
						}

						public void setOssBucket(String ossBucket) {
							this.ossBucket = ossBucket;
						}

						public String getFolder() {
							return this.folder;
						}

						public void setFolder(String folder) {
							this.folder = folder;
						}

						public Long getExpiredTime() {
							return this.expiredTime;
						}

						public void setExpiredTime(Long expiredTime) {
							this.expiredTime = expiredTime;
						}
					}

					public static class AftsConf {

						private Integer expiredTime;

						public Integer getExpiredTime() {
							return this.expiredTime;
						}

						public void setExpiredTime(Integer expiredTime) {
							this.expiredTime = expiredTime;
						}
					}
				}
			}
		}

		public static class Creator {

			private String userId;

			private String userName;

			private String accountType;

			private String accountNo;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
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
		}

		public static class Modifier {

			private String userId;

			private String userName;

			private String accountType;

			private String accountNo;

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
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
		}

		public static class RobotConfig {

			private String source;

			private List<ModelServiceConfig> modelServiceConfigs;

			private EffectStep effectStep;

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public List<ModelServiceConfig> getModelServiceConfigs() {
				return this.modelServiceConfigs;
			}

			public void setModelServiceConfigs(List<ModelServiceConfig> modelServiceConfigs) {
				this.modelServiceConfigs = modelServiceConfigs;
			}

			public EffectStep getEffectStep() {
				return this.effectStep;
			}

			public void setEffectStep(EffectStep effectStep) {
				this.effectStep = effectStep;
			}

			public static class ModelServiceConfig {

				private String serviceId;

				private String serviceName;

				private List<ModelServiceConfig$PostParamPair> postParams;

				private List<ModelServiceConfig$ResultMappingPair> resultMappings;

				public String getServiceId() {
					return this.serviceId;
				}

				public void setServiceId(String serviceId) {
					this.serviceId = serviceId;
				}

				public String getServiceName() {
					return this.serviceName;
				}

				public void setServiceName(String serviceName) {
					this.serviceName = serviceName;
				}

				public List<ModelServiceConfig$PostParamPair> getPostParams() {
					return this.postParams;
				}

				public void setPostParams(List<ModelServiceConfig$PostParamPair> postParams) {
					this.postParams = postParams;
				}

				public List<ModelServiceConfig$ResultMappingPair> getResultMappings() {
					return this.resultMappings;
				}

				public void setResultMappings(List<ModelServiceConfig$ResultMappingPair> resultMappings) {
					this.resultMappings = resultMappings;
				}

				public static class ModelServiceConfig$PostParamPair {

					private String key;

					private String value;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}

				public static class ModelServiceConfig$ResultMappingPair {

					private String questionId;

					private String resultKey;

					private String markTitle;

					public String getQuestionId() {
						return this.questionId;
					}

					public void setQuestionId(String questionId) {
						this.questionId = questionId;
					}

					public String getResultKey() {
						return this.resultKey;
					}

					public void setResultKey(String resultKey) {
						this.resultKey = resultKey;
					}

					public String getMarkTitle() {
						return this.markTitle;
					}

					public void setMarkTitle(String markTitle) {
						this.markTitle = markTitle;
					}
				}
			}

			public static class EffectStep {

				private Boolean preProcess;

				private Boolean preLabel;

				private Boolean label;

				private ProcessConfig processConfig;

				public Boolean getPreProcess() {
					return this.preProcess;
				}

				public void setPreProcess(Boolean preProcess) {
					this.preProcess = preProcess;
				}

				public Boolean getPreLabel() {
					return this.preLabel;
				}

				public void setPreLabel(Boolean preLabel) {
					this.preLabel = preLabel;
				}

				public Boolean getLabel() {
					return this.label;
				}

				public void setLabel(Boolean label) {
					this.label = label;
				}

				public ProcessConfig getProcessConfig() {
					return this.processConfig;
				}

				public void setProcessConfig(ProcessConfig processConfig) {
					this.processConfig = processConfig;
				}

				public static class ProcessConfig {

					private List<String> relateColumn;

					public List<String> getRelateColumn() {
						return this.relateColumn;
					}

					public void setRelateColumn(List<String> relateColumn) {
						this.relateColumn = relateColumn;
					}
				}
			}
		}
	}

	@Override
	public GetOptionTemplateResponse getInstance(UnmarshallerContext context) {
		return	GetOptionTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
