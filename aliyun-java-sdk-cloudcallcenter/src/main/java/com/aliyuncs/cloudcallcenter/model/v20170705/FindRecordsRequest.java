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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class FindRecordsRequest extends RpcAcsRequest<FindRecordsResponse> {
	
	public FindRecordsRequest() {
		super("CloudCallCenter", "2017-07-05", "FindRecords", "CloudCallCenter", "innerAPI");
	}

	private String instance;

	private String query;

	public String getInstance() {
		return this.instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
		if(instance != null){
			putQueryParameter("Instance", instance);
		}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putQueryParameter("Query", query);
		}
	}

	@Override
	public Class<FindRecordsResponse> getResponseClass() {
		return FindRecordsResponse.class;
	}

}
