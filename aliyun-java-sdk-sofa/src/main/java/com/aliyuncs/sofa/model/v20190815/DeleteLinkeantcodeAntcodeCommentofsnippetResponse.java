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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DeleteLinkeantcodeAntcodeCommentofsnippetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteLinkeantcodeAntcodeCommentofsnippetResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String responseContent;

	private String responsePage;

	private String responsePageInfoNextPage;

	private String responsePageInfoPerPage;

	private String responsePageInfoPrevPage;

	private String responsePageInfoTotal;

	private String responsePageInfoTotalPages;

	private Long responseStatusCode;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResponseContent() {
		return this.responseContent;
	}

	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}

	public String getResponsePage() {
		return this.responsePage;
	}

	public void setResponsePage(String responsePage) {
		this.responsePage = responsePage;
	}

	public String getResponsePageInfoNextPage() {
		return this.responsePageInfoNextPage;
	}

	public void setResponsePageInfoNextPage(String responsePageInfoNextPage) {
		this.responsePageInfoNextPage = responsePageInfoNextPage;
	}

	public String getResponsePageInfoPerPage() {
		return this.responsePageInfoPerPage;
	}

	public void setResponsePageInfoPerPage(String responsePageInfoPerPage) {
		this.responsePageInfoPerPage = responsePageInfoPerPage;
	}

	public String getResponsePageInfoPrevPage() {
		return this.responsePageInfoPrevPage;
	}

	public void setResponsePageInfoPrevPage(String responsePageInfoPrevPage) {
		this.responsePageInfoPrevPage = responsePageInfoPrevPage;
	}

	public String getResponsePageInfoTotal() {
		return this.responsePageInfoTotal;
	}

	public void setResponsePageInfoTotal(String responsePageInfoTotal) {
		this.responsePageInfoTotal = responsePageInfoTotal;
	}

	public String getResponsePageInfoTotalPages() {
		return this.responsePageInfoTotalPages;
	}

	public void setResponsePageInfoTotalPages(String responsePageInfoTotalPages) {
		this.responsePageInfoTotalPages = responsePageInfoTotalPages;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	@Override
	public DeleteLinkeantcodeAntcodeCommentofsnippetResponse getInstance(UnmarshallerContext context) {
		return	DeleteLinkeantcodeAntcodeCommentofsnippetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
