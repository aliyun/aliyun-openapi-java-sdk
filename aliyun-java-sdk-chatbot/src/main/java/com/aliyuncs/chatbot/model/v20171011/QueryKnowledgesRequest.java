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

package com.aliyuncs.chatbot.model.v20171011;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryKnowledgesRequest extends RpcAcsRequest<QueryKnowledgesResponse> {
	
	public QueryKnowledgesRequest() {
		super("Chatbot", "2017-10-11", "QueryKnowledges", "beebot");
	}

	private Integer pageSize;

	private String coreWordName;

	private String knowledgeTitle;

	private Integer pageNumber;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getCoreWordName() {
		return this.coreWordName;
	}

	public void setCoreWordName(String coreWordName) {
		this.coreWordName = coreWordName;
		if(coreWordName != null){
			putQueryParameter("CoreWordName", coreWordName);
		}
	}

	public String getKnowledgeTitle() {
		return this.knowledgeTitle;
	}

	public void setKnowledgeTitle(String knowledgeTitle) {
		this.knowledgeTitle = knowledgeTitle;
		if(knowledgeTitle != null){
			putQueryParameter("KnowledgeTitle", knowledgeTitle);
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
	public Class<QueryKnowledgesResponse> getResponseClass() {
		return QueryKnowledgesResponse.class;
	}

}
