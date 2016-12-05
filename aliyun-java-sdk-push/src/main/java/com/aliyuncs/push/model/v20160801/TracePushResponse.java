/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.push.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20160801.TracePushResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TracePushResponse extends AcsResponse {

	private String requestId;

	private PushBasicInfo pushBasicInfo;

	private PushTaskInfo pushTaskInfo;

	private PushDeviceInfo pushDeviceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PushBasicInfo getPushBasicInfo() {
		return this.pushBasicInfo;
	}

	public void setPushBasicInfo(PushBasicInfo pushBasicInfo) {
		this.pushBasicInfo = pushBasicInfo;
	}

	public PushTaskInfo getPushTaskInfo() {
		return this.pushTaskInfo;
	}

	public void setPushTaskInfo(PushTaskInfo pushTaskInfo) {
		this.pushTaskInfo = pushTaskInfo;
	}

	public PushDeviceInfo getPushDeviceInfo() {
		return this.pushDeviceInfo;
	}

	public void setPushDeviceInfo(PushDeviceInfo pushDeviceInfo) {
		this.pushDeviceInfo = pushDeviceInfo;
	}

	public static class PushBasicInfo {

		private Long appId;

		private String title;

		private String targetType;

		private String pushType;

		private String pushTime;

		private String expireTime;

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getPushType() {
			return this.pushType;
		}

		public void setPushType(String pushType) {
			this.pushType = pushType;
		}

		public String getPushTime() {
			return this.pushTime;
		}

		public void setPushTime(String pushTime) {
			this.pushTime = pushTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}
	}

	public static class PushTaskInfo {

		private Boolean broadcast;

		private String acceptTime;

		private String androidTaskStatus;

		private String iOSTaskStatus;

		private String androidTaskErrCode;

		private String iOSTaskErrCode;

		private List<String> deviceSet;

		public Boolean getBroadcast() {
			return this.broadcast;
		}

		public void setBroadcast(Boolean broadcast) {
			this.broadcast = broadcast;
		}

		public String getAcceptTime() {
			return this.acceptTime;
		}

		public void setAcceptTime(String acceptTime) {
			this.acceptTime = acceptTime;
		}

		public String getAndroidTaskStatus() {
			return this.androidTaskStatus;
		}

		public void setAndroidTaskStatus(String androidTaskStatus) {
			this.androidTaskStatus = androidTaskStatus;
		}

		public String getiOSTaskStatus() {
			return this.iOSTaskStatus;
		}

		public void setiOSTaskStatus(String iOSTaskStatus) {
			this.iOSTaskStatus = iOSTaskStatus;
		}

		public String getAndroidTaskErrCode() {
			return this.androidTaskErrCode;
		}

		public void setAndroidTaskErrCode(String androidTaskErrCode) {
			this.androidTaskErrCode = androidTaskErrCode;
		}

		public String getiOSTaskErrCode() {
			return this.iOSTaskErrCode;
		}

		public void setiOSTaskErrCode(String iOSTaskErrCode) {
			this.iOSTaskErrCode = iOSTaskErrCode;
		}

		public List<String> getDeviceSet() {
			return this.deviceSet;
		}

		public void setDeviceSet(List<String> deviceSet) {
			this.deviceSet = deviceSet;
		}
	}

	public static class PushDeviceInfo {

		private Boolean online;

		private String createTime;

		private String sentTime;

		private String arriveTime;

		private String clickTime;

		private String cleanTime;

		private String deviceStatus;

		private String deviceErrCode;

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSentTime() {
			return this.sentTime;
		}

		public void setSentTime(String sentTime) {
			this.sentTime = sentTime;
		}

		public String getArriveTime() {
			return this.arriveTime;
		}

		public void setArriveTime(String arriveTime) {
			this.arriveTime = arriveTime;
		}

		public String getClickTime() {
			return this.clickTime;
		}

		public void setClickTime(String clickTime) {
			this.clickTime = clickTime;
		}

		public String getCleanTime() {
			return this.cleanTime;
		}

		public void setCleanTime(String cleanTime) {
			this.cleanTime = cleanTime;
		}

		public String getDeviceStatus() {
			return this.deviceStatus;
		}

		public void setDeviceStatus(String deviceStatus) {
			this.deviceStatus = deviceStatus;
		}

		public String getDeviceErrCode() {
			return this.deviceErrCode;
		}

		public void setDeviceErrCode(String deviceErrCode) {
			this.deviceErrCode = deviceErrCode;
		}
	}

	@Override
	public TracePushResponse getInstance(UnmarshallerContext context) {
		return	TracePushResponseUnmarshaller.unmarshall(this, context);
	}
}
