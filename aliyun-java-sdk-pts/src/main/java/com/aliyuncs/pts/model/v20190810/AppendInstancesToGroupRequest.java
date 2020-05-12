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

package com.aliyuncs.pts.model.v20190810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AppendInstancesToGroupRequest extends RpcAcsRequest<AppendInstancesToGroupResponse> {
	   

	private Long ver;

	private Long groupId;

	private String instanceIdAndPorts;
	public AppendInstancesToGroupRequest() {
		super("PTS", "2019-08-10", "AppendInstancesToGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getVer() {
		return this.ver;
	}

	public void setVer(Long ver) {
		this.ver = ver;
		if(ver != null){
			putQueryParameter("Ver", ver.toString());
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public String getInstanceIdAndPorts() {
		return this.instanceIdAndPorts;
	}

	public void setInstanceIdAndPorts(String instanceIdAndPorts) {
		this.instanceIdAndPorts = instanceIdAndPorts;
		if(instanceIdAndPorts != null){
			putQueryParameter("InstanceIdAndPorts", instanceIdAndPorts);
		}
	}

	@Override
	public Class<AppendInstancesToGroupResponse> getResponseClass() {
		return AppendInstancesToGroupResponse.class;
	}

}
