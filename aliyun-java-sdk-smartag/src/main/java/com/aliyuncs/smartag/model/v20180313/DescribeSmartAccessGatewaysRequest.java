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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmartAccessGatewaysRequest extends RpcAcsRequest<DescribeSmartAccessGatewaysResponse> {
	   

	private Long resourceOwnerId;

	private String aclIds;

	private Boolean canAssociateQos;

	private String softwareVersion;

	private String unboundAclIds;

	private Integer pageNumber;

	private String versionComparator;

	private String resourceGroupId;

	private Integer pageSize;

	private String instanceType;

	private String hardwareType;

	private List<String> smartAGIdss;

	private String serialNumber;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String associatedCcnId;

	private Long ownerId;

	private String businessState;

	private String name;

	private String smartAGId;

	private String status;
	public DescribeSmartAccessGatewaysRequest() {
		super("Smartag", "2018-03-13", "DescribeSmartAccessGateways", "smartag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getAclIds() {
		return this.aclIds;
	}

	public void setAclIds(String aclIds) {
		this.aclIds = aclIds;
		if(aclIds != null){
			putQueryParameter("AclIds", aclIds);
		}
	}

	public Boolean getCanAssociateQos() {
		return this.canAssociateQos;
	}

	public void setCanAssociateQos(Boolean canAssociateQos) {
		this.canAssociateQos = canAssociateQos;
		if(canAssociateQos != null){
			putQueryParameter("CanAssociateQos", canAssociateQos.toString());
		}
	}

	public String getSoftwareVersion() {
		return this.softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
		if(softwareVersion != null){
			putQueryParameter("SoftwareVersion", softwareVersion);
		}
	}

	public String getUnboundAclIds() {
		return this.unboundAclIds;
	}

	public void setUnboundAclIds(String unboundAclIds) {
		this.unboundAclIds = unboundAclIds;
		if(unboundAclIds != null){
			putQueryParameter("UnboundAclIds", unboundAclIds);
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

	public String getVersionComparator() {
		return this.versionComparator;
	}

	public void setVersionComparator(String versionComparator) {
		this.versionComparator = versionComparator;
		if(versionComparator != null){
			putQueryParameter("VersionComparator", versionComparator);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getHardwareType() {
		return this.hardwareType;
	}

	public void setHardwareType(String hardwareType) {
		this.hardwareType = hardwareType;
		if(hardwareType != null){
			putQueryParameter("HardwareType", hardwareType);
		}
	}

	public List<String> getSmartAGIdss() {
		return this.smartAGIdss;
	}

	public void setSmartAGIdss(List<String> smartAGIdss) {
		this.smartAGIdss = smartAGIdss;	
		if (smartAGIdss != null) {
			for (int i = 0; i < smartAGIdss.size(); i++) {
				putQueryParameter("SmartAGIds." + (i + 1) , smartAGIdss.get(i));
			}
		}	
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		if(serialNumber != null){
			putQueryParameter("SerialNumber", serialNumber);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getAssociatedCcnId() {
		return this.associatedCcnId;
	}

	public void setAssociatedCcnId(String associatedCcnId) {
		this.associatedCcnId = associatedCcnId;
		if(associatedCcnId != null){
			putQueryParameter("AssociatedCcnId", associatedCcnId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getBusinessState() {
		return this.businessState;
	}

	public void setBusinessState(String businessState) {
		this.businessState = businessState;
		if(businessState != null){
			putQueryParameter("BusinessState", businessState);
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

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
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

	@Override
	public Class<DescribeSmartAccessGatewaysResponse> getResponseClass() {
		return DescribeSmartAccessGatewaysResponse.class;
	}

}
