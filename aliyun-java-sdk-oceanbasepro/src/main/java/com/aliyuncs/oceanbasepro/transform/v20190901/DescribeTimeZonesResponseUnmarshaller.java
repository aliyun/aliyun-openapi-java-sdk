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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTimeZonesResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTimeZonesResponse.TimeZones;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTimeZonesResponse.TimeZones.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTimeZonesResponseUnmarshaller {

	public static DescribeTimeZonesResponse unmarshall(DescribeTimeZonesResponse describeTimeZonesResponse, UnmarshallerContext _ctx) {
		
		describeTimeZonesResponse.setRequestId(_ctx.stringValue("DescribeTimeZonesResponse.RequestId"));

		TimeZones timeZones = new TimeZones();
		timeZones.set_Default(_ctx.stringValue("DescribeTimeZonesResponse.TimeZones.Default"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTimeZonesResponse.TimeZones.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTimeZone(_ctx.stringValue("DescribeTimeZonesResponse.TimeZones.List["+ i +"].TimeZone"));
			listItem.setDescription(_ctx.stringValue("DescribeTimeZonesResponse.TimeZones.List["+ i +"].Description"));

			list.add(listItem);
		}
		timeZones.setList(list);
		describeTimeZonesResponse.setTimeZones(timeZones);
	 
	 	return describeTimeZonesResponse;
	}
}