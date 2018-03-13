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
package com.aliyuncs.jaq.model.v20161123;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.jaq.transform.v20161123.AfsAppCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AfsAppCheckResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMsg;

	private Data data;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer secondCheckResult;

		public Integer getSecondCheckResult() {
			return this.secondCheckResult;
		}

		public void setSecondCheckResult(Integer secondCheckResult) {
			this.secondCheckResult = secondCheckResult;
		}
	}

	@Override
	public AfsAppCheckResponse getInstance(UnmarshallerContext context) {
		return	AfsAppCheckResponseUnmarshaller.unmarshall(this, context);
	}
}
