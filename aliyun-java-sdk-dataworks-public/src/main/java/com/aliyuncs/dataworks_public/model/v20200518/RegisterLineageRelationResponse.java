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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.RegisterLineageRelationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RegisterLineageRelationResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private LineageRelation lineageRelation;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public LineageRelation getLineageRelation() {
		return this.lineageRelation;
	}

	public void setLineageRelation(LineageRelation lineageRelation) {
		this.lineageRelation = lineageRelation;
	}

	public static class LineageRelation {

		private String srcEntityQualifiedName;

		private String destEntityQualifiedName;

		private String relationshipGuid;

		public String getSrcEntityQualifiedName() {
			return this.srcEntityQualifiedName;
		}

		public void setSrcEntityQualifiedName(String srcEntityQualifiedName) {
			this.srcEntityQualifiedName = srcEntityQualifiedName;
		}

		public String getDestEntityQualifiedName() {
			return this.destEntityQualifiedName;
		}

		public void setDestEntityQualifiedName(String destEntityQualifiedName) {
			this.destEntityQualifiedName = destEntityQualifiedName;
		}

		public String getRelationshipGuid() {
			return this.relationshipGuid;
		}

		public void setRelationshipGuid(String relationshipGuid) {
			this.relationshipGuid = relationshipGuid;
		}
	}

	@Override
	public RegisterLineageRelationResponse getInstance(UnmarshallerContext context) {
		return	RegisterLineageRelationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
