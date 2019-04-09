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

package com.aliyuncs.airec.model.v20181012;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20181012.DescribeDataSetMessageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataSetMessageResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String message;

		private String errorLevel;

		private String errorType;

		private String timestamp;

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getErrorLevel() {
			return this.errorLevel;
		}

		public void setErrorLevel(String errorLevel) {
			this.errorLevel = errorLevel;
		}

		public String getErrorType() {
			return this.errorType;
		}

		public void setErrorType(String errorType) {
			this.errorType = errorType;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public DescribeDataSetMessageResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataSetMessageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
