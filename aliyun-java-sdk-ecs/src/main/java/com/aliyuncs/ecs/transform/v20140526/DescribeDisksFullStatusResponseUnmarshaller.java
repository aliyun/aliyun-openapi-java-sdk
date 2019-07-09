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

	public static DescribeDisksFullStatusResponse unmarshall(DescribeDisksFullStatusResponse describeDisksFullStatusResponse, UnmarshallerContext _ctx) {
		
		describeDisksFullStatusResponse.setRequestId(_ctx.stringValue("DescribeDisksFullStatusResponse.RequestId"));
		describeDisksFullStatusResponse.setTotalCount(_ctx.integerValue("DescribeDisksFullStatusResponse.TotalCount"));
		describeDisksFullStatusResponse.setPageNumber(_ctx.integerValue("DescribeDisksFullStatusResponse.PageNumber"));
		describeDisksFullStatusResponse.setPageSize(_ctx.integerValue("DescribeDisksFullStatusResponse.PageSize"));

		List<DiskFullStatusType> diskFullStatusSet = new ArrayList<DiskFullStatusType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDisksFullStatusResponse.DiskFullStatusSet.Length"); i++) {
			DiskFullStatusType diskFullStatusType = new DiskFullStatusType();
			diskFullStatusType.setDiskId(_ctx.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskId"));
			diskFullStatusType.setInstanceId(_ctx.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].InstanceId"));
			diskFullStatusType.setDevice(_ctx.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].Device"));

			Status status = new Status();
			status.setCode(_ctx.integerValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].Status.Code"));
			status.setName(_ctx.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].Status.Name"));
			diskFullStatusType.setStatus(status);

			HealthStatus healthStatus = new HealthStatus();
			healthStatus.setCode(_ctx.integerValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].HealthStatus.Code"));
			healthStatus.setName(_ctx.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].HealthStatus.Name"));
			diskFullStatusType.setHealthStatus(healthStatus);

			List<DiskEventType> diskEventSet = new ArrayList<DiskEventType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet.Length"); j++) {
				DiskEventType diskEventType = new DiskEventType();
				diskEventType.setEventId(_ctx.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventId"));
				diskEventType.setEventTime(_ctx.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventTime"));
				diskEventType.setEventEndTime(_ctx.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventEndTime"));

				EventType eventType = new EventType();
				eventType.setCode(_ctx.integerValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventType.Code"));
				eventType.setName(_ctx.stringValue("DescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventType.Name"));
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