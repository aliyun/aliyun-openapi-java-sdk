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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ListSchemeTaskConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSchemeTaskConfigResponse extends AcsResponse {

	private Integer count;

	private Integer currentPage;

	private Integer pageSize;

	private Integer pageNumber;

	private String resultCountId;

	private String lastDataId;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<DataItem> data;

	private List<String> messages;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getResultCountId() {
		return this.resultCountId;
	}

	public void setResultCountId(String resultCountId) {
		this.resultCountId = resultCountId;
	}

	public String getLastDataId() {
		return this.lastDataId;
	}

	public void setLastDataId(String lastDataId) {
		this.lastDataId = lastDataId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public List<String> getMessages() {
		return this.messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public static class DataItem {

		private Long id;

		private Long schemeTaskConfigId;

		private String name;

		private Integer sourceDataType;

		private Integer status;

		private Integer manualReview;

		private Integer assignType;

		private Integer asrTaskPriority;

		private String modeCustomizationId;

		private String modelName;

		private String vocabId;

		private String vocabName;

		private String userGroup;

		private Long createUser;

		private String createTime;

		private String updateTime;

		private Long updateUser;

		private Integer type;

		private Integer numberSum;

		private Integer numberSuccess;

		private Integer numberFail;

		private Double finishRate;

		private Integer numberExecuting;

		private Integer asrVersion;

		private List<SchemeListItem> schemeList;

		private List<Long> schemeIdList;

		private DataConfig dataConfig;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getSchemeTaskConfigId() {
			return this.schemeTaskConfigId;
		}

		public void setSchemeTaskConfigId(Long schemeTaskConfigId) {
			this.schemeTaskConfigId = schemeTaskConfigId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getSourceDataType() {
			return this.sourceDataType;
		}

		public void setSourceDataType(Integer sourceDataType) {
			this.sourceDataType = sourceDataType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getManualReview() {
			return this.manualReview;
		}

		public void setManualReview(Integer manualReview) {
			this.manualReview = manualReview;
		}

		public Integer getAssignType() {
			return this.assignType;
		}

		public void setAssignType(Integer assignType) {
			this.assignType = assignType;
		}

		public Integer getAsrTaskPriority() {
			return this.asrTaskPriority;
		}

		public void setAsrTaskPriority(Integer asrTaskPriority) {
			this.asrTaskPriority = asrTaskPriority;
		}

		public String getModeCustomizationId() {
			return this.modeCustomizationId;
		}

		public void setModeCustomizationId(String modeCustomizationId) {
			this.modeCustomizationId = modeCustomizationId;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getVocabId() {
			return this.vocabId;
		}

		public void setVocabId(String vocabId) {
			this.vocabId = vocabId;
		}

		public String getVocabName() {
			return this.vocabName;
		}

		public void setVocabName(String vocabName) {
			this.vocabName = vocabName;
		}

		public String getUserGroup() {
			return this.userGroup;
		}

		public void setUserGroup(String userGroup) {
			this.userGroup = userGroup;
		}

		public Long getCreateUser() {
			return this.createUser;
		}

		public void setCreateUser(Long createUser) {
			this.createUser = createUser;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Long getUpdateUser() {
			return this.updateUser;
		}

		public void setUpdateUser(Long updateUser) {
			this.updateUser = updateUser;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getNumberSum() {
			return this.numberSum;
		}

		public void setNumberSum(Integer numberSum) {
			this.numberSum = numberSum;
		}

		public Integer getNumberSuccess() {
			return this.numberSuccess;
		}

		public void setNumberSuccess(Integer numberSuccess) {
			this.numberSuccess = numberSuccess;
		}

		public Integer getNumberFail() {
			return this.numberFail;
		}

		public void setNumberFail(Integer numberFail) {
			this.numberFail = numberFail;
		}

		public Double getFinishRate() {
			return this.finishRate;
		}

		public void setFinishRate(Double finishRate) {
			this.finishRate = finishRate;
		}

		public Integer getNumberExecuting() {
			return this.numberExecuting;
		}

		public void setNumberExecuting(Integer numberExecuting) {
			this.numberExecuting = numberExecuting;
		}

		public Integer getAsrVersion() {
			return this.asrVersion;
		}

		public void setAsrVersion(Integer asrVersion) {
			this.asrVersion = asrVersion;
		}

		public List<SchemeListItem> getSchemeList() {
			return this.schemeList;
		}

		public void setSchemeList(List<SchemeListItem> schemeList) {
			this.schemeList = schemeList;
		}

		public List<Long> getSchemeIdList() {
			return this.schemeIdList;
		}

		public void setSchemeIdList(List<Long> schemeIdList) {
			this.schemeIdList = schemeIdList;
		}

		public DataConfig getDataConfig() {
			return this.dataConfig;
		}

		public void setDataConfig(DataConfig dataConfig) {
			this.dataConfig = dataConfig;
		}

		public static class SchemeListItem {

			private Long schemeId;

			private String name;

			public Long getSchemeId() {
				return this.schemeId;
			}

			public void setSchemeId(Long schemeId) {
				this.schemeId = schemeId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class DataConfig {

			private Integer index;

			private String resultParam;

			private String dataSets;

			private List<AssignConfig> assignConfigs;

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public String getResultParam() {
				return this.resultParam;
			}

			public void setResultParam(String resultParam) {
				this.resultParam = resultParam;
			}

			public String getDataSets() {
				return this.dataSets;
			}

			public void setDataSets(String dataSets) {
				this.dataSets = dataSets;
			}

			public List<AssignConfig> getAssignConfigs() {
				return this.assignConfigs;
			}

			public void setAssignConfigs(List<AssignConfig> assignConfigs) {
				this.assignConfigs = assignConfigs;
			}

			public static class AssignConfig {

				private List<AssignConfigContest> assignConfigContests;

				public List<AssignConfigContest> getAssignConfigContests() {
					return this.assignConfigContests;
				}

				public void setAssignConfigContests(List<AssignConfigContest> assignConfigContests) {
					this.assignConfigContests = assignConfigContests;
				}

				public static class AssignConfigContest {

					private String name;

					private Integer dataType;

					private Integer symbol;

					private String value;

					private List<String> listObject;

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Integer getDataType() {
						return this.dataType;
					}

					public void setDataType(Integer dataType) {
						this.dataType = dataType;
					}

					public Integer getSymbol() {
						return this.symbol;
					}

					public void setSymbol(Integer symbol) {
						this.symbol = symbol;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public List<String> getListObject() {
						return this.listObject;
					}

					public void setListObject(List<String> listObject) {
						this.listObject = listObject;
					}
				}
			}
		}
	}

	@Override
	public ListSchemeTaskConfigResponse getInstance(UnmarshallerContext context) {
		return	ListSchemeTaskConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
