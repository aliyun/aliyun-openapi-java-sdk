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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListSharedReportsRequest extends RpcAcsRequest<ListSharedReportsResponse> {
	   

	private String treeType;

	private Integer pageSize;

	private String keyword;

	private String userId;
	public ListSharedReportsRequest() {
		super("quickbi-public", "2022-01-01", "ListSharedReports", "quickbi");
		setMethod(MethodType.POST);
	}

	public String getTreeType() {
		return this.treeType;
	}

	public void setTreeType(String treeType) {
		this.treeType = treeType;
		if(treeType != null){
			putQueryParameter("TreeType", treeType);
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<ListSharedReportsResponse> getResponseClass() {
		return ListSharedReportsResponse.class;
	}

}
