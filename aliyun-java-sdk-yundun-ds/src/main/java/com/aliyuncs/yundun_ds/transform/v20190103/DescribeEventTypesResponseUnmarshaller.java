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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventTypesResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventTypesResponse.EventType;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventTypesResponse.EventType.SubType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventTypesResponseUnmarshaller {

	public static DescribeEventTypesResponse unmarshall(DescribeEventTypesResponse describeEventTypesResponse, UnmarshallerContext context) {
		
		describeEventTypesResponse.setRequestId(context.stringValue("DescribeEventTypesResponse.RequestId"));

		List<EventType> eventTypeList = new ArrayList<EventType>();
		for (int i = 0; i < context.lengthValue("DescribeEventTypesResponse.EventTypeList.Length"); i++) {
			EventType eventType = new EventType();
			eventType.setId(context.longValue("DescribeEventTypesResponse.EventTypeList["+ i +"].Id"));
			eventType.setName(context.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].Name"));
			eventType.setCode(context.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].Code"));
			eventType.setDescription(context.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].Description"));

			List<SubType> subTypeList = new ArrayList<SubType>();
			for (int j = 0; j < context.lengthValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList.Length"); j++) {
				SubType subType = new SubType();
				subType.setId(context.longValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].Id"));
				subType.setName(context.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].Name"));
				subType.setCode(context.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].Code"));
				subType.setDescription(context.stringValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].Description"));
				subType.setStatus(context.integerValue("DescribeEventTypesResponse.EventTypeList["+ i +"].SubTypeList["+ j +"].Status"));

				subTypeList.add(subType);
			}
			eventType.setSubTypeList(subTypeList);

			eventTypeList.add(eventType);
		}
		describeEventTypesResponse.setEventTypeList(eventTypeList);
	 
	 	return describeEventTypesResponse;
	}
}