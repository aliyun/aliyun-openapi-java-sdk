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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListDiskOpsEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDiskOpsEventsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<DiskOpsEventInfo> eventList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DiskOpsEventInfo> getEventList() {
		return this.eventList;
	}

	public void setEventList(List<DiskOpsEventInfo> eventList) {
		this.eventList = eventList;
	}

	public static class DiskOpsEventInfo {

		private String regionId;

		private String userId;

		private String clusterBizId;

		private String clusterName;

		private String instanceId;

		private String instanceName;

		private String instanceStatus;

		private String privateIp;

		private String diskId;

		private String diskDevice;

		private String diskMountPoint;

		private String eventId;

		private String eventType;

		private Long eventTriggerTime;

		private String currentActivity;

		private String currentActivityState;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getClusterBizId() {
			return this.clusterBizId;
		}

		public void setClusterBizId(String clusterBizId) {
			this.clusterBizId = clusterBizId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getDiskDevice() {
			return this.diskDevice;
		}

		public void setDiskDevice(String diskDevice) {
			this.diskDevice = diskDevice;
		}

		public String getDiskMountPoint() {
			return this.diskMountPoint;
		}

		public void setDiskMountPoint(String diskMountPoint) {
			this.diskMountPoint = diskMountPoint;
		}

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public Long getEventTriggerTime() {
			return this.eventTriggerTime;
		}

		public void setEventTriggerTime(Long eventTriggerTime) {
			this.eventTriggerTime = eventTriggerTime;
		}

		public String getCurrentActivity() {
			return this.currentActivity;
		}

		public void setCurrentActivity(String currentActivity) {
			this.currentActivity = currentActivity;
		}

		public String getCurrentActivityState() {
			return this.currentActivityState;
		}

		public void setCurrentActivityState(String currentActivityState) {
			this.currentActivityState = currentActivityState;
		}
	}

	@Override
	public ListDiskOpsEventsResponse getInstance(UnmarshallerContext context) {
		return	ListDiskOpsEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
