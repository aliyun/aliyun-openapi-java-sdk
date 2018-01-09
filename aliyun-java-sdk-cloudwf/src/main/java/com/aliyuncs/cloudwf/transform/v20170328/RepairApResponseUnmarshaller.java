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
package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.RepairApResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RepairApResponseUnmarshaller {

	public static RepairApResponse unmarshall(RepairApResponse repairApResponse, UnmarshallerContext context) {
		
		repairApResponse.setRequestId(context.stringValue("RepairApResponse.RequestId"));
		repairApResponse.setSuccess(context.booleanValue("RepairApResponse.Success"));
		repairApResponse.setMessage(context.stringValue("RepairApResponse.Message"));
		repairApResponse.setData(context.stringValue("RepairApResponse.Data"));
		repairApResponse.setErrorCode(context.integerValue("RepairApResponse.ErrorCode"));
		repairApResponse.setErrorMsg(context.stringValue("RepairApResponse.ErrorMsg"));
	 
	 	return repairApResponse;
	}
}