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
package com.aliyuncs.green.model.v20161206;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AntispamResultsRequest extends RpcAcsRequest<AntispamResultsResponse> {
	
	public AntispamResultsRequest() {
		super("Green", "2016-12-06", "AntispamResults", "green");
		setMethod(MethodType.POST);
	}

	private List<String> dataIds;

	public List<String> getDataIds() {
		return this.dataIds;
	}

	public void setDataIds(List<String> dataIds) {
		this.dataIds = dataIds;	
		for (int i = 0; i < dataIds.size(); i++) {
			putQueryParameter("DataId." + (i + 1) , dataIds.get(i));
		}	
	}

	@Override
	public Class<AntispamResultsResponse> getResponseClass() {
		return AntispamResultsResponse.class;
	}

}
