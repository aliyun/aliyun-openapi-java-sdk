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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAndAnalyzeNetworkPathRequest extends RpcAcsRequest<CreateAndAnalyzeNetworkPathResponse> {
	   

	private String targetId;

	private String targetType;

	private String targetIpAddress;

	private Integer sourcePort;

	private String protocol;

	private String sourceType;

	private Integer targetPort;

	private String sourceId;

	private String sourceIpAddress;
	public CreateAndAnalyzeNetworkPathRequest() {
		super("nis", "2021-12-16", "CreateAndAnalyzeNetworkPath", "networkana");
		setMethod(MethodType.GET);
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

	public Integer getSourcePort() {
		return this.sourcePort;
	}

	public void setSourcePort(Integer sourcePort) {
		this.sourcePort = sourcePort;
		if(sourcePort != null){
			putQueryParameter("SourcePort", sourcePort.toString());
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

	@Override
	public Class<CreateAndAnalyzeNetworkPathResponse> getResponseClass() {
		return CreateAndAnalyzeNetworkPathResponse.class;
	}

}
