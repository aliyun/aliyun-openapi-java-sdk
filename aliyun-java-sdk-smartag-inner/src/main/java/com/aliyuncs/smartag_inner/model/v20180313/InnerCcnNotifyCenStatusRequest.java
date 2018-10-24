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

package com.aliyuncs.smartag_inner.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerCcnNotifyCenStatusRequest extends RpcAcsRequest<InnerCcnNotifyCenStatusResponse> {
	
	public InnerCcnNotifyCenStatusRequest() {
		super("Smartag-inner", "2018-03-13", "InnerCcnNotifyCenStatus", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String instanceId;

	private String cenInstanceId;

	private Integer globalTunnelId;

	private String state;

	private Long instanceUid;

	private Long cenInstanceUid;

	private String cenInstanceBid;

	private String instanceBid;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
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

	public String getCenInstanceId() {
		return this.cenInstanceId;
	}

	public void setCenInstanceId(String cenInstanceId) {
		this.cenInstanceId = cenInstanceId;
		if(cenInstanceId != null){
			putQueryParameter("CenInstanceId", cenInstanceId);
		}
	}

	public Integer getGlobalTunnelId() {
		return this.globalTunnelId;
	}

	public void setGlobalTunnelId(Integer globalTunnelId) {
		this.globalTunnelId = globalTunnelId;
		if(globalTunnelId != null){
			putQueryParameter("GlobalTunnelId", globalTunnelId.toString());
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public Long getInstanceUid() {
		return this.instanceUid;
	}

	public void setInstanceUid(Long instanceUid) {
		this.instanceUid = instanceUid;
		if(instanceUid != null){
			putQueryParameter("InstanceUid", instanceUid.toString());
		}
	}

	public Long getCenInstanceUid() {
		return this.cenInstanceUid;
	}

	public void setCenInstanceUid(Long cenInstanceUid) {
		this.cenInstanceUid = cenInstanceUid;
		if(cenInstanceUid != null){
			putQueryParameter("CenInstanceUid", cenInstanceUid.toString());
		}
	}

	public String getCenInstanceBid() {
		return this.cenInstanceBid;
	}

	public void setCenInstanceBid(String cenInstanceBid) {
		this.cenInstanceBid = cenInstanceBid;
		if(cenInstanceBid != null){
			putQueryParameter("CenInstanceBid", cenInstanceBid);
		}
	}

	public String getInstanceBid() {
		return this.instanceBid;
	}

	public void setInstanceBid(String instanceBid) {
		this.instanceBid = instanceBid;
		if(instanceBid != null){
			putQueryParameter("InstanceBid", instanceBid);
		}
	}

	@Override
	public Class<InnerCcnNotifyCenStatusResponse> getResponseClass() {
		return InnerCcnNotifyCenStatusResponse.class;
	}

}
