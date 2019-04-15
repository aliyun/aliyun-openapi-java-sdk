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
public class DescribeJoinRuleListRequest extends RpcAcsRequest<DescribeJoinRuleListResponse> {
	
	public DescribeJoinRuleListRequest() {
		super("aegis", "2016-11-11", "DescribeJoinRuleList", "vipaegis");
	}

	private String warnLevel;

	private Integer pageSize;

	private Long remark;

	private Integer currentPage;

	public String getWarnLevel() {
		return this.warnLevel;
	}

	public void setWarnLevel(String warnLevel) {
		this.warnLevel = warnLevel;
		if(warnLevel != null){
			putQueryParameter("WarnLevel", warnLevel);
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

	public Long getRemark() {
		return this.remark;
	}

	public void setRemark(Long remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("remark", remark.toString());
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

	@Override
	public Class<DescribeJoinRuleListResponse> getResponseClass() {
		return DescribeJoinRuleListResponse.class;
	}

}
