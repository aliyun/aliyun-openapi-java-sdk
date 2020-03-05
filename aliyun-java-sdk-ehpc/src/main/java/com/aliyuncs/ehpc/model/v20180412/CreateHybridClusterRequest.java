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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateHybridClusterRequest extends RpcAcsRequest<CreateHybridClusterResponse> {
	   

	private String ehpcVersion;

	private String securityGroupId;

	private String description;

	private String keyPairName;

	private String securityGroupName;

	private String ecsOrderComputeInstanceType;

	private String onPremiseVolumeRemotePath;

	private String jobQueue;

	private String volumeType;

	private String resourceGroupId;

	private String password;

	private String onPremiseVolumeMountPoint;

	private String onPremiseVolumeProtocol;

	private String volumeProtocol;

	private String onPremiseVolumeLocalPath;

	private String clientVersion;

	private String osTag;

	private String remoteDirectory;

	private List<PostInstallScript> postInstallScripts;

	private String vSwitchId;

	private List<Nodes> nodess;

	private List<Application> applications;

	private String domain;

	private String vpcId;

	private String name;

	private String volumeId;

	private String volumeMountpoint;

	private String zoneId;

	private Boolean schedulerPreInstall;

	private String location;
	public CreateHybridClusterRequest() {
		super("EHPC", "2018-04-12", "CreateHybridCluster", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEhpcVersion() {
		return this.ehpcVersion;
	}

	public void setEhpcVersion(String ehpcVersion) {
		this.ehpcVersion = ehpcVersion;
		if(ehpcVersion != null){
			putQueryParameter("EhpcVersion", ehpcVersion);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
		}
	}

	public String getSecurityGroupName() {
		return this.securityGroupName;
	}

	public void setSecurityGroupName(String securityGroupName) {
		this.securityGroupName = securityGroupName;
		if(securityGroupName != null){
			putQueryParameter("SecurityGroupName", securityGroupName);
		}
	}

	public String getEcsOrderComputeInstanceType() {
		return this.ecsOrderComputeInstanceType;
	}

	public void setEcsOrderComputeInstanceType(String ecsOrderComputeInstanceType) {
		this.ecsOrderComputeInstanceType = ecsOrderComputeInstanceType;
		if(ecsOrderComputeInstanceType != null){
			putQueryParameter("EcsOrder.Compute.InstanceType", ecsOrderComputeInstanceType);
		}
	}

	public String getOnPremiseVolumeRemotePath() {
		return this.onPremiseVolumeRemotePath;
	}

	public void setOnPremiseVolumeRemotePath(String onPremiseVolumeRemotePath) {
		this.onPremiseVolumeRemotePath = onPremiseVolumeRemotePath;
		if(onPremiseVolumeRemotePath != null){
			putQueryParameter("OnPremiseVolumeRemotePath", onPremiseVolumeRemotePath);
		}
	}

	public String getJobQueue() {
		return this.jobQueue;
	}

	public void setJobQueue(String jobQueue) {
		this.jobQueue = jobQueue;
		if(jobQueue != null){
			putQueryParameter("JobQueue", jobQueue);
		}
	}

	public String getVolumeType() {
		return this.volumeType;
	}

	public void setVolumeType(String volumeType) {
		this.volumeType = volumeType;
		if(volumeType != null){
			putQueryParameter("VolumeType", volumeType);
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getOnPremiseVolumeMountPoint() {
		return this.onPremiseVolumeMountPoint;
	}

	public void setOnPremiseVolumeMountPoint(String onPremiseVolumeMountPoint) {
		this.onPremiseVolumeMountPoint = onPremiseVolumeMountPoint;
		if(onPremiseVolumeMountPoint != null){
			putQueryParameter("OnPremiseVolumeMountPoint", onPremiseVolumeMountPoint);
		}
	}

	public String getOnPremiseVolumeProtocol() {
		return this.onPremiseVolumeProtocol;
	}

	public void setOnPremiseVolumeProtocol(String onPremiseVolumeProtocol) {
		this.onPremiseVolumeProtocol = onPremiseVolumeProtocol;
		if(onPremiseVolumeProtocol != null){
			putQueryParameter("OnPremiseVolumeProtocol", onPremiseVolumeProtocol);
		}
	}

	public String getVolumeProtocol() {
		return this.volumeProtocol;
	}

	public void setVolumeProtocol(String volumeProtocol) {
		this.volumeProtocol = volumeProtocol;
		if(volumeProtocol != null){
			putQueryParameter("VolumeProtocol", volumeProtocol);
		}
	}

	public String getOnPremiseVolumeLocalPath() {
		return this.onPremiseVolumeLocalPath;
	}

	public void setOnPremiseVolumeLocalPath(String onPremiseVolumeLocalPath) {
		this.onPremiseVolumeLocalPath = onPremiseVolumeLocalPath;
		if(onPremiseVolumeLocalPath != null){
			putQueryParameter("OnPremiseVolumeLocalPath", onPremiseVolumeLocalPath);
		}
	}

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		if(clientVersion != null){
			putQueryParameter("ClientVersion", clientVersion);
		}
	}

	public String getOsTag() {
		return this.osTag;
	}

	public void setOsTag(String osTag) {
		this.osTag = osTag;
		if(osTag != null){
			putQueryParameter("OsTag", osTag);
		}
	}

	public String getRemoteDirectory() {
		return this.remoteDirectory;
	}

	public void setRemoteDirectory(String remoteDirectory) {
		this.remoteDirectory = remoteDirectory;
		if(remoteDirectory != null){
			putQueryParameter("RemoteDirectory", remoteDirectory);
		}
	}

	public List<PostInstallScript> getPostInstallScripts() {
		return this.postInstallScripts;
	}

	public void setPostInstallScripts(List<PostInstallScript> postInstallScripts) {
		this.postInstallScripts = postInstallScripts;	
		if (postInstallScripts != null) {
			for (int depth1 = 0; depth1 < postInstallScripts.size(); depth1++) {
				putQueryParameter("PostInstallScript." + (depth1 + 1) + ".Args" , postInstallScripts.get(depth1).getArgs());
				putQueryParameter("PostInstallScript." + (depth1 + 1) + ".Url" , postInstallScripts.get(depth1).getUrl());
			}
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

	public List<Nodes> getNodess() {
		return this.nodess;
	}

	public void setNodess(List<Nodes> nodess) {
		this.nodess = nodess;	
		if (nodess != null) {
			for (int depth1 = 0; depth1 < nodess.size(); depth1++) {
				putQueryParameter("Nodes." + (depth1 + 1) + ".IpAddress" , nodess.get(depth1).getIpAddress());
				putQueryParameter("Nodes." + (depth1 + 1) + ".HostName" , nodess.get(depth1).getHostName());
				putQueryParameter("Nodes." + (depth1 + 1) + ".Role" , nodess.get(depth1).getRole());
				putQueryParameter("Nodes." + (depth1 + 1) + ".AccountType" , nodess.get(depth1).getAccountType());
				putQueryParameter("Nodes." + (depth1 + 1) + ".SchedulerType" , nodess.get(depth1).getSchedulerType());
			}
		}	
	}

	public List<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;	
		if (applications != null) {
			for (int depth1 = 0; depth1 < applications.size(); depth1++) {
				putQueryParameter("Application." + (depth1 + 1) + ".Tag" , applications.get(depth1).getTag());
			}
		}	
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getVolumeId() {
		return this.volumeId;
	}

	public void setVolumeId(String volumeId) {
		this.volumeId = volumeId;
		if(volumeId != null){
			putQueryParameter("VolumeId", volumeId);
		}
	}

	public String getVolumeMountpoint() {
		return this.volumeMountpoint;
	}

	public void setVolumeMountpoint(String volumeMountpoint) {
		this.volumeMountpoint = volumeMountpoint;
		if(volumeMountpoint != null){
			putQueryParameter("VolumeMountpoint", volumeMountpoint);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Boolean getSchedulerPreInstall() {
		return this.schedulerPreInstall;
	}

	public void setSchedulerPreInstall(Boolean schedulerPreInstall) {
		this.schedulerPreInstall = schedulerPreInstall;
		if(schedulerPreInstall != null){
			putQueryParameter("SchedulerPreInstall", schedulerPreInstall.toString());
		}
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putQueryParameter("Location", location);
		}
	}

	public static class PostInstallScript {

		private String args;

		private String url;

		public String getArgs() {
			return this.args;
		}

		public void setArgs(String args) {
			this.args = args;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	public static class Nodes {

		private String ipAddress;

		private String hostName;

		private String role;

		private String accountType;

		private String schedulerType;

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getSchedulerType() {
			return this.schedulerType;
		}

		public void setSchedulerType(String schedulerType) {
			this.schedulerType = schedulerType;
		}
	}

	public static class Application {

		private String tag;

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}
	}

	@Override
	public Class<CreateHybridClusterResponse> getResponseClass() {
		return CreateHybridClusterResponse.class;
	}

}
