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
package com.aliyuncs.cms.model.v20150801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetDimTableRequest extends RpcAcsRequest<GetDimTableResponse> {
	
	public GetDimTableRequest() {
		super("Cms", "2015-08-01", "GetDimTable");
	}

	private String dimTableName;

	public String getDimTableName() {
		return this.dimTableName;
	}

	public void setDimTableName(String dimTableName) {
		this.dimTableName = dimTableName;
		putQueryParameter("DimTableName", dimTableName);
	}

	@Override
	public Class<GetDimTableResponse> getResponseClass() {
		return GetDimTableResponse.class;
	}

}
