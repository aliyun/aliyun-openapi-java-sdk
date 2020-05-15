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

package com.aliyuncs.alimt.model.v20181012;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alimt.transform.v20181012.GetDocTranslateTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDocTranslateTaskResponse extends AcsResponse {

	private String requestId;

	private String taskId;

	private String status;

	private String translateFileUrl;

	private String translateErrorCode;

	private String translateErrorMessage;

	private Integer pageCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTranslateFileUrl() {
		return this.translateFileUrl;
	}

	public void setTranslateFileUrl(String translateFileUrl) {
		this.translateFileUrl = translateFileUrl;
	}

	public String getTranslateErrorCode() {
		return this.translateErrorCode;
	}

	public void setTranslateErrorCode(String translateErrorCode) {
		this.translateErrorCode = translateErrorCode;
	}

	public String getTranslateErrorMessage() {
		return this.translateErrorMessage;
	}

	public void setTranslateErrorMessage(String translateErrorMessage) {
		this.translateErrorMessage = translateErrorMessage;
	}

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public GetDocTranslateTaskResponse getInstance(UnmarshallerContext context) {
		return	GetDocTranslateTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
