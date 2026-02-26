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

package com.aliyuncs.viapi.model.v20230117;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CancelWaitingAsyncJobRequest extends RpcAcsRequest<CancelWaitingAsyncJobResponse> {
	   

	private String jobId;
	public CancelWaitingAsyncJobRequest() {
		super("viapi", "2023-01-17", "CancelWaitingAsyncJob", "viapi");
		setMethod(MethodType.POST);
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putBodyParameter("JobId", jobId);
		}
	}

	@Override
	public Class<CancelWaitingAsyncJobResponse> getResponseClass() {
		return CancelWaitingAsyncJobResponse.class;
	}

}
