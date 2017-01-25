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
package com.aliyuncs.drds.transform.v20150413;

import com.aliyuncs.drds.model.v20150413.DescribeReadOnlyAccountResponse;
import com.aliyuncs.drds.model.v20150413.DescribeReadOnlyAccountResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReadOnlyAccountResponseUnmarshaller {

	public static DescribeReadOnlyAccountResponse unmarshall(DescribeReadOnlyAccountResponse describeReadOnlyAccountResponse, UnmarshallerContext context) {
		
		describeReadOnlyAccountResponse.setRequestId(context.stringValue("DescribeReadOnlyAccountResponse.RequestId"));
		describeReadOnlyAccountResponse.setSuccess(context.booleanValue("DescribeReadOnlyAccountResponse.Success"));

		Data data = new Data();
		data.setDbName(context.stringValue("DescribeReadOnlyAccountResponse.Data.DbName"));
		data.setDrdsInstanceId(context.stringValue("DescribeReadOnlyAccountResponse.Data.DrdsInstanceId"));
		data.setAccountName(context.stringValue("DescribeReadOnlyAccountResponse.Data.AccountName"));
		describeReadOnlyAccountResponse.setData(data);
	 
	 	return describeReadOnlyAccountResponse;
	}
}