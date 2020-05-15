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

package com.aliyuncs.cassandra.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cassandra.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyIpWhitelistGroupRequest extends RpcAcsRequest<ModifyIpWhitelistGroupResponse> {
	   

	private String ipList;

	private Integer ipVersion;

	private String clusterId;

	private String groupName;
	public ModifyIpWhitelistGroupRequest() {
		super("Cassandra", "2019-01-01", "ModifyIpWhitelistGroup", "Cassandra");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIpList() {
		return this.ipList;
	}

	public void setIpList(String ipList) {
		this.ipList = ipList;
		if(ipList != null){
			putQueryParameter("IpList", ipList);
		}
	}

	public Integer getIpVersion() {
		return this.ipVersion;
	}

	public void setIpVersion(Integer ipVersion) {
		this.ipVersion = ipVersion;
		if(ipVersion != null){
			putQueryParameter("IpVersion", ipVersion.toString());
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

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	@Override
	public Class<ModifyIpWhitelistGroupResponse> getResponseClass() {
		return ModifyIpWhitelistGroupResponse.class;
	}

}
