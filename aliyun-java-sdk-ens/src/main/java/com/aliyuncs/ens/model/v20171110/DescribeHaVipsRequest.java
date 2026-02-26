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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeHaVipsRequest extends RpcAcsRequest<DescribeHaVipsResponse> {
	   

	private String ensRegionId;

	private String haVipId;

	private String haVipAddress;

	private String vSwitchId;

	private String name;

	private String networkId;

	private String status;

	private String pageNumber;

	private String pageSize;

	private List<String> ensRegionIds;
	public DescribeHaVipsRequest() {
		super("Ens", "2017-11-10", "DescribeHaVips", "ens");
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

	public String getHaVipId() {
		return this.haVipId;
	}

	public void setHaVipId(String haVipId) {
		this.haVipId = haVipId;
		if(haVipId != null){
			putQueryParameter("HaVipId", haVipId);
		}
	}

	public String getHaVipAddress() {
		return this.haVipAddress;
	}

	public void setHaVipAddress(String haVipAddress) {
		this.haVipAddress = haVipAddress;
		if(haVipAddress != null){
			putQueryParameter("HaVipAddress", haVipAddress);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
		if(networkId != null){
			putQueryParameter("NetworkId", networkId);
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

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public List<String> getEnsRegionIds() {
		return this.ensRegionIds;
	}

	public void setEnsRegionIds(List<String> ensRegionIds) {
		this.ensRegionIds = ensRegionIds;	
		if (ensRegionIds != null) {
			for (int depth1 = 0; depth1 < ensRegionIds.size(); depth1++) {
				putQueryParameter("EnsRegionIds." + (depth1 + 1) , ensRegionIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<DescribeHaVipsResponse> getResponseClass() {
		return DescribeHaVipsResponse.class;
	}

}
