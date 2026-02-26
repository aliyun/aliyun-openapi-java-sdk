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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAddonReleaseRequest extends RpcAcsRequest<DescribeAddonReleaseResponse> {
	   

	private String releaseName;

	private String environmentId;
	public DescribeAddonReleaseRequest() {
		super("ARMS", "2019-08-08", "DescribeAddonRelease", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReleaseName() {
		return this.releaseName;
	}

	public void setReleaseName(String releaseName) {
		this.releaseName = releaseName;
		if(releaseName != null){
			putQueryParameter("ReleaseName", releaseName);
		}
	}

	public String getEnvironmentId() {
		return this.environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
		if(environmentId != null){
			putQueryParameter("EnvironmentId", environmentId);
		}
	}

	@Override
	public Class<DescribeAddonReleaseResponse> getResponseClass() {
		return DescribeAddonReleaseResponse.class;
	}

}
