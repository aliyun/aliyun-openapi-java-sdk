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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListTerminalRequest extends RpcAcsRequest<ListTerminalResponse> {
	   

	private Integer clientType;

	private String buildId;

	private String uuid;

	private String ipv4;

	private String nextToken;

	private String alias;

	private Boolean inManage;

	private String model;

	private String serialNumber;

	private String terminalGroupId;

	private String locationInfo;

	private String searchKeyword;

	private Integer maxResults;
	public ListTerminalRequest() {
		super("wyota", "2021-04-20", "ListTerminal");
		setMethod(MethodType.POST);
	}

	public Integer getClientType() {
		return this.clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putBodyParameter("ClientType", clientType.toString());
		}
	}

	public String getBuildId() {
		return this.buildId;
	}

	public void setBuildId(String buildId) {
		this.buildId = buildId;
		if(buildId != null){
			putBodyParameter("BuildId", buildId);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putBodyParameter("Uuid", uuid);
		}
	}

	public String getIpv4() {
		return this.ipv4;
	}

	public void setIpv4(String ipv4) {
		this.ipv4 = ipv4;
		if(ipv4 != null){
			putBodyParameter("Ipv4", ipv4);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		if(alias != null){
			putBodyParameter("Alias", alias);
		}
	}

	public Boolean getInManage() {
		return this.inManage;
	}

	public void setInManage(Boolean inManage) {
		this.inManage = inManage;
		if(inManage != null){
			putBodyParameter("InManage", inManage.toString());
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("Model", model);
		}
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		if(serialNumber != null){
			putBodyParameter("SerialNumber", serialNumber);
		}
	}

	public String getTerminalGroupId() {
		return this.terminalGroupId;
	}

	public void setTerminalGroupId(String terminalGroupId) {
		this.terminalGroupId = terminalGroupId;
		if(terminalGroupId != null){
			putBodyParameter("TerminalGroupId", terminalGroupId);
		}
	}

	public String getLocationInfo() {
		return this.locationInfo;
	}

	public void setLocationInfo(String locationInfo) {
		this.locationInfo = locationInfo;
		if(locationInfo != null){
			putBodyParameter("LocationInfo", locationInfo);
		}
	}

	public String getSearchKeyword() {
		return this.searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
		if(searchKeyword != null){
			putBodyParameter("SearchKeyword", searchKeyword);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListTerminalResponse> getResponseClass() {
		return ListTerminalResponse.class;
	}

}
