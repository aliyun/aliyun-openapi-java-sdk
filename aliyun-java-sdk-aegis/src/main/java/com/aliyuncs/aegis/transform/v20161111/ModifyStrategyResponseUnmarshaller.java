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
package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.ModifyStrategyResponse;
import com.aliyuncs.aegis.model.v20161111.ModifyStrategyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyStrategyResponseUnmarshaller {

	public static ModifyStrategyResponse unmarshall(ModifyStrategyResponse modifyStrategyResponse, UnmarshallerContext context) {
		
		modifyStrategyResponse.setRequestId(context.stringValue("ModifyStrategyResponse.RequestId"));
		modifyStrategyResponse.setSuccess(context.booleanValue("ModifyStrategyResponse.Success"));
		modifyStrategyResponse.setTotalCount(context.integerValue("ModifyStrategyResponse.TotalCount"));
		modifyStrategyResponse.setHttpStatusCode(context.integerValue("ModifyStrategyResponse.HttpStatusCode"));

		Result result = new Result();
		result.setStrategyId(context.integerValue("ModifyStrategyResponse.Result.StrategyId"));
		modifyStrategyResponse.setResult(result);
	 
	 	return modifyStrategyResponse;
	}
}