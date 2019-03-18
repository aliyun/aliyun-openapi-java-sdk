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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiTrafficDataResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiTrafficDataResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiTrafficDataResponseUnmarshaller {

	public static DescribeApiTrafficDataResponse unmarshall(DescribeApiTrafficDataResponse describeApiTrafficDataResponse, UnmarshallerContext context) {
		
		describeApiTrafficDataResponse.setRequestId(context.stringValue("DescribeApiTrafficDataResponse.RequestId"));

		List<MonitorItem> callUploads = new ArrayList<MonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeApiTrafficDataResponse.CallUploads.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemTime(context.stringValue("DescribeApiTrafficDataResponse.CallUploads["+ i +"].ItemTime"));
			monitorItem.setItemValue(context.stringValue("DescribeApiTrafficDataResponse.CallUploads["+ i +"].ItemValue"));

			callUploads.add(monitorItem);
		}
		describeApiTrafficDataResponse.setCallUploads(callUploads);

		List<MonitorItem> callDownloads = new ArrayList<MonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeApiTrafficDataResponse.CallDownloads.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemTime(context.stringValue("DescribeApiTrafficDataResponse.CallDownloads["+ i +"].ItemTime"));
			monitorItem.setItemValue(context.stringValue("DescribeApiTrafficDataResponse.CallDownloads["+ i +"].ItemValue"));

			callDownloads.add(monitorItem);
		}
		describeApiTrafficDataResponse.setCallDownloads(callDownloads);
	 
	 	return describeApiTrafficDataResponse;
	}
}