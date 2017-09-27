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
package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribePreCheckResultsResponse;
import com.aliyuncs.rds.model.v20140815.DescribePreCheckResultsResponse.PreCheckResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePreCheckResultsResponseUnmarshaller {

	public static DescribePreCheckResultsResponse unmarshall(DescribePreCheckResultsResponse describePreCheckResultsResponse, UnmarshallerContext context) {
		
		describePreCheckResultsResponse.setRequestId(context.stringValue("DescribePreCheckResultsResponse.RequestId"));
		describePreCheckResultsResponse.setDBInstanceId(context.stringValue("DescribePreCheckResultsResponse.DBInstanceId"));

		List<PreCheckResult> items = new ArrayList<PreCheckResult>();
		for (int i = 0; i < context.lengthValue("DescribePreCheckResultsResponse.Items.Length"); i++) {
			PreCheckResult preCheckResult = new PreCheckResult();
			preCheckResult.setPreCheckName(context.stringValue("DescribePreCheckResultsResponse.Items["+ i +"].PreCheckName"));
			preCheckResult.setPreCheckResult(context.stringValue("DescribePreCheckResultsResponse.Items["+ i +"].PreCheckResult"));
			preCheckResult.setFailReasion(context.stringValue("DescribePreCheckResultsResponse.Items["+ i +"].FailReasion"));
			preCheckResult.setRepairMethod(context.stringValue("DescribePreCheckResultsResponse.Items["+ i +"].RepairMethod"));

			items.add(preCheckResult);
		}
		describePreCheckResultsResponse.setItems(items);
	 
	 	return describePreCheckResultsResponse;
	}
}