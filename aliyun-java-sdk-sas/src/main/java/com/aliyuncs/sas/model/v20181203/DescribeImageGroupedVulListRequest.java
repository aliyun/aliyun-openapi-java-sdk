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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageGroupedVulListRequest extends RpcAcsRequest<DescribeImageGroupedVulListResponse> {
	   

	private String type;

	private Long lastTsEnd;

	private Long createTsStart;

	private String imageTag;

	private String level;

	private String groupId;

	private String orderBy;

	private String aliasName;

	private Long patchId;

	private String name;

	private Long createTsEnd;

	private String necessity;

	private String uuids;

	private String repoId;

	private String statusList;

	private String cveId;

	private String remark;

	private String repoNamespace;

	private String imageDigest;

	private Integer pageSize;

	private String lang;

	private Long lastTsStart;

	private String direction;

	private String dealed;

	private Integer currentPage;

	private String searchTags;

	private String repoName;

	private String repoInstanceId;

	private String imageLayer;

	private String repoRegionId;
	public DescribeImageGroupedVulListRequest() {
		super("Sas", "2018-12-03", "DescribeImageGroupedVulList", "sas");
		setMethod(MethodType.POST);
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

	public String getImageTag() {
		return this.imageTag;
	}

	public void setImageTag(String imageTag) {
		this.imageTag = imageTag;
		if(imageTag != null){
			putQueryParameter("ImageTag", imageTag);
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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public String getRepoId() {
		return this.repoId;
	}

	public void setRepoId(String repoId) {
		this.repoId = repoId;
		if(repoId != null){
			putQueryParameter("RepoId", repoId);
		}
	}

	public String getStatusList() {
		return this.statusList;
	}

	public void setStatusList(String statusList) {
		this.statusList = statusList;
		if(statusList != null){
			putQueryParameter("StatusList", statusList);
		}
	}

	public String getCveId() {
		return this.cveId;
	}

	public void setCveId(String cveId) {
		this.cveId = cveId;
		if(cveId != null){
			putQueryParameter("CveId", cveId);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getRepoNamespace() {
		return this.repoNamespace;
	}

	public void setRepoNamespace(String repoNamespace) {
		this.repoNamespace = repoNamespace;
		if(repoNamespace != null){
			putQueryParameter("RepoNamespace", repoNamespace);
		}
	}

	public String getImageDigest() {
		return this.imageDigest;
	}

	public void setImageDigest(String imageDigest) {
		this.imageDigest = imageDigest;
		if(imageDigest != null){
			putQueryParameter("ImageDigest", imageDigest);
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

	public Long getLastTsStart() {
		return this.lastTsStart;
	}

	public void setLastTsStart(Long lastTsStart) {
		this.lastTsStart = lastTsStart;
		if(lastTsStart != null){
			putQueryParameter("LastTsStart", lastTsStart.toString());
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

	public String getSearchTags() {
		return this.searchTags;
	}

	public void setSearchTags(String searchTags) {
		this.searchTags = searchTags;
		if(searchTags != null){
			putQueryParameter("SearchTags", searchTags);
		}
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		if(repoName != null){
			putQueryParameter("RepoName", repoName);
		}
	}

	public String getRepoInstanceId() {
		return this.repoInstanceId;
	}

	public void setRepoInstanceId(String repoInstanceId) {
		this.repoInstanceId = repoInstanceId;
		if(repoInstanceId != null){
			putQueryParameter("RepoInstanceId", repoInstanceId);
		}
	}

	public String getImageLayer() {
		return this.imageLayer;
	}

	public void setImageLayer(String imageLayer) {
		this.imageLayer = imageLayer;
		if(imageLayer != null){
			putQueryParameter("ImageLayer", imageLayer);
		}
	}

	public String getRepoRegionId() {
		return this.repoRegionId;
	}

	public void setRepoRegionId(String repoRegionId) {
		this.repoRegionId = repoRegionId;
		if(repoRegionId != null){
			putQueryParameter("RepoRegionId", repoRegionId);
		}
	}

	@Override
	public Class<DescribeImageGroupedVulListResponse> getResponseClass() {
		return DescribeImageGroupedVulListResponse.class;
	}

}
