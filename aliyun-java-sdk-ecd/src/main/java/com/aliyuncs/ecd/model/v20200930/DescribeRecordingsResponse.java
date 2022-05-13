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
import com.aliyuncs.ecd.transform.v20200930.DescribeRecordingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRecordingsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<Recording> recordings;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Recording> getRecordings() {
		return this.recordings;
	}

	public void setRecordings(List<Recording> recordings) {
		this.recordings = recordings;
	}

	public static class Recording {

		private String endTime;

		private String filePath;

		private String startTime;

		private String recordingType;

		private Integer recordingSize;

		private String desktopId;

		private List<String> endUserIds;

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getFilePath() {
			return this.filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getRecordingType() {
			return this.recordingType;
		}

		public void setRecordingType(String recordingType) {
			this.recordingType = recordingType;
		}

		public Integer getRecordingSize() {
			return this.recordingSize;
		}

		public void setRecordingSize(Integer recordingSize) {
			this.recordingSize = recordingSize;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public List<String> getEndUserIds() {
			return this.endUserIds;
		}

		public void setEndUserIds(List<String> endUserIds) {
			this.endUserIds = endUserIds;
		}
	}

	@Override
	public DescribeRecordingsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRecordingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
