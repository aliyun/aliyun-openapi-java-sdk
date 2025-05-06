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
import com.aliyuncs.itag.transform.v20210517.PageViewSubTaskItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageViewSubTaskItemResponse extends AcsResponse {

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

		private Long total;

		private Long totalPage;

		private Integer pageNum;

		private Integer pageSize;

		private List<MarkItemList> list;

		private TaskInfo taskInfo;

		private SubTask subTask;

		private SubUserTask subUserTask;

		private OptionTemplate optionTemplate;

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

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<MarkItemList> getList() {
			return this.list;
		}

		public void setList(List<MarkItemList> list) {
			this.list = list;
		}

		public TaskInfo getTaskInfo() {
			return this.taskInfo;
		}

		public void setTaskInfo(TaskInfo taskInfo) {
			this.taskInfo = taskInfo;
		}

		public SubTask getSubTask() {
			return this.subTask;
		}

		public void setSubTask(SubTask subTask) {
			this.subTask = subTask;
		}

		public SubUserTask getSubUserTask() {
			return this.subUserTask;
		}

		public void setSubUserTask(SubUserTask subUserTask) {
			this.subUserTask = subUserTask;
		}

		public OptionTemplate getOptionTemplate() {
			return this.optionTemplate;
		}

		public void setOptionTemplate(OptionTemplate optionTemplate) {
			this.optionTemplate = optionTemplate;
		}

		public static class MarkItemList {

			private String markItemId;

			private String dataId;

			private String datasetId;

			private String state;

			private Long mine;

			private Long rejectFlag;

			private Long fixedFlag;

			private Long abandonFlag;

			private Long weight;

			private Map<Object,Object> dataMeta;

			private List<MarkResultListItem> markResultList;

			public String getMarkItemId() {
				return this.markItemId;
			}

			public void setMarkItemId(String markItemId) {
				this.markItemId = markItemId;
			}

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public String getDatasetId() {
				return this.datasetId;
			}

			public void setDatasetId(String datasetId) {
				this.datasetId = datasetId;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public Long getMine() {
				return this.mine;
			}

			public void setMine(Long mine) {
				this.mine = mine;
			}

			public Long getRejectFlag() {
				return this.rejectFlag;
			}

			public void setRejectFlag(Long rejectFlag) {
				this.rejectFlag = rejectFlag;
			}

			public Long getFixedFlag() {
				return this.fixedFlag;
			}

			public void setFixedFlag(Long fixedFlag) {
				this.fixedFlag = fixedFlag;
			}

			public Long getAbandonFlag() {
				return this.abandonFlag;
			}

			public void setAbandonFlag(Long abandonFlag) {
				this.abandonFlag = abandonFlag;
			}

			public Long getWeight() {
				return this.weight;
			}

			public void setWeight(Long weight) {
				this.weight = weight;
			}

			public Map<Object,Object> getDataMeta() {
				return this.dataMeta;
			}

			public void setDataMeta(Map<Object,Object> dataMeta) {
				this.dataMeta = dataMeta;
			}

			public List<MarkResultListItem> getMarkResultList() {
				return this.markResultList;
			}

			public void setMarkResultList(List<MarkResultListItem> markResultList) {
				this.markResultList = markResultList;
			}

			public static class MarkResultListItem {

				private String userMarkResultId;

				private String markResultId;

				private String markTitle;

				private String markResult;

				private String questionId;

				private String resultType;

				private String version;

				public String getUserMarkResultId() {
					return this.userMarkResultId;
				}

				public void setUserMarkResultId(String userMarkResultId) {
					this.userMarkResultId = userMarkResultId;
				}

				public String getMarkResultId() {
					return this.markResultId;
				}

				public void setMarkResultId(String markResultId) {
					this.markResultId = markResultId;
				}

				public String getMarkTitle() {
					return this.markTitle;
				}

				public void setMarkTitle(String markTitle) {
					this.markTitle = markTitle;
				}

				public String getMarkResult() {
					return this.markResult;
				}

				public void setMarkResult(String markResult) {
					this.markResult = markResult;
				}

				public String getQuestionId() {
					return this.questionId;
				}

				public void setQuestionId(String questionId) {
					this.questionId = questionId;
				}

				public String getResultType() {
					return this.resultType;
				}

				public void setResultType(String resultType) {
					this.resultType = resultType;
				}

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}
			}
		}

		public static class TaskInfo {

			private String taskName;

			private String taskId;

			private String taskType;

			private String channel;

			private Long safetyLevel;

			private BizInfo bizInfo;

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

			public String getTaskType() {
				return this.taskType;
			}

			public void setTaskType(String taskType) {
				this.taskType = taskType;
			}

			public String getChannel() {
				return this.channel;
			}

			public void setChannel(String channel) {
				this.channel = channel;
			}

			public Long getSafetyLevel() {
				return this.safetyLevel;
			}

			public void setSafetyLevel(Long safetyLevel) {
				this.safetyLevel = safetyLevel;
			}

			public BizInfo getBizInfo() {
				return this.bizInfo;
			}

			public void setBizInfo(BizInfo bizInfo) {
				this.bizInfo = bizInfo;
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
		}

		public static class SubTask {

			private String subTaskId;

			public String getSubTaskId() {
				return this.subTaskId;
			}

			public void setSubTaskId(String subTaskId) {
				this.subTaskId = subTaskId;
			}
		}

		public static class SubUserTask {

			private String userSubTaskId;

			private String subTaskId;

			private String workNode;

			private String state;

			private Long voteIdx;

			private String lastUserSubTaskId;

			private String operateFlag;

			private Long rejectFlag;

			private String rejectRemark;

			private String gmtTimeout;

			private String externalBizNo;

			private Handler handler;

			public String getUserSubTaskId() {
				return this.userSubTaskId;
			}

			public void setUserSubTaskId(String userSubTaskId) {
				this.userSubTaskId = userSubTaskId;
			}

			public String getSubTaskId() {
				return this.subTaskId;
			}

			public void setSubTaskId(String subTaskId) {
				this.subTaskId = subTaskId;
			}

			public String getWorkNode() {
				return this.workNode;
			}

			public void setWorkNode(String workNode) {
				this.workNode = workNode;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public Long getVoteIdx() {
				return this.voteIdx;
			}

			public void setVoteIdx(Long voteIdx) {
				this.voteIdx = voteIdx;
			}

			public String getLastUserSubTaskId() {
				return this.lastUserSubTaskId;
			}

			public void setLastUserSubTaskId(String lastUserSubTaskId) {
				this.lastUserSubTaskId = lastUserSubTaskId;
			}

			public String getOperateFlag() {
				return this.operateFlag;
			}

			public void setOperateFlag(String operateFlag) {
				this.operateFlag = operateFlag;
			}

			public Long getRejectFlag() {
				return this.rejectFlag;
			}

			public void setRejectFlag(Long rejectFlag) {
				this.rejectFlag = rejectFlag;
			}

			public String getRejectRemark() {
				return this.rejectRemark;
			}

			public void setRejectRemark(String rejectRemark) {
				this.rejectRemark = rejectRemark;
			}

			public String getGmtTimeout() {
				return this.gmtTimeout;
			}

			public void setGmtTimeout(String gmtTimeout) {
				this.gmtTimeout = gmtTimeout;
			}

			public String getExternalBizNo() {
				return this.externalBizNo;
			}

			public void setExternalBizNo(String externalBizNo) {
				this.externalBizNo = externalBizNo;
			}

			public Handler getHandler() {
				return this.handler;
			}

			public void setHandler(Handler handler) {
				this.handler = handler;
			}

			public static class Handler {

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

		public static class OptionTemplate {

			private String gmtCreate;

			private String gmtModified;

			private String id;

			private String name;

			private String tntInstId;

			private String description;

			private Map<Object,Object> exif;

			private Long status;

			private String sharedMode;

			private String type;

			private String classify;

			private List<QuestionConfigsItem> questionConfigs;

			private List<String> tags;

			private List<String> abandonReasons;

			private ViewConfigs viewConfigs;

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

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
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

			public ViewConfigs getViewConfigs() {
				return this.viewConfigs;
			}

			public void setViewConfigs(ViewConfigs viewConfigs) {
				this.viewConfigs = viewConfigs;
			}

			public static class QuestionConfigsItem {

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

				private List<FieldsItem> fields;

				public List<FieldsItem> getFields() {
					return this.fields;
				}

				public void setFields(List<FieldsItem> fields) {
					this.fields = fields;
				}

				public static class FieldsItem {

					private String fieldName;

					private String type;

					private Boolean corsProxy;

					private Boolean hide;

					private String convertor;

					private Map<Object,Object> visitInfo;

					private Map<Object,Object> plugins;

					private List<String> relationQuestionIds;

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

					public Map<Object,Object> getVisitInfo() {
						return this.visitInfo;
					}

					public void setVisitInfo(Map<Object,Object> visitInfo) {
						this.visitInfo = visitInfo;
					}

					public Map<Object,Object> getPlugins() {
						return this.plugins;
					}

					public void setPlugins(Map<Object,Object> plugins) {
						this.plugins = plugins;
					}

					public List<String> getRelationQuestionIds() {
						return this.relationQuestionIds;
					}

					public void setRelationQuestionIds(List<String> relationQuestionIds) {
						this.relationQuestionIds = relationQuestionIds;
					}
				}
			}
		}
	}

	@Override
	public PageViewSubTaskItemResponse getInstance(UnmarshallerContext context) {
		return	PageViewSubTaskItemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
