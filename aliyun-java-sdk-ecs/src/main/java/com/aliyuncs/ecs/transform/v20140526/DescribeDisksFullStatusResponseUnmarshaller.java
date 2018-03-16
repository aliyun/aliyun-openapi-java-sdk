/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusResponse.DiskFullStatusType;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusResponse.DiskFullStatusType.DiskEventType;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusResponse.DiskFullStatusType.DiskEventType.EventType;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusResponse.DiskFullStatusType.HealthStatus;
import com.aliyuncs.ecs.model.v20140526.DescribeDisksFullStatusResponse.DiskFullStatusType.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDisksFullStatusResponseUnmarshaller {

	public static DescribeDisksFullStatusResponse unmarshall(DescribeDisksFullStatusResponse describeDisksFullStatusResponse, UnmarshallerContext context) {
		
		describeDisksFullStatusResponse.setRequestId(context.stringValue("DescribeDisksFullStatusResponse.RequestId"));
		describeDisksFullStatusResponse.setTotalCount(context.integerValue("DescribeDisksFullStatusResponse.TotalCount"));
		describeDisksFullStatusResponse.setPageNumber(context.integerValue("DescribeDisksFullStatusResponse.PageNumber"));
		describeDisksFullStatusResponse.setPageSize(context.integerValue("DescribeDisksFullStatusResponse.PageSize"));

		List<DiskFullStatusType> diskFullStatusSet = new ArrayList<DiskFullStatusType>();
		for (int i = 0; i < context.lengthValue("DescribeDisksFullStatusResponse.DiskFullStatusSet.Length"); i++) {
			DiskFullStatusType diskFullStatusType = new DiskFullStatusType();
			diskFullStatusType.setDiskId(context.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskId"));

			Status status = new Status();
			status.setCode(context.integerValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].Status.Code"));
			status.setName(context.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].Status.Name"));
			diskFullStatusType.setStatus(status);

			HealthStatus healthStatus = new HealthStatus();
			healthStatus.setCode(context.integerValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].HealthStatus.Code"));
			healthStatus.setName(context.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].HealthStatus.Name"));
			diskFullStatusType.setHealthStatus(healthStatus);

			List<DiskEventType> diskEventSet = new ArrayList<DiskEventType>();
			for (int j = 0; j < context.lengthValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet.Length"); j++) {
				DiskEventType diskEventType = new DiskEventType();
				diskEventType.setEventId(context.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventId"));
				diskEventType.setEventTime(context.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventTime"));

				EventType eventType = new EventType();
				eventType.setCode(context.integerValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventType.Code"));
				eventType.setName(context.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventType.Name"));
				diskEventType.setEventType(eventType);

				diskEventSet.add(diskEventType);
			}
			diskFullStatusType.setDiskEventSet(diskEventSet);

			diskFullStatusSet.add(diskFullStatusType);
		}
		describeDisksFullStatusResponse.setDiskFullStatusSet(diskFullStatusSet);
	 
	 	return describeDisksFullStatusResponse;
	}
}