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
public class ModifyFlowLogAttributeRequest extends RpcAcsRequest<ModifyFlowLogAttributeResponse> {
	   

	private Long resourceOwnerId;

	private String netflowVersion;

	private String description;

	private Integer inactiveAging;

	private String slsRegionId;

	private Integer activeAging;

	private String outputType;

	private String projectName;

	private String logstoreName;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer netflowServerPort;

	private Long ownerId;

	private String netflowServerIp;

	private String name;

	private String flowLogId;
	public ModifyFlowLogAttributeRequest() {
		super("Smartag", "2018-03-13", "ModifyFlowLogAttribute", "smartag");
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

	public String getNetflowVersion() {
		return this.netflowVersion;
	}

	public void setNetflowVersion(String netflowVersion) {
		this.netflowVersion = netflowVersion;
		if(netflowVersion != null){
			putQueryParameter("NetflowVersion", netflowVersion);
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

	public Integer getInactiveAging() {
		return this.inactiveAging;
	}

	public void setInactiveAging(Integer inactiveAging) {
		this.inactiveAging = inactiveAging;
		if(inactiveAging != null){
			putQueryParameter("InactiveAging", inactiveAging.toString());
		}
	}

	public String getSlsRegionId() {
		return this.slsRegionId;
	}

	public void setSlsRegionId(String slsRegionId) {
		this.slsRegionId = slsRegionId;
		if(slsRegionId != null){
			putQueryParameter("SlsRegionId", slsRegionId);
		}
	}

	public Integer getActiveAging() {
		return this.activeAging;
	}

	public void setActiveAging(Integer activeAging) {
		this.activeAging = activeAging;
		if(activeAging != null){
			putQueryParameter("ActiveAging", activeAging.toString());
		}
	}

	public String getOutputType() {
		return this.outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
		if(outputType != null){
			putQueryParameter("OutputType", outputType);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getLogstoreName() {
		return this.logstoreName;
	}

	public void setLogstoreName(String logstoreName) {
		this.logstoreName = logstoreName;
		if(logstoreName != null){
			putQueryParameter("LogstoreName", logstoreName);
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

	public Integer getNetflowServerPort() {
		return this.netflowServerPort;
	}

	public void setNetflowServerPort(Integer netflowServerPort) {
		this.netflowServerPort = netflowServerPort;
		if(netflowServerPort != null){
			putQueryParameter("NetflowServerPort", netflowServerPort.toString());
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

	public String getNetflowServerIp() {
		return this.netflowServerIp;
	}

	public void setNetflowServerIp(String netflowServerIp) {
		this.netflowServerIp = netflowServerIp;
		if(netflowServerIp != null){
			putQueryParameter("NetflowServerIp", netflowServerIp);
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

	public String getFlowLogId() {
		return this.flowLogId;
	}

	public void setFlowLogId(String flowLogId) {
		this.flowLogId = flowLogId;
		if(flowLogId != null){
			putQueryParameter("FlowLogId", flowLogId);
		}
	}

	@Override
	public Class<ModifyFlowLogAttributeResponse> getResponseClass() {
		return ModifyFlowLogAttributeResponse.class;
	}

}
