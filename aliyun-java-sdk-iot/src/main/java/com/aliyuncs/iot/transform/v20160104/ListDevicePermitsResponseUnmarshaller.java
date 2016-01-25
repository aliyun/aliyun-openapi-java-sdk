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
package com.aliyuncs.iot.transform.v20160104;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20160104.ListDevicePermitsResponse;
import com.aliyuncs.iot.model.v20160104.ListDevicePermitsResponse.DevicePermission;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevicePermitsResponseUnmarshaller {

	public static ListDevicePermitsResponse unmarshall(ListDevicePermitsResponse listDevicePermitsResponse, UnmarshallerContext context) {
		
		listDevicePermitsResponse.setRequestId(context.stringValue("ListDevicePermitsResponse.RequestId"));
		listDevicePermitsResponse.setSuccess(context.booleanValue("ListDevicePermitsResponse.Success"));
		listDevicePermitsResponse.setErrorMessage(context.stringValue("ListDevicePermitsResponse.ErrorMessage"));

		List<DevicePermission> devicePermissions = new ArrayList<DevicePermission>();
		for (int i = 0; i < context.lengthValue("ListDevicePermitsResponse.DevicePermissions.Length"); i++) {
			DevicePermission devicePermission = new DevicePermission();
			devicePermission.setId(context.longValue("ListDevicePermitsResponse.DevicePermissions["+ i +"].Id"));
			devicePermission.setAppKey(context.longValue("ListDevicePermitsResponse.DevicePermissions["+ i +"].AppKey"));
			devicePermission.setDeviceId(context.stringValue("ListDevicePermitsResponse.DevicePermissions["+ i +"].DeviceId"));
			devicePermission.setGrantType(context.stringValue("ListDevicePermitsResponse.DevicePermissions["+ i +"].GrantType"));
			devicePermission.setTopicFullName(context.stringValue("ListDevicePermitsResponse.DevicePermissions["+ i +"].TopicFullName"));
			devicePermission.setTopicUserId(context.longValue("ListDevicePermitsResponse.DevicePermissions["+ i +"].TopicUserId"));

			devicePermissions.add(devicePermission);
		}
		listDevicePermitsResponse.setDevicePermissions(devicePermissions);
	 
	 	return listDevicePermitsResponse;
	}
}