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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.UpdateGatewayOptionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayOptionResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean enableHardwareAcceleration;

		private Boolean disableHttp2Alpn;

		private Boolean enableWaf;

		private TraceDetails traceDetails;

		private LogConfigDetails logConfigDetails;

		public Boolean getEnableHardwareAcceleration() {
			return this.enableHardwareAcceleration;
		}

		public void setEnableHardwareAcceleration(Boolean enableHardwareAcceleration) {
			this.enableHardwareAcceleration = enableHardwareAcceleration;
		}

		public Boolean getDisableHttp2Alpn() {
			return this.disableHttp2Alpn;
		}

		public void setDisableHttp2Alpn(Boolean disableHttp2Alpn) {
			this.disableHttp2Alpn = disableHttp2Alpn;
		}

		public Boolean getEnableWaf() {
			return this.enableWaf;
		}

		public void setEnableWaf(Boolean enableWaf) {
			this.enableWaf = enableWaf;
		}

		public TraceDetails getTraceDetails() {
			return this.traceDetails;
		}

		public void setTraceDetails(TraceDetails traceDetails) {
			this.traceDetails = traceDetails;
		}

		public LogConfigDetails getLogConfigDetails() {
			return this.logConfigDetails;
		}

		public void setLogConfigDetails(LogConfigDetails logConfigDetails) {
			this.logConfigDetails = logConfigDetails;
		}

		public static class TraceDetails {

			private Boolean traceEnabled;

			private Long sample;

			public Boolean getTraceEnabled() {
				return this.traceEnabled;
			}

			public void setTraceEnabled(Boolean traceEnabled) {
				this.traceEnabled = traceEnabled;
			}

			public Long getSample() {
				return this.sample;
			}

			public void setSample(Long sample) {
				this.sample = sample;
			}
		}

		public static class LogConfigDetails {

			private Boolean logEnabled;

			private String projectName;

			private String logStoreName;

			public Boolean getLogEnabled() {
				return this.logEnabled;
			}

			public void setLogEnabled(Boolean logEnabled) {
				this.logEnabled = logEnabled;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getLogStoreName() {
				return this.logStoreName;
			}

			public void setLogStoreName(String logStoreName) {
				this.logStoreName = logStoreName;
			}
		}
	}

	@Override
	public UpdateGatewayOptionResponse getInstance(UnmarshallerContext context) {
		return	UpdateGatewayOptionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
