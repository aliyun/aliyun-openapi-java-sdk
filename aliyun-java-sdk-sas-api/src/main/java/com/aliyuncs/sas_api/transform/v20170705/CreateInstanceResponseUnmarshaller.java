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
package com.aliyuncs.sas_api.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas_api.model.v20170705.CreateInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceResponseUnmarshaller {

	public static CreateInstanceResponse unmarshall(CreateInstanceResponse createInstanceResponse, UnmarshallerContext context) {
		
		createInstanceResponse.setRequestId(context.stringValue("CreateInstanceResponse.RequestId"));
		createInstanceResponse.setCode(context.stringValue("CreateInstanceResponse.Code"));
		createInstanceResponse.setMessage(context.stringValue("CreateInstanceResponse.Message"));
		createInstanceResponse.setOrderId(context.stringValue("CreateInstanceResponse.OrderId"));
		createInstanceResponse.setInstanceId(context.stringValue("CreateInstanceResponse.InstanceId"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateInstanceResponse.InstanceIds.Length"); i++) {
			instanceIds.add(context.stringValue("CreateInstanceResponse.InstanceIds["+ i +"]"));
		}
		createInstanceResponse.setInstanceIds(instanceIds);
	 
	 	return createInstanceResponse;
	}
}