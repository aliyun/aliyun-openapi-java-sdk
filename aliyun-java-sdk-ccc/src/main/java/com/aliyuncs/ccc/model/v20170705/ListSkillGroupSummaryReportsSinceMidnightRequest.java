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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListSkillGroupSummaryReportsSinceMidnightRequest extends RpcAcsRequest<ListSkillGroupSummaryReportsSinceMidnightResponse> {
	
	public ListSkillGroupSummaryReportsSinceMidnightRequest() {
		super("CCC", "2017-07-05", "ListSkillGroupSummaryReportsSinceMidnight");
	}

	private String instanceId;

	private String skillGroups;

	private Integer pageSize;

	private Integer pageNumber;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSkillGroups() {
		return this.skillGroups;
	}

	public void setSkillGroups(String skillGroups) {
		this.skillGroups = skillGroups;
		if(skillGroups != null){
			putQueryParameter("SkillGroups", skillGroups);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<ListSkillGroupSummaryReportsSinceMidnightResponse> getResponseClass() {
		return ListSkillGroupSummaryReportsSinceMidnightResponse.class;
	}

}
