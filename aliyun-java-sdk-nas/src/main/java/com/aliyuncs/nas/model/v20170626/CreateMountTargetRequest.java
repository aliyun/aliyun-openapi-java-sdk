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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMountTargetRequest extends RpcAcsRequest<CreateMountTargetResponse> {
	   

	private String networkType;

	private String fileSystemId;

	private String accessGroupName;

	private String vSwitchId;

	private String vpcId;
	public CreateMountTargetRequest() {
		super("NAS", "2017-06-26", "CreateMountTarget", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
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

	public String getAccessGroupName() {
		return this.accessGroupName;
	}

	public void setAccessGroupName(String accessGroupName) {
		this.accessGroupName = accessGroupName;
		if(accessGroupName != null){
			putQueryParameter("AccessGroupName", accessGroupName);
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

	@Override
	public Class<CreateMountTargetResponse> getResponseClass() {
		return CreateMountTargetResponse.class;
	}

}
