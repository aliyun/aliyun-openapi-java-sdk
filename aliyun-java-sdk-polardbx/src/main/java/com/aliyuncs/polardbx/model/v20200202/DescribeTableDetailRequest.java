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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeTableDetailRequest extends RpcAcsRequest<DescribeTableDetailResponse> {
	   

	private String dBInstanceName;

	private String dbName;

	private String tableName;
	public DescribeTableDetailRequest() {
		super("polardbx", "2020-02-02", "DescribeTableDetail", "polardbx");
		setMethod(MethodType.POST);
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	@Override
	public Class<DescribeTableDetailResponse> getResponseClass() {
		return DescribeTableDetailResponse.class;
	}

}
