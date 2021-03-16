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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDisksFullStatusResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDisksFullStatusResponse.DiskFullStatusType;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDisksFullStatusResponse.DiskFullStatusType.DiskEventType;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDisksFullStatusResponse.DiskFullStatusType.DiskEventType.EventType;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDisksFullStatusResponse.DiskFullStatusType.HealthStatus;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDisksFullStatusResponse.DiskFullStatusType.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDisksFullStatusResponseUnmarshaller {

	public static OpsDescribeDisksFullStatusResponse unmarshall(OpsDescribeDisksFullStatusResponse opsDescribeDisksFullStatusResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDisksFullStatusResponse.setRequestId(_ctx.stringValue("OpsDescribeDisksFullStatusResponse.RequestId"));
		opsDescribeDisksFullStatusResponse.setTotalCount(_ctx.integerValue("OpsDescribeDisksFullStatusResponse.TotalCount"));
		opsDescribeDisksFullStatusResponse.setPageNumber(_ctx.integerValue("OpsDescribeDisksFullStatusResponse.PageNumber"));
		opsDescribeDisksFullStatusResponse.setPageSize(_ctx.integerValue("OpsDescribeDisksFullStatusResponse.PageSize"));

		List<DiskFullStatusType> diskFullStatusSet = new ArrayList<DiskFullStatusType>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet.Length"); i++) {
			DiskFullStatusType diskFullStatusType = new DiskFullStatusType();
			diskFullStatusType.setDiskId(_ctx.stringValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskId"));

			Status status = new Status();
			status.setCode(_ctx.integerValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].Status.Code"));
			status.setName(_ctx.stringValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].Status.Name"));
			diskFullStatusType.setStatus(status);

			HealthStatus healthStatus = new HealthStatus();
			healthStatus.setCode(_ctx.integerValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].HealthStatus.Code"));
			healthStatus.setName(_ctx.stringValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].HealthStatus.Name"));
			diskFullStatusType.setHealthStatus(healthStatus);

			List<DiskEventType> diskEventSet = new ArrayList<DiskEventType>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet.Length"); j++) {
				DiskEventType diskEventType = new DiskEventType();
				diskEventType.setEventId(_ctx.stringValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventId"));
				diskEventType.setEventTime(_ctx.stringValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventTime"));
				diskEventType.setEventEndTime(_ctx.stringValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventEndTime"));

				EventType eventType = new EventType();
				eventType.setCode(_ctx.integerValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventType.Code"));
				eventType.setName(_ctx.stringValue("OpsDescribeDisksFullStatusResponse.DiskFullStatusSet["+ i +"].DiskEventSet["+ j +"].EventType.Name"));
				diskEventType.setEventType(eventType);

				diskEventSet.add(diskEventType);
			}
			diskFullStatusType.setDiskEventSet(diskEventSet);

			diskFullStatusSet.add(diskFullStatusType);
		}
		opsDescribeDisksFullStatusResponse.setDiskFullStatusSet(diskFullStatusSet);
	 
	 	return opsDescribeDisksFullStatusResponse;
	}
}