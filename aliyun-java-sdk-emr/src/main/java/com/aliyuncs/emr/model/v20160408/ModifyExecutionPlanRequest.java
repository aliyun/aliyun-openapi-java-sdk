/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyExecutionPlanRequest extends RpcAcsRequest<ModifyExecutionPlanResponse> {
	
	public ModifyExecutionPlanRequest() {
		super("Emr", "2016-04-08", "ModifyExecutionPlan");
	}

	private Long resourceOwnerId;

	private String clusterName;

	private String clusterId;

	private String zoneId;

	private Boolean logEnable;

	private String logPath;

	private String securityGroupId;

	private Boolean isOpenPublicIp;

	private Boolean createClusterOnDemand;

	private String emrVer;

	private String clusterType;

	private Boolean highAvailabilityEnable;

	private String vpcId;

	private String vSwitchId;

	private String netType;

	private Boolean ioOptimized;

	private String instanceGeneration;

	private String configurations;

	private String id;

	private Long executionPlanVersion;

	private String name;

	private String strategy;

	private Integer timeInterval;

	private Long startTime;

	private String timeUnit;

	private List<String> optionSoftWareLists;

	private List<EcsOrder> ecsOrders;

	private List<BootstrapAction> bootstrapActions;

	private List<String> jobIdLists;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		putQueryParameter("ClusterName", clusterName);
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		putQueryParameter("ClusterId", clusterId);
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		putQueryParameter("ZoneId", zoneId);
	}

	public Boolean getLogEnable() {
		return this.logEnable;
	}

	public void setLogEnable(Boolean logEnable) {
		this.logEnable = logEnable;
		putQueryParameter("LogEnable", logEnable);
	}

	public String getLogPath() {
		return this.logPath;
	}

	public void setLogPath(String logPath) {
		this.logPath = logPath;
		putQueryParameter("LogPath", logPath);
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		putQueryParameter("SecurityGroupId", securityGroupId);
	}

	public Boolean getIsOpenPublicIp() {
		return this.isOpenPublicIp;
	}

	public void setIsOpenPublicIp(Boolean isOpenPublicIp) {
		this.isOpenPublicIp = isOpenPublicIp;
		putQueryParameter("IsOpenPublicIp", isOpenPublicIp);
	}

	public Boolean getCreateClusterOnDemand() {
		return this.createClusterOnDemand;
	}

	public void setCreateClusterOnDemand(Boolean createClusterOnDemand) {
		this.createClusterOnDemand = createClusterOnDemand;
		putQueryParameter("CreateClusterOnDemand", createClusterOnDemand);
	}

	public String getEmrVer() {
		return this.emrVer;
	}

	public void setEmrVer(String emrVer) {
		this.emrVer = emrVer;
		putQueryParameter("EmrVer", emrVer);
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		putQueryParameter("ClusterType", clusterType);
	}

	public Boolean getHighAvailabilityEnable() {
		return this.highAvailabilityEnable;
	}

	public void setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
		this.highAvailabilityEnable = highAvailabilityEnable;
		putQueryParameter("HighAvailabilityEnable", highAvailabilityEnable);
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		putQueryParameter("VpcId", vpcId);
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		putQueryParameter("VSwitchId", vSwitchId);
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		putQueryParameter("NetType", netType);
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		putQueryParameter("IoOptimized", ioOptimized);
	}

	public String getInstanceGeneration() {
		return this.instanceGeneration;
	}

	public void setInstanceGeneration(String instanceGeneration) {
		this.instanceGeneration = instanceGeneration;
		putQueryParameter("InstanceGeneration", instanceGeneration);
	}

	public String getConfigurations() {
		return this.configurations;
	}

	public void setConfigurations(String configurations) {
		this.configurations = configurations;
		putQueryParameter("Configurations", configurations);
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		putQueryParameter("Id", id);
	}

	public Long getExecutionPlanVersion() {
		return this.executionPlanVersion;
	}

	public void setExecutionPlanVersion(Long executionPlanVersion) {
		this.executionPlanVersion = executionPlanVersion;
		putQueryParameter("ExecutionPlanVersion", executionPlanVersion);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		putQueryParameter("Name", name);
	}

	public String getStrategy() {
		return this.strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
		putQueryParameter("Strategy", strategy);
	}

	public Integer getTimeInterval() {
		return this.timeInterval;
	}

	public void setTimeInterval(Integer timeInterval) {
		this.timeInterval = timeInterval;
		putQueryParameter("TimeInterval", timeInterval);
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		putQueryParameter("StartTime", startTime);
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
		putQueryParameter("TimeUnit", timeUnit);
	}

	public List<String> getOptionSoftWareLists() {
		return this.optionSoftWareLists;
	}

	public void setOptionSoftWareLists(List<String> optionSoftWareLists) {
		this.optionSoftWareLists = optionSoftWareLists;	
		for (int i = 0; i < optionSoftWareLists.size(); i++) {
			putQueryParameter("OptionSoftWareList." + (i + 1) , optionSoftWareLists.get(i));
		}	
	}

	public List<EcsOrder> getEcsOrders() {
		return this.ecsOrders;
	}

	public void setEcsOrders(List<EcsOrder> ecsOrders) {
		this.ecsOrders = ecsOrders;	
		for (int i = 0; i < ecsOrders.size(); i++) {
			putQueryParameter("EcsOrder." + (i + 1) + ".Index" , ecsOrders.get(i).getIndex());
			putQueryParameter("EcsOrder." + (i + 1) + ".NodeCount" , ecsOrders.get(i).getNodeCount());
			putQueryParameter("EcsOrder." + (i + 1) + ".InstanceType" , ecsOrders.get(i).getInstanceType());
			putQueryParameter("EcsOrder." + (i + 1) + ".DiskType" , ecsOrders.get(i).getDiskType());
			putQueryParameter("EcsOrder." + (i + 1) + ".DiskCapacity" , ecsOrders.get(i).getDiskCapacity());
			putQueryParameter("EcsOrder." + (i + 1) + ".NodeType" , ecsOrders.get(i).getNodeType());
			putQueryParameter("EcsOrder." + (i + 1) + ".DiskCount" , ecsOrders.get(i).getDiskCount());
		}	
	}

	public List<BootstrapAction> getBootstrapActions() {
		return this.bootstrapActions;
	}

	public void setBootstrapActions(List<BootstrapAction> bootstrapActions) {
		this.bootstrapActions = bootstrapActions;	
		for (int i = 0; i < bootstrapActions.size(); i++) {
			putQueryParameter("BootstrapAction." + (i + 1) + ".Name" , bootstrapActions.get(i).getName());
			putQueryParameter("BootstrapAction." + (i + 1) + ".Path" , bootstrapActions.get(i).getPath());
			putQueryParameter("BootstrapAction." + (i + 1) + ".Arg" , bootstrapActions.get(i).getArg());
		}	
	}

	public List<String> getJobIdLists() {
		return this.jobIdLists;
	}

	public void setJobIdLists(List<String> jobIdLists) {
		this.jobIdLists = jobIdLists;	
		for (int i = 0; i < jobIdLists.size(); i++) {
			putQueryParameter("JobIdList." + (i + 1) , jobIdLists.get(i));
		}	
	}

	public static class EcsOrder {

		private Integer index;

		private Integer nodeCount;

		private String instanceType;

		private String diskType;

		private Integer diskCapacity;

		private String nodeType;

		private Integer diskCount;

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public Integer getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(Integer nodeCount) {
			this.nodeCount = nodeCount;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public Integer getDiskCapacity() {
			return this.diskCapacity;
		}

		public void setDiskCapacity(Integer diskCapacity) {
			this.diskCapacity = diskCapacity;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public Integer getDiskCount() {
			return this.diskCount;
		}

		public void setDiskCount(Integer diskCount) {
			this.diskCount = diskCount;
		}
	}

	public static class BootstrapAction {

		private String name;

		private String path;

		private String arg;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getArg() {
			return this.arg;
		}

		public void setArg(String arg) {
			this.arg = arg;
		}
	}

	@Override
	public Class<ModifyExecutionPlanResponse> getResponseClass() {
		return ModifyExecutionPlanResponse.class;
	}

}
