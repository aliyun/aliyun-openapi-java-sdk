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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePrometheusInstanceRequest extends RpcAcsRequest<CreatePrometheusInstanceResponse> {
	   

	private String grafanaInstanceId;

	private String clusterName;

	private String securityGroupId;

	private Integer duration;

	private String resourceGroupId;

	private String subClustersJson;

	private Boolean allSubClustersSuccess;

	private String clusterId;

	private List<Tags> tagss;

	private String clusterType;

	private String vSwitchId;

	private String vpcId;

	private String paymentType;

	private Integer archiveDuration;
	public CreatePrometheusInstanceRequest() {
		super("ARMS", "2019-08-08", "CreatePrometheusInstance", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGrafanaInstanceId() {
		return this.grafanaInstanceId;
	}

	public void setGrafanaInstanceId(String grafanaInstanceId) {
		this.grafanaInstanceId = grafanaInstanceId;
		if(grafanaInstanceId != null){
			putQueryParameter("GrafanaInstanceId", grafanaInstanceId);
		}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
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

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
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

	public String getSubClustersJson() {
		return this.subClustersJson;
	}

	public void setSubClustersJson(String subClustersJson) {
		this.subClustersJson = subClustersJson;
		if(subClustersJson != null){
			putQueryParameter("SubClustersJson", subClustersJson);
		}
	}

	public Boolean getAllSubClustersSuccess() {
		return this.allSubClustersSuccess;
	}

	public void setAllSubClustersSuccess(Boolean allSubClustersSuccess) {
		this.allSubClustersSuccess = allSubClustersSuccess;
		if(allSubClustersSuccess != null){
			putQueryParameter("AllSubClustersSuccess", allSubClustersSuccess.toString());
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

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
				putQueryParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
			}
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
		if(paymentType != null){
			putQueryParameter("PaymentType", paymentType);
		}
	}

	public Integer getArchiveDuration() {
		return this.archiveDuration;
	}

	public void setArchiveDuration(Integer archiveDuration) {
		this.archiveDuration = archiveDuration;
		if(archiveDuration != null){
			putQueryParameter("ArchiveDuration", archiveDuration.toString());
		}
	}

	public static class Tags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreatePrometheusInstanceResponse> getResponseClass() {
		return CreatePrometheusInstanceResponse.class;
	}

}
