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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiLatencyDataResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiLatencyDataResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiLatencyDataResponseUnmarshaller {

	public static DescribeApiLatencyDataResponse unmarshall(DescribeApiLatencyDataResponse describeApiLatencyDataResponse, UnmarshallerContext context) {
		
		describeApiLatencyDataResponse.setRequestId(context.stringValue("DescribeApiLatencyDataResponse.RequestId"));

		List<MonitorItem> callLatencys = new ArrayList<MonitorItem>();
		for (int i = 0; i < context.lengthValue("DescribeApiLatencyDataResponse.CallLatencys.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemTime(context.stringValue("DescribeApiLatencyDataResponse.CallLatencys["+ i +"].ItemTime"));
			monitorItem.setItemValue(context.stringValue("DescribeApiLatencyDataResponse.CallLatencys["+ i +"].ItemValue"));

			callLatencys.add(monitorItem);
		}
		describeApiLatencyDataResponse.setCallLatencys(callLatencys);
	 
	 	return describeApiLatencyDataResponse;
	}
}