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
public class DescribeVSwitchesRequest extends RpcAcsRequest<DescribeVSwitchesResponse> {
	   

	private String orderByParams;

	private String ensRegionId;

	private String vSwitchId;

	private String networkId;

	private Integer pageNumber;

	private Integer pageSize;

	private String vSwitchName;
	public DescribeVSwitchesRequest() {
		super("Ens", "2017-11-10", "DescribeVSwitches", "ens");
		setMethod(MethodType.POST);
	}

	public String getOrderByParams() {
		return this.orderByParams;
	}

	public void setOrderByParams(String orderByParams) {
		this.orderByParams = orderByParams;
		if(orderByParams != null){
			putQueryParameter("OrderByParams", orderByParams);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public String getVSwitchName() {
		return this.vSwitchName;
	}

	public void setVSwitchName(String vSwitchName) {
		this.vSwitchName = vSwitchName;
		if(vSwitchName != null){
			putQueryParameter("VSwitchName", vSwitchName);
		}
	}

	@Override
	public Class<DescribeVSwitchesResponse> getResponseClass() {
		return DescribeVSwitchesResponse.class;
	}

}
