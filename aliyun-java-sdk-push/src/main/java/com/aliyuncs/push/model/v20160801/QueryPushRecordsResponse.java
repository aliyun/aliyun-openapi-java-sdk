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

package com.aliyuncs.push.model.v20160801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20160801.QueryPushRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPushRecordsResponse extends AcsResponse {

	private String nextToken;

	private Integer pageSize;

	private String requestId;

	private Integer total;

	private Integer page;

	private List<PushInfo> pushInfos;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public List<PushInfo> getPushInfos() {
		return this.pushInfos;
	}

	public void setPushInfos(List<PushInfo> pushInfos) {
		this.pushInfos = pushInfos;
	}

	public static class PushInfo {

		private String status;

		private String messageId;

		private Long appKey;

		private String deviceType;

		private String pushType;

		private String body;

		private String title;

		private String source;

		private String pushTime;

		private String target;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessageId() {
			return this.messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}

		public Long getAppKey() {
			return this.appKey;
		}

		public void setAppKey(Long appKey) {
			this.appKey = appKey;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getPushType() {
			return this.pushType;
		}

		public void setPushType(String pushType) {
			this.pushType = pushType;
		}

		public String getBody() {
			return this.body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getPushTime() {
			return this.pushTime;
		}

		public void setPushTime(String pushTime) {
			this.pushTime = pushTime;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}
	}

	@Override
	public QueryPushRecordsResponse getInstance(UnmarshallerContext context) {
		return	QueryPushRecordsResponseUnmarshaller.unmarshall(this, context);
	}
}
