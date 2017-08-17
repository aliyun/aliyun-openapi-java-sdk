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

import com.aliyuncs.sas_api.model.v20170705.GetIpProfileResponse;
import com.aliyuncs.sas_api.model.v20170705.GetIpProfileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIpProfileResponseUnmarshaller {

	public static GetIpProfileResponse unmarshall(GetIpProfileResponse getIpProfileResponse, UnmarshallerContext context) {
		
		getIpProfileResponse.setRequestId(context.stringValue("GetIpProfileResponse.RequestId"));
		getIpProfileResponse.setCode(context.integerValue("GetIpProfileResponse.Code"));
		getIpProfileResponse.setMessage(context.stringValue("GetIpProfileResponse.Message"));
		getIpProfileResponse.setSuccess(context.booleanValue("GetIpProfileResponse.Success"));

		Data data = new Data();
		data.setIp(context.stringValue("GetIpProfileResponse.Data.Ip"));
		data.setInfo(context.stringValue("GetIpProfileResponse.Data.Info"));
		getIpProfileResponse.setData(data);
	 
	 	return getIpProfileResponse;
	}
}