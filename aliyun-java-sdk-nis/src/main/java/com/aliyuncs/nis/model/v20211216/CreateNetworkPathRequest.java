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

package com.aliyuncs.nis.model.v20211216;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateNetworkPathRequest extends RpcAcsRequest<CreateNetworkPathResponse> {
	   

	private String targetId;

	private String targetType;

	private String targetIpAddress;

	private String networkPathName;

	private Integer sourcePort;

	private String resourceGroupId;

	private String protocol;

	private String sourceType;

	private List<Tag> tags;

	private Integer targetPort;

	private String sourceId;

	private String sourceIpAddress;

	private String networkPathDescription;
	public CreateNetworkPathRequest() {
		super("nis", "2021-12-16", "CreateNetworkPath", "networkana");
		setMethod(MethodType.POST);
	}

	public String getTargetId() {
		return this.targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
		if(targetId != null){
			putQueryParameter("TargetId", targetId);
		}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public String getTargetIpAddress() {
		return this.targetIpAddress;
	}

	public void setTargetIpAddress(String targetIpAddress) {
		this.targetIpAddress = targetIpAddress;
		if(targetIpAddress != null){
			putQueryParameter("TargetIpAddress", targetIpAddress);
		}
	}

	public String getNetworkPathName() {
		return this.networkPathName;
	}

	public void setNetworkPathName(String networkPathName) {
		this.networkPathName = networkPathName;
		if(networkPathName != null){
			putQueryParameter("NetworkPathName", networkPathName);
		}
	}

	public Integer getSourcePort() {
		return this.sourcePort;
	}

	public void setSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
		if(sourcePort != null){
			putQueryParameter("SourcePort", sourcePort.toString());
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

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public Integer getTargetPort() {
		return this.targetPort;
	}

	public void setTargetPort(Integer targetPort) {
		this.targetPort = targetPort;
		if(targetPort != null){
			putQueryParameter("TargetPort", targetPort.toString());
		}
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putQueryParameter("SourceId", sourceId);
		}
	}

	public String getSourceIpAddress() {
		return this.sourceIpAddress;
	}

	public void setSourceIpAddress(String sourceIpAddress) {
		this.sourceIpAddress = sourceIpAddress;
		if(sourceIpAddress != null){
			putQueryParameter("SourceIpAddress", sourceIpAddress);
		}
	}

	public String getNetworkPathDescription() {
		return this.networkPathDescription;
	}

	public void setNetworkPathDescription(String networkPathDescription) {
		this.networkPathDescription = networkPathDescription;
		if(networkPathDescription != null){
			putQueryParameter("NetworkPathDescription", networkPathDescription);
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateNetworkPathResponse> getResponseClass() {
		return CreateNetworkPathResponse.class;
	}

}
