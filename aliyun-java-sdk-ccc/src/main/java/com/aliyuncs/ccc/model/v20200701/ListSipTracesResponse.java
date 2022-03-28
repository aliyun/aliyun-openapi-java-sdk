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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListSipTracesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSipTracesResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private List<CallTraces> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CallTraces> getData() {
		return this.data;
	}

	public void setData(List<CallTraces> data) {
		this.data = data;
	}

	public static class CallTraces {

		private String callId;

		private String contactId;

		private String firstLine;

		private String destinationNodeIp;

		private String sourceNodeIp;

		private String payload;

		private Long timestamp;

		public String getCallId() {
			return this.callId;
		}

		public void setCallId(String callId) {
			this.callId = callId;
		}

		public String getContactId() {
			return this.contactId;
		}

		public void setContactId(String contactId) {
			this.contactId = contactId;
		}

		public String getFirstLine() {
			return this.firstLine;
		}

		public void setFirstLine(String firstLine) {
			this.firstLine = firstLine;
		}

		public String getDestinationNodeIp() {
			return this.destinationNodeIp;
		}

		public void setDestinationNodeIp(String destinationNodeIp) {
			this.destinationNodeIp = destinationNodeIp;
		}

		public String getSourceNodeIp() {
			return this.sourceNodeIp;
		}

		public void setSourceNodeIp(String sourceNodeIp) {
			this.sourceNodeIp = sourceNodeIp;
		}

		public String getPayload() {
			return this.payload;
		}

		public void setPayload(String payload) {
			this.payload = payload;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public ListSipTracesResponse getInstance(UnmarshallerContext context) {
		return	ListSipTracesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
