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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSDGDeploymentStatusRequest extends RpcAcsRequest<DescribeSDGDeploymentStatusResponse> {
	   

	@SerializedName("regionIds")
	private List<String> regionIds;

	@SerializedName("instanceIds")
	private List<String> instanceIds;

	private String status;

	private String deploymentType;

	private Integer pageNumber;

	private String sDGId;

	private Integer pageSize;
	public DescribeSDGDeploymentStatusRequest() {
		super("Ens", "2017-11-10", "DescribeSDGDeploymentStatus", "ens");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getRegionIds() {
		return this.regionIds;
	}

	public void setRegionIds(List<String> regionIds) {
		this.regionIds = regionIds;	
		if (regionIds != null) {
			putQueryParameter("RegionIds" , new Gson().toJson(regionIds));
		}	
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			putQueryParameter("InstanceIds" , new Gson().toJson(instanceIds));
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

	public String getDeploymentType() {
		return this.deploymentType;
	}

	public void setDeploymentType(String deploymentType) {
		this.deploymentType = deploymentType;
		if(deploymentType != null){
			putQueryParameter("DeploymentType", deploymentType);
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

	public String getSDGId() {
		return this.sDGId;
	}

	public void setSDGId(String sDGId) {
		this.sDGId = sDGId;
		if(sDGId != null){
			putQueryParameter("SDGId", sDGId);
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

	@Override
	public Class<DescribeSDGDeploymentStatusResponse> getResponseClass() {
		return DescribeSDGDeploymentStatusResponse.class;
	}

}
