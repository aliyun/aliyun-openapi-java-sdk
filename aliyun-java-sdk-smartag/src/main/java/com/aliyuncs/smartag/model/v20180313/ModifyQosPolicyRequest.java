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
public class ModifyQosPolicyRequest extends RpcAcsRequest<ModifyQosPolicyResponse> {
	   

	private List<String> dpiGroupIdss;

	private Long resourceOwnerId;

	private String sourcePortRange;

	private String qosPolicyId;

	private String sourceCidr;

	private String description;

	private String startTime;

	private String destCidr;

	private List<String> dpiSignatureIdss;

	private String qosId;

	private String resourceOwnerAccount;

	private String ipProtocol;

	private String ownerAccount;

	private String endTime;

	private Long ownerId;

	private Integer priority;

	private String destPortRange;

	private String name;
	public ModifyQosPolicyRequest() {
		super("Smartag", "2018-03-13", "ModifyQosPolicy", "smartag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDpiGroupIdss() {
		return this.dpiGroupIdss;
	}

	public void setDpiGroupIdss(List<String> dpiGroupIdss) {
		this.dpiGroupIdss = dpiGroupIdss;	
		if (dpiGroupIdss != null) {
			for (int i = 0; i < dpiGroupIdss.size(); i++) {
				putQueryParameter("DpiGroupIds." + (i + 1) , dpiGroupIdss.get(i));
			}
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

	public String getSourcePortRange() {
		return this.sourcePortRange;
	}

	public void setSourcePortRange(String sourcePortRange) {
		this.sourcePortRange = sourcePortRange;
		if(sourcePortRange != null){
			putQueryParameter("SourcePortRange", sourcePortRange);
		}
	}

	public String getQosPolicyId() {
		return this.qosPolicyId;
	}

	public void setQosPolicyId(String qosPolicyId) {
		this.qosPolicyId = qosPolicyId;
		if(qosPolicyId != null){
			putQueryParameter("QosPolicyId", qosPolicyId);
		}
	}

	public String getSourceCidr() {
		return this.sourceCidr;
	}

	public void setSourceCidr(String sourceCidr) {
		this.sourceCidr = sourceCidr;
		if(sourceCidr != null){
			putQueryParameter("SourceCidr", sourceCidr);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getDestCidr() {
		return this.destCidr;
	}

	public void setDestCidr(String destCidr) {
		this.destCidr = destCidr;
		if(destCidr != null){
			putQueryParameter("DestCidr", destCidr);
		}
	}

	public List<String> getDpiSignatureIdss() {
		return this.dpiSignatureIdss;
	}

	public void setDpiSignatureIdss(List<String> dpiSignatureIdss) {
		this.dpiSignatureIdss = dpiSignatureIdss;	
		if (dpiSignatureIdss != null) {
			for (int i = 0; i < dpiSignatureIdss.size(); i++) {
				putQueryParameter("DpiSignatureIds." + (i + 1) , dpiSignatureIdss.get(i));
			}
		}	
	}

	public String getQosId() {
		return this.qosId;
	}

	public void setQosId(String qosId) {
		this.qosId = qosId;
		if(qosId != null){
			putQueryParameter("QosId", qosId);
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

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public String getDestPortRange() {
		return this.destPortRange;
	}

	public void setDestPortRange(String destPortRange) {
		this.destPortRange = destPortRange;
		if(destPortRange != null){
			putQueryParameter("DestPortRange", destPortRange);
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

	@Override
	public Class<ModifyQosPolicyResponse> getResponseClass() {
		return ModifyQosPolicyResponse.class;
	}

}
