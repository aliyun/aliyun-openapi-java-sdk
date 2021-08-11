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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.ResetDisksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ResetDisksResponse extends AcsResponse {

	private String requestId;

	private List<OperationProgress> operationProgressSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OperationProgress> getOperationProgressSet() {
		return this.operationProgressSet;
	}

	public void setOperationProgressSet(List<OperationProgress> operationProgressSet) {
		this.operationProgressSet = operationProgressSet;
	}

	public static class OperationProgress {

		private String errorMsg;

		private String errorCode;

		private String operationStatus;

		private List<RelatedItem> relatedItemSet;

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getOperationStatus() {
			return this.operationStatus;
		}

		public void setOperationStatus(String operationStatus) {
			this.operationStatus = operationStatus;
		}

		public List<RelatedItem> getRelatedItemSet() {
			return this.relatedItemSet;
		}

		public void setRelatedItemSet(List<RelatedItem> relatedItemSet) {
			this.relatedItemSet = relatedItemSet;
		}

		public static class RelatedItem {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public ResetDisksResponse getInstance(UnmarshallerContext context) {
		return	ResetDisksResponseUnmarshaller.unmarshall(this, context);
	}
}
