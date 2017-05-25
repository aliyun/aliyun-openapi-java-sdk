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
package com.aliyuncs.iot.transform.v20170420;

import com.aliyuncs.iot.model.v20170420.QueryDeviceByNameResponse;
import com.aliyuncs.iot.model.v20170420.QueryDeviceByNameResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceByNameResponseUnmarshaller {

	public static QueryDeviceByNameResponse unmarshall(QueryDeviceByNameResponse queryDeviceByNameResponse, UnmarshallerContext context) {
		
		queryDeviceByNameResponse.setRequestId(context.stringValue("QueryDeviceByNameResponse.RequestId"));
		queryDeviceByNameResponse.setSuccess(context.booleanValue("QueryDeviceByNameResponse.Success"));
		queryDeviceByNameResponse.setErrorMessage(context.stringValue("QueryDeviceByNameResponse.ErrorMessage"));

		DeviceInfo deviceInfo = new DeviceInfo();
		deviceInfo.setDeviceId(context.stringValue("QueryDeviceByNameResponse.DeviceInfo.DeviceId"));
		deviceInfo.setDeviceSecret(context.stringValue("QueryDeviceByNameResponse.DeviceInfo.DeviceSecret"));
		deviceInfo.setProductKey(context.stringValue("QueryDeviceByNameResponse.DeviceInfo.ProductKey"));
		deviceInfo.setDeviceStatus(context.stringValue("QueryDeviceByNameResponse.DeviceInfo.DeviceStatus"));
		deviceInfo.setDeviceName(context.stringValue("QueryDeviceByNameResponse.DeviceInfo.DeviceName"));
		deviceInfo.setDeviceType(context.stringValue("QueryDeviceByNameResponse.DeviceInfo.DeviceType"));
		deviceInfo.setGmtCreate(context.stringValue("QueryDeviceByNameResponse.DeviceInfo.GmtCreate"));
		deviceInfo.setGmtModified(context.stringValue("QueryDeviceByNameResponse.DeviceInfo.GmtModified"));
		queryDeviceByNameResponse.setDeviceInfo(deviceInfo);
	 
	 	return queryDeviceByNameResponse;
	}
}