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

package com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetMetaTableRequest extends RpcAcsRequest<GetMetaTableResponse> {
	
	public GetMetaTableRequest() {
		super("dataworks-enterprise-ultimate", "2019-04-24", "GetMetaTable");
	}

	private String tableGuid;

	public String getTableGuid() {
		return this.tableGuid;
	}

	public void setTableGuid(String tableGuid) {
		this.tableGuid = tableGuid;
		if(tableGuid != null){
			putQueryParameter("TableGuid", tableGuid);
		}
	}

	@Override
	public Class<GetMetaTableResponse> getResponseClass() {
		return GetMetaTableResponse.class;
	}

}
