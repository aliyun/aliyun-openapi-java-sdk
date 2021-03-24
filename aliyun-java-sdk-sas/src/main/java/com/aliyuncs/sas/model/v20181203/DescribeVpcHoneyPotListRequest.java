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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpcHoneyPotListRequest extends RpcAcsRequest<DescribeVpcHoneyPotListResponse> {
	   

	private String vpcName;

	private Integer pageSize;

	private Boolean honeyPotExistence;

	private String vpcRegionId;

	private Integer currentPage;

	private String vpcId;
	public DescribeVpcHoneyPotListRequest() {
		super("Sas", "2018-12-03", "DescribeVpcHoneyPotList", "sas");
		setMethod(MethodType.POST);
	}

	public String getVpcName() {
		return this.vpcName;
	}

	public void setVpcName(String vpcName) {
		this.vpcName = vpcName;
		if(vpcName != null){
			putQueryParameter("VpcName", vpcName);
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

	public Boolean getHoneyPotExistence() {
		return this.honeyPotExistence;
	}

	public void setHoneyPotExistence(Boolean honeyPotExistence) {
		this.honeyPotExistence = honeyPotExistence;
		if(honeyPotExistence != null){
			putQueryParameter("HoneyPotExistence", honeyPotExistence.toString());
		}
	}

	public String getVpcRegionId() {
		return this.vpcRegionId;
	}

	public void setVpcRegionId(String vpcRegionId) {
		this.vpcRegionId = vpcRegionId;
		if(vpcRegionId != null){
			putQueryParameter("VpcRegionId", vpcRegionId);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	@Override
	public Class<DescribeVpcHoneyPotListResponse> getResponseClass() {
		return DescribeVpcHoneyPotListResponse.class;
	}

}
