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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDetectionResultRequest extends RpcAcsRequest<GetDetectionResultResponse> {
	   

	private Long countByPage;

	private Boolean desensitization;

	private String jobId;

	private Long page;

	private String status;
	public GetDetectionResultRequest() {
		super("vod", "2017-03-21", "GetDetectionResult", "vod");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getCountByPage() {
		return this.countByPage;
	}

	public void setCountByPage(Long countByPage) {
		this.countByPage = countByPage;
		if(countByPage != null){
			putQueryParameter("CountByPage", countByPage.toString());
		}
	}

	public Boolean getDesensitization() {
		return this.desensitization;
	}

	public void setDesensitization(Boolean desensitization) {
		this.desensitization = desensitization;
		if(desensitization != null){
			putQueryParameter("Desensitization", desensitization.toString());
		}
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

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<GetDetectionResultResponse> getResponseClass() {
		return GetDetectionResultResponse.class;
	}

}
