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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBNodePerformanceRequest extends RpcAcsRequest<DescribeDBNodePerformanceResponse> {
	   

	private String startTime;

	private String dBNodeRole;

	private String characterType;

	private String dBInstanceName;

	private String dBNodeIds;

	private String key;

	private String endTime;
	public DescribeDBNodePerformanceRequest() {
		super("polardbx", "2020-02-02", "DescribeDBNodePerformance", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getDBNodeRole() {
		return this.dBNodeRole;
	}

	public void setDBNodeRole(String dBNodeRole) {
		this.dBNodeRole = dBNodeRole;
		if(dBNodeRole != null){
			putQueryParameter("DBNodeRole", dBNodeRole);
		}
	}

	public String getCharacterType() {
		return this.characterType;
	}

	public void setCharacterType(String characterType) {
		this.characterType = characterType;
		if(characterType != null){
			putQueryParameter("CharacterType", characterType);
		}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public String getDBNodeIds() {
		return this.dBNodeIds;
	}

	public void setDBNodeIds(String dBNodeIds) {
		this.dBNodeIds = dBNodeIds;
		if(dBNodeIds != null){
			putQueryParameter("DBNodeIds", dBNodeIds);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	@Override
	public Class<DescribeDBNodePerformanceResponse> getResponseClass() {
		return DescribeDBNodePerformanceResponse.class;
	}

}
