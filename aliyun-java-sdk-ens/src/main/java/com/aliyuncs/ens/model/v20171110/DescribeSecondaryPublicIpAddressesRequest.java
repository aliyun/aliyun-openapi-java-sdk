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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecondaryPublicIpAddressesRequest extends RpcAcsRequest<DescribeSecondaryPublicIpAddressesResponse> {
	   

	private String secondaryPublicIpId;

	private String isp;

	private Integer pageNumber;

	private String ensRegionId;

	private Integer pageSize;

	private String secondaryPublicIpAddress;
	public DescribeSecondaryPublicIpAddressesRequest() {
		super("Ens", "2017-11-10", "DescribeSecondaryPublicIpAddresses", "ens");
		setMethod(MethodType.POST);
	}

	public String getSecondaryPublicIpId() {
		return this.secondaryPublicIpId;
	}

	public void setSecondaryPublicIpId(String secondaryPublicIpId) {
		this.secondaryPublicIpId = secondaryPublicIpId;
		if(secondaryPublicIpId != null){
			putQueryParameter("SecondaryPublicIpId", secondaryPublicIpId);
		}
	}

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
		if(isp != null){
			putQueryParameter("Isp", isp);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSecondaryPublicIpAddress() {
		return this.secondaryPublicIpAddress;
	}

	public void setSecondaryPublicIpAddress(String secondaryPublicIpAddress) {
		this.secondaryPublicIpAddress = secondaryPublicIpAddress;
		if(secondaryPublicIpAddress != null){
			putQueryParameter("SecondaryPublicIpAddress", secondaryPublicIpAddress);
		}
	}

	@Override
	public Class<DescribeSecondaryPublicIpAddressesResponse> getResponseClass() {
		return DescribeSecondaryPublicIpAddressesResponse.class;
	}

}
