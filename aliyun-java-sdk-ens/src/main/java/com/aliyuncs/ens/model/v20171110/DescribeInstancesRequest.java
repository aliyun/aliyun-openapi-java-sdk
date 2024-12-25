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
public class DescribeInstancesRequest extends RpcAcsRequest<DescribeInstancesResponse> {
	   

	@SerializedName("serviceStatus")
	private List<String> serviceStatus;

	private String orderByParams;

	private String ensRegionId;

	private String instanceResourceType;

	private String ensServiceId;

	@SerializedName("tags")
	private List<Tags> tags;

	private String vSwitchId;

	private String instanceId;

	private String instanceName;

	private String instanceIds;

	private String networkId;

	private String status;

	private String intranetIp;

	private String imageId;

	private String securityGroupId;

	private String searchKey;

	private Integer pageNumber;

	private String pageSize;

	private String instanceType;

	private String ensRegionIds;
	public DescribeInstancesRequest() {
		super("Ens", "2017-11-10", "DescribeInstances", "ens");
		setMethod(MethodType.POST);
	}

	public List<String> getServiceStatus() {
		return this.serviceStatus;
	}

	public void setServiceStatus(List<String> serviceStatus) {
		this.serviceStatus = serviceStatus;	
		if (serviceStatus != null) {
			putQueryParameter("ServiceStatus" , new Gson().toJson(serviceStatus));
		}	
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

	public String getInstanceResourceType() {
		return this.instanceResourceType;
	}

	public void setInstanceResourceType(String instanceResourceType) {
		this.instanceResourceType = instanceResourceType;
		if(instanceResourceType != null){
			putQueryParameter("InstanceResourceType", instanceResourceType);
		}
	}

	public String getEnsServiceId() {
		return this.ensServiceId;
	}

	public void setEnsServiceId(String ensServiceId) {
		this.ensServiceId = ensServiceId;
		if(ensServiceId != null){
			putQueryParameter("EnsServiceId", ensServiceId);
		}
	}

	public List<Tags> getTags() {
		return this.tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
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

	public String getIntranetIp() {
		return this.intranetIp;
	}

	public void setIntranetIp(String intranetIp) {
		this.intranetIp = intranetIp;
		if(intranetIp != null){
			putQueryParameter("IntranetIp", intranetIp);
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getSearchKey() {
		return this.searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
		if(searchKey != null){
			putQueryParameter("SearchKey", searchKey);
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

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getEnsRegionIds() {
		return this.ensRegionIds;
	}

	public void setEnsRegionIds(String ensRegionIds) {
		this.ensRegionIds = ensRegionIds;
		if(ensRegionIds != null){
			putQueryParameter("EnsRegionIds", ensRegionIds);
		}
	}

	public static class Tags {

		@SerializedName("Value")
		private String value;

		@SerializedName("Key")
		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<DescribeInstancesResponse> getResponseClass() {
		return DescribeInstancesResponse.class;
	}

}
