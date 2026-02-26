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
import com.aliyuncs.itag.transform.v20210517.PageViewTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageViewTaskResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private Result result;

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

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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

		private Long pageNum;

		private Long pageSize;

		private Long total;

		private Long totalPage;

		private List<ITagTaskDTO> list;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}

		public List<ITagTaskDTO> getList() {
			return this.list;
		}

		public void setList(List<ITagTaskDTO> list) {
			this.list = list;
		}

		public static class ITagTaskDTO {

			private String taskName;

			private String taskId;

			private String templateId;

			private Long projectId;

			private String taskType;

			private String tntInstId;

			private String tntInstName;

			private String remark;

			private Boolean allowAppendData;

			private String channel;

			private Integer safetyLevel;

			private String relateTaskConfig;

			private Map<Object,Object> exif;

			private Map<Object,Object> mineConfigs;

			private Map<Object,Object> voteConfigs;

			private String runMsg;

			private Boolean archived;

			private String stage;

			private Map<Object,Object> archivedInfos;

			private Integer alertTime;

			private Integer status;

			private String gmtCreate;

			private String gmtModified;

			private List<TaskDatasetProxyRelation> datasetProxyRelations;

			private List<ITagSimpleUserVO> admins;

			private List<ITagTaskWorkflowConfig> taskWorkFlow;

			private List<String> workflowNodes;

			private List<String> tags;

			private List<String> supportDownloadTypes;

			private OptionTemplateDTO optionTemplateDTO;

			private TaskTemplateConfig taskTemplateConfig;

			private BizInfo bizInfo;

			private AssignConfig assignConfig;

			private NoticeConfig noticeConfig;

			private ResultCallbackConfig resultCallbackConfig;

			private Creator creator;

			private Modifier modifier;

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getTaskType() {
				return this.taskType;
			}

			public void setTaskType(String taskType) {
				this.taskType = taskType;
			}

			public String getTntInstId() {
				return this.tntInstId;
			}

			public void setTntInstId(String tntInstId) {
				this.tntInstId = tntInstId;
			}

			public String getTntInstName() {
				return this.tntInstName;
			}

			public void setTntInstName(String tntInstName) {
				this.tntInstName = tntInstName;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public Boolean getAllowAppendData() {
				return this.allowAppendData;
			}

			public void setAllowAppendData(Boolean allowAppendData) {
				this.allowAppendData = allowAppendData;
			}

			public String getChannel() {
				return this.channel;
			}

			public void setChannel(String channel) {
				this.channel = channel;
			}

			public Integer getSafetyLevel() {
				return this.safetyLevel;
			}

			public void setSafetyLevel(Integer safetyLevel) {
				this.safetyLevel = safetyLevel;
			}

			public String getRelateTaskConfig() {
				return this.relateTaskConfig;
			}

			public void setRelateTaskConfig(String relateTaskConfig) {
				this.relateTaskConfig = relateTaskConfig;
			}

			public Map<Object,Object> getExif() {
				return this.exif;
			}

			public void setExif(Map<Object,Object> exif) {
				this.exif = exif;
			}

			public Map<Object,Object> getMineConfigs() {
				return this.mineConfigs;
			}

			public void setMineConfigs(Map<Object,Object> mineConfigs) {
				this.mineConfigs = mineConfigs;
			}

			public Map<Object,Object> getVoteConfigs() {
				return this.voteConfigs;
			}

			public void setVoteConfigs(Map<Object,Object> voteConfigs) {
				this.voteConfigs = voteConfigs;
			}

			public String getRunMsg() {
				return this.runMsg;
			}

			public void setRunMsg(String runMsg) {
				this.runMsg = runMsg;
			}

			public Boolean getArchived() {
				return this.archived;
			}

			public void setArchived(Boolean archived) {
				this.archived = archived;
			}

			public String getStage() {
				return this.stage;
			}

			public void setStage(String stage) {
				this.stage = stage;
			}

			public Map<Object,Object> getArchivedInfos() {
				return this.archivedInfos;
			}

			public void setArchivedInfos(Map<Object,Object> archivedInfos) {
				this.archivedInfos = archivedInfos;
			}

			public Integer getAlertTime() {
				return this.alertTime;
			}

			public void setAlertTime(Integer alertTime) {
				this.alertTime = alertTime;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
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

			public List<TaskDatasetProxyRelation> getDatasetProxyRelations() {
				return this.datasetProxyRelations;
			}

			public void setDatasetProxyRelations(List<TaskDatasetProxyRelation> datasetProxyRelations) {
				this.datasetProxyRelations = datasetProxyRelations;
			}

			public List<ITagSimpleUserVO> getAdmins() {
				return this.admins;
			}

			public void setAdmins(List<ITagSimpleUserVO> admins) {
				this.admins = admins;
			}

			public List<ITagTaskWorkflowConfig> getTaskWorkFlow() {
				return this.taskWorkFlow;
			}

			public void setTaskWorkFlow(List<ITagTaskWorkflowConfig> taskWorkFlow) {
				this.taskWorkFlow = taskWorkFlow;
			}

			public List<String> getWorkflowNodes() {
				return this.workflowNodes;
			}

			public void setWorkflowNodes(List<String> workflowNodes) {
				this.workflowNodes = workflowNodes;
			}

			public List<String> getTags() {
				return this.tags;
			}

			public void setTags(List<String> tags) {
				this.tags = tags;
			}

			public List<String> getSupportDownloadTypes() {
				return this.supportDownloadTypes;
			}

			public void setSupportDownloadTypes(List<String> supportDownloadTypes) {
				this.supportDownloadTypes = supportDownloadTypes;
			}

			public OptionTemplateDTO getOptionTemplateDTO() {
				return this.optionTemplateDTO;
			}

			public void setOptionTemplateDTO(OptionTemplateDTO optionTemplateDTO) {
				this.optionTemplateDTO = optionTemplateDTO;
			}

			public TaskTemplateConfig getTaskTemplateConfig() {
				return this.taskTemplateConfig;
			}

			public void setTaskTemplateConfig(TaskTemplateConfig taskTemplateConfig) {
				this.taskTemplateConfig = taskTemplateConfig;
			}

			public BizInfo getBizInfo() {
				return this.bizInfo;
			}

			public void setBizInfo(BizInfo bizInfo) {
				this.bizInfo = bizInfo;
			}

			public AssignConfig getAssignConfig() {
				return this.assignConfig;
			}

			public void setAssignConfig(AssignConfig assignConfig) {
				this.assignConfig = assignConfig;
			}

			public NoticeConfig getNoticeConfig() {
				return this.noticeConfig;
			}

			public void setNoticeConfig(NoticeConfig noticeConfig) {
				this.noticeConfig = noticeConfig;
			}

			public ResultCallbackConfig getResultCallbackConfig() {
				return this.resultCallbackConfig;
			}

			public void setResultCallbackConfig(ResultCallbackConfig resultCallbackConfig) {
				this.resultCallbackConfig = resultCallbackConfig;
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

			public static class TaskDatasetProxyRelation {

				private String datasetId;

				private String source;

				private String sourceBizId;

				private String datasetType;

				private Map<Object,Object> exif;

				public String getDatasetId() {
					return this.datasetId;
				}

				public void setDatasetId(String datasetId) {
					this.datasetId = datasetId;
				}

				public String getSource() {
					return this.source;
				}

				public void setSource(String source) {
					this.source = source;
				}

				public String getSourceBizId() {
					return this.sourceBizId;
				}

				public void setSourceBizId(String sourceBizId) {
					this.sourceBizId = sourceBizId;
				}

				public String getDatasetType() {
					return this.datasetType;
				}

				public void setDatasetType(String datasetType) {
					this.datasetType = datasetType;
				}

				public Map<Object,Object> getExif() {
					return this.exif;
				}

				public void setExif(Map<Object,Object> exif) {
					this.exif = exif;
				}
			}

			public static class ITagSimpleUserVO {

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

			public static class ITagTaskWorkflowConfig {

				private String nodeName;

				private Map<Object,Object> exif;

				private List<ITagSimpleUserVO1> users;

				private List<ITagSimpleUserGroupVO> groups;

				public String getNodeName() {
					return this.nodeName;
				}

				public void setNodeName(String nodeName) {
					this.nodeName = nodeName;
				}

				public Map<Object,Object> getExif() {
					return this.exif;
				}

				public void setExif(Map<Object,Object> exif) {
					this.exif = exif;
				}

				public List<ITagSimpleUserVO1> getUsers() {
					return this.users;
				}

				public void setUsers(List<ITagSimpleUserVO1> users) {
					this.users = users;
				}

				public List<ITagSimpleUserGroupVO> getGroups() {
					return this.groups;
				}

				public void setGroups(List<ITagSimpleUserGroupVO> groups) {
					this.groups = groups;
				}

				public static class ITagSimpleUserVO1 {

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

				public static class ITagSimpleUserGroupVO {

					private String groupId;

					private String groupName;

					public String getGroupId() {
						return this.groupId;
					}

					public void setGroupId(String groupId) {
						this.groupId = groupId;
					}

					public String getGroupName() {
						return this.groupName;
					}

					public void setGroupName(String groupName) {
						this.groupName = groupName;
					}
				}
			}

			public static class OptionTemplateDTO {

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

				private List<String> tags2;

				private List<String> abandonReasons;

				private ViewConfigs viewConfigs;

				private Creator3 creator3;

				private Modifier4 modifier4;

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

				public List<String> getTags2() {
					return this.tags2;
				}

				public void setTags2(List<String> tags2) {
					this.tags2 = tags2;
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

				public Creator3 getCreator3() {
					return this.creator3;
				}

				public void setCreator3(Creator3 creator3) {
					this.creator3 = creator3;
				}

				public Modifier4 getModifier4() {
					return this.modifier4;
				}

				public void setModifier4(Modifier4 modifier4) {
					this.modifier4 = modifier4;
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

						private List<String> children5;

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

						public List<String> getChildren5() {
							return this.children5;
						}

						public void setChildren5(List<String> children5) {
							this.children5 = children5;
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

				public static class Creator3 {

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

				public static class Modifier4 {

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

			public static class TaskTemplateConfig {

				private Map<Object,Object> exif;

				private Map<Object,Object> templateOptionMap;

				private String templateRelationId;

				private String resourceKey;

				private List<String> selectQuestions;

				private RobotConfig6 robotConfig6;

				public Map<Object,Object> getExif() {
					return this.exif;
				}

				public void setExif(Map<Object,Object> exif) {
					this.exif = exif;
				}

				public Map<Object,Object> getTemplateOptionMap() {
					return this.templateOptionMap;
				}

				public void setTemplateOptionMap(Map<Object,Object> templateOptionMap) {
					this.templateOptionMap = templateOptionMap;
				}

				public String getTemplateRelationId() {
					return this.templateRelationId;
				}

				public void setTemplateRelationId(String templateRelationId) {
					this.templateRelationId = templateRelationId;
				}

				public String getResourceKey() {
					return this.resourceKey;
				}

				public void setResourceKey(String resourceKey) {
					this.resourceKey = resourceKey;
				}

				public List<String> getSelectQuestions() {
					return this.selectQuestions;
				}

				public void setSelectQuestions(List<String> selectQuestions) {
					this.selectQuestions = selectQuestions;
				}

				public RobotConfig6 getRobotConfig6() {
					return this.robotConfig6;
				}

				public void setRobotConfig6(RobotConfig6 robotConfig6) {
					this.robotConfig6 = robotConfig6;
				}

				public static class RobotConfig6 {

					private String source;

					private List<ModelServiceConfig9> modelServiceConfigs8;

					private EffectStep7 effectStep7;

					public String getSource() {
						return this.source;
					}

					public void setSource(String source) {
						this.source = source;
					}

					public List<ModelServiceConfig9> getModelServiceConfigs8() {
						return this.modelServiceConfigs8;
					}

					public void setModelServiceConfigs8(List<ModelServiceConfig9> modelServiceConfigs8) {
						this.modelServiceConfigs8 = modelServiceConfigs8;
					}

					public EffectStep7 getEffectStep7() {
						return this.effectStep7;
					}

					public void setEffectStep7(EffectStep7 effectStep7) {
						this.effectStep7 = effectStep7;
					}

					public static class ModelServiceConfig9 {

						private String serviceId;

						private String serviceName;

						private List<ModelServiceConfig$PostParamPair12> postParams10;

						private List<ModelServiceConfig$ResultMappingPair13> resultMappings11;

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

						public List<ModelServiceConfig$PostParamPair12> getPostParams10() {
							return this.postParams10;
						}

						public void setPostParams10(List<ModelServiceConfig$PostParamPair12> postParams10) {
							this.postParams10 = postParams10;
						}

						public List<ModelServiceConfig$ResultMappingPair13> getResultMappings11() {
							return this.resultMappings11;
						}

						public void setResultMappings11(List<ModelServiceConfig$ResultMappingPair13> resultMappings11) {
							this.resultMappings11 = resultMappings11;
						}

						public static class ModelServiceConfig$PostParamPair12 {

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

						public static class ModelServiceConfig$ResultMappingPair13 {

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

					public static class EffectStep7 {

						private Boolean preProcess;

						private Boolean preLabel;

						private Boolean label;

						private ProcessConfig14 processConfig14;

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

						public ProcessConfig14 getProcessConfig14() {
							return this.processConfig14;
						}

						public void setProcessConfig14(ProcessConfig14 processConfig14) {
							this.processConfig14 = processConfig14;
						}

						public static class ProcessConfig14 {

							private List<String> relateColumn15;

							public List<String> getRelateColumn15() {
								return this.relateColumn15;
							}

							public void setRelateColumn15(List<String> relateColumn15) {
								this.relateColumn15 = relateColumn15;
							}
						}
					}
				}
			}

			public static class BizInfo {

				private String bizCode;

				private String bizNo;

				private String bizClassify;

				public String getBizCode() {
					return this.bizCode;
				}

				public void setBizCode(String bizCode) {
					this.bizCode = bizCode;
				}

				public String getBizNo() {
					return this.bizNo;
				}

				public void setBizNo(String bizNo) {
					this.bizNo = bizNo;
				}

				public String getBizClassify() {
					return this.bizClassify;
				}

				public void setBizClassify(String bizClassify) {
					this.bizClassify = bizClassify;
				}
			}

			public static class AssignConfig {

				private String assignType;

				private Integer assignCount;

				private Integer assignSubTaskCount;

				private String assignField;

				public String getAssignType() {
					return this.assignType;
				}

				public void setAssignType(String assignType) {
					this.assignType = assignType;
				}

				public Integer getAssignCount() {
					return this.assignCount;
				}

				public void setAssignCount(Integer assignCount) {
					this.assignCount = assignCount;
				}

				public Integer getAssignSubTaskCount() {
					return this.assignSubTaskCount;
				}

				public void setAssignSubTaskCount(Integer assignSubTaskCount) {
					this.assignSubTaskCount = assignSubTaskCount;
				}

				public String getAssignField() {
					return this.assignField;
				}

				public void setAssignField(String assignField) {
					this.assignField = assignField;
				}
			}

			public static class NoticeConfig {

				private String dingHook;

				private String subTaskAlertGap;

				private List<String> listenActions;

				public String getDingHook() {
					return this.dingHook;
				}

				public void setDingHook(String dingHook) {
					this.dingHook = dingHook;
				}

				public String getSubTaskAlertGap() {
					return this.subTaskAlertGap;
				}

				public void setSubTaskAlertGap(String subTaskAlertGap) {
					this.subTaskAlertGap = subTaskAlertGap;
				}

				public List<String> getListenActions() {
					return this.listenActions;
				}

				public void setListenActions(List<String> listenActions) {
					this.listenActions = listenActions;
				}
			}

			public static class ResultCallbackConfig {

				private String retMsgMode;

				private Map<Object,Object> exif;

				public String getRetMsgMode() {
					return this.retMsgMode;
				}

				public void setRetMsgMode(String retMsgMode) {
					this.retMsgMode = retMsgMode;
				}

				public Map<Object,Object> getExif() {
					return this.exif;
				}

				public void setExif(Map<Object,Object> exif) {
					this.exif = exif;
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
		}
	}

	@Override
	public PageViewTaskResponse getInstance(UnmarshallerContext context) {
		return	PageViewTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
