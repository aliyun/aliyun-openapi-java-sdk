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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListIpsecServerLogsRequest extends RpcAcsRequest<ListIpsecServerLogsResponse> {
	   

	private Integer pageNumber;

	private Integer minutePeriod;

	private Integer pageSize;

	private Integer from;

	private Integer to;

	private String ipsecServerId;
	public ListIpsecServerLogsRequest() {
		super("Vpc", "2016-04-28", "ListIpsecServerLogs", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getMinutePeriod() {
		return this.minutePeriod;
	}

	public void setMinutePeriod(Integer minutePeriod) {
		this.minutePeriod = minutePeriod;
		if(minutePeriod != null){
			putQueryParameter("MinutePeriod", minutePeriod.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getFrom() {
		return this.from;
	}

	public void setFrom(Integer from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from.toString());
		}
	}

	public Integer getTo() {
		return this.to;
	}

	public void setTo(Integer to) {
		this.to = to;
		if(to != null){
			putQueryParameter("To", to.toString());
		}
	}

	public String getIpsecServerId() {
		return this.ipsecServerId;
	}

	public void setIpsecServerId(String ipsecServerId) {
		this.ipsecServerId = ipsecServerId;
		if(ipsecServerId != null){
			putQueryParameter("IpsecServerId", ipsecServerId);
		}
	}

	@Override
	public Class<ListIpsecServerLogsResponse> getResponseClass() {
		return ListIpsecServerLogsResponse.class;
	}

}
