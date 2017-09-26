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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsResponse.Invocation;
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationResultsResponse.Invocation.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationResultsResponseUnmarshaller {

	public static DescribeInvocationResultsResponse unmarshall(DescribeInvocationResultsResponse describeInvocationResultsResponse, UnmarshallerContext context) {
		
		describeInvocationResultsResponse.setRequestId(context.stringValue("DescribeInvocationResultsResponse.RequestId"));

		Invocation invocation = new Invocation();
		invocation.setInvokeId(context.stringValue("DescribeInvocationResultsResponse.Invocation.InvokeId"));
		invocation.setPageSize(context.longValue("DescribeInvocationResultsResponse.Invocation.PageSize"));
		invocation.setPageNumber(context.longValue("DescribeInvocationResultsResponse.Invocation.PageNumber"));
		invocation.setTotalCount(context.longValue("DescribeInvocationResultsResponse.Invocation.TotalCount"));
		invocation.setStatus(context.stringValue("DescribeInvocationResultsResponse.Invocation.Status"));

		List<ResultItem> resultLists = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeInvocationResultsResponse.Invocation.ResultLists.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setInstanceId(context.stringValue("DescribeInvocationResultsResponse.Invocation.ResultLists["+ i +"].InstanceId"));
			resultItem.setFinishedTime(context.stringValue("DescribeInvocationResultsResponse.Invocation.ResultLists["+ i +"].FinishedTime"));
			resultItem.setOutput(context.stringValue("DescribeInvocationResultsResponse.Invocation.ResultLists["+ i +"].Output"));
			resultItem.setExitCode(context.longValue("DescribeInvocationResultsResponse.Invocation.ResultLists["+ i +"].ExitCode"));

			resultLists.add(resultItem);
		}
		invocation.setResultLists(resultLists);
		describeInvocationResultsResponse.setInvocation(invocation);
	 
	 	return describeInvocationResultsResponse;
	}
}