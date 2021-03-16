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
public class QueryTicketActionRequest extends RpcAcsRequest<QueryTicketActionResponse> {
	   

	private String ticketId;

	private String actionCodeList;

	private Integer pageNo;

	private Integer pageSize;
	public QueryTicketActionRequest() {
		super("CCCXSpaceInner", "2019-12-27", "QueryTicketAction");
		setMethod(MethodType.POST);
	}

	public String getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null){
			putBodyParameter("TicketId", ticketId);
		}
	}

	public String getActionCodeList() {
		return this.actionCodeList;
	}

	public void setActionCodeList(String actionCodeList) {
		this.actionCodeList = actionCodeList;
		if(actionCodeList != null){
			putBodyParameter("ActionCodeList", actionCodeList);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putBodyParameter("PageNo", pageNo.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<QueryTicketActionResponse> getResponseClass() {
		return QueryTicketActionResponse.class;
	}

}
