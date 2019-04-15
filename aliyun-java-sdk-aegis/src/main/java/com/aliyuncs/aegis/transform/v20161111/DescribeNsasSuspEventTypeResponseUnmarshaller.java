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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeNsasSuspEventTypeResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeNsasSuspEventTypeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNsasSuspEventTypeResponseUnmarshaller {

	public static DescribeNsasSuspEventTypeResponse unmarshall(DescribeNsasSuspEventTypeResponse describeNsasSuspEventTypeResponse, UnmarshallerContext context) {
		
		describeNsasSuspEventTypeResponse.setRequestId(context.stringValue("DescribeNsasSuspEventTypeResponse.RequestId"));

		List<Data> eventTypes = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeNsasSuspEventTypeResponse.EventTypes.Length"); i++) {
			Data data = new Data();
			data.setName(context.stringValue("DescribeNsasSuspEventTypeResponse.EventTypes["+ i +"].Name"));
			data.setType(context.stringValue("DescribeNsasSuspEventTypeResponse.EventTypes["+ i +"].Type"));
			data.setSuspEventCount(context.integerValue("DescribeNsasSuspEventTypeResponse.EventTypes["+ i +"].SuspEventCount"));

			eventTypes.add(data);
		}
		describeNsasSuspEventTypeResponse.setEventTypes(eventTypes);
	 
	 	return describeNsasSuspEventTypeResponse;
	}
}