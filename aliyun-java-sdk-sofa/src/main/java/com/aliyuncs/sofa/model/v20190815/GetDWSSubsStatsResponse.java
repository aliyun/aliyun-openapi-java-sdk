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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetDWSSubsStatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDWSSubsStatsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long exception;

		private Long initializing;

		private Long running;

		private Long total;

		private Long unsubscribe;

		private Long waiting;

		public Long getException() {
			return this.exception;
		}

		public void setException(Long exception) {
			this.exception = exception;
		}

		public Long getInitializing() {
			return this.initializing;
		}

		public void setInitializing(Long initializing) {
			this.initializing = initializing;
		}

		public Long getRunning() {
			return this.running;
		}

		public void setRunning(Long running) {
			this.running = running;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getUnsubscribe() {
			return this.unsubscribe;
		}

		public void setUnsubscribe(Long unsubscribe) {
			this.unsubscribe = unsubscribe;
		}

		public Long getWaiting() {
			return this.waiting;
		}

		public void setWaiting(Long waiting) {
			this.waiting = waiting;
		}
	}

	@Override
	public GetDWSSubsStatsResponse getInstance(UnmarshallerContext context) {
		return	GetDWSSubsStatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
