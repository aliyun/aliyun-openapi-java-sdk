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
public class QueryLinkeBahamutIterationadvancedsearchRequest extends RpcAcsRequest<QueryLinkeBahamutIterationadvancedsearchResponse> {
	   

	private Long releaseStartDate;

	private String release;

	private Boolean withDeleted;

	private String externalId;

	private String project;

	private Long current;

	private String member;

	private Long pageSize;

	private String tenantId;

	private String keyword;

	private String order;

	private String tenantPath;

	private String creator;

	private Long releaseEndDate;

	private String mostPreUnitFabricStageName;

	private Boolean finished;

	private String field;

	private String name;

	private Long page;
	public QueryLinkeBahamutIterationadvancedsearchRequest() {
		super("SOFA", "2019-08-15", "QueryLinkeBahamutIterationadvancedsearch", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getReleaseStartDate() {
		return this.releaseStartDate;
	}

	public void setReleaseStartDate(Long releaseStartDate) {
		this.releaseStartDate = releaseStartDate;
		if(releaseStartDate != null){
			putBodyParameter("ReleaseStartDate", releaseStartDate.toString());
		}
	}

	public String getRelease() {
		return this.release;
	}

	public void setRelease(String release) {
		this.release = release;
		if(release != null){
			putBodyParameter("Release", release);
		}
	}

	public Boolean getWithDeleted() {
		return this.withDeleted;
	}

	public void setWithDeleted(Boolean withDeleted) {
		this.withDeleted = withDeleted;
		if(withDeleted != null){
			putBodyParameter("WithDeleted", withDeleted.toString());
		}
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
		if(externalId != null){
			putBodyParameter("ExternalId", externalId);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putBodyParameter("Project", project);
		}
	}

	public Long getCurrent() {
		return this.current;
	}

	public void setCurrent(Long current) {
		this.current = current;
		if(current != null){
			putBodyParameter("Current", current.toString());
		}
	}

	public String getMember() {
		return this.member;
	}

	public void setMember(String member) {
		this.member = member;
		if(member != null){
			putBodyParameter("Member", member);
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

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putBodyParameter("Order", order);
		}
	}

	public String getTenantPath() {
		return this.tenantPath;
	}

	public void setTenantPath(String tenantPath) {
		this.tenantPath = tenantPath;
		if(tenantPath != null){
			putBodyParameter("TenantPath", tenantPath);
		}
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		if(creator != null){
			putBodyParameter("Creator", creator);
		}
	}

	public Long getReleaseEndDate() {
		return this.releaseEndDate;
	}

	public void setReleaseEndDate(Long releaseEndDate) {
		this.releaseEndDate = releaseEndDate;
		if(releaseEndDate != null){
			putBodyParameter("ReleaseEndDate", releaseEndDate.toString());
		}
	}

	public String getMostPreUnitFabricStageName() {
		return this.mostPreUnitFabricStageName;
	}

	public void setMostPreUnitFabricStageName(String mostPreUnitFabricStageName) {
		this.mostPreUnitFabricStageName = mostPreUnitFabricStageName;
		if(mostPreUnitFabricStageName != null){
			putBodyParameter("MostPreUnitFabricStageName", mostPreUnitFabricStageName);
		}
	}

	public Boolean getFinished() {
		return this.finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
		if(finished != null){
			putBodyParameter("Finished", finished.toString());
		}
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
		if(field != null){
			putBodyParameter("Field", field);
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

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page.toString());
		}
	}

	@Override
	public Class<QueryLinkeBahamutIterationadvancedsearchResponse> getResponseClass() {
		return QueryLinkeBahamutIterationadvancedsearchResponse.class;
	}

}
