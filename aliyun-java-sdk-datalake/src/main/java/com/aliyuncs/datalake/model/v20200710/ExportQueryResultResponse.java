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

package com.aliyuncs.datalake.model.v20200710;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.datalake.transform.v20200710.ExportQueryResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ExportQueryResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Boolean isReady;

	private List<String> downloadUrlList;

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

	public Boolean getIsReady() {
		return this.isReady;
	}

	public void setIsReady(Boolean isReady) {
		this.isReady = isReady;
	}

	public List<String> getDownloadUrlList() {
		return this.downloadUrlList;
	}

	public void setDownloadUrlList(List<String> downloadUrlList) {
		this.downloadUrlList = downloadUrlList;
	}

	@Override
	public ExportQueryResultResponse getInstance(UnmarshallerContext context) {
		return	ExportQueryResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
