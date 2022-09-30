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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListCardsRequest extends RpcAcsRequest<ListCardsResponse> {
	   

	private String ipAddress;

	private List<String> iccids;

	private String iccid;

	private String nextToken;

	private Boolean lock;

	private String msisdn;

	private String apn;

	private String netLinkId;

	private String wirelessCloudConnectorId;

	private Boolean online;

	private Long maxResults;

	private List<String> statuses;
	public ListCardsRequest() {
		super("CC5G", "2022-03-14", "ListCards", "fivegcc");
		setMethod(MethodType.GET);
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		if(ipAddress != null){
			putQueryParameter("IpAddress", ipAddress);
		}
	}

	public List<String> getIccids() {
		return this.iccids;
	}

	public void setIccids(List<String> iccids) {
		this.iccids = iccids;	
		if (iccids != null) {
			for (int depth1 = 0; depth1 < iccids.size(); depth1++) {
				putQueryParameter("Iccids." + (depth1 + 1) , iccids.get(depth1));
			}
		}	
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
		if(iccid != null){
			putQueryParameter("Iccid", iccid);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Boolean getLock() {
		return this.lock;
	}

	public void setLock(Boolean lock) {
		this.lock = lock;
		if(lock != null){
			putQueryParameter("Lock", lock.toString());
		}
	}

	public String getMsisdn() {
		return this.msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
		if(msisdn != null){
			putQueryParameter("Msisdn", msisdn);
		}
	}

	public String getApn() {
		return this.apn;
	}

	public void setApn(String apn) {
		this.apn = apn;
		if(apn != null){
			putQueryParameter("Apn", apn);
		}
	}

	public String getNetLinkId() {
		return this.netLinkId;
	}

	public void setNetLinkId(String netLinkId) {
		this.netLinkId = netLinkId;
		if(netLinkId != null){
			putQueryParameter("NetLinkId", netLinkId);
		}
	}

	public String getWirelessCloudConnectorId() {
		return this.wirelessCloudConnectorId;
	}

	public void setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
		this.wirelessCloudConnectorId = wirelessCloudConnectorId;
		if(wirelessCloudConnectorId != null){
			putQueryParameter("WirelessCloudConnectorId", wirelessCloudConnectorId);
		}
	}

	public Boolean getOnline() {
		return this.online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
		if(online != null){
			putQueryParameter("Online", online.toString());
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public List<String> getStatuses() {
		return this.statuses;
	}

	public void setStatuses(List<String> statuses) {
		this.statuses = statuses;	
		if (statuses != null) {
			for (int depth1 = 0; depth1 < statuses.size(); depth1++) {
				putQueryParameter("Statuses." + (depth1 + 1) , statuses.get(depth1));
			}
		}	
	}

	@Override
	public Class<ListCardsResponse> getResponseClass() {
		return ListCardsResponse.class;
	}

}
