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

package com.aliyuncs.dts.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.DescribeEtlJobLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEtlJobLogsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errCode;

	private Boolean success;

	private String errMessage;

	private String dynamicMessage;

	private String dynamicCode;

	private List<EtlRunningLog> etlRunningLogs;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public List<EtlRunningLog> getEtlRunningLogs() {
		return this.etlRunningLogs;
	}

	public void setEtlRunningLogs(List<EtlRunningLog> etlRunningLogs) {
		this.etlRunningLogs = etlRunningLogs;
	}

	public static class EtlRunningLog {

		private String etlId;

		private String userId;

		private String contentKey;

		private String content;

		private String status;

		private String logDatetime;

		public String getEtlId() {
			return this.etlId;
		}

		public void setEtlId(String etlId) {
			this.etlId = etlId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getContentKey() {
			return this.contentKey;
		}

		public void setContentKey(String contentKey) {
			this.contentKey = contentKey;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getLogDatetime() {
			return this.logDatetime;
		}

		public void setLogDatetime(String logDatetime) {
			this.logDatetime = logDatetime;
		}
	}

	@Override
	public DescribeEtlJobLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeEtlJobLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
