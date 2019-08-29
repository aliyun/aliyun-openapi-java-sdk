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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeVsDomainRecordDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVsDomainRecordDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private List<DataModule> recordDataPerInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public List<DataModule> getRecordDataPerInterval() {
		return this.recordDataPerInterval;
	}

	public void setRecordDataPerInterval(List<DataModule> recordDataPerInterval) {
		this.recordDataPerInterval = recordDataPerInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private String recordValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getRecordValue() {
			return this.recordValue;
		}

		public void setRecordValue(String recordValue) {
			this.recordValue = recordValue;
		}
	}

	@Override
	public DescribeVsDomainRecordDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVsDomainRecordDataResponseUnmarshaller.unmarshall(this, context);
	}
}
