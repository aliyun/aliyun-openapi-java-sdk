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
import com.aliyuncs.sofa.transform.v20190815.ListDSTTracesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDSTTracesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<TracesItem> traces;

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

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<TracesItem> getTraces() {
		return this.traces;
	}

	public void setTraces(List<TracesItem> traces) {
		this.traces = traces;
	}

	public static class TracesItem {

		private Boolean collected;

		private String collectedDescription;

		private String collectedName;

		private String collectedTime;

		private String collectedUserName;

		private String traceId;

		public Boolean getCollected() {
			return this.collected;
		}

		public void setCollected(Boolean collected) {
			this.collected = collected;
		}

		public String getCollectedDescription() {
			return this.collectedDescription;
		}

		public void setCollectedDescription(String collectedDescription) {
			this.collectedDescription = collectedDescription;
		}

		public String getCollectedName() {
			return this.collectedName;
		}

		public void setCollectedName(String collectedName) {
			this.collectedName = collectedName;
		}

		public String getCollectedTime() {
			return this.collectedTime;
		}

		public void setCollectedTime(String collectedTime) {
			this.collectedTime = collectedTime;
		}

		public String getCollectedUserName() {
			return this.collectedUserName;
		}

		public void setCollectedUserName(String collectedUserName) {
			this.collectedUserName = collectedUserName;
		}

		public String getTraceId() {
			return this.traceId;
		}

		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}
	}

	@Override
	public ListDSTTracesResponse getInstance(UnmarshallerContext context) {
		return	ListDSTTracesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
