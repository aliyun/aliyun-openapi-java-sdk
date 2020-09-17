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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeLinklogConfigRequest extends RpcAcsRequest<AddLinkeLinklogConfigResponse> {
	   

	private Long beginMills;

	private String sorter;

	private Long endMills;

	private Long gmtModified;

	private Long configValNum;

	private Long pageSize;

	private Long end;

	private Long id;

	private String configValStr;

	private String configType;

	private Long currentPage;

	private Long gmtCreate;

	private Long begin;
	public AddLinkeLinklogConfigRequest() {
		super("SOFA", "2019-08-15", "AddLinkeLinklogConfig", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getBeginMills() {
		return this.beginMills;
	}

	public void setBeginMills(Long beginMills) {
		this.beginMills = beginMills;
		if(beginMills != null){
			putBodyParameter("BeginMills", beginMills.toString());
		}
	}

	public String getSorter() {
		return this.sorter;
	}

	public void setSorter(String sorter) {
		this.sorter = sorter;
		if(sorter != null){
			putBodyParameter("Sorter", sorter);
		}
	}

	public Long getEndMills() {
		return this.endMills;
	}

	public void setEndMills(Long endMills) {
		this.endMills = endMills;
		if(endMills != null){
			putBodyParameter("EndMills", endMills.toString());
		}
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
		if(gmtModified != null){
			putBodyParameter("GmtModified", gmtModified.toString());
		}
	}

	public Long getConfigValNum() {
		return this.configValNum;
	}

	public void setConfigValNum(Long configValNum) {
		this.configValNum = configValNum;
		if(configValNum != null){
			putBodyParameter("ConfigValNum", configValNum.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putBodyParameter("End", end.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getConfigValStr() {
		return this.configValStr;
	}

	public void setConfigValStr(String configValStr) {
		this.configValStr = configValStr;
		if(configValStr != null){
			putBodyParameter("ConfigValStr", configValStr);
		}
	}

	public String getConfigType() {
		return this.configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
		if(configType != null){
			putBodyParameter("ConfigType", configType);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(Long gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putBodyParameter("GmtCreate", gmtCreate.toString());
		}
	}

	public Long getBegin() {
		return this.begin;
	}

	public void setBegin(Long begin) {
		this.begin = begin;
		if(begin != null){
			putBodyParameter("Begin", begin.toString());
		}
	}

	@Override
	public Class<AddLinkeLinklogConfigResponse> getResponseClass() {
		return AddLinkeLinklogConfigResponse.class;
	}

}
