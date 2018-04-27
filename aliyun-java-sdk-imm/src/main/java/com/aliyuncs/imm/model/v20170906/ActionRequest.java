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
package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.FormatType;

import java.util.Map;

/**
 * Created by guangchun.luo on 17/12/29.
 */
public class ActionRequest extends RpcAcsRequest<ActionResponse> {

	Map<String,String> params;

	public ActionRequest(Map<String,String> params) {

		super("imm", "2017-09-06", params.get("Action"));
		this.params = params;

		setAcceptFormat(FormatType.JSON);

		for(Map.Entry<String,String> entry : params.entrySet()){
			putQueryParameter(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public Class<ActionResponse> getResponseClass() {
		return ActionResponse.class;
	}

}
