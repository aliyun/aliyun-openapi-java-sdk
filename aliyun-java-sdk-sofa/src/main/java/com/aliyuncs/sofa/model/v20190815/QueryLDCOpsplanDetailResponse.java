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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryLDCOpsplanDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLDCOpsplanDetailResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long appCount;

	private String executor;

	private String finishTime;

	private String id;

	private String messageDetail;

	private String mode;

	private String name;

	private String remark;

	private String startTime;

	private String state;

	private String timeSeriesId;

	private String type;

	private List<AppInfosItem> appInfos;

	private List<GroupCollectionListItem> groupCollectionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getAppCount() {
		return this.appCount;
	}

	public void setAppCount(Long appCount) {
		this.appCount = appCount;
	}

	public String getExecutor() {
		return this.executor;
	}

	public void setExecutor(String executor) {
		this.executor = executor;
	}

	public String getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessageDetail() {
		return this.messageDetail;
	}

	public void setMessageDetail(String messageDetail) {
		this.messageDetail = messageDetail;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimeSeriesId() {
		return this.timeSeriesId;
	}

	public void setTimeSeriesId(String timeSeriesId) {
		this.timeSeriesId = timeSeriesId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<AppInfosItem> getAppInfos() {
		return this.appInfos;
	}

	public void setAppInfos(List<AppInfosItem> appInfos) {
		this.appInfos = appInfos;
	}

	public List<GroupCollectionListItem> getGroupCollectionList() {
		return this.groupCollectionList;
	}

	public void setGroupCollectionList(List<GroupCollectionListItem> groupCollectionList) {
		this.groupCollectionList = groupCollectionList;
	}

	public static class AppInfosItem {

		private String appId;

		private String appInstanceGroupName;

		private String appName;

		private String executor;

		private String finishTime;

		private Long groupNum;

		private String groupStrategy;

		private String id;

		private String namespace;

		private String operationType;

		private String revision;

		private String rollbackRevision;

		private Boolean standaloneExecutable;

		private String startTime;

		private String state;

		private Long podCount;

		private String rollbackReason;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppInstanceGroupName() {
			return this.appInstanceGroupName;
		}

		public void setAppInstanceGroupName(String appInstanceGroupName) {
			this.appInstanceGroupName = appInstanceGroupName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getExecutor() {
			return this.executor;
		}

		public void setExecutor(String executor) {
			this.executor = executor;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public Long getGroupNum() {
			return this.groupNum;
		}

		public void setGroupNum(Long groupNum) {
			this.groupNum = groupNum;
		}

		public String getGroupStrategy() {
			return this.groupStrategy;
		}

		public void setGroupStrategy(String groupStrategy) {
			this.groupStrategy = groupStrategy;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getOperationType() {
			return this.operationType;
		}

		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}

		public String getRevision() {
			return this.revision;
		}

		public void setRevision(String revision) {
			this.revision = revision;
		}

		public String getRollbackRevision() {
			return this.rollbackRevision;
		}

		public void setRollbackRevision(String rollbackRevision) {
			this.rollbackRevision = rollbackRevision;
		}

		public Boolean getStandaloneExecutable() {
			return this.standaloneExecutable;
		}

		public void setStandaloneExecutable(Boolean standaloneExecutable) {
			this.standaloneExecutable = standaloneExecutable;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getPodCount() {
			return this.podCount;
		}

		public void setPodCount(Long podCount) {
			this.podCount = podCount;
		}

		public String getRollbackReason() {
			return this.rollbackReason;
		}

		public void setRollbackReason(String rollbackReason) {
			this.rollbackReason = rollbackReason;
		}
	}

	public static class GroupCollectionListItem {

		private List<AppGroupListItem> appGroupList;

		public List<AppGroupListItem> getAppGroupList() {
			return this.appGroupList;
		}

		public void setAppGroupList(List<AppGroupListItem> appGroupList) {
			this.appGroupList = appGroupList;
		}

		public static class AppGroupListItem {

			private String id;

			private String state;

			private List<String> appIdList;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public List<String> getAppIdList() {
				return this.appIdList;
			}

			public void setAppIdList(List<String> appIdList) {
				this.appIdList = appIdList;
			}
		}
	}

	@Override
	public QueryLDCOpsplanDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryLDCOpsplanDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
