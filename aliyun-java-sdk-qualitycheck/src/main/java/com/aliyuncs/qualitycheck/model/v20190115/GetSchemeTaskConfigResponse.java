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
import com.aliyuncs.qualitycheck.transform.v20190115.GetSchemeTaskConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSchemeTaskConfigResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String success;

	private String message;

	private String httpStatusCode;

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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private Long schemeTaskConfigId;

		private String name;

		private String sourceDataType;

		private String status;

		private Integer assignType;

		private Integer manualReview;

		private Integer asrTaskPriority;

		private String modeCustomizationId;

		private String modelName;

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

		public String getSourceDataType() {
			return this.sourceDataType;
		}

		public void setSourceDataType(String sourceDataType) {
			this.sourceDataType = sourceDataType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getAssignType() {
			return this.assignType;
		}

		public void setAssignType(Integer assignType) {
			this.assignType = assignType;
		}

		public Integer getManualReview() {
			return this.manualReview;
		}

		public void setManualReview(Integer manualReview) {
			this.manualReview = manualReview;
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

			private Long index;

			private String resultParam;

			private String dataSets;

			private List<AssignConfigsItem> assignConfigs;

			public Long getIndex() {
				return this.index;
			}

			public void setIndex(Long index) {
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

			public List<AssignConfigsItem> getAssignConfigs() {
				return this.assignConfigs;
			}

			public void setAssignConfigs(List<AssignConfigsItem> assignConfigs) {
				this.assignConfigs = assignConfigs;
			}

			public static class AssignConfigsItem {

				private List<AssignConfigContestsItem> assignConfigContests;

				public List<AssignConfigContestsItem> getAssignConfigContests() {
					return this.assignConfigContests;
				}

				public void setAssignConfigContests(List<AssignConfigContestsItem> assignConfigContests) {
					this.assignConfigContests = assignConfigContests;
				}

				public static class AssignConfigContestsItem {

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
	public GetSchemeTaskConfigResponse getInstance(UnmarshallerContext context) {
		return	GetSchemeTaskConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
