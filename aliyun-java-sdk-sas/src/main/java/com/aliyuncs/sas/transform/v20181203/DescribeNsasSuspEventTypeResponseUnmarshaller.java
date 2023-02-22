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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeNsasSuspEventTypeResponse;
import com.aliyuncs.sas.model.v20181203.DescribeNsasSuspEventTypeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNsasSuspEventTypeResponseUnmarshaller {

	public static DescribeNsasSuspEventTypeResponse unmarshall(DescribeNsasSuspEventTypeResponse describeNsasSuspEventTypeResponse, UnmarshallerContext _ctx) {
		
		describeNsasSuspEventTypeResponse.setRequestId(_ctx.stringValue("DescribeNsasSuspEventTypeResponse.RequestId"));

		List<Data> eventTypes = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNsasSuspEventTypeResponse.EventTypes.Length"); i++) {
			Data data = new Data();
			data.setType(_ctx.stringValue("DescribeNsasSuspEventTypeResponse.EventTypes["+ i +"].Type"));
			data.setSuspEventCount(_ctx.integerValue("DescribeNsasSuspEventTypeResponse.EventTypes["+ i +"].SuspEventCount"));
			data.setName(_ctx.stringValue("DescribeNsasSuspEventTypeResponse.EventTypes["+ i +"].Name"));

			eventTypes.add(data);
		}
		describeNsasSuspEventTypeResponse.setEventTypes(eventTypes);
	 
	 	return describeNsasSuspEventTypeResponse;
	}
}