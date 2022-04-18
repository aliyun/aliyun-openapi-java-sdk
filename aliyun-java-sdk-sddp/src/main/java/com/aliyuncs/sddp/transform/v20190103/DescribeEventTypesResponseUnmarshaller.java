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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeEventTypesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeEventTypesResponse.EventType;
import com.aliyuncs.sddp.model.v20190103.DescribeEventTypesResponse.EventType.SubType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventTypesResponseUnmarshaller {

	public static DescribeEventTypesResponse unmarshall(DescribeEventTypesResponse describeEventTypesResponse, UnmarshallerContext _ctx) {
		
		describeEventTypesResponse.setRequestId(_ctx.stringValue("DescribeEventTypesResponse.RequestId"));

		List<EventType> eventTypeList = new ArrayList<EventType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventTypesResponse.EventTypeList.Length"); i++) {
			EventType eventType = new EventType();
			eventType.setCode(_ctx.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].Code"));
			eventType.setDescription(_ctx.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].Description"));
			eventType.setName(_ctx.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].Name"));
			eventType.setId(_ctx.longValue("DescribeEventTypesResponse.EventTypeList["+ i +"].Id"));

			List<SubType> subTypeList = new ArrayList<SubType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList.Length"); j++) {
				SubType subType = new SubType();
				subType.setStatus(_ctx.integerValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].Status"));
				subType.setDescription(_ctx.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].Description"));
				subType.setConfigContentType(_ctx.integerValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].ConfigContentType"));
				subType.setEventHitCount(_ctx.integerValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].EventHitCount"));
				subType.setConfigValue(_ctx.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].ConfigValue"));
				subType.setConfigCode(_ctx.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].ConfigCode"));
				subType.setCode(_ctx.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].Code"));
				subType.setConfigDescription(_ctx.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].ConfigDescription"));
				subType.setName(_ctx.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].Name"));
				subType.setAdaptedProduct(_ctx.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].AdaptedProduct"));
				subType.setId(_ctx.longValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].Id"));

				subTypeList.add(subType);
			}
			eventType.setSubTypeList(subTypeList);

			eventTypeList.add(eventType);
		}
		describeEventTypesResponse.setEventTypeList(eventTypeList);
	 
	 	return describeEventTypesResponse;
	}
}