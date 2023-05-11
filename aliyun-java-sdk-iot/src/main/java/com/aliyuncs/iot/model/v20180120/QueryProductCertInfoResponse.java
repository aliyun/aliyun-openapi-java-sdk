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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryProductCertInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProductCertInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private ProductCertInfo productCertInfo;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ProductCertInfo getProductCertInfo() {
		return this.productCertInfo;
	}

	public void setProductCertInfo(ProductCertInfo productCertInfo) {
		this.productCertInfo = productCertInfo;
	}

	public static class ProductCertInfo {

		private Integer issueModel;

		public Integer getIssueModel() {
			return this.issueModel;
		}

		public void setIssueModel(Integer issueModel) {
			this.issueModel = issueModel;
		}
	}

	@Override
	public QueryProductCertInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryProductCertInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
