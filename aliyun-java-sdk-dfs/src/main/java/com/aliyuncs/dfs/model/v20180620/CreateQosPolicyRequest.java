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

package com.aliyuncs.dfs.model.v20180620;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateQosPolicyRequest extends RpcAcsRequest<CreateQosPolicyResponse> {
	   

	private String description;

	@SerializedName("flowIds")
	private List<Integer> flowIds;

	@SerializedName("zoneIds")
	private List<String> zoneIds;

	private Long maxIOps;

	private String inputRegionId;

	private Long maxMetaQps;

	private String fileSystemId;

	private Long maxIOBandWidth;

	private String federationId;
	public CreateQosPolicyRequest() {
		super("DFS", "2018-06-20", "CreateQosPolicy", "alidfs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public List<Integer> getFlowIds() {
		return this.flowIds;
	}

	public void setFlowIds(List<Integer> flowIds) {
		this.flowIds = flowIds;	
		if (flowIds != null) {
			putQueryParameter("FlowIds" , new Gson().toJson(flowIds));
		}	
	}

	public List<String> getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(List<String> zoneIds) {
		this.zoneIds = zoneIds;	
		if (zoneIds != null) {
			putQueryParameter("ZoneIds" , new Gson().toJson(zoneIds));
		}	
	}

	public Long getMaxIOps() {
		return this.maxIOps;
	}

	public void setMaxIOps(Long maxIOps) {
		this.maxIOps = maxIOps;
		if(maxIOps != null){
			putQueryParameter("MaxIOps", maxIOps.toString());
		}
	}

	public String getInputRegionId() {
		return this.inputRegionId;
	}

	public void setInputRegionId(String inputRegionId) {
		this.inputRegionId = inputRegionId;
		if(inputRegionId != null){
			putQueryParameter("InputRegionId", inputRegionId);
		}
	}

	public Long getMaxMetaQps() {
		return this.maxMetaQps;
	}

	public void setMaxMetaQps(Long maxMetaQps) {
		this.maxMetaQps = maxMetaQps;
		if(maxMetaQps != null){
			putQueryParameter("MaxMetaQps", maxMetaQps.toString());
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public Long getMaxIOBandWidth() {
		return this.maxIOBandWidth;
	}

	public void setMaxIOBandWidth(Long maxIOBandWidth) {
		this.maxIOBandWidth = maxIOBandWidth;
		if(maxIOBandWidth != null){
			putQueryParameter("MaxIOBandWidth", maxIOBandWidth.toString());
		}
	}

	public String getFederationId() {
		return this.federationId;
	}

	public void setFederationId(String federationId) {
		this.federationId = federationId;
		if(federationId != null){
			putQueryParameter("FederationId", federationId);
		}
	}

	@Override
	public Class<CreateQosPolicyResponse> getResponseClass() {
		return CreateQosPolicyResponse.class;
	}

}
