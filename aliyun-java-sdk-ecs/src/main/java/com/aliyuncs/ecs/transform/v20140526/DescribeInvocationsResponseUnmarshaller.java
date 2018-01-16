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
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse.Invocation;
import com.aliyuncs.ecs.model.v20140526.DescribeInvocationsResponse.Invocation.InvokeInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInvocationsResponseUnmarshaller {

	public static DescribeInvocationsResponse unmarshall(DescribeInvocationsResponse describeInvocationsResponse, UnmarshallerContext context) {
		
		describeInvocationsResponse.setRequestId(context.stringValue("DescribeInvocationsResponse.RequestId"));
		describeInvocationsResponse.setTotalCount(context.longValue("DescribeInvocationsResponse.TotalCount"));
		describeInvocationsResponse.setPageNumber(context.longValue("DescribeInvocationsResponse.PageNumber"));
		describeInvocationsResponse.setPageSize(context.longValue("DescribeInvocationsResponse.PageSize"));

		List<Invocation> invocations = new ArrayList<Invocation>();
		for (int i = 0; i < context.lengthValue("DescribeInvocationsResponse.Invocations.Length"); i++) {
			Invocation invocation = new Invocation();
			invocation.setInvokeId(context.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeId"));
			invocation.setCommandId(context.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandId"));
			invocation.setCommandType(context.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandType"));
			invocation.setCommandName(context.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].CommandName"));
			invocation.setFrequency(context.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].Frequency"));
			invocation.setTimed(context.booleanValue("DescribeInvocationsResponse.Invocations["+ i +"].Timed"));
			invocation.setInvokeStatus(context.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeStatus"));

			List<InvokeInstance> invokeInstances = new ArrayList<InvokeInstance>();
			for (int j = 0; j < context.lengthValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances.Length"); j++) {
				InvokeInstance invokeInstance = new InvokeInstance();
				invokeInstance.setInstanceId(context.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InstanceId"));
				invokeInstance.setInstanceInvokeStatus(context.stringValue("DescribeInvocationsResponse.Invocations["+ i +"].InvokeInstances["+ j +"].InstanceInvokeStatus"));

				invokeInstances.add(invokeInstance);
			}
			invocation.setInvokeInstances(invokeInstances);

			invocations.add(invocation);
		}
		describeInvocationsResponse.setInvocations(invocations);
	 
	 	return describeInvocationsResponse;
	}
}