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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDomainIpaConnDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDomainIpaConnDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private List<DataModule> connectionDataPerInterval;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataModule> getConnectionDataPerInterval() {
		return this.connectionDataPerInterval;
	}

	public void setConnectionDataPerInterval(List<DataModule> connectionDataPerInterval) {
		this.connectionDataPerInterval = connectionDataPerInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private String domain;

		private Long connections;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Long getConnections() {
			return this.connections;
		}

		public void setConnections(Long connections) {
			this.connections = connections;
		}
	}

	@Override
	public DescribeDcdnDomainIpaConnDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDomainIpaConnDataResponseUnmarshaller.unmarshall(this, context);
	}
}
