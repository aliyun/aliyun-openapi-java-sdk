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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCrossCloudRegionMappingToAliyunRequest extends RpcAcsRequest<DescribeCrossCloudRegionMappingToAliyunResponse> {
	   

	private String cloudProvider;

	private String aliyunRegionId;

	private String crossCloudRegionId;
	public DescribeCrossCloudRegionMappingToAliyunRequest() {
		super("polardb", "2017-08-01", "DescribeCrossCloudRegionMappingToAliyun", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCloudProvider() {
		return this.cloudProvider;
	}

	public void setCloudProvider(String cloudProvider) {
		this.cloudProvider = cloudProvider;
		if(cloudProvider != null){
			putQueryParameter("CloudProvider", cloudProvider);
		}
	}

	public String getAliyunRegionId() {
		return this.aliyunRegionId;
	}

	public void setAliyunRegionId(String aliyunRegionId) {
		this.aliyunRegionId = aliyunRegionId;
		if(aliyunRegionId != null){
			putQueryParameter("AliyunRegionId", aliyunRegionId);
		}
	}

	public String getCrossCloudRegionId() {
		return this.crossCloudRegionId;
	}

	public void setCrossCloudRegionId(String crossCloudRegionId) {
		this.crossCloudRegionId = crossCloudRegionId;
		if(crossCloudRegionId != null){
			putQueryParameter("CrossCloudRegionId", crossCloudRegionId);
		}
	}

	@Override
	public Class<DescribeCrossCloudRegionMappingToAliyunResponse> getResponseClass() {
		return DescribeCrossCloudRegionMappingToAliyunResponse.class;
	}

}
