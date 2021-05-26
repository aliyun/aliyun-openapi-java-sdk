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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PageQueryTicketRequest extends RpcAcsRequest<PageQueryTicketResponse> {
	   

	private Long buId;

	private Long endDate;

	private Integer pageNo;

	private Integer pageSize;

	private Integer ticketStatus;

	private Integer ticketType;

	private Long startDate;

	private Long ticketId;

	private Long memberId;
	public PageQueryTicketRequest() {
		super("CCCXSpaceInner", "2019-12-27", "PageQueryTicket");
		setMethod(MethodType.GET);
	}

	public Long getBuId() {
		return this.buId;
	}

	public void setBuId(Long buId) {
		this.buId = buId;
		if(buId != null){
			putQueryParameter("BuId", buId.toString());
		}
	}

	public Long getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate.toString());
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
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

	public Integer getTicketStatus() {
		return this.ticketStatus;
	}

	public void setTicketStatus(Integer ticketStatus) {
		this.ticketStatus = ticketStatus;
		if(ticketStatus != null){
			putQueryParameter("TicketStatus", ticketStatus.toString());
		}
	}

	public Integer getTicketType() {
		return this.ticketType;
	}

	public void setTicketType(Integer ticketType) {
		this.ticketType = ticketType;
		if(ticketType != null){
			putQueryParameter("TicketType", ticketType.toString());
		}
	}

	public Long getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate.toString());
		}
	}

	public Long getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null){
			putQueryParameter("TicketId", ticketId.toString());
		}
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
		if(memberId != null){
			putQueryParameter("MemberId", memberId.toString());
		}
	}

	@Override
	public Class<PageQueryTicketResponse> getResponseClass() {
		return PageQueryTicketResponse.class;
	}

}
