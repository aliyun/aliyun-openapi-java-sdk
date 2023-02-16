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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeAvailableAdvicesResponse;
import com.aliyuncs.adb.model.v20190315.DescribeAvailableAdvicesResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableAdvicesResponseUnmarshaller {

	public static DescribeAvailableAdvicesResponse unmarshall(DescribeAvailableAdvicesResponse describeAvailableAdvicesResponse, UnmarshallerContext _ctx) {
		
		describeAvailableAdvicesResponse.setRequestId(_ctx.stringValue("DescribeAvailableAdvicesResponse.RequestId"));
		describeAvailableAdvicesResponse.setPageNumber(_ctx.longValue("DescribeAvailableAdvicesResponse.PageNumber"));
		describeAvailableAdvicesResponse.setPageSize(_ctx.longValue("DescribeAvailableAdvicesResponse.PageSize"));
		describeAvailableAdvicesResponse.setTotalCount(_ctx.longValue("DescribeAvailableAdvicesResponse.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableAdvicesResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setAdviceId(_ctx.stringValue("DescribeAvailableAdvicesResponse.Items["+ i +"].AdviceId"));
			itemsItem.setAdviceDate(_ctx.stringValue("DescribeAvailableAdvicesResponse.Items["+ i +"].AdviceDate"));
			itemsItem.setAdviceType(_ctx.stringValue("DescribeAvailableAdvicesResponse.Items["+ i +"].AdviceType"));
			itemsItem.setSQL(_ctx.stringValue("DescribeAvailableAdvicesResponse.Items["+ i +"].SQL"));
			itemsItem.setReason(_ctx.stringValue("DescribeAvailableAdvicesResponse.Items["+ i +"].Reason"));
			itemsItem.setBenefit(_ctx.stringValue("DescribeAvailableAdvicesResponse.Items["+ i +"].Benefit"));
			itemsItem.setTotalCount(_ctx.longValue("DescribeAvailableAdvicesResponse.Items["+ i +"].TotalCount"));
			itemsItem.setPageSize(_ctx.longValue("DescribeAvailableAdvicesResponse.Items["+ i +"].PageSize"));
			itemsItem.setPageNumber(_ctx.longValue("DescribeAvailableAdvicesResponse.Items["+ i +"].PageNumber"));

			items.add(itemsItem);
		}
		describeAvailableAdvicesResponse.setItems(items);
	 
	 	return describeAvailableAdvicesResponse;
	}
}