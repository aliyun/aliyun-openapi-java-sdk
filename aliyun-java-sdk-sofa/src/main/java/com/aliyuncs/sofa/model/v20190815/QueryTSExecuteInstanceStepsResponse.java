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
import com.aliyuncs.sofa.transform.v20190815.QueryTSExecuteInstanceStepsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTSExecuteInstanceStepsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long consume;

		private String gmtBegin;

		private String gmtEnd;

		private String handler;

		private String requestId;

		private Long sharding;

		private String status;

		public Long getConsume() {
			return this.consume;
		}

		public void setConsume(Long consume) {
			this.consume = consume;
		}

		public String getGmtBegin() {
			return this.gmtBegin;
		}

		public void setGmtBegin(String gmtBegin) {
			this.gmtBegin = gmtBegin;
		}

		public String getGmtEnd() {
			return this.gmtEnd;
		}

		public void setGmtEnd(String gmtEnd) {
			this.gmtEnd = gmtEnd;
		}

		public String getHandler() {
			return this.handler;
		}

		public void setHandler(String handler) {
			this.handler = handler;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Long getSharding() {
			return this.sharding;
		}

		public void setSharding(Long sharding) {
			this.sharding = sharding;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public QueryTSExecuteInstanceStepsResponse getInstance(UnmarshallerContext context) {
		return	QueryTSExecuteInstanceStepsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
