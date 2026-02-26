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

package com.aliyuncs.dfs.model.v20180620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListUserGroupsMappingsRequest extends RpcAcsRequest<ListUserGroupsMappingsResponse> {
	   

	private String nextToken;

	private String inputRegionId;

	private Integer limit;

	private String filesystemId;
	public ListUserGroupsMappingsRequest() {
		super("DFS", "2018-06-20", "ListUserGroupsMappings", "alidfs");
		setMethod(MethodType.POST);
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

	public String getInputRegionId() {
		return this.inputRegionId;
	}

	public void setInputRegionId(String inputRegionId) {
		this.inputRegionId = inputRegionId;
		if(inputRegionId != null){
			putQueryParameter("InputRegionId", inputRegionId);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public String getFilesystemId() {
		return this.filesystemId;
	}

	public void setFilesystemId(String filesystemId) {
		this.filesystemId = filesystemId;
		if(filesystemId != null){
			putQueryParameter("FilesystemId", filesystemId);
		}
	}

	@Override
	public Class<ListUserGroupsMappingsResponse> getResponseClass() {
		return ListUserGroupsMappingsResponse.class;
	}

}
