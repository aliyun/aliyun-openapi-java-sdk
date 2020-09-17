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
public class UpdateLinkeLinklogStoreRequest extends RpcAcsRequest<UpdateLinkeLinklogStoreResponse> {
	   

	private Long beginMills;

	private String sorter;

	private Long endMills;

	private String envPattern;

	private Long gmtModified;

	private Long pageSize;

	private Long end;

	private Long id;

	private String stepPattern;

	private Long currentPage;

	private Long gmtCreate;

	private String ownerId;

	private String name;

	private Long begin;
	public UpdateLinkeLinklogStoreRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinklogStore", "sofacafedeps");
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

	public String getEnvPattern() {
		return this.envPattern;
	}

	public void setEnvPattern(String envPattern) {
		this.envPattern = envPattern;
		if(envPattern != null){
			putBodyParameter("EnvPattern", envPattern);
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

	public String getStepPattern() {
		return this.stepPattern;
	}

	public void setStepPattern(String stepPattern) {
		this.stepPattern = stepPattern;
		if(stepPattern != null){
			putBodyParameter("StepPattern", stepPattern);
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

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putBodyParameter("OwnerId", ownerId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
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
	public Class<UpdateLinkeLinklogStoreResponse> getResponseClass() {
		return UpdateLinkeLinklogStoreResponse.class;
	}

}
