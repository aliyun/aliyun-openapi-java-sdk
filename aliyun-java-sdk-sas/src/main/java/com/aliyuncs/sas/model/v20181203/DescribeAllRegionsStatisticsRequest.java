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
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAllRegionsStatisticsRequest extends RpcAcsRequest<DescribeAllRegionsStatisticsResponse> {
	   

	private String statusList;

	private Boolean allRegion;

	private String remark;

	private String startTime;

	private String type;

	private String uuid;

	private String sourceIp;

	private Long webGroupId;

	private Integer pageSize;

	private String from;

	private String tag;

	private Integer flow;

	private String saleId;

	private Integer ruleType;

	private Long groupId;

	private String endTime;

	private String dealed;

	private Integer currentPage;

	private String secureToken;

	private Integer action1;

	private Integer status;
	public DescribeAllRegionsStatisticsRequest() {
		super("Sas", "2018-12-03", "DescribeAllRegionsStatistics", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Boolean getAllRegion() {
		return this.allRegion;
	}

	public void setAllRegion(Boolean allRegion) {
		this.allRegion = allRegion;
		if(allRegion != null){
			putQueryParameter("AllRegion", allRegion.toString());
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
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

	public Long getWebGroupId() {
		return this.webGroupId;
	}

	public void setWebGroupId(Long webGroupId) {
		this.webGroupId = webGroupId;
		if(webGroupId != null){
			putQueryParameter("WebGroupId", webGroupId.toString());
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

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putQueryParameter("From", from);
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	public Integer getFlow() {
		return this.flow;
	}

	public void setFlow(Integer flow) {
		this.flow = flow;
		if(flow != null){
			putQueryParameter("Flow", flow.toString());
		}
	}

	public String getSaleId() {
		return this.saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
		if(saleId != null){
			putQueryParameter("SaleId", saleId);
		}
	}

	public Integer getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(Integer ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType.toString());
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
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

	public String getSecureToken() {
		return this.secureToken;
	}

	public void setSecureToken(String secureToken) {
		this.secureToken = secureToken;
		if(secureToken != null){
			putQueryParameter("SecureToken", secureToken);
		}
	}

	public Integer getAction1() {
		return this.action1;
	}

	public void setAction1(Integer action1) {
		this.action1 = action1;
		if(action1 != null){
			putQueryParameter("Action1", action1.toString());
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<DescribeAllRegionsStatisticsResponse> getResponseClass() {
		return DescribeAllRegionsStatisticsResponse.class;
	}

}
