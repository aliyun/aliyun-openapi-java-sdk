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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListRtcMPUEventSubRecordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRtcMPUEventSubRecordResponse extends AcsResponse {

	private String requestId;

	private Long count;

	private Boolean hasMore;

	private List<SubInfo> logs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Boolean getHasMore() {
		return this.hasMore;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public List<SubInfo> getLogs() {
		return this.logs;
	}

	public void setLogs(List<SubInfo> logs) {
		this.logs = logs;
	}

	public static class SubInfo {

		private String appId;

		private String subId;

		private String msgId;

		private String data;

		private String time;

		private Long cost;

		private String callbackUrl;

		private String hTTPCode;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getSubId() {
			return this.subId;
		}

		public void setSubId(String subId) {
			this.subId = subId;
		}

		public String getMsgId() {
			return this.msgId;
		}

		public void setMsgId(String msgId) {
			this.msgId = msgId;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Long getCost() {
			return this.cost;
		}

		public void setCost(Long cost) {
			this.cost = cost;
		}

		public String getCallbackUrl() {
			return this.callbackUrl;
		}

		public void setCallbackUrl(String callbackUrl) {
			this.callbackUrl = callbackUrl;
		}

		public String getHTTPCode() {
			return this.hTTPCode;
		}

		public void setHTTPCode(String hTTPCode) {
			this.hTTPCode = hTTPCode;
		}
	}

	@Override
	public ListRtcMPUEventSubRecordResponse getInstance(UnmarshallerContext context) {
		return	ListRtcMPUEventSubRecordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
