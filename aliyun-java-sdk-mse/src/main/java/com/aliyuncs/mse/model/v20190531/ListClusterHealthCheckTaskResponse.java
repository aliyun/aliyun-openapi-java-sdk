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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListClusterHealthCheckTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterHealthCheckTaskResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String errorCode;

	private Integer httpStatusCode;

	private String message;

	private String dynamicCode;

	private String dynamicMessage;

	private Data data;

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

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer totalSize;

		private Integer pageSize;

		private List<ResultItem> result;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Integer totalSize) {
			this.totalSize = totalSize;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<ResultItem> getResult() {
			return this.result;
		}

		public void setResult(List<ResultItem> result) {
			this.result = result;
		}

		public static class ResultItem {

			private Integer id;

			private Integer score;

			private Integer totalItem;

			private Integer totalRisk;

			private String instanceId;

			private String clusterType;

			private String type;

			private String status;

			private String primaryUser;

			private String spec;

			private String replica;

			private String versionCode;

			private String appVersion;

			private String imageVersion;

			private String createTime;

			private String updateTime;

			private String chargeType;

			private List<RiskListItem> riskList;

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public Integer getScore() {
				return this.score;
			}

			public void setScore(Integer score) {
				this.score = score;
			}

			public Integer getTotalItem() {
				return this.totalItem;
			}

			public void setTotalItem(Integer totalItem) {
				this.totalItem = totalItem;
			}

			public Integer getTotalRisk() {
				return this.totalRisk;
			}

			public void setTotalRisk(Integer totalRisk) {
				this.totalRisk = totalRisk;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getClusterType() {
				return this.clusterType;
			}

			public void setClusterType(String clusterType) {
				this.clusterType = clusterType;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPrimaryUser() {
				return this.primaryUser;
			}

			public void setPrimaryUser(String primaryUser) {
				this.primaryUser = primaryUser;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public String getReplica() {
				return this.replica;
			}

			public void setReplica(String replica) {
				this.replica = replica;
			}

			public String getVersionCode() {
				return this.versionCode;
			}

			public void setVersionCode(String versionCode) {
				this.versionCode = versionCode;
			}

			public String getAppVersion() {
				return this.appVersion;
			}

			public void setAppVersion(String appVersion) {
				this.appVersion = appVersion;
			}

			public String getImageVersion() {
				return this.imageVersion;
			}

			public void setImageVersion(String imageVersion) {
				this.imageVersion = imageVersion;
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

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public List<RiskListItem> getRiskList() {
				return this.riskList;
			}

			public void setRiskList(List<RiskListItem> riskList) {
				this.riskList = riskList;
			}

			public static class RiskListItem {

				private Integer id;

				private Long taskId;

				private String riskName;

				private String riskCode;

				private String primaryUser;

				private Integer type;

				private String values;

				private String module;

				private String riskType;

				private String riskLevel;

				private String suggestion;

				private String situation;

				private String description;

				private Boolean mute;

				private Boolean noticeFeature;

				public Integer getId() {
					return this.id;
				}

				public void setId(Integer id) {
					this.id = id;
				}

				public Long getTaskId() {
					return this.taskId;
				}

				public void setTaskId(Long taskId) {
					this.taskId = taskId;
				}

				public String getRiskName() {
					return this.riskName;
				}

				public void setRiskName(String riskName) {
					this.riskName = riskName;
				}

				public String getRiskCode() {
					return this.riskCode;
				}

				public void setRiskCode(String riskCode) {
					this.riskCode = riskCode;
				}

				public String getPrimaryUser() {
					return this.primaryUser;
				}

				public void setPrimaryUser(String primaryUser) {
					this.primaryUser = primaryUser;
				}

				public Integer getType() {
					return this.type;
				}

				public void setType(Integer type) {
					this.type = type;
				}

				public String getValues() {
					return this.values;
				}

				public void setValues(String values) {
					this.values = values;
				}

				public String getModule() {
					return this.module;
				}

				public void setModule(String module) {
					this.module = module;
				}

				public String getRiskType() {
					return this.riskType;
				}

				public void setRiskType(String riskType) {
					this.riskType = riskType;
				}

				public String getRiskLevel() {
					return this.riskLevel;
				}

				public void setRiskLevel(String riskLevel) {
					this.riskLevel = riskLevel;
				}

				public String getSuggestion() {
					return this.suggestion;
				}

				public void setSuggestion(String suggestion) {
					this.suggestion = suggestion;
				}

				public String getSituation() {
					return this.situation;
				}

				public void setSituation(String situation) {
					this.situation = situation;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Boolean getMute() {
					return this.mute;
				}

				public void setMute(Boolean mute) {
					this.mute = mute;
				}

				public Boolean getNoticeFeature() {
					return this.noticeFeature;
				}

				public void setNoticeFeature(Boolean noticeFeature) {
					this.noticeFeature = noticeFeature;
				}
			}
		}
	}

	@Override
	public ListClusterHealthCheckTaskResponse getInstance(UnmarshallerContext context) {
		return	ListClusterHealthCheckTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
