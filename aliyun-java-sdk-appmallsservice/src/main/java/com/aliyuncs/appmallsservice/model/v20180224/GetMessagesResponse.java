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

package com.aliyuncs.appmallsservice.model.v20180224;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.appmallsservice.transform.v20180224.GetMessagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMessagesResponse extends AcsResponse {

	private String errorCode;

	private String msg;

	private String subCode;

	private String subMsg;

	private String logsId;

	private String requestId;

	private List<BizMessagesItem> bizMessages;

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMsg() {
		return this.subMsg;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BizMessagesItem> getBizMessages() {
		return this.bizMessages;
	}

	public void setBizMessages(List<BizMessagesItem> bizMessages) {
		this.bizMessages = bizMessages;
	}

	public static class BizMessagesItem {

		private String pubTime;

		private String topic;

		private Long dataId;

		private String contentMapJson;

		public String getPubTime() {
			return this.pubTime;
		}

		public void setPubTime(String pubTime) {
			this.pubTime = pubTime;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Long getDataId() {
			return this.dataId;
		}

		public void setDataId(Long dataId) {
			this.dataId = dataId;
		}

		public String getContentMapJson() {
			return this.contentMapJson;
		}

		public void setContentMapJson(String contentMapJson) {
			this.contentMapJson = contentMapJson;
		}
	}

	@Override
	public GetMessagesResponse getInstance(UnmarshallerContext context) {
		return	GetMessagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
