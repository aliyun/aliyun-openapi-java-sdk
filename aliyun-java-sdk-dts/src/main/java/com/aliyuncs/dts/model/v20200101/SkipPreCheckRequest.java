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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SkipPreCheckRequest extends RpcAcsRequest<SkipPreCheckResponse> {
	   

	private String skipPreCheckItems;

	private Boolean skip;

	private String jobId;

	private String skipPreCheckNames;

	private String dtsJobId;
	public SkipPreCheckRequest() {
		super("Dts", "2020-01-01", "SkipPreCheck", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSkipPreCheckItems() {
		return this.skipPreCheckItems;
	}

	public void setSkipPreCheckItems(String skipPreCheckItems) {
		this.skipPreCheckItems = skipPreCheckItems;
		if(skipPreCheckItems != null){
			putQueryParameter("SkipPreCheckItems", skipPreCheckItems);
		}
	}

	public Boolean getSkip() {
		return this.skip;
	}

	public void setSkip(Boolean skip) {
		this.skip = skip;
		if(skip != null){
			putQueryParameter("Skip", skip.toString());
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

	public String getSkipPreCheckNames() {
		return this.skipPreCheckNames;
	}

	public void setSkipPreCheckNames(String skipPreCheckNames) {
		this.skipPreCheckNames = skipPreCheckNames;
		if(skipPreCheckNames != null){
			putQueryParameter("SkipPreCheckNames", skipPreCheckNames);
		}
	}

	public String getDtsJobId() {
		return this.dtsJobId;
	}

	public void setDtsJobId(String dtsJobId) {
		this.dtsJobId = dtsJobId;
		if(dtsJobId != null){
			putQueryParameter("DtsJobId", dtsJobId);
		}
	}

	@Override
	public Class<SkipPreCheckResponse> getResponseClass() {
		return SkipPreCheckResponse.class;
	}

}
