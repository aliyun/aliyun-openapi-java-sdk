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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudDiskTypesRequest extends RpcAcsRequest<DescribeCloudDiskTypesResponse> {
	   

	private String ensRegionId;

	@SerializedName("ensRegionIds")
	private List<String> ensRegionIds;
	public DescribeCloudDiskTypesRequest() {
		super("Ens", "2017-11-10", "DescribeCloudDiskTypes", "ens");
		setMethod(MethodType.GET);
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
		if(ensRegionId != null){
			putQueryParameter("EnsRegionId", ensRegionId);
		}
	}

	public List<String> getEnsRegionIds() {
		return this.ensRegionIds;
	}

	public void setEnsRegionIds(List<String> ensRegionIds) {
		this.ensRegionIds = ensRegionIds;	
		if (ensRegionIds != null) {
			putQueryParameter("EnsRegionIds" , new Gson().toJson(ensRegionIds));
		}	
	}

	@Override
	public Class<DescribeCloudDiskTypesResponse> getResponseClass() {
		return DescribeCloudDiskTypesResponse.class;
	}

}
