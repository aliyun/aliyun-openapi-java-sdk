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
public class GetURLUploadInfosRequest extends RpcAcsRequest<GetURLUploadInfosResponse> {
	   

	private String jobIds;

	private String uploadURLs;
	public GetURLUploadInfosRequest() {
		super("vod", "2017-03-21", "GetURLUploadInfos", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getJobIds() {
		return this.jobIds;
	}

	public void setJobIds(String jobIds) {
		this.jobIds = jobIds;
		if(jobIds != null){
			putQueryParameter("JobIds", jobIds);
		}
	}

	public String getUploadURLs() {
		return this.uploadURLs;
	}

	public void setUploadURLs(String uploadURLs) {
		this.uploadURLs = uploadURLs;
		if(uploadURLs != null){
			putQueryParameter("UploadURLs", uploadURLs);
		}
	}

	@Override
	public Class<GetURLUploadInfosResponse> getResponseClass() {
		return GetURLUploadInfosResponse.class;
	}

}
