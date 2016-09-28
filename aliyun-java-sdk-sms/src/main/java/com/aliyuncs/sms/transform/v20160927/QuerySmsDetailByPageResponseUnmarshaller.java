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

import com.aliyuncs.sms.model.v20160927.QuerySmsDetailByPageResponse;
import com.aliyuncs.sms.model.v20160927.QuerySmsDetailByPageResponse.stat;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySmsDetailByPageResponseUnmarshaller {

	public static QuerySmsDetailByPageResponse unmarshall(QuerySmsDetailByPageResponse querySmsDetailByPageResponse, UnmarshallerContext context) {
		
		querySmsDetailByPageResponse.setRequestId(context.stringValue("QuerySmsDetailByPageResponse.RequestId"));
		querySmsDetailByPageResponse.setPageNumber(context.integerValue("QuerySmsDetailByPageResponse.PageNumber"));
		querySmsDetailByPageResponse.setPageSize(context.integerValue("QuerySmsDetailByPageResponse.PageSize"));
		querySmsDetailByPageResponse.setTotalCount(context.integerValue("QuerySmsDetailByPageResponse.TotalCount"));

		List<stat> data = new ArrayList<stat>();
		for (int i = 0; i < context.lengthValue("QuerySmsDetailByPageResponse.data.Length"); i++) {
			stat stat = new stat();
			stat.setReceiverNum(context.stringValue("QuerySmsDetailByPageResponse.data["+ i +"].ReceiverNum"));
			stat.setSmsCode(context.stringValue("QuerySmsDetailByPageResponse.data["+ i +"].SmsCode"));
			stat.setSmsContent(context.stringValue("QuerySmsDetailByPageResponse.data["+ i +"].SmsContent"));
			stat.setSmsStatus(context.integerValue("QuerySmsDetailByPageResponse.data["+ i +"].SmsStatus"));
			stat.setResultCode(context.stringValue("QuerySmsDetailByPageResponse.data["+ i +"].ResultCode"));

			data.add(stat);
		}
		querySmsDetailByPageResponse.setdata(data);
	 
	 	return querySmsDetailByPageResponse;
	}
}