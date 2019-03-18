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
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiErrorDataResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiErrorDataResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiErrorDataResponseUnmarshaller {

	public static DescribeApiErrorDataResponse unmarshall(DescribeApiErrorDataResponse describeApiErrorDataResponse, UnmarshallerContext context) {
		
		describeApiErrorDataResponse.setRequestId(context.stringValue("DescribeApiErrorDataResponse.RequestId"));

		List<MonitorItem> clientErrors = new ArrayList<MonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeApiErrorDataResponse.ClientErrors.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemTime(context.stringValue("DescribeApiErrorDataResponse.ClientErrors["+ i +"].ItemTime"));
			monitorItem.setItemValue(context.stringValue("DescribeApiErrorDataResponse.ClientErrors["+ i +"].ItemValue"));

			clientErrors.add(monitorItem);
		}
		describeApiErrorDataResponse.setClientErrors(clientErrors);

		List<MonitorItem> serverErrors = new ArrayList<MonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeApiErrorDataResponse.ServerErrors.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemTime(context.stringValue("DescribeApiErrorDataResponse.ServerErrors["+ i +"].ItemTime"));
			monitorItem.setItemValue(context.stringValue("DescribeApiErrorDataResponse.ServerErrors["+ i +"].ItemValue"));

			serverErrors.add(monitorItem);
		}
		describeApiErrorDataResponse.setServerErrors(serverErrors);
	 
	 	return describeApiErrorDataResponse;
	}
}