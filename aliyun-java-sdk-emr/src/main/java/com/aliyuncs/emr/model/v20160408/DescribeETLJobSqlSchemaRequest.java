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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeETLJobSqlSchemaRequest extends RpcAcsRequest<DescribeETLJobSqlSchemaResponse> {
	
	public DescribeETLJobSqlSchemaRequest() {
		super("Emr", "2016-04-08", "DescribeETLJobSqlSchema");
	}

	private Long resourceOwnerId;

	private String resolveId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResolveId() {
		return this.resolveId;
	}

	public void setResolveId(String resolveId) {
		this.resolveId = resolveId;
		if(resolveId != null){
			putQueryParameter("ResolveId", resolveId);
		}
	}

	@Override
	public Class<DescribeETLJobSqlSchemaResponse> getResponseClass() {
		return DescribeETLJobSqlSchemaResponse.class;
	}

}
