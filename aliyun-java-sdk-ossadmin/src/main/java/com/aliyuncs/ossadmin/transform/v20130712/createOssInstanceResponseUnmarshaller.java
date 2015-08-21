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
package com.aliyuncs.ossadmin.transform.v20130712;

import com.aliyuncs.ossadmin.model.v20130712.createOssInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class createOssInstanceResponseUnmarshaller {

	public static createOssInstanceResponse unmarshall(createOssInstanceResponse createOssInstanceResponse, UnmarshallerContext context) {
		
		createOssInstanceResponse.setRequestId(context.stringValue("createOssInstanceResponse.RequestId"));
		createOssInstanceResponse.setCode(context.stringValue("createOssInstanceResponse.Code"));
		createOssInstanceResponse.setMessage(context.stringValue("createOssInstanceResponse.Message"));
		createOssInstanceResponse.setSuccess(context.booleanValue("createOssInstanceResponse.Success"));
		createOssInstanceResponse.setaliUid(context.longValue("createOssInstanceResponse.aliUid"));
		createOssInstanceResponse.setinstanceId(context.stringValue("createOssInstanceResponse.instanceId"));
		createOssInstanceResponse.setinstacneStatus(context.stringValue("createOssInstanceResponse.instacneStatus"));
		createOssInstanceResponse.setinstanceName(context.stringValue("createOssInstanceResponse.instanceName"));
		createOssInstanceResponse.setstartTime(context.stringValue("createOssInstanceResponse.startTime"));
		createOssInstanceResponse.setendTime(context.stringValue("createOssInstanceResponse.endTime"));
	 
	 	return createOssInstanceResponse;
	}
}