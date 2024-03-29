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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.CancelUrlUploadJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CancelUrlUploadJobsResponse extends AcsResponse {

	private String requestId;

	private List<String> canceledJobs;

	private List<String> nonExists;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getCanceledJobs() {
		return this.canceledJobs;
	}

	public void setCanceledJobs(List<String> canceledJobs) {
		this.canceledJobs = canceledJobs;
	}

	public List<String> getNonExists() {
		return this.nonExists;
	}

	public void setNonExists(List<String> nonExists) {
		this.nonExists = nonExists;
	}

	@Override
	public CancelUrlUploadJobsResponse getInstance(UnmarshallerContext context) {
		return	CancelUrlUploadJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
