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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AttachInstancesRequest extends RpcAcsRequest<AttachInstancesResponse> {
	   

	private Integer loadBalancerWeight6;

	private Integer loadBalancerWeight11;

	private Integer loadBalancerWeight7;

	private Integer loadBalancerWeight12;

	private Long resourceOwnerId;

	private Integer loadBalancerWeight8;

	private Integer loadBalancerWeight9;

	private Integer loadBalancerWeight10;

	private Integer loadBalancerWeight2;

	private Integer loadBalancerWeight15;

	private Integer loadBalancerWeight3;

	private Integer loadBalancerWeight16;

	private Integer loadBalancerWeight4;

	private Integer loadBalancerWeight13;

	private Integer loadBalancerWeight5;

	private Integer loadBalancerWeight14;

	private Integer loadBalancerWeight1;

	private String instanceId1;

	private Integer loadBalancerWeight20;

	private String instanceId3;

	private String instanceId2;

	private String instanceId5;

	private String instanceId4;

	private String instanceId7;

	private String instanceId6;

	private String instanceId9;

	private String instanceId8;

	private Long ownerId;

	private Integer loadBalancerWeight19;

	private Integer loadBalancerWeight17;

	private Integer loadBalancerWeight18;

	private String instanceId10;

	private String instanceId12;

	private String instanceId11;

	private String scalingGroupId;

	private String instanceId20;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Boolean entrusted;

	private String instanceId18;

	private String instanceId17;

	private String instanceId19;

	private String instanceId14;

	private String instanceId13;

	private String instanceId16;

	private String instanceId15;
	public AttachInstancesRequest() {
		super("Ess", "2014-08-28", "AttachInstances", "ess");
		setMethod(MethodType.POST);
	}

	public Integer getLoadBalancerWeight6() {
		return this.loadBalancerWeight6;
	}

	public void setLoadBalancerWeight6(Integer loadBalancerWeight6) {
		this.loadBalancerWeight6 = loadBalancerWeight6;
		if(loadBalancerWeight6 != null){
			putQueryParameter("LoadBalancerWeight.6", loadBalancerWeight6.toString());
		}
	}

	public Integer getLoadBalancerWeight11() {
		return this.loadBalancerWeight11;
	}

	public void setLoadBalancerWeight11(Integer loadBalancerWeight11) {
		this.loadBalancerWeight11 = loadBalancerWeight11;
		if(loadBalancerWeight11 != null){
			putQueryParameter("LoadBalancerWeight.11", loadBalancerWeight11.toString());
		}
	}

	public Integer getLoadBalancerWeight7() {
		return this.loadBalancerWeight7;
	}

	public void setLoadBalancerWeight7(Integer loadBalancerWeight7) {
		this.loadBalancerWeight7 = loadBalancerWeight7;
		if(loadBalancerWeight7 != null){
			putQueryParameter("LoadBalancerWeight.7", loadBalancerWeight7.toString());
		}
	}

	public Integer getLoadBalancerWeight12() {
		return this.loadBalancerWeight12;
	}

	public void setLoadBalancerWeight12(Integer loadBalancerWeight12) {
		this.loadBalancerWeight12 = loadBalancerWeight12;
		if(loadBalancerWeight12 != null){
			putQueryParameter("LoadBalancerWeight.12", loadBalancerWeight12.toString());
		}
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

	public Integer getLoadBalancerWeight8() {
		return this.loadBalancerWeight8;
	}

	public void setLoadBalancerWeight8(Integer loadBalancerWeight8) {
		this.loadBalancerWeight8 = loadBalancerWeight8;
		if(loadBalancerWeight8 != null){
			putQueryParameter("LoadBalancerWeight.8", loadBalancerWeight8.toString());
		}
	}

	public Integer getLoadBalancerWeight9() {
		return this.loadBalancerWeight9;
	}

	public void setLoadBalancerWeight9(Integer loadBalancerWeight9) {
		this.loadBalancerWeight9 = loadBalancerWeight9;
		if(loadBalancerWeight9 != null){
			putQueryParameter("LoadBalancerWeight.9", loadBalancerWeight9.toString());
		}
	}

	public Integer getLoadBalancerWeight10() {
		return this.loadBalancerWeight10;
	}

	public void setLoadBalancerWeight10(Integer loadBalancerWeight10) {
		this.loadBalancerWeight10 = loadBalancerWeight10;
		if(loadBalancerWeight10 != null){
			putQueryParameter("LoadBalancerWeight.10", loadBalancerWeight10.toString());
		}
	}

	public Integer getLoadBalancerWeight2() {
		return this.loadBalancerWeight2;
	}

	public void setLoadBalancerWeight2(Integer loadBalancerWeight2) {
		this.loadBalancerWeight2 = loadBalancerWeight2;
		if(loadBalancerWeight2 != null){
			putQueryParameter("LoadBalancerWeight.2", loadBalancerWeight2.toString());
		}
	}

	public Integer getLoadBalancerWeight15() {
		return this.loadBalancerWeight15;
	}

	public void setLoadBalancerWeight15(Integer loadBalancerWeight15) {
		this.loadBalancerWeight15 = loadBalancerWeight15;
		if(loadBalancerWeight15 != null){
			putQueryParameter("LoadBalancerWeight.15", loadBalancerWeight15.toString());
		}
	}

	public Integer getLoadBalancerWeight3() {
		return this.loadBalancerWeight3;
	}

	public void setLoadBalancerWeight3(Integer loadBalancerWeight3) {
		this.loadBalancerWeight3 = loadBalancerWeight3;
		if(loadBalancerWeight3 != null){
			putQueryParameter("LoadBalancerWeight.3", loadBalancerWeight3.toString());
		}
	}

	public Integer getLoadBalancerWeight16() {
		return this.loadBalancerWeight16;
	}

	public void setLoadBalancerWeight16(Integer loadBalancerWeight16) {
		this.loadBalancerWeight16 = loadBalancerWeight16;
		if(loadBalancerWeight16 != null){
			putQueryParameter("LoadBalancerWeight.16", loadBalancerWeight16.toString());
		}
	}

	public Integer getLoadBalancerWeight4() {
		return this.loadBalancerWeight4;
	}

	public void setLoadBalancerWeight4(Integer loadBalancerWeight4) {
		this.loadBalancerWeight4 = loadBalancerWeight4;
		if(loadBalancerWeight4 != null){
			putQueryParameter("LoadBalancerWeight.4", loadBalancerWeight4.toString());
		}
	}

	public Integer getLoadBalancerWeight13() {
		return this.loadBalancerWeight13;
	}

	public void setLoadBalancerWeight13(Integer loadBalancerWeight13) {
		this.loadBalancerWeight13 = loadBalancerWeight13;
		if(loadBalancerWeight13 != null){
			putQueryParameter("LoadBalancerWeight.13", loadBalancerWeight13.toString());
		}
	}

	public Integer getLoadBalancerWeight5() {
		return this.loadBalancerWeight5;
	}

	public void setLoadBalancerWeight5(Integer loadBalancerWeight5) {
		this.loadBalancerWeight5 = loadBalancerWeight5;
		if(loadBalancerWeight5 != null){
			putQueryParameter("LoadBalancerWeight.5", loadBalancerWeight5.toString());
		}
	}

	public Integer getLoadBalancerWeight14() {
		return this.loadBalancerWeight14;
	}

	public void setLoadBalancerWeight14(Integer loadBalancerWeight14) {
		this.loadBalancerWeight14 = loadBalancerWeight14;
		if(loadBalancerWeight14 != null){
			putQueryParameter("LoadBalancerWeight.14", loadBalancerWeight14.toString());
		}
	}

	public Integer getLoadBalancerWeight1() {
		return this.loadBalancerWeight1;
	}

	public void setLoadBalancerWeight1(Integer loadBalancerWeight1) {
		this.loadBalancerWeight1 = loadBalancerWeight1;
		if(loadBalancerWeight1 != null){
			putQueryParameter("LoadBalancerWeight.1", loadBalancerWeight1.toString());
		}
	}

	public String getInstanceId1() {
		return this.instanceId1;
	}

	public void setInstanceId1(String instanceId1) {
		this.instanceId1 = instanceId1;
		if(instanceId1 != null){
			putQueryParameter("InstanceId.1", instanceId1);
		}
	}

	public Integer getLoadBalancerWeight20() {
		return this.loadBalancerWeight20;
	}

	public void setLoadBalancerWeight20(Integer loadBalancerWeight20) {
		this.loadBalancerWeight20 = loadBalancerWeight20;
		if(loadBalancerWeight20 != null){
			putQueryParameter("LoadBalancerWeight.20", loadBalancerWeight20.toString());
		}
	}

	public String getInstanceId3() {
		return this.instanceId3;
	}

	public void setInstanceId3(String instanceId3) {
		this.instanceId3 = instanceId3;
		if(instanceId3 != null){
			putQueryParameter("InstanceId.3", instanceId3);
		}
	}

	public String getInstanceId2() {
		return this.instanceId2;
	}

	public void setInstanceId2(String instanceId2) {
		this.instanceId2 = instanceId2;
		if(instanceId2 != null){
			putQueryParameter("InstanceId.2", instanceId2);
		}
	}

	public String getInstanceId5() {
		return this.instanceId5;
	}

	public void setInstanceId5(String instanceId5) {
		this.instanceId5 = instanceId5;
		if(instanceId5 != null){
			putQueryParameter("InstanceId.5", instanceId5);
		}
	}

	public String getInstanceId4() {
		return this.instanceId4;
	}

	public void setInstanceId4(String instanceId4) {
		this.instanceId4 = instanceId4;
		if(instanceId4 != null){
			putQueryParameter("InstanceId.4", instanceId4);
		}
	}

	public String getInstanceId7() {
		return this.instanceId7;
	}

	public void setInstanceId7(String instanceId7) {
		this.instanceId7 = instanceId7;
		if(instanceId7 != null){
			putQueryParameter("InstanceId.7", instanceId7);
		}
	}

	public String getInstanceId6() {
		return this.instanceId6;
	}

	public void setInstanceId6(String instanceId6) {
		this.instanceId6 = instanceId6;
		if(instanceId6 != null){
			putQueryParameter("InstanceId.6", instanceId6);
		}
	}

	public String getInstanceId9() {
		return this.instanceId9;
	}

	public void setInstanceId9(String instanceId9) {
		this.instanceId9 = instanceId9;
		if(instanceId9 != null){
			putQueryParameter("InstanceId.9", instanceId9);
		}
	}

	public String getInstanceId8() {
		return this.instanceId8;
	}

	public void setInstanceId8(String instanceId8) {
		this.instanceId8 = instanceId8;
		if(instanceId8 != null){
			putQueryParameter("InstanceId.8", instanceId8);
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

	public Integer getLoadBalancerWeight19() {
		return this.loadBalancerWeight19;
	}

	public void setLoadBalancerWeight19(Integer loadBalancerWeight19) {
		this.loadBalancerWeight19 = loadBalancerWeight19;
		if(loadBalancerWeight19 != null){
			putQueryParameter("LoadBalancerWeight.19", loadBalancerWeight19.toString());
		}
	}

	public Integer getLoadBalancerWeight17() {
		return this.loadBalancerWeight17;
	}

	public void setLoadBalancerWeight17(Integer loadBalancerWeight17) {
		this.loadBalancerWeight17 = loadBalancerWeight17;
		if(loadBalancerWeight17 != null){
			putQueryParameter("LoadBalancerWeight.17", loadBalancerWeight17.toString());
		}
	}

	public Integer getLoadBalancerWeight18() {
		return this.loadBalancerWeight18;
	}

	public void setLoadBalancerWeight18(Integer loadBalancerWeight18) {
		this.loadBalancerWeight18 = loadBalancerWeight18;
		if(loadBalancerWeight18 != null){
			putQueryParameter("LoadBalancerWeight.18", loadBalancerWeight18.toString());
		}
	}

	public String getInstanceId10() {
		return this.instanceId10;
	}

	public void setInstanceId10(String instanceId10) {
		this.instanceId10 = instanceId10;
		if(instanceId10 != null){
			putQueryParameter("InstanceId.10", instanceId10);
		}
	}

	public String getInstanceId12() {
		return this.instanceId12;
	}

	public void setInstanceId12(String instanceId12) {
		this.instanceId12 = instanceId12;
		if(instanceId12 != null){
			putQueryParameter("InstanceId.12", instanceId12);
		}
	}

	public String getInstanceId11() {
		return this.instanceId11;
	}

	public void setInstanceId11(String instanceId11) {
		this.instanceId11 = instanceId11;
		if(instanceId11 != null){
			putQueryParameter("InstanceId.11", instanceId11);
		}
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public String getInstanceId20() {
		return this.instanceId20;
	}

	public void setInstanceId20(String instanceId20) {
		this.instanceId20 = instanceId20;
		if(instanceId20 != null){
			putQueryParameter("InstanceId.20", instanceId20);
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

	public Boolean getEntrusted() {
		return this.entrusted;
	}

	public void setEntrusted(Boolean entrusted) {
		this.entrusted = entrusted;
		if(entrusted != null){
			putQueryParameter("Entrusted", entrusted.toString());
		}
	}

	public String getInstanceId18() {
		return this.instanceId18;
	}

	public void setInstanceId18(String instanceId18) {
		this.instanceId18 = instanceId18;
		if(instanceId18 != null){
			putQueryParameter("InstanceId.18", instanceId18);
		}
	}

	public String getInstanceId17() {
		return this.instanceId17;
	}

	public void setInstanceId17(String instanceId17) {
		this.instanceId17 = instanceId17;
		if(instanceId17 != null){
			putQueryParameter("InstanceId.17", instanceId17);
		}
	}

	public String getInstanceId19() {
		return this.instanceId19;
	}

	public void setInstanceId19(String instanceId19) {
		this.instanceId19 = instanceId19;
		if(instanceId19 != null){
			putQueryParameter("InstanceId.19", instanceId19);
		}
	}

	public String getInstanceId14() {
		return this.instanceId14;
	}

	public void setInstanceId14(String instanceId14) {
		this.instanceId14 = instanceId14;
		if(instanceId14 != null){
			putQueryParameter("InstanceId.14", instanceId14);
		}
	}

	public String getInstanceId13() {
		return this.instanceId13;
	}

	public void setInstanceId13(String instanceId13) {
		this.instanceId13 = instanceId13;
		if(instanceId13 != null){
			putQueryParameter("InstanceId.13", instanceId13);
		}
	}

	public String getInstanceId16() {
		return this.instanceId16;
	}

	public void setInstanceId16(String instanceId16) {
		this.instanceId16 = instanceId16;
		if(instanceId16 != null){
			putQueryParameter("InstanceId.16", instanceId16);
		}
	}

	public String getInstanceId15() {
		return this.instanceId15;
	}

	public void setInstanceId15(String instanceId15) {
		this.instanceId15 = instanceId15;
		if(instanceId15 != null){
			putQueryParameter("InstanceId.15", instanceId15);
		}
	}

	@Override
	public Class<AttachInstancesResponse> getResponseClass() {
		return AttachInstancesResponse.class;
	}

}
