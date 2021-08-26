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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeUserConnectionRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserConnectionRecordsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<ConnectionRecord> connectionRecords;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ConnectionRecord> getConnectionRecords() {
		return this.connectionRecords;
	}

	public void setConnectionRecords(List<ConnectionRecord> connectionRecords) {
		this.connectionRecords = connectionRecords;
	}

	public static class ConnectionRecord {

		private String connectionRecordId;

		private String connectStartTime;

		private String connectEndTime;

		private String connectDuration;

		private String desktopId;

		private String desktopName;

		public String getConnectionRecordId() {
			return this.connectionRecordId;
		}

		public void setConnectionRecordId(String connectionRecordId) {
			this.connectionRecordId = connectionRecordId;
		}

		public String getConnectStartTime() {
			return this.connectStartTime;
		}

		public void setConnectStartTime(String connectStartTime) {
			this.connectStartTime = connectStartTime;
		}

		public String getConnectEndTime() {
			return this.connectEndTime;
		}

		public void setConnectEndTime(String connectEndTime) {
			this.connectEndTime = connectEndTime;
		}

		public String getConnectDuration() {
			return this.connectDuration;
		}

		public void setConnectDuration(String connectDuration) {
			this.connectDuration = connectDuration;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}
	}

	@Override
	public DescribeUserConnectionRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserConnectionRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
