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

import com.aliyuncs.cms.model.v20190101.DescribeCustomEventCountResponse;
import com.aliyuncs.cms.model.v20190101.DescribeCustomEventCountResponse.CustomEventCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomEventCountResponseUnmarshaller {

	public static DescribeCustomEventCountResponse unmarshall(DescribeCustomEventCountResponse describeCustomEventCountResponse, UnmarshallerContext _ctx) {
		
		describeCustomEventCountResponse.setRequestId(_ctx.stringValue("DescribeCustomEventCountResponse.RequestId"));
		describeCustomEventCountResponse.setCode(_ctx.stringValue("DescribeCustomEventCountResponse.Code"));
		describeCustomEventCountResponse.setMessage(_ctx.stringValue("DescribeCustomEventCountResponse.Message"));
		describeCustomEventCountResponse.setSuccess(_ctx.booleanValue("DescribeCustomEventCountResponse.Success"));

		List<CustomEventCount> customEventCounts = new ArrayList<CustomEventCount>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomEventCountResponse.CustomEventCounts.Length"); i++) {
			CustomEventCount customEventCount = new CustomEventCount();
			customEventCount.setName(_ctx.stringValue("DescribeCustomEventCountResponse.CustomEventCounts["+ i +"].Name"));
			customEventCount.setNum(_ctx.integerValue("DescribeCustomEventCountResponse.CustomEventCounts["+ i +"].Num"));
			customEventCount.setTime(_ctx.longValue("DescribeCustomEventCountResponse.CustomEventCounts["+ i +"].Time"));

			customEventCounts.add(customEventCount);
		}
		describeCustomEventCountResponse.setCustomEventCounts(customEventCounts);
	 
	 	return describeCustomEventCountResponse;
	}
}