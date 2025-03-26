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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeElasticStrengthRequest extends RpcAcsRequest<DescribeElasticStrengthResponse> {
	   

	private String imageId;

	private List<String> dataDiskCategoriess;

	private String scalingGroupId;

	private List<String> vSwitchIdss;

	private List<String> instanceTypess;

	private String imageName;

	private List<String> scalingGroupIdss;

	private Integer ipv6AddressCount;

	private List<String> systemDiskCategoriess;

	private String spotStrategy;

	private String priorityStrategy;

	private String imageFamily;
	public DescribeElasticStrengthRequest() {
		super("Ess", "2014-08-28", "DescribeElasticStrength", "ess");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public List<String> getDataDiskCategoriess() {
		return this.dataDiskCategoriess;
	}

	public void setDataDiskCategoriess(List<String> dataDiskCategoriess) {
		this.dataDiskCategoriess = dataDiskCategoriess;	
		if (dataDiskCategoriess != null) {
			for (int i = 0; i < dataDiskCategoriess.size(); i++) {
				putQueryParameter("DataDiskCategories." + (i + 1) , dataDiskCategoriess.get(i));
			}
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

	public List<String> getVSwitchIdss() {
		return this.vSwitchIdss;
	}

	public void setVSwitchIdss(List<String> vSwitchIdss) {
		this.vSwitchIdss = vSwitchIdss;	
		if (vSwitchIdss != null) {
			for (int i = 0; i < vSwitchIdss.size(); i++) {
				putQueryParameter("VSwitchIds." + (i + 1) , vSwitchIdss.get(i));
			}
		}	
	}

	public List<String> getInstanceTypess() {
		return this.instanceTypess;
	}

	public void setInstanceTypess(List<String> instanceTypess) {
		this.instanceTypess = instanceTypess;	
		if (instanceTypess != null) {
			for (int i = 0; i < instanceTypess.size(); i++) {
				putQueryParameter("InstanceTypes." + (i + 1) , instanceTypess.get(i));
			}
		}	
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public List<String> getScalingGroupIdss() {
		return this.scalingGroupIdss;
	}

	public void setScalingGroupIdss(List<String> scalingGroupIdss) {
		this.scalingGroupIdss = scalingGroupIdss;	
		if (scalingGroupIdss != null) {
			for (int i = 0; i < scalingGroupIdss.size(); i++) {
				putQueryParameter("ScalingGroupIds." + (i + 1) , scalingGroupIdss.get(i));
			}
		}	
	}

	public Integer getIpv6AddressCount() {
		return this.ipv6AddressCount;
	}

	public void setIpv6AddressCount(Integer ipv6AddressCount) {
		this.ipv6AddressCount = ipv6AddressCount;
		if(ipv6AddressCount != null){
			putQueryParameter("Ipv6AddressCount", ipv6AddressCount.toString());
		}
	}

	public List<String> getSystemDiskCategoriess() {
		return this.systemDiskCategoriess;
	}

	public void setSystemDiskCategoriess(List<String> systemDiskCategoriess) {
		this.systemDiskCategoriess = systemDiskCategoriess;	
		if (systemDiskCategoriess != null) {
			for (int i = 0; i < systemDiskCategoriess.size(); i++) {
				putQueryParameter("SystemDiskCategories." + (i + 1) , systemDiskCategoriess.get(i));
			}
		}	
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public String getPriorityStrategy() {
		return this.priorityStrategy;
	}

	public void setPriorityStrategy(String priorityStrategy) {
		this.priorityStrategy = priorityStrategy;
		if(priorityStrategy != null){
			putQueryParameter("PriorityStrategy", priorityStrategy);
		}
	}

	public String getImageFamily() {
		return this.imageFamily;
	}

	public void setImageFamily(String imageFamily) {
		this.imageFamily = imageFamily;
		if(imageFamily != null){
			putQueryParameter("ImageFamily", imageFamily);
		}
	}

	@Override
	public Class<DescribeElasticStrengthResponse> getResponseClass() {
		return DescribeElasticStrengthResponse.class;
	}

}
