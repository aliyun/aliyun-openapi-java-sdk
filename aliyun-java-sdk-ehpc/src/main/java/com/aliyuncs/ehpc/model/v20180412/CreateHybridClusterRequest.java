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

/**
 * @author auto create
 * @version 
 */
public class CreateHybridClusterRequest extends RpcAcsRequest<CreateHybridClusterResponse> {
	
	public CreateHybridClusterRequest() {
		super("EHPC", "2018-04-12", "CreateHybridCluster", "ehs");
	}

	private String volumeProtocol;

	private String osTag;

	private String remoteDirectory;

	private String ehpcVersion;

	private String securityGroupId;

	private String description;

	private String keyPairName;

	private String securityGroupName;

	private String ecsOrderComputeInstanceType;

	private String vSwitchId;

	private String volumeType;

	private String password;

	private String nodes;

	private List<Application> applications;

	private String domain;

	private String vpcId;

	private String name;

	private String volumeId;

	private String volumeMountpoint;

	private String zoneId;

	private String location;

	public String getVolumeProtocol() {
		return this.volumeProtocol;
	}

	public void setVolumeProtocol(String volumeProtocol) {
		this.volumeProtocol = volumeProtocol;
		if(volumeProtocol != null){
			putQueryParameter("VolumeProtocol", volumeProtocol);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getNodes() {
		return this.nodes;
	}

	public void setNodes(String nodes) {
		this.nodes = nodes;
		if(nodes != null){
			putQueryParameter("Nodes", nodes);
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

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
		if(location != null){
			putQueryParameter("Location", location);
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
