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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeTrafficControlsByApiResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeTrafficControlsByApiResponse.TrafficControlItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTrafficControlsByApiResponseUnmarshaller {

	public static DescribeTrafficControlsByApiResponse unmarshall(DescribeTrafficControlsByApiResponse describeTrafficControlsByApiResponse, UnmarshallerContext _ctx) {
		
		describeTrafficControlsByApiResponse.setRequestId(_ctx.stringValue("DescribeTrafficControlsByApiResponse.RequestId"));

		List<TrafficControlItem> trafficControlItems = new ArrayList<TrafficControlItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrafficControlsByApiResponse.TrafficControlItems.Length"); i++) {
			TrafficControlItem trafficControlItem = new TrafficControlItem();
			trafficControlItem.setTrafficControlItemId(_ctx.stringValue("DescribeTrafficControlsByApiResponse.TrafficControlItems["+ i +"].TrafficControlItemId"));
			trafficControlItem.setTrafficControlItemName(_ctx.stringValue("DescribeTrafficControlsByApiResponse.TrafficControlItems["+ i +"].TrafficControlItemName"));
			trafficControlItem.setBoundTime(_ctx.stringValue("DescribeTrafficControlsByApiResponse.TrafficControlItems["+ i +"].BoundTime"));

			trafficControlItems.add(trafficControlItem);
		}
		describeTrafficControlsByApiResponse.setTrafficControlItems(trafficControlItems);
	 
	 	return describeTrafficControlsByApiResponse;
	}
}