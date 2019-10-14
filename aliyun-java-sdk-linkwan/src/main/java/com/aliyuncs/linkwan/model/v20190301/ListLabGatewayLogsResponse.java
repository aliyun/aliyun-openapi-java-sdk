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

package com.aliyuncs.linkwan.model.v20190301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.ListLabGatewayLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLabGatewayLogsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<LabGatewayLog> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<LabGatewayLog> getData() {
		return this.data;
	}

	public void setData(List<LabGatewayLog> data) {
		this.data = data;
	}

	public static class LabGatewayLog {

		private String logType;

		private Long logMillis;

		private String content;

		public String getLogType() {
			return this.logType;
		}

		public void setLogType(String logType) {
			this.logType = logType;
		}

		public Long getLogMillis() {
			return this.logMillis;
		}

		public void setLogMillis(Long logMillis) {
			this.logMillis = logMillis;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public ListLabGatewayLogsResponse getInstance(UnmarshallerContext context) {
		return	ListLabGatewayLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
