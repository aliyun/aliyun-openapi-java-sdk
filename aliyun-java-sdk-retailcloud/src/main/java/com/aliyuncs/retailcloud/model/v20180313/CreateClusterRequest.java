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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterRequest extends RpcAcsRequest<CreateClusterResponse> {
	   

	private String businessCode;

	private Boolean createWithLogIntegration;

	private List<String> vswitchidss;

	private Integer cloudMonitorFlags;

	private String clusterEnvType;

	private Boolean createWithArmsIntegration;

	private String keyPair;

	private String clusterTitle;

	private String podCIDR;

	private Long clusterId;

	private String clusterType;

	private String password;

	private Integer snatEntry;

	private String netPlug;

	private String vpcId;

	private String regionName;

	private Boolean privateZone;

	private String serviceCIDR;

	private Integer publicSlb;
	public CreateClusterRequest() {
		super("retailcloud", "2018-03-13", "CreateCluster", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBusinessCode() {
		return this.businessCode;
	}

	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
		if(businessCode != null){
			putQueryParameter("BusinessCode", businessCode);
		}
	}

	public Boolean getCreateWithLogIntegration() {
		return this.createWithLogIntegration;
	}

	public void setCreateWithLogIntegration(Boolean createWithLogIntegration) {
		this.createWithLogIntegration = createWithLogIntegration;
		if(createWithLogIntegration != null){
			putQueryParameter("CreateWithLogIntegration", createWithLogIntegration.toString());
		}
	}

	public List<String> getVswitchidss() {
		return this.vswitchidss;
	}

	public void setVswitchidss(List<String> vswitchidss) {
		this.vswitchidss = vswitchidss;	
		if (vswitchidss != null) {
			for (int i = 0; i < vswitchidss.size(); i++) {
				putQueryParameter("Vswitchids." + (i + 1) , vswitchidss.get(i));
			}
		}	
	}

	public Integer getCloudMonitorFlags() {
		return this.cloudMonitorFlags;
	}

	public void setCloudMonitorFlags(Integer cloudMonitorFlags) {
		this.cloudMonitorFlags = cloudMonitorFlags;
		if(cloudMonitorFlags != null){
			putQueryParameter("CloudMonitorFlags", cloudMonitorFlags.toString());
		}
	}

	public String getClusterEnvType() {
		return this.clusterEnvType;
	}

	public void setClusterEnvType(String clusterEnvType) {
		this.clusterEnvType = clusterEnvType;
		if(clusterEnvType != null){
			putQueryParameter("ClusterEnvType", clusterEnvType);
		}
	}

	public Boolean getCreateWithArmsIntegration() {
		return this.createWithArmsIntegration;
	}

	public void setCreateWithArmsIntegration(Boolean createWithArmsIntegration) {
		this.createWithArmsIntegration = createWithArmsIntegration;
		if(createWithArmsIntegration != null){
			putQueryParameter("CreateWithArmsIntegration", createWithArmsIntegration.toString());
		}
	}

	public String getKeyPair() {
		return this.keyPair;
	}

	public void setKeyPair(String keyPair) {
		this.keyPair = keyPair;
		if(keyPair != null){
			putQueryParameter("KeyPair", keyPair);
		}
	}

	public String getClusterTitle() {
		return this.clusterTitle;
	}

	public void setClusterTitle(String clusterTitle) {
		this.clusterTitle = clusterTitle;
		if(clusterTitle != null){
			putQueryParameter("ClusterTitle", clusterTitle);
		}
	}

	public String getPodCIDR() {
		return this.podCIDR;
	}

	public void setPodCIDR(String podCIDR) {
		this.podCIDR = podCIDR;
		if(podCIDR != null){
			putQueryParameter("PodCIDR", podCIDR);
		}
	}

	public Long getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId.toString());
		}
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putQueryParameter("ClusterType", clusterType);
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

	public Integer getSnatEntry() {
		return this.snatEntry;
	}

	public void setSnatEntry(Integer snatEntry) {
		this.snatEntry = snatEntry;
		if(snatEntry != null){
			putQueryParameter("SnatEntry", snatEntry.toString());
		}
	}

	public String getNetPlug() {
		return this.netPlug;
	}

	public void setNetPlug(String netPlug) {
		this.netPlug = netPlug;
		if(netPlug != null){
			putQueryParameter("NetPlug", netPlug);
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

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
		if(regionName != null){
			putQueryParameter("RegionName", regionName);
		}
	}

	public Boolean getPrivateZone() {
		return this.privateZone;
	}

	public void setPrivateZone(Boolean privateZone) {
		this.privateZone = privateZone;
		if(privateZone != null){
			putQueryParameter("PrivateZone", privateZone.toString());
		}
	}

	public String getServiceCIDR() {
		return this.serviceCIDR;
	}

	public void setServiceCIDR(String serviceCIDR) {
		this.serviceCIDR = serviceCIDR;
		if(serviceCIDR != null){
			putQueryParameter("ServiceCIDR", serviceCIDR);
		}
	}

	public Integer getPublicSlb() {
		return this.publicSlb;
	}

	public void setPublicSlb(Integer publicSlb) {
		this.publicSlb = publicSlb;
		if(publicSlb != null){
			putQueryParameter("PublicSlb", publicSlb.toString());
		}
	}

	@Override
	public Class<CreateClusterResponse> getResponseClass() {
		return CreateClusterResponse.class;
	}

}
