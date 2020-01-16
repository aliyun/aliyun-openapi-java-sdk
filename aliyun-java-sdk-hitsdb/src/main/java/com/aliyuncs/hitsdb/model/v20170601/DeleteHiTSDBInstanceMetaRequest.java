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

package com.aliyuncs.hitsdb.model.v20170601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteHiTSDBInstanceMetaRequest extends RpcAcsRequest<DeleteHiTSDBInstanceMetaResponse> {
	   

	private String reverseVpcIp;

	private Long resourceOwnerId;

	private Integer reverseVpcPort;

	private String passWord;

	private String securityToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String tags;

	private String instanceId;

	private String metric;

	private String userName;
	public DeleteHiTSDBInstanceMetaRequest() {
		super("hitsdb", "2017-06-01", "DeleteHiTSDBInstanceMeta", "hitsdb");
		setMethod(MethodType.POST);
	}

	public String getReverseVpcIp() {
		return this.reverseVpcIp;
	}

	public void setReverseVpcIp(String reverseVpcIp) {
		this.reverseVpcIp = reverseVpcIp;
		if(reverseVpcIp != null){
			putQueryParameter("ReverseVpcIp", reverseVpcIp);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getReverseVpcPort() {
		return this.reverseVpcPort;
	}

	public void setReverseVpcPort(Integer reverseVpcPort) {
		this.reverseVpcPort = reverseVpcPort;
		if(reverseVpcPort != null){
			putQueryParameter("ReverseVpcPort", reverseVpcPort.toString());
		}
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
		if(passWord != null){
			putQueryParameter("PassWord", passWord);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
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

	public String getMetric() {
		return this.metric;
	}

	public void setMetric(String metric) {
		this.metric = metric;
		if(metric != null){
			putQueryParameter("Metric", metric);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<DeleteHiTSDBInstanceMetaResponse> getResponseClass() {
		return DeleteHiTSDBInstanceMetaResponse.class;
	}

}
