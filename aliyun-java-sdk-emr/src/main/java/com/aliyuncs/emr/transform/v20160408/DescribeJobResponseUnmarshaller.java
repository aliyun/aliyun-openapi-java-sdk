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
package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobResponseUnmarshaller {

	public static DescribeJobResponse unmarshall(DescribeJobResponse describeJobResponse, UnmarshallerContext context) {
		
		describeJobResponse.setRequestId(context.stringValue("DescribeJobResponse.RequestId"));
		describeJobResponse.setId(context.stringValue("DescribeJobResponse.Id"));
		describeJobResponse.setName(context.stringValue("DescribeJobResponse.Name"));
		describeJobResponse.setFailAct(context.stringValue("DescribeJobResponse.FailAct"));
		describeJobResponse.setType(context.stringValue("DescribeJobResponse.Type"));
		describeJobResponse.setRunParameter(context.stringValue("DescribeJobResponse.RunParameter"));
	 
	 	return describeJobResponse;
	}
}