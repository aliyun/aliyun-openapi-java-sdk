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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListLogstashLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLogstashLogResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Long timestamp;

		private String host;

		private String level;

		private String content;

		private String instanceId;

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public ListLogstashLogResponse getInstance(UnmarshallerContext context) {
		return	ListLogstashLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
