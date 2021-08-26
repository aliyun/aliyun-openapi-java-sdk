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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeFrontVulPatchListRequest extends RpcAcsRequest<DescribeFrontVulPatchListResponse> {
	   

	private String type;

	private List<VulInfo> vulInfos;

	private String operateType;
	public DescribeFrontVulPatchListRequest() {
		super("ecd", "2020-09-30", "DescribeFrontVulPatchList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public List<VulInfo> getVulInfos() {
		return this.vulInfos;
	}

	public void setVulInfos(List<VulInfo> vulInfos) {
		this.vulInfos = vulInfos;	
		if (vulInfos != null) {
			for (int depth1 = 0; depth1 < vulInfos.size(); depth1++) {
				putQueryParameter("VulInfo." + (depth1 + 1) + ".Name" , vulInfos.get(depth1).getName());
				putQueryParameter("VulInfo." + (depth1 + 1) + ".DesktopId" , vulInfos.get(depth1).getDesktopId());
				putQueryParameter("VulInfo." + (depth1 + 1) + ".Tag" , vulInfos.get(depth1).getTag());
			}
		}	
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	public static class VulInfo {

		private String name;

		private String desktopId;

		private String tag;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}
	}

	@Override
	public Class<DescribeFrontVulPatchListResponse> getResponseClass() {
		return DescribeFrontVulPatchListResponse.class;
	}

}
