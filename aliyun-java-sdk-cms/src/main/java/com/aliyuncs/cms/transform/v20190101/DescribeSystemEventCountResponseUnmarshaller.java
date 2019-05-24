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

import com.aliyuncs.cms.model.v20190101.DescribeSystemEventCountResponse;
import com.aliyuncs.cms.model.v20190101.DescribeSystemEventCountResponse.SystemEventCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSystemEventCountResponseUnmarshaller {

	public static DescribeSystemEventCountResponse unmarshall(DescribeSystemEventCountResponse describeSystemEventCountResponse, UnmarshallerContext context) {
		
		describeSystemEventCountResponse.setRequestId(context.stringValue("DescribeSystemEventCountResponse.RequestId"));
		describeSystemEventCountResponse.setCode(context.stringValue("DescribeSystemEventCountResponse.Code"));
		describeSystemEventCountResponse.setMessage(context.stringValue("DescribeSystemEventCountResponse.Message"));
		describeSystemEventCountResponse.setSuccess(context.stringValue("DescribeSystemEventCountResponse.Success"));

		List<SystemEventCount> systemEventCounts = new ArrayList<SystemEventCount>();
		for (int i = 0; i < context.lengthValue("DescribeSystemEventCountResponse.SystemEventCounts.Length"); i++) {
			SystemEventCount systemEventCount = new SystemEventCount();
			systemEventCount.setContent(context.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Content"));
			systemEventCount.setProduct(context.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Product"));
			systemEventCount.setName(context.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Name"));
			systemEventCount.setGroupId(context.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].GroupId"));
			systemEventCount.setNum(context.longValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Num"));
			systemEventCount.setLevel(context.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Level"));
			systemEventCount.setStatus(context.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Status"));
			systemEventCount.setResourceId(context.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].ResourceId"));
			systemEventCount.setRegionId(context.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].RegionId"));
			systemEventCount.setInstanceName(context.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].InstanceName"));
			systemEventCount.setTime(context.longValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Time"));

			systemEventCounts.add(systemEventCount);
		}
		describeSystemEventCountResponse.setSystemEventCounts(systemEventCounts);
	 
	 	return describeSystemEventCountResponse;
	}
}