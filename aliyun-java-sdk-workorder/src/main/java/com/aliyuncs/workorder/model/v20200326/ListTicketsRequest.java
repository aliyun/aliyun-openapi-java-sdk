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

package com.aliyuncs.workorder.model.v20200326;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.workorder.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTicketsRequest extends RpcAcsRequest<ListTicketsResponse> {
	   

	private String productCode;

	private String language;

	private String subUserId;

	private Long createdBeforeTime;

	private Integer pageSize;

	private String ids;

	private String ticketStatus;

	private Integer pageStart;

	private Long createdAfterTime;
	public ListTicketsRequest() {
		super("Workorder", "2020-03-26", "ListTickets", "workorder");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getSubUserId() {
		return this.subUserId;
	}

	public void setSubUserId(String subUserId) {
		this.subUserId = subUserId;
		if(subUserId != null){
			putQueryParameter("SubUserId", subUserId);
		}
	}

	public Long getCreatedBeforeTime() {
		return this.createdBeforeTime;
	}

	public void setCreatedBeforeTime(Long createdBeforeTime) {
		this.createdBeforeTime = createdBeforeTime;
		if(createdBeforeTime != null){
			putQueryParameter("CreatedBeforeTime", createdBeforeTime.toString());
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

	public String getIds() {
		return this.ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
		if(ids != null){
			putQueryParameter("Ids", ids);
		}
	}

	public String getTicketStatus() {
		return this.ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
		if(ticketStatus != null){
			putQueryParameter("TicketStatus", ticketStatus);
		}
	}

	public Integer getPageStart() {
		return this.pageStart;
	}

	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
		if(pageStart != null){
			putQueryParameter("PageStart", pageStart.toString());
		}
	}

	public Long getCreatedAfterTime() {
		return this.createdAfterTime;
	}

	public void setCreatedAfterTime(Long createdAfterTime) {
		this.createdAfterTime = createdAfterTime;
		if(createdAfterTime != null){
			putQueryParameter("CreatedAfterTime", createdAfterTime.toString());
		}
	}

	@Override
	public Class<ListTicketsResponse> getResponseClass() {
		return ListTicketsResponse.class;
	}

}
