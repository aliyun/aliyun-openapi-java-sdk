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

import com.aliyuncs.cloudapi.model.v20160714.DescribeLogConfigResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeLogConfigResponse.LogInfo;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeLogConfigResponseUnmarshaller {

	public static DescribeLogConfigResponse unmarshall(DescribeLogConfigResponse describeLogConfigResponse, UnmarshallerContext context) {
		
		describeLogConfigResponse.setRequestId(context.stringValue("DescribeLogConfigResponse.RequestId"));

		List<LogInfo> logInfos = new ArrayList<LogInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLogConfigResponse.LogInfos.Length"); i++) {
			LogInfo logInfo = new LogInfo();
			logInfo.setRegionId(context.stringValue("DescribeLogConfigResponse.LogInfos["+ i +"].RegionId"));
			logInfo.setSlsProject(context.stringValue("DescribeLogConfigResponse.LogInfos["+ i +"].SlsProject"));
			logInfo.setSlsLogStore(context.stringValue("DescribeLogConfigResponse.LogInfos["+ i +"].SlsLogStore"));
			logInfo.setLogType(context.stringValue("DescribeLogConfigResponse.LogInfos["+ i +"].LogType"));

			logInfos.add(logInfo);
		}
		describeLogConfigResponse.setLogInfos(logInfos);
	 
	 	return describeLogConfigResponse;
	}
}