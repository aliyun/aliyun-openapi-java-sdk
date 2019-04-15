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
public class CreateLogQueryRequest extends RpcAcsRequest<CreateLogQueryResponse> {
	
	public CreateLogQueryRequest() {
		super("aegis", "2016-11-11", "CreateLogQuery", "vipaegis");
	}

	private String sourceIp;

	private String queryName;

	private String conditions;

	private String queryDetail;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getQueryName() {
		return this.queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
		if(queryName != null){
			putQueryParameter("QueryName", queryName);
		}
	}

	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
		if(conditions != null){
			putQueryParameter("Conditions", conditions);
		}
	}

	public String getQueryDetail() {
		return this.queryDetail;
	}

	public void setQueryDetail(String queryDetail) {
		this.queryDetail = queryDetail;
		if(queryDetail != null){
			putQueryParameter("QueryDetail", queryDetail);
		}
	}

	@Override
	public Class<CreateLogQueryResponse> getResponseClass() {
		return CreateLogQueryResponse.class;
	}

}
