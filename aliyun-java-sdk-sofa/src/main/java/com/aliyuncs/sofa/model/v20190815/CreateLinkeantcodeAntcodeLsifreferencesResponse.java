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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.CreateLinkeantcodeAntcodeLsifreferencesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeantcodeAntcodeLsifreferencesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long fileCount;

	private Long refCount;

	private Long responseStatusCode;

	private List<RefListItem> refList;

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

	public Long getFileCount() {
		return this.fileCount;
	}

	public void setFileCount(Long fileCount) {
		this.fileCount = fileCount;
	}

	public Long getRefCount() {
		return this.refCount;
	}

	public void setRefCount(Long refCount) {
		this.refCount = refCount;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public List<RefListItem> getRefList() {
		return this.refList;
	}

	public void setRefList(List<RefListItem> refList) {
		this.refList = refList;
	}

	public static class RefListItem {

		private String uri;

		private List<String> referenceChunks;

		public String getUri() {
			return this.uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}

		public List<String> getReferenceChunks() {
			return this.referenceChunks;
		}

		public void setReferenceChunks(List<String> referenceChunks) {
			this.referenceChunks = referenceChunks;
		}
	}

	@Override
	public CreateLinkeantcodeAntcodeLsifreferencesResponse getInstance(UnmarshallerContext context) {
		return	CreateLinkeantcodeAntcodeLsifreferencesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
