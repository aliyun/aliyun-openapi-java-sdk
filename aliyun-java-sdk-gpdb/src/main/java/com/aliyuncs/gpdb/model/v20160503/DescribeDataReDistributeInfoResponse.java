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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDataReDistributeInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataReDistributeInfoResponse extends AcsResponse {

	private String requestId;

	private DataReDistributeInfo dataReDistributeInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DataReDistributeInfo getDataReDistributeInfo() {
		return this.dataReDistributeInfo;
	}

	public void setDataReDistributeInfo(DataReDistributeInfo dataReDistributeInfo) {
		this.dataReDistributeInfo = dataReDistributeInfo;
	}

	public static class DataReDistributeInfo {

		private String type;

		private String startTime;

		private Long progress;

		private String remainTime;

		private String message;

		private String status;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Long getProgress() {
			return this.progress;
		}

		public void setProgress(Long progress) {
			this.progress = progress;
		}

		public String getRemainTime() {
			return this.remainTime;
		}

		public void setRemainTime(String remainTime) {
			this.remainTime = remainTime;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeDataReDistributeInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataReDistributeInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
