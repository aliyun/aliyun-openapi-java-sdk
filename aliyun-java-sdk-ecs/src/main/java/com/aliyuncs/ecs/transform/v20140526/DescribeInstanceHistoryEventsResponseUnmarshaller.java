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

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse.InstanceSystemEventType;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceHistoryEventsResponse.InstanceSystemEventType.EventType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceHistoryEventsResponseUnmarshaller {

	public static DescribeInstanceHistoryEventsResponse unmarshall(DescribeInstanceHistoryEventsResponse describeInstanceHistoryEventsResponse, UnmarshallerContext context) {
		
		describeInstanceHistoryEventsResponse.setRequestId(context.stringValue("DescribeInstanceHistoryEventsResponse.RequestId"));
		describeInstanceHistoryEventsResponse.setTotalCount(context.integerValue("DescribeInstanceHistoryEventsResponse.TotalCount"));
		describeInstanceHistoryEventsResponse.setPageNumber(context.integerValue("DescribeInstanceHistoryEventsResponse.PageNumber"));
		describeInstanceHistoryEventsResponse.setPageSize(context.integerValue("DescribeInstanceHistoryEventsResponse.PageSize"));

		List<InstanceSystemEventType> instanceSystemEventSet = new ArrayList<InstanceSystemEventType>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet.Length"); i++) {
			InstanceSystemEventType instanceSystemEventType = new InstanceSystemEventType();
			instanceSystemEventType.setInstanceId(context.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].InstanceId"));
			instanceSystemEventType.setEventId(context.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventId"));
			instanceSystemEventType.setEventPublishTime(context.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventPublishTime"));
			instanceSystemEventType.setNotBefore(context.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].NotBefore"));

			EventType eventType = new EventType();
			eventType.setCode(context.integerValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventType.Code"));
			eventType.setName(context.stringValue("DescribeInstanceHistoryEventsResponse.InstanceSystemEventSet["+ i +"].EventType.Name"));
			instanceSystemEventType.setEventType(eventType);

			instanceSystemEventSet.add(instanceSystemEventType);
		}
		describeInstanceHistoryEventsResponse.setInstanceSystemEventSet(instanceSystemEventSet);
	 
	 	return describeInstanceHistoryEventsResponse;
	}
}