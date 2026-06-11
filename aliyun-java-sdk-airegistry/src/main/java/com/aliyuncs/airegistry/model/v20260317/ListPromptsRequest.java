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

package com.aliyuncs.airegistry.model.v20260317;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListPromptsRequest extends RpcAcsRequest<ListPromptsResponse> {
	   

	private String promptKey;

	private String bizTags;

	private String namespaceId;

	private Integer pageNo;

	private String search;

	private Integer pageSize;
	public ListPromptsRequest() {
		super("AIRegistry", "2026-03-17", "ListPrompts");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPromptKey() {
		return this.promptKey;
	}

	public void setPromptKey(String promptKey) {
		this.promptKey = promptKey;
		if(promptKey != null){
			putQueryParameter("PromptKey", promptKey);
		}
	}

	public String getBizTags() {
		return this.bizTags;
	}

	public void setBizTags(String bizTags) {
		this.bizTags = bizTags;
		if(bizTags != null){
			putQueryParameter("BizTags", bizTags);
		}
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public String getSearch() {
		return this.search;
	}

	public void setSearch(String search) {
		this.search = search;
		if(search != null){
			putQueryParameter("Search", search);
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

	@Override
	public Class<ListPromptsResponse> getResponseClass() {
		return ListPromptsResponse.class;
	}

}
