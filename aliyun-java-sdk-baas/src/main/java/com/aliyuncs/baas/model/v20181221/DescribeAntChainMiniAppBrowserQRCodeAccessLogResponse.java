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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long accessAlipayAccountCount;

		private Long accessCount;

		public Long getAccessAlipayAccountCount() {
			return this.accessAlipayAccountCount;
		}

		public void setAccessAlipayAccountCount(Long accessAlipayAccountCount) {
			this.accessAlipayAccountCount = accessAlipayAccountCount;
		}

		public Long getAccessCount() {
			return this.accessCount;
		}

		public void setAccessCount(Long accessCount) {
			this.accessCount = accessCount;
		}
	}

	@Override
	public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainMiniAppBrowserQRCodeAccessLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
