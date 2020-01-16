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
public class ExploreHiTSDBInstanceDataRequest extends RpcAcsRequest<ExploreHiTSDBInstanceDataResponse> {
	   

	private String reverseVpcIp;

	private Long resourceOwnerId;

	private Integer reverseVpcPort;

	private String passWord;

	private String securityToken;

	private Long end;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String aggregator;

	private Long start;

	private Long ownerId;

	private String tagFilter;

	private String instanceId;

	private String metric;

	private String downSampleAggregator;

	private String downSampleTime;

	private String userName;
	public ExploreHiTSDBInstanceDataRequest() {
		super("hitsdb", "2017-06-01", "ExploreHiTSDBInstanceData", "hitsdb");
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

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putQueryParameter("End", end.toString());
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

	public String getAggregator() {
		return this.aggregator;
	}

	public void setAggregator(String aggregator) {
		this.aggregator = aggregator;
		if(aggregator != null){
			putQueryParameter("Aggregator", aggregator);
		}
	}

	public Long getStart() {
		return this.start;
	}

	public void setStart(Long start) {
		this.start = start;
		if(start != null){
			putQueryParameter("Start", start.toString());
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

	public String getTagFilter() {
		return this.tagFilter;
	}

	public void setTagFilter(String tagFilter) {
		this.tagFilter = tagFilter;
		if(tagFilter != null){
			putQueryParameter("TagFilter", tagFilter);
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

	public String getDownSampleAggregator() {
		return this.downSampleAggregator;
	}

	public void setDownSampleAggregator(String downSampleAggregator) {
		this.downSampleAggregator = downSampleAggregator;
		if(downSampleAggregator != null){
			putQueryParameter("DownSampleAggregator", downSampleAggregator);
		}
	}

	public String getDownSampleTime() {
		return this.downSampleTime;
	}

	public void setDownSampleTime(String downSampleTime) {
		this.downSampleTime = downSampleTime;
		if(downSampleTime != null){
			putQueryParameter("DownSampleTime", downSampleTime);
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
	public Class<ExploreHiTSDBInstanceDataResponse> getResponseClass() {
		return ExploreHiTSDBInstanceDataResponse.class;
	}

}
