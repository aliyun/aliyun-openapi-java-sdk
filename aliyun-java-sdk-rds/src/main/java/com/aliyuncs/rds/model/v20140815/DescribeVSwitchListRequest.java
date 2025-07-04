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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeVSwitchListRequest extends RpcAcsRequest<DescribeVSwitchListResponse> {
	   

	private List<String> vSwitchIdss;

	private String pageNumber;

	private String pageSize;

	private String vpcId;
	public DescribeVSwitchListRequest() {
		super("Rds", "2014-08-15", "DescribeVSwitchList", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getVSwitchIdss() {
		return this.vSwitchIdss;
	}

	public void setVSwitchIdss(List<String> vSwitchIdss) {
		this.vSwitchIdss = vSwitchIdss;	
		if (vSwitchIdss != null) {
			for (int i = 0; i < vSwitchIdss.size(); i++) {
				putQueryParameter("VSwitchIds." + (i + 1) , vSwitchIdss.get(i));
			}
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
	public Class<DescribeVSwitchListResponse> getResponseClass() {
		return DescribeVSwitchListResponse.class;
	}

}
