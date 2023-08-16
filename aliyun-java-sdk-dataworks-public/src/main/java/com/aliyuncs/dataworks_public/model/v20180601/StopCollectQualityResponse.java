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

package com.aliyuncs.dataworks_public.model.v20180601;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20180601.StopCollectQualityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StopCollectQualityResponse extends AcsResponse {

	private String returnCode;

	private String requestId;

	private ReturnValue returnValue;

	public String getReturnCode() {
		return this.returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ReturnValue getReturnValue() {
		return this.returnValue;
	}

	public void setReturnValue(ReturnValue returnValue) {
		this.returnValue = returnValue;
	}

	public static class ReturnValue {

		private String result;

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}
	}

	@Override
	public StopCollectQualityResponse getInstance(UnmarshallerContext context) {
		return	StopCollectQualityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
