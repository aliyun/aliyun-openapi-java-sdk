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

package com.aliyuncs.iqa.model.v20190813;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iqa.transform.v20190813.UploadDocumentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UploadDocumentResponse extends AcsResponse {

	private String requestId;

	private String projectId;

	private Integer totalCount;

	private Integer fileDataCount;

	private Integer jsonDataCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getFileDataCount() {
		return this.fileDataCount;
	}

	public void setFileDataCount(Integer fileDataCount) {
		this.fileDataCount = fileDataCount;
	}

	public Integer getJsonDataCount() {
		return this.jsonDataCount;
	}

	public void setJsonDataCount(Integer jsonDataCount) {
		this.jsonDataCount = jsonDataCount;
	}

	@Override
	public UploadDocumentResponse getInstance(UnmarshallerContext context) {
		return	UploadDocumentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
