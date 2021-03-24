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
public class DescribeVulListRequest extends RpcAcsRequest<DescribeVulListResponse> {
	   

	private String targetType;

	private Integer minScore;

	private String remark;

	private String attachTypes;

	private String type;

	private String vpcInstanceIds;

	private Long createTsStart;

	private String containerFieldName;

	private String containerFieldValue;

	private Integer pageSize;

	private Long modifyTsStart;

	private String lang;

	private Long modifyTsEnd;

	private String level;

	private String resource;

	private String groupId;

	private String dealed;

	private Integer currentPage;

	private String clusterId;

	private String batchName;

	private String aliasName;

	private Long createTsEnd;

	private String necessity;

	private String uuids;
	public DescribeVulListRequest() {
		super("Sas", "2018-12-03", "DescribeVulList", "sas");
		setMethod(MethodType.POST);
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public Integer getMinScore() {
		return this.minScore;
	}

	public void setMinScore(Integer minScore) {
		this.minScore = minScore;
		if(minScore != null){
			putQueryParameter("MinScore", minScore.toString());
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

	public String getAttachTypes() {
		return this.attachTypes;
	}

	public void setAttachTypes(String attachTypes) {
		this.attachTypes = attachTypes;
		if(attachTypes != null){
			putQueryParameter("AttachTypes", attachTypes);
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

	public String getVpcInstanceIds() {
		return this.vpcInstanceIds;
	}

	public void setVpcInstanceIds(String vpcInstanceIds) {
		this.vpcInstanceIds = vpcInstanceIds;
		if(vpcInstanceIds != null){
			putQueryParameter("VpcInstanceIds", vpcInstanceIds);
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

	public String getContainerFieldName() {
		return this.containerFieldName;
	}

	public void setContainerFieldName(String containerFieldName) {
		this.containerFieldName = containerFieldName;
		if(containerFieldName != null){
			putQueryParameter("ContainerFieldName", containerFieldName);
		}
	}

	public String getContainerFieldValue() {
		return this.containerFieldValue;
	}

	public void setContainerFieldValue(String containerFieldValue) {
		this.containerFieldValue = containerFieldValue;
		if(containerFieldValue != null){
			putQueryParameter("ContainerFieldValue", containerFieldValue);
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

	public Long getModifyTsStart() {
		return this.modifyTsStart;
	}

	public void setModifyTsStart(Long modifyTsStart) {
		this.modifyTsStart = modifyTsStart;
		if(modifyTsStart != null){
			putQueryParameter("ModifyTsStart", modifyTsStart.toString());
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

	public Long getModifyTsEnd() {
		return this.modifyTsEnd;
	}

	public void setModifyTsEnd(Long modifyTsEnd) {
		this.modifyTsEnd = modifyTsEnd;
		if(modifyTsEnd != null){
			putQueryParameter("ModifyTsEnd", modifyTsEnd.toString());
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

	public String getResource() {
		return this.resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
		if(resource != null){
			putQueryParameter("Resource", resource);
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getBatchName() {
		return this.batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
		if(batchName != null){
			putQueryParameter("BatchName", batchName);
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

	@Override
	public Class<DescribeVulListResponse> getResponseClass() {
		return DescribeVulListResponse.class;
	}

}
