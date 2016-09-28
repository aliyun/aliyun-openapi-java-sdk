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
package com.aliyuncs.sms.transform.v20160927;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sms.model.v20160927.QuerySmsFailByPageResponse;
import com.aliyuncs.sms.model.v20160927.QuerySmsFailByPageResponse.stat;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySmsFailByPageResponseUnmarshaller {

	public static QuerySmsFailByPageResponse unmarshall(QuerySmsFailByPageResponse querySmsFailByPageResponse, UnmarshallerContext context) {
		
		querySmsFailByPageResponse.setRequestId(context.stringValue("QuerySmsFailByPageResponse.RequestId"));
		querySmsFailByPageResponse.setPageNumber(context.integerValue("QuerySmsFailByPageResponse.PageNumber"));
		querySmsFailByPageResponse.setPageSize(context.integerValue("QuerySmsFailByPageResponse.PageSize"));
		querySmsFailByPageResponse.setTotalCount(context.integerValue("QuerySmsFailByPageResponse.TotalCount"));

		List<stat> data = new ArrayList<stat>();
		for (int i = 0; i < context.lengthValue("QuerySmsFailByPageResponse.data.Length"); i++) {
			stat stat = new stat();
			stat.setReceiverNum(context.stringValue("QuerySmsFailByPageResponse.data["+ i +"].ReceiverNum"));
			stat.setSmsCode(context.stringValue("QuerySmsFailByPageResponse.data["+ i +"].SmsCode"));
			stat.setSmsStatus(context.integerValue("QuerySmsFailByPageResponse.data["+ i +"].SmsStatus"));
			stat.setResultCode(context.stringValue("QuerySmsFailByPageResponse.data["+ i +"].ResultCode"));

			data.add(stat);
		}
		querySmsFailByPageResponse.setdata(data);
	 
	 	return querySmsFailByPageResponse;
	}
}