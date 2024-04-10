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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetInternetTupleRequest extends RpcAcsRequest<GetInternetTupleResponse> {
	   

	private String otherPort;

	private String cloudIsp;

	private Integer topN;

	private String cloudPort;

	private String protocol;

	private String otherIp;

	@SerializedName("instanceList")
	private List<String> instanceList;

	private String orderBy;

	private String sort;

	private Boolean useMultiAccount;

	private String instanceId;

	private Integer tupleType;

	private String cloudIp;

	@SerializedName("cloudIpList")
	private List<String> cloudIpList;

	private String otherIsp;

	private String otherCountry;

	private String direction;

	private Long endTime;

	private Long beginTime;

	private String otherCity;

	private List<Long> accountIdss;
	public GetInternetTupleRequest() {
		super("nis", "2021-12-16", "GetInternetTuple", "networkana");
		setMethod(MethodType.POST);
	}

	public String getOtherPort() {
		return this.otherPort;
	}

	public void setOtherPort(String otherPort) {
		this.otherPort = otherPort;
		if(otherPort != null){
			putQueryParameter("OtherPort", otherPort);
		}
	}

	public String getCloudIsp() {
		return this.cloudIsp;
	}

	public void setCloudIsp(String cloudIsp) {
		this.cloudIsp = cloudIsp;
		if(cloudIsp != null){
			putQueryParameter("CloudIsp", cloudIsp);
		}
	}

	public Integer getTopN() {
		return this.topN;
	}

	public void setTopN(Integer topN) {
		this.topN = topN;
		if(topN != null){
			putQueryParameter("TopN", topN.toString());
		}
	}

	public String getCloudPort() {
		return this.cloudPort;
	}

	public void setCloudPort(String cloudPort) {
		this.cloudPort = cloudPort;
		if(cloudPort != null){
			putQueryParameter("CloudPort", cloudPort);
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

	public String getOtherIp() {
		return this.otherIp;
	}

	public void setOtherIp(String otherIp) {
		this.otherIp = otherIp;
		if(otherIp != null){
			putQueryParameter("OtherIp", otherIp);
		}
	}

	public List<String> getInstanceList() {
		return this.instanceList;
	}

	public void setInstanceList(List<String> instanceList) {
		this.instanceList = instanceList;	
		if (instanceList != null) {
			putQueryParameter("InstanceList" , new Gson().toJson(instanceList));
		}	
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
		if(orderBy != null){
			putQueryParameter("OrderBy", orderBy);
		}
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("Sort", sort);
		}
	}

	public Boolean getUseMultiAccount() {
		return this.useMultiAccount;
	}

	public void setUseMultiAccount(Boolean useMultiAccount) {
		this.useMultiAccount = useMultiAccount;
		if(useMultiAccount != null){
			putQueryParameter("UseMultiAccount", useMultiAccount.toString());
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

	public Integer getTupleType() {
		return this.tupleType;
	}

	public void setTupleType(Integer tupleType) {
		this.tupleType = tupleType;
		if(tupleType != null){
			putQueryParameter("TupleType", tupleType.toString());
		}
	}

	public String getCloudIp() {
		return this.cloudIp;
	}

	public void setCloudIp(String cloudIp) {
		this.cloudIp = cloudIp;
		if(cloudIp != null){
			putQueryParameter("CloudIp", cloudIp);
		}
	}

	public List<String> getCloudIpList() {
		return this.cloudIpList;
	}

	public void setCloudIpList(List<String> cloudIpList) {
		this.cloudIpList = cloudIpList;	
		if (cloudIpList != null) {
			putQueryParameter("CloudIpList" , new Gson().toJson(cloudIpList));
		}	
	}

	public String getOtherIsp() {
		return this.otherIsp;
	}

	public void setOtherIsp(String otherIsp) {
		this.otherIsp = otherIsp;
		if(otherIsp != null){
			putQueryParameter("OtherIsp", otherIsp);
		}
	}

	public String getOtherCountry() {
		return this.otherCountry;
	}

	public void setOtherCountry(String otherCountry) {
		this.otherCountry = otherCountry;
		if(otherCountry != null){
			putQueryParameter("OtherCountry", otherCountry);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getOtherCity() {
		return this.otherCity;
	}

	public void setOtherCity(String otherCity) {
		this.otherCity = otherCity;
		if(otherCity != null){
			putQueryParameter("OtherCity", otherCity);
		}
	}

	public List<Long> getAccountIdss() {
		return this.accountIdss;
	}

	public void setAccountIdss(List<Long> accountIdss) {
		this.accountIdss = accountIdss;	
		if (accountIdss != null) {
			for (int i = 0; i < accountIdss.size(); i++) {
				putQueryParameter("AccountIds." + (i + 1) , accountIdss.get(i));
			}
		}	
	}

	@Override
	public Class<GetInternetTupleResponse> getResponseClass() {
		return GetInternetTupleResponse.class;
	}

}
