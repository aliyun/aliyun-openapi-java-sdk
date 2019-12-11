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

import com.aliyuncs.cms.model.v20190101.DescribeCustomEventAttributeResponse;
import com.aliyuncs.cms.model.v20190101.DescribeCustomEventAttributeResponse.CustomEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomEventAttributeResponseUnmarshaller {

	public static DescribeCustomEventAttributeResponse unmarshall(DescribeCustomEventAttributeResponse describeCustomEventAttributeResponse, UnmarshallerContext _ctx) {
		
		describeCustomEventAttributeResponse.setRequestId(_ctx.stringValue("DescribeCustomEventAttributeResponse.RequestId"));
		describeCustomEventAttributeResponse.setCode(_ctx.stringValue("DescribeCustomEventAttributeResponse.Code"));
		describeCustomEventAttributeResponse.setMessage(_ctx.stringValue("DescribeCustomEventAttributeResponse.Message"));
		describeCustomEventAttributeResponse.setSuccess(_ctx.stringValue("DescribeCustomEventAttributeResponse.Success"));

		List<CustomEvent> customEvents = new ArrayList<CustomEvent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomEventAttributeResponse.CustomEvents.Length"); i++) {
			CustomEvent customEvent = new CustomEvent();
			customEvent.setId(_ctx.stringValue("DescribeCustomEventAttributeResponse.CustomEvents["+ i +"].Id"));
			customEvent.setContent(_ctx.stringValue("DescribeCustomEventAttributeResponse.CustomEvents["+ i +"].Content"));
			customEvent.setGroupId(_ctx.stringValue("DescribeCustomEventAttributeResponse.CustomEvents["+ i +"].GroupId"));
			customEvent.setName(_ctx.stringValue("DescribeCustomEventAttributeResponse.CustomEvents["+ i +"].Name"));
			customEvent.setTime(_ctx.stringValue("DescribeCustomEventAttributeResponse.CustomEvents["+ i +"].Time"));

			customEvents.add(customEvent);
		}
		describeCustomEventAttributeResponse.setCustomEvents(customEvents);
	 
	 	return describeCustomEventAttributeResponse;
	}
}