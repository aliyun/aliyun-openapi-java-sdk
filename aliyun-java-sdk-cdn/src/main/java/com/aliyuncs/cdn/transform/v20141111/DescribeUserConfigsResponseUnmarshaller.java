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
package com.aliyuncs.cdn.transform.v20141111;

import com.aliyuncs.cdn.model.v20141111.DescribeUserConfigsResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeUserConfigsResponse.Configs;
import com.aliyuncs.cdn.model.v20141111.DescribeUserConfigsResponse.Configs.OssLogConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserConfigsResponseUnmarshaller {

	public static DescribeUserConfigsResponse unmarshall(DescribeUserConfigsResponse describeUserConfigsResponse, UnmarshallerContext context) {
		
		describeUserConfigsResponse.setRequestId(context.stringValue("DescribeUserConfigsResponse.RequestId"));

		Configs configs = new Configs();

		OssLogConfig ossLogConfig = new OssLogConfig();
		ossLogConfig.setEnable(context.stringValue("DescribeUserConfigsResponse.Configs.OssLogConfig.Enable"));
		ossLogConfig.setBucket(context.stringValue("DescribeUserConfigsResponse.Configs.OssLogConfig.Bucket"));
		ossLogConfig.setPrefix(context.stringValue("DescribeUserConfigsResponse.Configs.OssLogConfig.Prefix"));
		configs.setOssLogConfig(ossLogConfig);
		describeUserConfigsResponse.setConfigs(configs);
	 
	 	return describeUserConfigsResponse;
	}
}