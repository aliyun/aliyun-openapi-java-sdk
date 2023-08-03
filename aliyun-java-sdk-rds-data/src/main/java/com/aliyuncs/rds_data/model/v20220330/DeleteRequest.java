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

package com.aliyuncs.rds_data.model.v20220330;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteRequest extends RpcAcsRequest<DeleteResponse> {
	   

	private String transactionId;

	private String filter;

	private String database;

	private String resourceArn;

	private String table;

	private String secretArn;
	public DeleteRequest() {
		super("rds-data", "2022-03-30", "Delete");
		setMethod(MethodType.POST);
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
		if(transactionId != null){
			putBodyParameter("TransactionId", transactionId);
		}
	}

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
		if(filter != null){
			putBodyParameter("Filter", filter);
		}
	}

	public String getDatabase() {
		return this.database;
	}

	public void setDatabase(String database) {
		this.database = database;
		if(database != null){
			putBodyParameter("Database", database);
		}
	}

	public String getResourceArn() {
		return this.resourceArn;
	}

	public void setResourceArn(String resourceArn) {
		this.resourceArn = resourceArn;
		if(resourceArn != null){
			putBodyParameter("ResourceArn", resourceArn);
		}
	}

	public String getTable() {
		return this.table;
	}

	public void setTable(String table) {
		this.table = table;
		if(table != null){
			putBodyParameter("Table", table);
		}
	}

	public String getSecretArn() {
		return this.secretArn;
	}

	public void setSecretArn(String secretArn) {
		this.secretArn = secretArn;
		if(secretArn != null){
			putBodyParameter("SecretArn", secretArn);
		}
	}

	@Override
	public Class<DeleteResponse> getResponseClass() {
		return DeleteResponse.class;
	}

}
