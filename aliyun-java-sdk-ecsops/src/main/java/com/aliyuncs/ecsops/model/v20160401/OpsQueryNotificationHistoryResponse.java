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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryNotificationHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryNotificationHistoryResponse extends AcsResponse {

	private String requestId;

	private Integer totalCnt;

	private Integer pageNumber;

	private Integer pageSize;

	private List<NotifyHistory> notifyHistoryList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCnt() {
		return this.totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
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

	public List<NotifyHistory> getNotifyHistoryList() {
		return this.notifyHistoryList;
	}

	public void setNotifyHistoryList(List<NotifyHistory> notifyHistoryList) {
		this.notifyHistoryList = notifyHistoryList;
	}

	public static class NotifyHistory {

		private String alertParameter;

		private String notifyResultInfo;

		private String dedupUk;

		private String completeTime;

		private String gmtModified;

		private String alertStaffId;

		private String notifySuccess;

		private String machineId;

		private String tag;

		private String callTime;

		private String alertChannel;

		private String gmtCreate;

		private String token;

		private String alertEventId;

		private String alertContent;

		private String matchedRouteKey;

		private String alertConfigId;

		private String alertConfigName;

		private String matchedCondition;

		private Long id;

		private String alertSource;

		public String getAlertParameter() {
			return this.alertParameter;
		}

		public void setAlertParameter(String alertParameter) {
			this.alertParameter = alertParameter;
		}

		public String getNotifyResultInfo() {
			return this.notifyResultInfo;
		}

		public void setNotifyResultInfo(String notifyResultInfo) {
			this.notifyResultInfo = notifyResultInfo;
		}

		public String getDedupUk() {
			return this.dedupUk;
		}

		public void setDedupUk(String dedupUk) {
			this.dedupUk = dedupUk;
		}

		public String getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(String completeTime) {
			this.completeTime = completeTime;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getAlertStaffId() {
			return this.alertStaffId;
		}

		public void setAlertStaffId(String alertStaffId) {
			this.alertStaffId = alertStaffId;
		}

		public String getNotifySuccess() {
			return this.notifySuccess;
		}

		public void setNotifySuccess(String notifySuccess) {
			this.notifySuccess = notifySuccess;
		}

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getCallTime() {
			return this.callTime;
		}

		public void setCallTime(String callTime) {
			this.callTime = callTime;
		}

		public String getAlertChannel() {
			return this.alertChannel;
		}

		public void setAlertChannel(String alertChannel) {
			this.alertChannel = alertChannel;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getAlertEventId() {
			return this.alertEventId;
		}

		public void setAlertEventId(String alertEventId) {
			this.alertEventId = alertEventId;
		}

		public String getAlertContent() {
			return this.alertContent;
		}

		public void setAlertContent(String alertContent) {
			this.alertContent = alertContent;
		}

		public String getMatchedRouteKey() {
			return this.matchedRouteKey;
		}

		public void setMatchedRouteKey(String matchedRouteKey) {
			this.matchedRouteKey = matchedRouteKey;
		}

		public String getAlertConfigId() {
			return this.alertConfigId;
		}

		public void setAlertConfigId(String alertConfigId) {
			this.alertConfigId = alertConfigId;
		}

		public String getAlertConfigName() {
			return this.alertConfigName;
		}

		public void setAlertConfigName(String alertConfigName) {
			this.alertConfigName = alertConfigName;
		}

		public String getMatchedCondition() {
			return this.matchedCondition;
		}

		public void setMatchedCondition(String matchedCondition) {
			this.matchedCondition = matchedCondition;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getAlertSource() {
			return this.alertSource;
		}

		public void setAlertSource(String alertSource) {
			this.alertSource = alertSource;
		}
	}

	@Override
	public OpsQueryNotificationHistoryResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryNotificationHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
