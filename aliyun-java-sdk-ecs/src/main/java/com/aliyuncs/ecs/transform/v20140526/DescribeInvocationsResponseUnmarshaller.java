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

import com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse.InvocationItem;
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse.InvocationItem.InvokeItemItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationsResponseUnmarshaller {

	public static DescribeInvocationsResponse unmarshall(DescribeInvocationsResponse describeInvocationsResponse, UnmarshallerContext context) {
		
		describeInvocationsResponse.setRequestId(context.stringValue("DescribeInvocationsResponse.RequestId"));
		describeInvocationsResponse.setTotalCount(context.longValue("DescribeInvocationsResponse.TotalCount"));
		describeInvocationsResponse.setPageNumber(context.longValue("DescribeInvocationsResponse.PageNumber"));
		describeInvocationsResponse.setPageSize(context.longValue("DescribeInvocationsResponse.PageSize"));

		List<InvocationItem> invocation = new ArrayList<InvocationItem>();
		for (int i = 0; i < context.lengthValue("DescribeInvocationsResponse.Invocation.Length"); i++) {
			InvocationItem invocationItem = new InvocationItem();
			invocationItem.setInvokeId(context.stringValue("DescribeInvocationsResponse.Invocation["+ i +"].InvokeId"));
			invocationItem.setCommandId(context.stringValue("DescribeInvocationsResponse.Invocation["+ i +"].CommandId"));
			invocationItem.setCommandType(context.stringValue("DescribeInvocationsResponse.Invocation["+ i +"].CommandType"));
			invocationItem.setCommandName(context.stringValue("DescribeInvocationsResponse.Invocation["+ i +"].CommandName"));
			invocationItem.setTimed(context.booleanValue("DescribeInvocationsResponse.Invocation["+ i +"].Timed"));
			invocationItem.setInvokeStatus(context.stringValue("DescribeInvocationsResponse.Invocation["+ i +"].InvokeStatus"));

			List<InvokeItemItem> invokeItem = new ArrayList<InvokeItemItem>();
			for (int j = 0; j < context.lengthValue("DescribeInvocationsResponse.Invocation["+ i +"].InvokeItem.Length"); j++) {
				InvokeItemItem invokeItemItem = new InvokeItemItem();
				invokeItemItem.setInstanceId(context.stringValue("DescribeInvocationsResponse.Invocation["+ i +"].InvokeItem["+ j +"].InstanceId"));
				invokeItemItem.setStatus(context.stringValue("DescribeInvocationsResponse.Invocation["+ i +"].InvokeItem["+ j +"].Status"));

				invokeItem.add(invokeItemItem);
			}
			invocationItem.setInvokeItem(invokeItem);

			invocation.add(invocationItem);
		}
		describeInvocationsResponse.setInvocation(invocation);
	 
	 	return describeInvocationsResponse;
	}
}