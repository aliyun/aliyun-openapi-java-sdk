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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DownloadLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DownloadLogResponse extends AcsResponse {

	private String requestId;

	private List<StackTraceItem> stackTrace;

	private List<String> suppressed;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StackTraceItem> getStackTrace() {
		return this.stackTrace;
	}

	public void setStackTrace(List<StackTraceItem> stackTrace) {
		this.stackTrace = stackTrace;
	}

	public List<String> getSuppressed() {
		return this.suppressed;
	}

	public void setSuppressed(List<String> suppressed) {
		this.suppressed = suppressed;
	}

	public static class StackTraceItem {

		private String fileName;

		private Boolean nativeMethod;

		private String methodName;

		private String className;

		private Integer lineNumber;

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Boolean getNativeMethod() {
			return this.nativeMethod;
		}

		public void setNativeMethod(Boolean nativeMethod) {
			this.nativeMethod = nativeMethod;
		}

		public String getMethodName() {
			return this.methodName;
		}

		public void setMethodName(String methodName) {
			this.methodName = methodName;
		}

		public String getClassName() {
			return this.className;
		}

		public void setClassName(String className) {
			this.className = className;
		}

		public Integer getLineNumber() {
			return this.lineNumber;
		}

		public void setLineNumber(Integer lineNumber) {
			this.lineNumber = lineNumber;
		}
	}

	@Override
	public DownloadLogResponse getInstance(UnmarshallerContext context) {
		return	DownloadLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
