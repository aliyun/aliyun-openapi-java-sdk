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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListFaceGroupsRequest extends RpcAcsRequest<ListFaceGroupsResponse> {
	   

	private String project;

	private String remarksBQuery;

	private String externalId;

	private Integer limit;

	private String remarksArrayBQuery;

	private String order;

	private String remarksAQuery;

	private String orderBy;

	private String remarksDQuery;

	private String remarksArrayAQuery;

	private String marker;

	private String setId;

	private String remarksCQuery;
	public ListFaceGroupsRequest() {
		super("imm", "2017-09-06", "ListFaceGroups");
		setMethod(MethodType.POST);
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getRemarksBQuery() {
		return this.remarksBQuery;
	}

	public void setRemarksBQuery(String remarksBQuery) {
		this.remarksBQuery = remarksBQuery;
		if(remarksBQuery != null){
			putQueryParameter("RemarksBQuery", remarksBQuery);
		}
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
		if(externalId != null){
			putQueryParameter("ExternalId", externalId);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public String getRemarksArrayBQuery() {
		return this.remarksArrayBQuery;
	}

	public void setRemarksArrayBQuery(String remarksArrayBQuery) {
		this.remarksArrayBQuery = remarksArrayBQuery;
		if(remarksArrayBQuery != null){
			putQueryParameter("RemarksArrayBQuery", remarksArrayBQuery);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public String getRemarksAQuery() {
		return this.remarksAQuery;
	}

	public void setRemarksAQuery(String remarksAQuery) {
		this.remarksAQuery = remarksAQuery;
		if(remarksAQuery != null){
			putQueryParameter("RemarksAQuery", remarksAQuery);
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

	public String getRemarksDQuery() {
		return this.remarksDQuery;
	}

	public void setRemarksDQuery(String remarksDQuery) {
		this.remarksDQuery = remarksDQuery;
		if(remarksDQuery != null){
			putQueryParameter("RemarksDQuery", remarksDQuery);
		}
	}

	public String getRemarksArrayAQuery() {
		return this.remarksArrayAQuery;
	}

	public void setRemarksArrayAQuery(String remarksArrayAQuery) {
		this.remarksArrayAQuery = remarksArrayAQuery;
		if(remarksArrayAQuery != null){
			putQueryParameter("RemarksArrayAQuery", remarksArrayAQuery);
		}
	}

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
		if(marker != null){
			putQueryParameter("Marker", marker);
		}
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
		if(setId != null){
			putQueryParameter("SetId", setId);
		}
	}

	public String getRemarksCQuery() {
		return this.remarksCQuery;
	}

	public void setRemarksCQuery(String remarksCQuery) {
		this.remarksCQuery = remarksCQuery;
		if(remarksCQuery != null){
			putQueryParameter("RemarksCQuery", remarksCQuery);
		}
	}

	@Override
	public Class<ListFaceGroupsResponse> getResponseClass() {
		return ListFaceGroupsResponse.class;
	}

}
