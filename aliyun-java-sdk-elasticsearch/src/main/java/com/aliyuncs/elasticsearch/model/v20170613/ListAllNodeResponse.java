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
import com.aliyuncs.elasticsearch.transform.v20170613.ListAllNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAllNodeResponse extends AcsResponse {

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

		private String host;

		private Integer port;

		private String zoneId;

		private String nodeType;

		private String cpuPercent;

		private String loadFiveM;

		private String heapPercent;

		private String health;

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getCpuPercent() {
			return this.cpuPercent;
		}

		public void setCpuPercent(String cpuPercent) {
			this.cpuPercent = cpuPercent;
		}

		public String getLoadFiveM() {
			return this.loadFiveM;
		}

		public void setLoadFiveM(String loadFiveM) {
			this.loadFiveM = loadFiveM;
		}

		public String getHeapPercent() {
			return this.heapPercent;
		}

		public void setHeapPercent(String heapPercent) {
			this.heapPercent = heapPercent;
		}

		public String getHealth() {
			return this.health;
		}

		public void setHealth(String health) {
			this.health = health;
		}
	}

	@Override
	public ListAllNodeResponse getInstance(UnmarshallerContext context) {
		return	ListAllNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
