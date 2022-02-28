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

package com.aliyuncs.qktest.model.v20210908;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListTestBooksRequest extends RpcAcsRequest<ListTestBooksResponse> {
	   

	private String filter;

	private String nextToken;

	private List<String> testBookIdss;

	private Integer maxResults;
	public ListTestBooksRequest() {
		super("QKTest", "2021-09-08", "ListTestBooks");
		setMethod(MethodType.GET);
	}

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
		if(filter != null){
			putQueryParameter("Filter", filter);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<String> getTestBookIdss() {
		return this.testBookIdss;
	}

	public void setTestBookIdss(List<String> testBookIdss) {
		this.testBookIdss = testBookIdss;	
		if (testBookIdss != null) {
			for (int i = 0; i < testBookIdss.size(); i++) {
				putQueryParameter("TestBookIds." + (i + 1) , testBookIdss.get(i));
			}
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListTestBooksResponse> getResponseClass() {
		return ListTestBooksResponse.class;
	}

}
