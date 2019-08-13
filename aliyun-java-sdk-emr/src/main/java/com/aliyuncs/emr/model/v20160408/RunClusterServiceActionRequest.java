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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunClusterServiceActionRequest extends RpcAcsRequest<RunClusterServiceActionResponse> {
	
	public RunClusterServiceActionRequest() {
		super("Emr", "2016-04-08", "RunClusterServiceAction", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String executeStrategy;

	private List<String> hostGroupIdLists;

	private Long resourceOwnerId;

	private Boolean onlyRestartStaleConfigNodes;

	private Integer nodeCountPerBatch;

	private String clusterId;

	private String customCommand;

	private String componentNameList;

	private String serviceActionName;

	private Boolean isRolling;

	private Integer totlerateFailCount;

	private String serviceName;

	private String comment;

	private String customParams;

	private Long interval;

	private String hostIdList;

	private Boolean turnOnMaintenanceMode;

	public String getExecuteStrategy() {
		return this.executeStrategy;
	}

	public void setExecuteStrategy(String executeStrategy) {
		this.executeStrategy = executeStrategy;
		if(executeStrategy != null){
			putQueryParameter("ExecuteStrategy", executeStrategy);
		}
	}

	public List<String> getHostGroupIdLists() {
		return this.hostGroupIdLists;
	}

	public void setHostGroupIdLists(List<String> hostGroupIdLists) {
		this.hostGroupIdLists = hostGroupIdLists;	
		if (hostGroupIdLists != null) {
			for (int i = 0; i < hostGroupIdLists.size(); i++) {
				putQueryParameter("HostGroupIdList." + (i + 1) , hostGroupIdLists.get(i));
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

	public Boolean getOnlyRestartStaleConfigNodes() {
		return this.onlyRestartStaleConfigNodes;
	}

	public void setOnlyRestartStaleConfigNodes(Boolean onlyRestartStaleConfigNodes) {
		this.onlyRestartStaleConfigNodes = onlyRestartStaleConfigNodes;
		if(onlyRestartStaleConfigNodes != null){
			putQueryParameter("OnlyRestartStaleConfigNodes", onlyRestartStaleConfigNodes.toString());
		}
	}

	public Integer getNodeCountPerBatch() {
		return this.nodeCountPerBatch;
	}

	public void setNodeCountPerBatch(Integer nodeCountPerBatch) {
		this.nodeCountPerBatch = nodeCountPerBatch;
		if(nodeCountPerBatch != null){
			putQueryParameter("NodeCountPerBatch", nodeCountPerBatch.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getCustomCommand() {
		return this.customCommand;
	}

	public void setCustomCommand(String customCommand) {
		this.customCommand = customCommand;
		if(customCommand != null){
			putQueryParameter("CustomCommand", customCommand);
		}
	}

	public String getComponentNameList() {
		return this.componentNameList;
	}

	public void setComponentNameList(String componentNameList) {
		this.componentNameList = componentNameList;
		if(componentNameList != null){
			putQueryParameter("ComponentNameList", componentNameList);
		}
	}

	public String getServiceActionName() {
		return this.serviceActionName;
	}

	public void setServiceActionName(String serviceActionName) {
		this.serviceActionName = serviceActionName;
		if(serviceActionName != null){
			putQueryParameter("ServiceActionName", serviceActionName);
		}
	}

	public Boolean getIsRolling() {
		return this.isRolling;
	}

	public void setIsRolling(Boolean isRolling) {
		this.isRolling = isRolling;
		if(isRolling != null){
			putQueryParameter("IsRolling", isRolling.toString());
		}
	}

	public Integer getTotlerateFailCount() {
		return this.totlerateFailCount;
	}

	public void setTotlerateFailCount(Integer totlerateFailCount) {
		this.totlerateFailCount = totlerateFailCount;
		if(totlerateFailCount != null){
			putQueryParameter("TotlerateFailCount", totlerateFailCount.toString());
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public String getCustomParams() {
		return this.customParams;
	}

	public void setCustomParams(String customParams) {
		this.customParams = customParams;
		if(customParams != null){
			putQueryParameter("CustomParams", customParams);
		}
	}

	public Long getInterval() {
		return this.interval;
	}

	public void setInterval(Long interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	public String getHostIdList() {
		return this.hostIdList;
	}

	public void setHostIdList(String hostIdList) {
		this.hostIdList = hostIdList;
		if(hostIdList != null){
			putQueryParameter("HostIdList", hostIdList);
		}
	}

	public Boolean getTurnOnMaintenanceMode() {
		return this.turnOnMaintenanceMode;
	}

	public void setTurnOnMaintenanceMode(Boolean turnOnMaintenanceMode) {
		this.turnOnMaintenanceMode = turnOnMaintenanceMode;
		if(turnOnMaintenanceMode != null){
			putQueryParameter("TurnOnMaintenanceMode", turnOnMaintenanceMode.toString());
		}
	}

	@Override
	public Class<RunClusterServiceActionResponse> getResponseClass() {
		return RunClusterServiceActionResponse.class;
	}

}
