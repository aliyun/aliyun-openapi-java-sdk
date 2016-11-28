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
package com.aliyuncs.iot.transform.v20160530;

import com.aliyuncs.iot.model.v20160530.QueryDeviceByIdResponse;
import com.aliyuncs.iot.model.v20160530.QueryDeviceByIdResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceByIdResponseUnmarshaller {

	public static QueryDeviceByIdResponse unmarshall(QueryDeviceByIdResponse queryDeviceByIdResponse, UnmarshallerContext context) {
		
		queryDeviceByIdResponse.setRequestId(context.stringValue("QueryDeviceByIdResponse.RequestId"));
		queryDeviceByIdResponse.setSuccess(context.booleanValue("QueryDeviceByIdResponse.Success"));
		queryDeviceByIdResponse.setErrorMessage(context.stringValue("QueryDeviceByIdResponse.ErrorMessage"));

		DeviceInfo deviceInfo = new DeviceInfo();
		deviceInfo.setDeviceId(context.stringValue("QueryDeviceByIdResponse.DeviceInfo.DeviceId"));
		deviceInfo.setDeviceSecret(context.stringValue("QueryDeviceByIdResponse.DeviceInfo.DeviceSecret"));
		deviceInfo.setProductKey(context.stringValue("QueryDeviceByIdResponse.DeviceInfo.ProductKey"));
		deviceInfo.setDeviceStatus(context.stringValue("QueryDeviceByIdResponse.DeviceInfo.DeviceStatus"));
		deviceInfo.setDeviceName(context.stringValue("QueryDeviceByIdResponse.DeviceInfo.DeviceName"));
		deviceInfo.setGmtCreate(context.stringValue("QueryDeviceByIdResponse.DeviceInfo.GmtCreate"));
		deviceInfo.setGmtModified(context.stringValue("QueryDeviceByIdResponse.DeviceInfo.GmtModified"));
		queryDeviceByIdResponse.setDeviceInfo(deviceInfo);
	 
	 	return queryDeviceByIdResponse;
	}
}