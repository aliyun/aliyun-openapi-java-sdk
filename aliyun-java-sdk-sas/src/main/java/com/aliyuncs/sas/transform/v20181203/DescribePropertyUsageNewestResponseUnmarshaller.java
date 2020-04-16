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

import com.aliyuncs.sas.model.v20181203.DescribePropertyUsageNewestResponse;
import com.aliyuncs.sas.model.v20181203.DescribePropertyUsageNewestResponse.NewestStatisticItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePropertyUsageNewestResponseUnmarshaller {

	public static DescribePropertyUsageNewestResponse unmarshall(DescribePropertyUsageNewestResponse describePropertyUsageNewestResponse, UnmarshallerContext _ctx) {
		
		describePropertyUsageNewestResponse.setRequestId(_ctx.stringValue("DescribePropertyUsageNewestResponse.RequestId"));
		describePropertyUsageNewestResponse.setItemCount(_ctx.integerValue("DescribePropertyUsageNewestResponse.ItemCount"));
		describePropertyUsageNewestResponse.setType(_ctx.stringValue("DescribePropertyUsageNewestResponse.Type"));

		List<NewestStatisticItem> newestStatisticItems = new ArrayList<NewestStatisticItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePropertyUsageNewestResponse.NewestStatisticItems.Length"); i++) {
			NewestStatisticItem newestStatisticItem = new NewestStatisticItem();
			newestStatisticItem.setName(_ctx.stringValue("DescribePropertyUsageNewestResponse.NewestStatisticItems["+ i +"].Name"));
			newestStatisticItem.setCreate(_ctx.longValue("DescribePropertyUsageNewestResponse.NewestStatisticItems["+ i +"].Create"));

			newestStatisticItems.add(newestStatisticItem);
		}
		describePropertyUsageNewestResponse.setNewestStatisticItems(newestStatisticItems);
	 
	 	return describePropertyUsageNewestResponse;
	}
}