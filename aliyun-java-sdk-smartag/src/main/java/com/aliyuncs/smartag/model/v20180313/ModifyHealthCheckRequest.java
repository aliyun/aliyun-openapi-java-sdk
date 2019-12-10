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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyHealthCheckRequest extends RpcAcsRequest<ModifyHealthCheckResponse> {
	   

	private Integer probeInterval;

	private Long resourceOwnerId;

	private Integer dstPort;

	private String description;

	private String hcInstanceId;

	private String type;

	private Integer failCountThreshold;

	private Integer probeTimeout;

	private Integer rttFailThreshold;

	private Integer rttThreshold;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String dstIpAddr;

	private Long ownerId;

	private String srcIpAddr;

	private String name;

	private String smartAGId;

	private Integer srcPort;

	private Integer probeCount;
	public ModifyHealthCheckRequest() {
		super("Smartag", "2018-03-13", "ModifyHealthCheck", "smartag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getProbeInterval() {
		return this.probeInterval;
	}

	public void setProbeInterval(Integer probeInterval) {
		this.probeInterval = probeInterval;
		if(probeInterval != null){
			putQueryParameter("ProbeInterval", probeInterval.toString());
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

	public Integer getDstPort() {
		return this.dstPort;
	}

	public void setDstPort(Integer dstPort) {
		this.dstPort = dstPort;
		if(dstPort != null){
			putQueryParameter("DstPort", dstPort.toString());
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

	public String getHcInstanceId() {
		return this.hcInstanceId;
	}

	public void setHcInstanceId(String hcInstanceId) {
		this.hcInstanceId = hcInstanceId;
		if(hcInstanceId != null){
			putQueryParameter("HcInstanceId", hcInstanceId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Integer getFailCountThreshold() {
		return this.failCountThreshold;
	}

	public void setFailCountThreshold(Integer failCountThreshold) {
		this.failCountThreshold = failCountThreshold;
		if(failCountThreshold != null){
			putQueryParameter("FailCountThreshold", failCountThreshold.toString());
		}
	}

	public Integer getProbeTimeout() {
		return this.probeTimeout;
	}

	public void setProbeTimeout(Integer probeTimeout) {
		this.probeTimeout = probeTimeout;
		if(probeTimeout != null){
			putQueryParameter("ProbeTimeout", probeTimeout.toString());
		}
	}

	public Integer getRttFailThreshold() {
		return this.rttFailThreshold;
	}

	public void setRttFailThreshold(Integer rttFailThreshold) {
		this.rttFailThreshold = rttFailThreshold;
		if(rttFailThreshold != null){
			putQueryParameter("RttFailThreshold", rttFailThreshold.toString());
		}
	}

	public Integer getRttThreshold() {
		return this.rttThreshold;
	}

	public void setRttThreshold(Integer rttThreshold) {
		this.rttThreshold = rttThreshold;
		if(rttThreshold != null){
			putQueryParameter("RttThreshold", rttThreshold.toString());
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

	public String getDstIpAddr() {
		return this.dstIpAddr;
	}

	public void setDstIpAddr(String dstIpAddr) {
		this.dstIpAddr = dstIpAddr;
		if(dstIpAddr != null){
			putQueryParameter("DstIpAddr", dstIpAddr);
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

	public String getSrcIpAddr() {
		return this.srcIpAddr;
	}

	public void setSrcIpAddr(String srcIpAddr) {
		this.srcIpAddr = srcIpAddr;
		if(srcIpAddr != null){
			putQueryParameter("SrcIpAddr", srcIpAddr);
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

	public Integer getSrcPort() {
		return this.srcPort;
	}

	public void setSrcPort(Integer srcPort) {
		this.srcPort = srcPort;
		if(srcPort != null){
			putQueryParameter("SrcPort", srcPort.toString());
		}
	}

	public Integer getProbeCount() {
		return this.probeCount;
	}

	public void setProbeCount(Integer probeCount) {
		this.probeCount = probeCount;
		if(probeCount != null){
			putQueryParameter("ProbeCount", probeCount.toString());
		}
	}

	@Override
	public Class<ModifyHealthCheckResponse> getResponseClass() {
		return ModifyHealthCheckResponse.class;
	}

}
