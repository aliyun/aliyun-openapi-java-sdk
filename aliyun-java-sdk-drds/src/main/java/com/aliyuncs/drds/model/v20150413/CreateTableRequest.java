/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.drds.model.v20150413;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateTableRequest extends RpcAcsRequest<CreateTableResponse> {
	
	public CreateTableRequest() {
		super("Drds", "2015-04-13", "CreateTable");
	}

	private String drdsInstanceId;

	private String dbName;

	private String ddlSql;

	private String shardType;

	private String shardKey;

	private String allowFullTableScan;

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		putQueryParameter("DrdsInstanceId", drdsInstanceId);
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		putQueryParameter("DbName", dbName);
	}

	public String getDdlSql() {
		return this.ddlSql;
	}

	public void setDdlSql(String ddlSql) {
		this.ddlSql = ddlSql;
		putQueryParameter("DdlSql", ddlSql);
	}

	public String getShardType() {
		return this.shardType;
	}

	public void setShardType(String shardType) {
		this.shardType = shardType;
		putQueryParameter("ShardType", shardType);
	}

	public String getShardKey() {
		return this.shardKey;
	}

	public void setShardKey(String shardKey) {
		this.shardKey = shardKey;
		putQueryParameter("ShardKey", shardKey);
	}

	public String getAllowFullTableScan() {
		return this.allowFullTableScan;
	}

	public void setAllowFullTableScan(String allowFullTableScan) {
		this.allowFullTableScan = allowFullTableScan;
		putQueryParameter("AllowFullTableScan", allowFullTableScan);
	}

	@Override
	public Class<CreateTableResponse> getResponseClass() {
		return CreateTableResponse.class;
	}

}
