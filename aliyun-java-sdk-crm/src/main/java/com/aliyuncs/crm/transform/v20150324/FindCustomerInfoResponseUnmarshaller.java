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
package com.aliyuncs.crm.transform.v20150324;

import com.aliyuncs.crm.model.v20150324.FindCustomerInfoResponse;
import com.aliyuncs.crm.model.v20150324.FindCustomerInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindCustomerInfoResponseUnmarshaller {

	public static FindCustomerInfoResponse unmarshall(FindCustomerInfoResponse findCustomerInfoResponse, UnmarshallerContext context) {
		
		findCustomerInfoResponse.setSuccess(context.booleanValue("FindCustomerInfoResponse.Success"));
		findCustomerInfoResponse.setResultCode(context.stringValue("FindCustomerInfoResponse.ResultCode"));
		findCustomerInfoResponse.setResultMessage(context.stringValue("FindCustomerInfoResponse.ResultMessage"));

		Data  data = new Data();
		data.setWebsite(context.stringValue("FindCustomerInfoResponse.Data.Website"));
		data.setBiz(context.stringValue("FindCustomerInfoResponse.Data.Biz"));
		findCustomerInfoResponse.setData(data);
	 
	 	return findCustomerInfoResponse;
	}
}