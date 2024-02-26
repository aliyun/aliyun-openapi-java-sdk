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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeBundlesRequest extends RpcAcsRequest<DescribeBundlesResponse> {
	   

	private Float gpuCount;

	private List<String> imageIds;

	private List<String> bundleIds;

	private String desktopTypeFamily;

	private Boolean selectedBundle;

	private String nextToken;

	private Boolean fromDesktopGroup;

	private String scope;

	private String bundleType;

	private String fotaChannel;

	private Boolean volumeEncryptionEnabled;

	private Integer memorySize;

	private String sessionType;

	private String osType;

	private Integer maxResults;

	private Boolean checkStock;

	private String protocolType;

	private Integer cpuCount;

	private Boolean supportMultiSession;
	public DescribeBundlesRequest() {
		super("ecd", "2020-09-30", "DescribeBundles", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Float getGpuCount() {
		return this.gpuCount;
	}

	public void setGpuCount(Float gpuCount) {
		this.gpuCount = gpuCount;
		if(gpuCount != null){
			putQueryParameter("GpuCount", gpuCount.toString());
		}
	}

	public List<String> getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;	
		if (imageIds != null) {
			for (int i = 0; i < imageIds.size(); i++) {
				putQueryParameter("ImageId." + (i + 1) , imageIds.get(i));
			}
		}	
	}

	public List<String> getBundleIds() {
		return this.bundleIds;
	}

	public void setBundleIds(List<String> bundleIds) {
		this.bundleIds = bundleIds;	
		if (bundleIds != null) {
			for (int i = 0; i < bundleIds.size(); i++) {
				putQueryParameter("BundleId." + (i + 1) , bundleIds.get(i));
			}
		}	
	}

	public String getDesktopTypeFamily() {
		return this.desktopTypeFamily;
	}

	public void setDesktopTypeFamily(String desktopTypeFamily) {
		this.desktopTypeFamily = desktopTypeFamily;
		if(desktopTypeFamily != null){
			putQueryParameter("DesktopTypeFamily", desktopTypeFamily);
		}
	}

	public Boolean getSelectedBundle() {
		return this.selectedBundle;
	}

	public void setSelectedBundle(Boolean selectedBundle) {
		this.selectedBundle = selectedBundle;
		if(selectedBundle != null){
			putQueryParameter("SelectedBundle", selectedBundle.toString());
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Boolean getFromDesktopGroup() {
		return this.fromDesktopGroup;
	}

	public void setFromDesktopGroup(Boolean fromDesktopGroup) {
		this.fromDesktopGroup = fromDesktopGroup;
		if(fromDesktopGroup != null){
			putQueryParameter("FromDesktopGroup", fromDesktopGroup.toString());
		}
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
		}
	}

	public String getBundleType() {
		return this.bundleType;
	}

	public void setBundleType(String bundleType) {
		this.bundleType = bundleType;
		if(bundleType != null){
			putQueryParameter("BundleType", bundleType);
		}
	}

	public String getFotaChannel() {
		return this.fotaChannel;
	}

	public void setFotaChannel(String fotaChannel) {
		this.fotaChannel = fotaChannel;
		if(fotaChannel != null){
			putQueryParameter("FotaChannel", fotaChannel);
		}
	}

	public Boolean getVolumeEncryptionEnabled() {
		return this.volumeEncryptionEnabled;
	}

	public void setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
		this.volumeEncryptionEnabled = volumeEncryptionEnabled;
		if(volumeEncryptionEnabled != null){
			putQueryParameter("VolumeEncryptionEnabled", volumeEncryptionEnabled.toString());
		}
	}

	public Integer getMemorySize() {
		return this.memorySize;
	}

	public void setMemorySize(Integer memorySize) {
		this.memorySize = memorySize;
		if(memorySize != null){
			putQueryParameter("MemorySize", memorySize.toString());
		}
	}

	public String getSessionType() {
		return this.sessionType;
	}

	public void setSessionType(String sessionType) {
		this.sessionType = sessionType;
		if(sessionType != null){
			putQueryParameter("SessionType", sessionType);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public Boolean getCheckStock() {
		return this.checkStock;
	}

	public void setCheckStock(Boolean checkStock) {
		this.checkStock = checkStock;
		if(checkStock != null){
			putQueryParameter("CheckStock", checkStock.toString());
		}
	}

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
		}
	}

	public Integer getCpuCount() {
		return this.cpuCount;
	}

	public void setCpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
		if(cpuCount != null){
			putQueryParameter("CpuCount", cpuCount.toString());
		}
	}

	public Boolean getSupportMultiSession() {
		return this.supportMultiSession;
	}

	public void setSupportMultiSession(Boolean supportMultiSession) {
		this.supportMultiSession = supportMultiSession;
		if(supportMultiSession != null){
			putQueryParameter("SupportMultiSession", supportMultiSession.toString());
		}
	}

	@Override
	public Class<DescribeBundlesResponse> getResponseClass() {
		return DescribeBundlesResponse.class;
	}

}
