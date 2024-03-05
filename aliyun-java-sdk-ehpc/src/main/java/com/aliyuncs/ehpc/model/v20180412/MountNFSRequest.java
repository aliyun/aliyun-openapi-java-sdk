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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MountNFSRequest extends RpcAcsRequest<MountNFSResponse> {
	   

	private String mountDir;

	private String instanceId;

	private String remoteDir;

	private String nfsDir;

	private String protocolType;
	public MountNFSRequest() {
		super("EHPC", "2018-04-12", "MountNFS", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMountDir() {
		return this.mountDir;
	}

	public void setMountDir(String mountDir) {
		this.mountDir = mountDir;
		if(mountDir != null){
			putQueryParameter("MountDir", mountDir);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getRemoteDir() {
		return this.remoteDir;
	}

	public void setRemoteDir(String remoteDir) {
		this.remoteDir = remoteDir;
		if(remoteDir != null){
			putQueryParameter("RemoteDir", remoteDir);
		}
	}

	public String getNfsDir() {
		return this.nfsDir;
	}

	public void setNfsDir(String nfsDir) {
		this.nfsDir = nfsDir;
		if(nfsDir != null){
			putQueryParameter("NfsDir", nfsDir);
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

	@Override
	public Class<MountNFSResponse> getResponseClass() {
		return MountNFSResponse.class;
	}

}
