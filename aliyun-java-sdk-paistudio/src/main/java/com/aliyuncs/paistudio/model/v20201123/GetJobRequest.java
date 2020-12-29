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

package com.aliyuncs.paistudio.model.v20201123;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.paistudio.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetJobRequest extends RoaAcsRequest<GetJobResponse> {
	   

	private String jobId;

	private Boolean queryDetail;
	public GetJobRequest() {
		super("PaiStudio", "2020-11-23", "GetJob");
		setUriPattern("/api/core/v1.0/jobs/[JobId]");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putPathParameter("JobId", jobId);
		}
	}

	public Boolean getQueryDetail() {
		return this.queryDetail;
	}

	public void setQueryDetail(Boolean queryDetail) {
		this.queryDetail = queryDetail;
		if(queryDetail != null){
			putQueryParameter("QueryDetail", queryDetail.toString());
		}
	}

	@Override
	public Class<GetJobResponse> getResponseClass() {
		return GetJobResponse.class;
	}

}
