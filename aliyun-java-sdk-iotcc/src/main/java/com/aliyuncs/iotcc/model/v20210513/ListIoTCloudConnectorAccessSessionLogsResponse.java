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

package com.aliyuncs.iotcc.model.v20210513;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.ListIoTCloudConnectorAccessSessionLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIoTCloudConnectorAccessSessionLogsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<AccessSessionLog> accessSessionLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<AccessSessionLog> getAccessSessionLogs() {
		return this.accessSessionLogs;
	}

	public void setAccessSessionLogs(List<AccessSessionLog> accessSessionLogs) {
		this.accessSessionLogs = accessSessionLogs;
	}

	public static class AccessSessionLog {

		private String sourceIp;

		private String destinationIp;

		private String destinationPort;

		private String time;

		private String clientToServiceFlow;

		private String serviceToClientFlow;

		private String type;

		private List<String> destinations;

		public String getSourceIp() {
			return this.sourceIp;
		}

		public void setSourceIp(String sourceIp) {
			this.sourceIp = sourceIp;
		}

		public String getDestinationIp() {
			return this.destinationIp;
		}

		public void setDestinationIp(String destinationIp) {
			this.destinationIp = destinationIp;
		}

		public String getDestinationPort() {
			return this.destinationPort;
		}

		public void setDestinationPort(String destinationPort) {
			this.destinationPort = destinationPort;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getClientToServiceFlow() {
			return this.clientToServiceFlow;
		}

		public void setClientToServiceFlow(String clientToServiceFlow) {
			this.clientToServiceFlow = clientToServiceFlow;
		}

		public String getServiceToClientFlow() {
			return this.serviceToClientFlow;
		}

		public void setServiceToClientFlow(String serviceToClientFlow) {
			this.serviceToClientFlow = serviceToClientFlow;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<String> getDestinations() {
			return this.destinations;
		}

		public void setDestinations(List<String> destinations) {
			this.destinations = destinations;
		}
	}

	@Override
	public ListIoTCloudConnectorAccessSessionLogsResponse getInstance(UnmarshallerContext context) {
		return	ListIoTCloudConnectorAccessSessionLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
