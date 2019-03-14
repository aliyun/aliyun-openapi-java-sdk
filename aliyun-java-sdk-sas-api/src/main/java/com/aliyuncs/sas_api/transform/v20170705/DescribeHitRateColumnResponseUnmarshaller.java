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

package com.aliyuncs.sas_api.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas_api.model.v20170705.DescribeHitRateColumnResponse;
import com.aliyuncs.sas_api.model.v20170705.DescribeHitRateColumnResponse.Item;
import com.aliyuncs.sas_api.model.v20170705.DescribeHitRateColumnResponse.TimeScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHitRateColumnResponseUnmarshaller {

	public static DescribeHitRateColumnResponse unmarshall(DescribeHitRateColumnResponse describeHitRateColumnResponse, UnmarshallerContext context) {
		
		describeHitRateColumnResponse.setRequestId(context.stringValue("DescribeHitRateColumnResponse.RequestId"));

		TimeScope timeScope = new TimeScope();
		timeScope.setInterval(context.longValue("DescribeHitRateColumnResponse.TimeScope.Interval"));
		timeScope.setStart(context.longValue("DescribeHitRateColumnResponse.TimeScope.Start"));
		describeHitRateColumnResponse.setTimeScope(timeScope);

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeHitRateColumnResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setData(context.longValue("DescribeHitRateColumnResponse.Items["+ i +"].Data"));
			item.setId(context.stringValue("DescribeHitRateColumnResponse.Items["+ i +"].Id"));
			item.setName(context.stringValue("DescribeHitRateColumnResponse.Items["+ i +"].Name"));

			items.add(item);
		}
		describeHitRateColumnResponse.setItems(items);
	 
	 	return describeHitRateColumnResponse;
	}
}