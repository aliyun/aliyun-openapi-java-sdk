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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeSystemEventAttributeResponse;
import com.aliyuncs.cms.model.v20190101.DescribeSystemEventAttributeResponse.SystemEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSystemEventAttributeResponseUnmarshaller {

	public static DescribeSystemEventAttributeResponse unmarshall(DescribeSystemEventAttributeResponse describeSystemEventAttributeResponse, UnmarshallerContext context) {
		
		describeSystemEventAttributeResponse.setRequestId(context.stringValue("DescribeSystemEventAttributeResponse.RequestId"));
		describeSystemEventAttributeResponse.setCode(context.stringValue("DescribeSystemEventAttributeResponse.Code"));
		describeSystemEventAttributeResponse.setMessage(context.stringValue("DescribeSystemEventAttributeResponse.Message"));
		describeSystemEventAttributeResponse.setSuccess(context.stringValue("DescribeSystemEventAttributeResponse.Success"));

		List<SystemEvent> systemEvents = new ArrayList<SystemEvent>();
		for (int i = 0; i < context.lengthValue("DescribeSystemEventAttributeResponse.SystemEvents.Length"); i++) {
			SystemEvent systemEvent = new SystemEvent();
			systemEvent.setContent(context.stringValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].Content"));
			systemEvent.setProduct(context.stringValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].Product"));
			systemEvent.setName(context.stringValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].Name"));
			systemEvent.setGroupId(context.stringValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].GroupId"));
			systemEvent.setNum(context.longValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].Num"));
			systemEvent.setLevel(context.stringValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].Level"));
			systemEvent.setStatus(context.stringValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].Status"));
			systemEvent.setResourceId(context.stringValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].ResourceId"));
			systemEvent.setRegionId(context.stringValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].RegionId"));
			systemEvent.setInstanceName(context.stringValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].InstanceName"));
			systemEvent.setTime(context.longValue("DescribeSystemEventAttributeResponse.SystemEvents["+ i +"].Time"));

			systemEvents.add(systemEvent);
		}
		describeSystemEventAttributeResponse.setSystemEvents(systemEvents);
	 
	 	return describeSystemEventAttributeResponse;
	}
}