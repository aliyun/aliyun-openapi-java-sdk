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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeAssistReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAssistReportResponse extends AcsResponse {

	private String requestId;

	private String assistId;

	private String assistDescription;

	private String assistResult;

	private String assistReason;

	private String assistTag;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAssistId() {
		return this.assistId;
	}

	public void setAssistId(String assistId) {
		this.assistId = assistId;
	}

	public String getAssistDescription() {
		return this.assistDescription;
	}

	public void setAssistDescription(String assistDescription) {
		this.assistDescription = assistDescription;
	}

	public String getAssistResult() {
		return this.assistResult;
	}

	public void setAssistResult(String assistResult) {
		this.assistResult = assistResult;
	}

	public String getAssistReason() {
		return this.assistReason;
	}

	public void setAssistReason(String assistReason) {
		this.assistReason = assistReason;
	}

	public String getAssistTag() {
		return this.assistTag;
	}

	public void setAssistTag(String assistTag) {
		this.assistTag = assistTag;
	}

	@Override
	public DescribeAssistReportResponse getInstance(UnmarshallerContext context) {
		return	DescribeAssistReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
