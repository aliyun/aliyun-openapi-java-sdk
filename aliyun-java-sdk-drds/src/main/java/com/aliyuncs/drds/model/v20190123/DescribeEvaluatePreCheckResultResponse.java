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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeEvaluatePreCheckResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEvaluatePreCheckResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private PreCheckResult preCheckResult;

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

	public PreCheckResult getPreCheckResult() {
		return this.preCheckResult;
	}

	public void setPreCheckResult(PreCheckResult preCheckResult) {
		this.preCheckResult = preCheckResult;
	}

	public static class PreCheckResult {

		private String preCheckName;

		private String state;

		private List<SubCheckItemsItem> subCheckItems;

		public String getPreCheckName() {
			return this.preCheckName;
		}

		public void setPreCheckName(String preCheckName) {
			this.preCheckName = preCheckName;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public List<SubCheckItemsItem> getSubCheckItems() {
			return this.subCheckItems;
		}

		public void setSubCheckItems(List<SubCheckItemsItem> subCheckItems) {
			this.subCheckItems = subCheckItems;
		}

		public static class SubCheckItemsItem {

			private String preCheckItemName;

			private String state;

			private String errorMsgCode;

			private List<String> errorMsgParams;

			public String getPreCheckItemName() {
				return this.preCheckItemName;
			}

			public void setPreCheckItemName(String preCheckItemName) {
				this.preCheckItemName = preCheckItemName;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getErrorMsgCode() {
				return this.errorMsgCode;
			}

			public void setErrorMsgCode(String errorMsgCode) {
				this.errorMsgCode = errorMsgCode;
			}

			public List<String> getErrorMsgParams() {
				return this.errorMsgParams;
			}

			public void setErrorMsgParams(List<String> errorMsgParams) {
				this.errorMsgParams = errorMsgParams;
			}
		}
	}

	@Override
	public DescribeEvaluatePreCheckResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeEvaluatePreCheckResultResponseUnmarshaller.unmarshall(this, context);
	}
}
