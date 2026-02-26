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

package com.aliyuncs.qualitycheck.model.v20190115;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetRulesCountListRequest extends RpcAcsRequest<GetRulesCountListResponse> {
	   

	private String createEmpid;

	private Long updateUserId;

	private String updateStartTime;

	private String startTime;

	private Long rid;

	private Integer type;

	private Integer pageNumber;

	private String ruleIdOrRuleName;

	private Integer pageSize;

	private Long createUserId;

	private Integer ruleScoreSingleType;

	private Integer sourceType;

	private String updateEndTime;

	private Integer ruleType;

	private Boolean countTotal;

	private String endTime;

	private Long schemeId;

	private Integer currentPage;

	private Integer businessRange;

	private String businessName;

	private String categoryName;

	private String lastUpdateEmpid;

	private Long baseMeAgentId;

	private String typeName;

	private List<String> requireInfoss;

	private Integer status;
	public GetRulesCountListRequest() {
		super("Qualitycheck", "2019-01-15", "GetRulesCountList");
		setMethod(MethodType.POST);
	}

	public String getCreateEmpid() {
		return this.createEmpid;
	}

	public void setCreateEmpid(String createEmpid) {
		this.createEmpid = createEmpid;
		if(createEmpid != null){
			putBodyParameter("CreateEmpid", createEmpid);
		}
	}

	public Long getUpdateUserId() {
		return this.updateUserId;
	}

	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
		if(updateUserId != null){
			putBodyParameter("UpdateUserId", updateUserId.toString());
		}
	}

	public String getUpdateStartTime() {
		return this.updateStartTime;
	}

	public void setUpdateStartTime(String updateStartTime) {
		this.updateStartTime = updateStartTime;
		if(updateStartTime != null){
			putBodyParameter("UpdateStartTime", updateStartTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime);
		}
	}

	public Long getRid() {
		return this.rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
		if(rid != null){
			putBodyParameter("Rid", rid.toString());
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getRuleIdOrRuleName() {
		return this.ruleIdOrRuleName;
	}

	public void setRuleIdOrRuleName(String ruleIdOrRuleName) {
		this.ruleIdOrRuleName = ruleIdOrRuleName;
		if(ruleIdOrRuleName != null){
			putBodyParameter("RuleIdOrRuleName", ruleIdOrRuleName);
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

	public Long getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
		if(createUserId != null){
			putBodyParameter("CreateUserId", createUserId.toString());
		}
	}

	public Integer getRuleScoreSingleType() {
		return this.ruleScoreSingleType;
	}

	public void setRuleScoreSingleType(Integer ruleScoreSingleType) {
		this.ruleScoreSingleType = ruleScoreSingleType;
		if(ruleScoreSingleType != null){
			putBodyParameter("RuleScoreSingleType", ruleScoreSingleType.toString());
		}
	}

	public Integer getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putBodyParameter("SourceType", sourceType.toString());
		}
	}

	public String getUpdateEndTime() {
		return this.updateEndTime;
	}

	public void setUpdateEndTime(String updateEndTime) {
		this.updateEndTime = updateEndTime;
		if(updateEndTime != null){
			putBodyParameter("UpdateEndTime", updateEndTime);
		}
	}

	public Integer getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(Integer ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putBodyParameter("RuleType", ruleType.toString());
		}
	}

	public Boolean getCountTotal() {
		return this.countTotal;
	}

	public void setCountTotal(Boolean countTotal) {
		this.countTotal = countTotal;
		if(countTotal != null){
			putBodyParameter("CountTotal", countTotal.toString());
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime);
		}
	}

	public Long getSchemeId() {
		return this.schemeId;
	}

	public void setSchemeId(Long schemeId) {
		this.schemeId = schemeId;
		if(schemeId != null){
			putBodyParameter("SchemeId", schemeId.toString());
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public Integer getBusinessRange() {
		return this.businessRange;
	}

	public void setBusinessRange(Integer businessRange) {
		this.businessRange = businessRange;
		if(businessRange != null){
			putBodyParameter("BusinessRange", businessRange.toString());
		}
	}

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
		if(businessName != null){
			putBodyParameter("BusinessName", businessName);
		}
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
		if(categoryName != null){
			putBodyParameter("CategoryName", categoryName);
		}
	}

	public String getLastUpdateEmpid() {
		return this.lastUpdateEmpid;
	}

	public void setLastUpdateEmpid(String lastUpdateEmpid) {
		this.lastUpdateEmpid = lastUpdateEmpid;
		if(lastUpdateEmpid != null){
			putBodyParameter("LastUpdateEmpid", lastUpdateEmpid);
		}
	}

	public Long getBaseMeAgentId() {
		return this.baseMeAgentId;
	}

	public void setBaseMeAgentId(Long baseMeAgentId) {
		this.baseMeAgentId = baseMeAgentId;
		if(baseMeAgentId != null){
			putQueryParameter("BaseMeAgentId", baseMeAgentId.toString());
		}
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
		if(typeName != null){
			putBodyParameter("TypeName", typeName);
		}
	}

	public List<String> getRequireInfoss() {
		return this.requireInfoss;
	}

	public void setRequireInfoss(List<String> requireInfoss) {
		this.requireInfoss = requireInfoss;	
		if (requireInfoss != null) {
			for (int i = 0; i < requireInfoss.size(); i++) {
				putBodyParameter("RequireInfos." + (i + 1) , requireInfoss.get(i));
			}
		}	
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<GetRulesCountListResponse> getResponseClass() {
		return GetRulesCountListResponse.class;
	}

}
