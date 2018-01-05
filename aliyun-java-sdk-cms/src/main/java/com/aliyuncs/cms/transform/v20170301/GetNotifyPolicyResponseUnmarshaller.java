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
package com.aliyuncs.cms.transform.v20170301;

import com.aliyuncs.cms.model.v20170301.GetNotifyPolicyResponse;
import com.aliyuncs.cms.model.v20170301.GetNotifyPolicyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNotifyPolicyResponseUnmarshaller {

	public static GetNotifyPolicyResponse unmarshall(GetNotifyPolicyResponse getNotifyPolicyResponse, UnmarshallerContext context) {
		
		getNotifyPolicyResponse.setCode(context.stringValue("GetNotifyPolicyResponse.code"));
		getNotifyPolicyResponse.setMessage(context.stringValue("GetNotifyPolicyResponse.message"));
		getNotifyPolicyResponse.setSuccess(context.stringValue("GetNotifyPolicyResponse.success"));
		getNotifyPolicyResponse.setTraceId(context.stringValue("GetNotifyPolicyResponse.traceId"));

		Result result = new Result();
		result.setAlertName(context.stringValue("GetNotifyPolicyResponse.Result.AlertName"));
		result.setDimensions(context.stringValue("GetNotifyPolicyResponse.Result.Dimensions"));
		result.setType(context.stringValue("GetNotifyPolicyResponse.Result.Type"));
		result.setId(context.stringValue("GetNotifyPolicyResponse.Result.Id"));
		result.setStartTime(context.longValue("GetNotifyPolicyResponse.Result.StartTime"));
		result.setEndTime(context.longValue("GetNotifyPolicyResponse.Result.EndTime"));
		getNotifyPolicyResponse.setResult(result);
	 
	 	return getNotifyPolicyResponse;
	}
}