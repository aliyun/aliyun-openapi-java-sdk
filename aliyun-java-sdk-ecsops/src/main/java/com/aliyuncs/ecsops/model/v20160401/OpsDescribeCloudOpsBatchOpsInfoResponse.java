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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCloudOpsBatchOpsInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCloudOpsBatchOpsInfoResponse extends AcsResponse {

	private String requestId;

	private String bizMessage;

	private String bizCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizMessage() {
		return this.bizMessage;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private BatchOpsInfoData batchOpsInfoData;

		private BatchOpsTaskData batchOpsTaskData;

		public BatchOpsInfoData getBatchOpsInfoData() {
			return this.batchOpsInfoData;
		}

		public void setBatchOpsInfoData(BatchOpsInfoData batchOpsInfoData) {
			this.batchOpsInfoData = batchOpsInfoData;
		}

		public BatchOpsTaskData getBatchOpsTaskData() {
			return this.batchOpsTaskData;
		}

		public void setBatchOpsTaskData(BatchOpsTaskData batchOpsTaskData) {
			this.batchOpsTaskData = batchOpsTaskData;
		}

		public static class BatchOpsInfoData {

			private Integer totalCount;

			private List<BatchOpsInfo> batchOpsInfos;

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public List<BatchOpsInfo> getBatchOpsInfos() {
				return this.batchOpsInfos;
			}

			public void setBatchOpsInfos(List<BatchOpsInfo> batchOpsInfos) {
				this.batchOpsInfos = batchOpsInfos;
			}

			public static class BatchOpsInfo {

				private String status;

				private String physicalModel;

				private String extendData;

				private String room;

				private String cluster;

				private String planTime;

				private String remark;

				private Integer weightLevel;

				private String submitUser;

				private String problemId;

				private String gmtModified;

				private String azone;

				private String opsType;

				private String resourceType;

				private String aswId;

				private String rack;

				private String region;

				private String gmtCreate;

				private String idc;

				private String resourceId;

				private Integer taskId;

				private Integer id;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getPhysicalModel() {
					return this.physicalModel;
				}

				public void setPhysicalModel(String physicalModel) {
					this.physicalModel = physicalModel;
				}

				public String getExtendData() {
					return this.extendData;
				}

				public void setExtendData(String extendData) {
					this.extendData = extendData;
				}

				public String getRoom() {
					return this.room;
				}

				public void setRoom(String room) {
					this.room = room;
				}

				public String getCluster() {
					return this.cluster;
				}

				public void setCluster(String cluster) {
					this.cluster = cluster;
				}

				public String getPlanTime() {
					return this.planTime;
				}

				public void setPlanTime(String planTime) {
					this.planTime = planTime;
				}

				public String getRemark() {
					return this.remark;
				}

				public void setRemark(String remark) {
					this.remark = remark;
				}

				public Integer getWeightLevel() {
					return this.weightLevel;
				}

				public void setWeightLevel(Integer weightLevel) {
					this.weightLevel = weightLevel;
				}

				public String getSubmitUser() {
					return this.submitUser;
				}

				public void setSubmitUser(String submitUser) {
					this.submitUser = submitUser;
				}

				public String getProblemId() {
					return this.problemId;
				}

				public void setProblemId(String problemId) {
					this.problemId = problemId;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getAzone() {
					return this.azone;
				}

				public void setAzone(String azone) {
					this.azone = azone;
				}

				public String getOpsType() {
					return this.opsType;
				}

				public void setOpsType(String opsType) {
					this.opsType = opsType;
				}

				public String getResourceType() {
					return this.resourceType;
				}

				public void setResourceType(String resourceType) {
					this.resourceType = resourceType;
				}

				public String getAswId() {
					return this.aswId;
				}

				public void setAswId(String aswId) {
					this.aswId = aswId;
				}

				public String getRack() {
					return this.rack;
				}

				public void setRack(String rack) {
					this.rack = rack;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public String getIdc() {
					return this.idc;
				}

				public void setIdc(String idc) {
					this.idc = idc;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public Integer getTaskId() {
					return this.taskId;
				}

				public void setTaskId(Integer taskId) {
					this.taskId = taskId;
				}

				public Integer getId() {
					return this.id;
				}

				public void setId(Integer id) {
					this.id = id;
				}
			}
		}

		public static class BatchOpsTaskData {

			private String status;

			private String physicalModel;

			private String extendData;

			private String room;

			private String cluster;

			private String submitUser;

			private String problemId;

			private String gmtModified;

			private String source;

			private String azone;

			private String opsType;

			private String resourceType;

			private String aswId;

			private String rack;

			private String region;

			private String gmtCreate;

			private String title;

			private String supportedFamily;

			private String idc;

			private String resourceId;

			private Integer id;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getPhysicalModel() {
				return this.physicalModel;
			}

			public void setPhysicalModel(String physicalModel) {
				this.physicalModel = physicalModel;
			}

			public String getExtendData() {
				return this.extendData;
			}

			public void setExtendData(String extendData) {
				this.extendData = extendData;
			}

			public String getRoom() {
				return this.room;
			}

			public void setRoom(String room) {
				this.room = room;
			}

			public String getCluster() {
				return this.cluster;
			}

			public void setCluster(String cluster) {
				this.cluster = cluster;
			}

			public String getSubmitUser() {
				return this.submitUser;
			}

			public void setSubmitUser(String submitUser) {
				this.submitUser = submitUser;
			}

			public String getProblemId() {
				return this.problemId;
			}

			public void setProblemId(String problemId) {
				this.problemId = problemId;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getAzone() {
				return this.azone;
			}

			public void setAzone(String azone) {
				this.azone = azone;
			}

			public String getOpsType() {
				return this.opsType;
			}

			public void setOpsType(String opsType) {
				this.opsType = opsType;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getAswId() {
				return this.aswId;
			}

			public void setAswId(String aswId) {
				this.aswId = aswId;
			}

			public String getRack() {
				return this.rack;
			}

			public void setRack(String rack) {
				this.rack = rack;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getSupportedFamily() {
				return this.supportedFamily;
			}

			public void setSupportedFamily(String supportedFamily) {
				this.supportedFamily = supportedFamily;
			}

			public String getIdc() {
				return this.idc;
			}

			public void setIdc(String idc) {
				this.idc = idc;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}
		}
	}

	@Override
	public OpsDescribeCloudOpsBatchOpsInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCloudOpsBatchOpsInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
