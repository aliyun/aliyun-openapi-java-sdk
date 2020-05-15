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

package com.aliyuncs.rsimganalys.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteTaskRequest extends RpcAcsRequest<DeleteTaskResponse> {
	   

	private String jobId;

	private String appkey;
	public DeleteTaskRequest() {
		super("rsimganalys", "2019-08-01", "DeleteTask");
		setMethod(MethodType.POST);
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public String getAppkey() {
		return this.appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
		if(appkey != null){
			putQueryParameter("Appkey", appkey);
		}
	}

	@Override
	public Class<DeleteTaskResponse> getResponseClass() {
		return DeleteTaskResponse.class;
	}

}
