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
import com.aliyuncs.elasticsearch.transform.v20170613.ListInstanceHistoryEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceHistoryEventsResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	private Headers headers;

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

	public Headers getHeaders() {
		return this.headers;
	}

	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public static class ResultItem {

		private String eventCreateTime;

		private String eventCycleStatus;

		private String eventExecuteTime;

		private String eventFinashTime;

		private String eventLevel;

		private String instanceId;

		private String nodeIP;

		private String eventType;

		private String regionId;

		private String ecsId;

		public String getEventCreateTime() {
			return this.eventCreateTime;
		}

		public void setEventCreateTime(String eventCreateTime) {
			this.eventCreateTime = eventCreateTime;
		}

		public String getEventCycleStatus() {
			return this.eventCycleStatus;
		}

		public void setEventCycleStatus(String eventCycleStatus) {
			this.eventCycleStatus = eventCycleStatus;
		}

		public String getEventExecuteTime() {
			return this.eventExecuteTime;
		}

		public void setEventExecuteTime(String eventExecuteTime) {
			this.eventExecuteTime = eventExecuteTime;
		}

		public String getEventFinashTime() {
			return this.eventFinashTime;
		}

		public void setEventFinashTime(String eventFinashTime) {
			this.eventFinashTime = eventFinashTime;
		}

		public String getEventLevel() {
			return this.eventLevel;
		}

		public void setEventLevel(String eventLevel) {
			this.eventLevel = eventLevel;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getNodeIP() {
			return this.nodeIP;
		}

		public void setNodeIP(String nodeIP) {
			this.nodeIP = nodeIP;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEcsId() {
			return this.ecsId;
		}

		public void setEcsId(String ecsId) {
			this.ecsId = ecsId;
		}
	}

	public static class Headers {

		private Long xTotalCount;

		private Long xTotalFailed;

		private Long xTotalSuccess;

		public Long getXTotalCount() {
			return this.xTotalCount;
		}

		public void setXTotalCount(Long xTotalCount) {
			this.xTotalCount = xTotalCount;
		}

		public Long getXTotalFailed() {
			return this.xTotalFailed;
		}

		public void setXTotalFailed(Long xTotalFailed) {
			this.xTotalFailed = xTotalFailed;
		}

		public Long getXTotalSuccess() {
			return this.xTotalSuccess;
		}

		public void setXTotalSuccess(Long xTotalSuccess) {
			this.xTotalSuccess = xTotalSuccess;
		}
	}

	@Override
	public ListInstanceHistoryEventsResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceHistoryEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
