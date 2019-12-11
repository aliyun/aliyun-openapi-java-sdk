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

	public static DescribeSystemEventCountResponse unmarshall(DescribeSystemEventCountResponse describeSystemEventCountResponse, UnmarshallerContext _ctx) {
		
		describeSystemEventCountResponse.setRequestId(_ctx.stringValue("DescribeSystemEventCountResponse.RequestId"));
		describeSystemEventCountResponse.setCode(_ctx.stringValue("DescribeSystemEventCountResponse.Code"));
		describeSystemEventCountResponse.setMessage(_ctx.stringValue("DescribeSystemEventCountResponse.Message"));
		describeSystemEventCountResponse.setSuccess(_ctx.stringValue("DescribeSystemEventCountResponse.Success"));

		List<SystemEventCount> systemEventCounts = new ArrayList<SystemEventCount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSystemEventCountResponse.SystemEventCounts.Length"); i++) {
			SystemEventCount systemEventCount = new SystemEventCount();
			systemEventCount.setContent(_ctx.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Content"));
			systemEventCount.setProduct(_ctx.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Product"));
			systemEventCount.setName(_ctx.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Name"));
			systemEventCount.setGroupId(_ctx.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].GroupId"));
			systemEventCount.setNum(_ctx.longValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Num"));
			systemEventCount.setLevel(_ctx.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Level"));
			systemEventCount.setStatus(_ctx.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Status"));
			systemEventCount.setResourceId(_ctx.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].ResourceId"));
			systemEventCount.setRegionId(_ctx.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].RegionId"));
			systemEventCount.setInstanceName(_ctx.stringValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].InstanceName"));
			systemEventCount.setTime(_ctx.longValue("DescribeSystemEventCountResponse.SystemEventCounts["+ i +"].Time"));

			systemEventCounts.add(systemEventCount);
		}
		describeSystemEventCountResponse.setSystemEventCounts(systemEventCounts);
	 
	 	return describeSystemEventCountResponse;
	}
}