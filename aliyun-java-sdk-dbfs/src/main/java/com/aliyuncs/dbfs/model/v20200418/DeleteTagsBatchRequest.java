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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteTagsBatchRequest extends RpcAcsRequest<DeleteTagsBatchResponse> {
	   

	private String dbfsList;

	private String tags;
	public DeleteTagsBatchRequest() {
		super("DBFS", "2020-04-18", "DeleteTagsBatch");
		setMethod(MethodType.POST);
	}

	public String getDbfsList() {
		return this.dbfsList;
	}

	public void setDbfsList(String dbfsList) {
		this.dbfsList = dbfsList;
		if(dbfsList != null){
			putQueryParameter("DbfsList", dbfsList);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	@Override
	public Class<DeleteTagsBatchResponse> getResponseClass() {
		return DeleteTagsBatchResponse.class;
	}

}
