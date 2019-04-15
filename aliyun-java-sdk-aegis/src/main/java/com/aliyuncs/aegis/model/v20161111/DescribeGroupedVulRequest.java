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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupedVulRequest extends RpcAcsRequest<DescribeGroupedVulResponse> {
	
	public DescribeGroupedVulRequest() {
		super("aegis", "2016-11-11", "DescribeGroupedVul", "vipaegis");
	}

	private String statusList;

	private String level;

	private String orderBy;

	private String dealed;

	private Integer currentPage;

	private String type;

	private Long lastTsEnd;

	private Long createTsStart;

	private String aliasName;

	private Long patchId;

	private String sourceIp;

	private String name;

	private Integer pageSize;

	private String lang;

	private Long createTsEnd;

	private Long lastTsStart;

	private String necessity;

	private String uuids;

	private String direction;

	public String getStatusList() {
		return this.statusList;
	}

	public void setStatusList(String statusList) {
		this.statusList = statusList;
		if(statusList != null){
			putQueryParameter("StatusList", statusList);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
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

	public String getDealed() {
		return this.dealed;
	}

	public void setDealed(String dealed) {
		this.dealed = dealed;
		if(dealed != null){
			putQueryParameter("Dealed", dealed);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Long getLastTsEnd() {
		return this.lastTsEnd;
	}

	public void setLastTsEnd(Long lastTsEnd) {
		this.lastTsEnd = lastTsEnd;
		if(lastTsEnd != null){
			putQueryParameter("LastTsEnd", lastTsEnd.toString());
		}
	}

	public Long getCreateTsStart() {
		return this.createTsStart;
	}

	public void setCreateTsStart(Long createTsStart) {
		this.createTsStart = createTsStart;
		if(createTsStart != null){
			putQueryParameter("CreateTsStart", createTsStart.toString());
		}
	}

	public String getAliasName() {
		return this.aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
		if(aliasName != null){
			putQueryParameter("AliasName", aliasName);
		}
	}

	public Long getPatchId() {
		return this.patchId;
	}

	public void setPatchId(Long patchId) {
		this.patchId = patchId;
		if(patchId != null){
			putQueryParameter("PatchId", patchId.toString());
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Long getCreateTsEnd() {
		return this.createTsEnd;
	}

	public void setCreateTsEnd(Long createTsEnd) {
		this.createTsEnd = createTsEnd;
		if(createTsEnd != null){
			putQueryParameter("CreateTsEnd", createTsEnd.toString());
		}
	}

	public Long getLastTsStart() {
		return this.lastTsStart;
	}

	public void setLastTsStart(Long lastTsStart) {
		this.lastTsStart = lastTsStart;
		if(lastTsStart != null){
			putQueryParameter("LastTsStart", lastTsStart.toString());
		}
	}

	public String getNecessity() {
		return this.necessity;
	}

	public void setNecessity(String necessity) {
		this.necessity = necessity;
		if(necessity != null){
			putQueryParameter("Necessity", necessity);
		}
	}

	public String getUuids() {
		return this.uuids;
	}

	public void setUuids(String uuids) {
		this.uuids = uuids;
		if(uuids != null){
			putQueryParameter("Uuids", uuids);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	@Override
	public Class<DescribeGroupedVulResponse> getResponseClass() {
		return DescribeGroupedVulResponse.class;
	}

}
