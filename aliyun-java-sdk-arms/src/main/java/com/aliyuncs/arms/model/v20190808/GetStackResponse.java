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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetStackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStackResponse extends AcsResponse {

	private String requestId;

	private List<StackInfoItem> stackInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StackInfoItem> getStackInfo() {
		return this.stackInfo;
	}

	public void setStackInfo(List<StackInfoItem> stackInfo) {
		this.stackInfo = stackInfo;
	}

	public static class StackInfoItem {

		private Long startTime;

		private Long duration;

		private String rpcId;

		private String serviceName;

		private String api;

		private String exception;

		private String line;

		private List<ExtInfoItem> extInfo;

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public String getRpcId() {
			return this.rpcId;
		}

		public void setRpcId(String rpcId) {
			this.rpcId = rpcId;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getApi() {
			return this.api;
		}

		public void setApi(String api) {
			this.api = api;
		}

		public String getException() {
			return this.exception;
		}

		public void setException(String exception) {
			this.exception = exception;
		}

		public String getLine() {
			return this.line;
		}

		public void setLine(String line) {
			this.line = line;
		}

		public List<ExtInfoItem> getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(List<ExtInfoItem> extInfo) {
			this.extInfo = extInfo;
		}

		public static class ExtInfoItem {

			private String type;

			private String info;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getInfo() {
				return this.info;
			}

			public void setInfo(String info) {
				this.info = info;
			}
		}
	}

	@Override
	public GetStackResponse getInstance(UnmarshallerContext context) {
		return	GetStackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
