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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeMessageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMessageResponse extends AcsResponse {

	private String requestId;

	private Message message;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Message getMessage() {
		return this.message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public static class Message {

		private Long id;

		private String projectId;

		private String appName;

		private String appKey;

		private Integer type;

		private Integer sendStatus;

		private String title;

		private String desc;

		private String action;

		private String uri;

		private String parameter;

		private Integer predictSendCnt;

		private Integer ackCnt;

		private Long gmtCreateTime;

		private Long exipiredTime;

		private Integer audit;

		private String auditMsg;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getSendStatus() {
			return this.sendStatus;
		}

		public void setSendStatus(Integer sendStatus) {
			this.sendStatus = sendStatus;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getUri() {
			return this.uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}

		public String getParameter() {
			return this.parameter;
		}

		public void setParameter(String parameter) {
			this.parameter = parameter;
		}

		public Integer getPredictSendCnt() {
			return this.predictSendCnt;
		}

		public void setPredictSendCnt(Integer predictSendCnt) {
			this.predictSendCnt = predictSendCnt;
		}

		public Integer getAckCnt() {
			return this.ackCnt;
		}

		public void setAckCnt(Integer ackCnt) {
			this.ackCnt = ackCnt;
		}

		public Long getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(Long gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public Long getExipiredTime() {
			return this.exipiredTime;
		}

		public void setExipiredTime(Long exipiredTime) {
			this.exipiredTime = exipiredTime;
		}

		public Integer getAudit() {
			return this.audit;
		}

		public void setAudit(Integer audit) {
			this.audit = audit;
		}

		public String getAuditMsg() {
			return this.auditMsg;
		}

		public void setAuditMsg(String auditMsg) {
			this.auditMsg = auditMsg;
		}
	}

	@Override
	public DescribeMessageResponse getInstance(UnmarshallerContext context) {
		return	DescribeMessageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
