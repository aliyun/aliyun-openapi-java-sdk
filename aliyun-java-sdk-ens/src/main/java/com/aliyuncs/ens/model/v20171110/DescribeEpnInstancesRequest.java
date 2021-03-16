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
public class DescribeEpnInstancesRequest extends RpcAcsRequest<DescribeEpnInstancesResponse> {
	   

	private Integer pageNumber;

	private Integer pageSize;

	private String ePNInstanceId;

	private String ePNInstanceName;
	public DescribeEpnInstancesRequest() {
		super("Ens", "2017-11-10", "DescribeEpnInstances");
		setMethod(MethodType.POST);
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

	public String getEPNInstanceId() {
		return this.ePNInstanceId;
	}

	public void setEPNInstanceId(String ePNInstanceId) {
		this.ePNInstanceId = ePNInstanceId;
		if(ePNInstanceId != null){
			putQueryParameter("EPNInstanceId", ePNInstanceId);
		}
	}

	public String getEPNInstanceName() {
		return this.ePNInstanceName;
	}

	public void setEPNInstanceName(String ePNInstanceName) {
		this.ePNInstanceName = ePNInstanceName;
		if(ePNInstanceName != null){
			putQueryParameter("EPNInstanceName", ePNInstanceName);
		}
	}

	@Override
	public Class<DescribeEpnInstancesResponse> getResponseClass() {
		return DescribeEpnInstancesResponse.class;
	}

}
