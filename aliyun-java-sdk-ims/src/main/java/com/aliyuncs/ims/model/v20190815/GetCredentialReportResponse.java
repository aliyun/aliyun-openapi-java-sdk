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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.GetCredentialReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCredentialReportResponse extends AcsResponse {

	private String generatedTime;

	private String requestId;

	private String content;

	private String isTruncated;

	private String nextToken;

	public String getGeneratedTime() {
		return this.generatedTime;
	}

	public void setGeneratedTime(String generatedTime) {
		this.generatedTime = generatedTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIsTruncated() {
		return this.isTruncated;
	}

	public void setIsTruncated(String isTruncated) {
		this.isTruncated = isTruncated;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	@Override
	public GetCredentialReportResponse getInstance(UnmarshallerContext context) {
		return	GetCredentialReportResponseUnmarshaller.unmarshall(this, context);
	}
}
