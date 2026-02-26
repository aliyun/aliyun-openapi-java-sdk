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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetApprovalSchemaRequest extends RpcAcsRequest<GetApprovalSchemaResponse> {
	   

	private String schemaId;
	public GetApprovalSchemaRequest() {
		super("csas", "2023-01-20", "GetApprovalSchema");
		setMethod(MethodType.GET);
	}

	public String getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
		if(schemaId != null){
			putQueryParameter("SchemaId", schemaId);
		}
	}

	@Override
	public Class<GetApprovalSchemaResponse> getResponseClass() {
		return GetApprovalSchemaResponse.class;
	}

}
