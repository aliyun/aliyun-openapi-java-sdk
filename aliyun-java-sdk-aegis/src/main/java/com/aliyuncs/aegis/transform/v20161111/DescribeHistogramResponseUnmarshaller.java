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

import com.aliyuncs.aegis.model.v20161111.DescribeHistogramResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeHistogramResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHistogramResponseUnmarshaller {

	public static DescribeHistogramResponse unmarshall(DescribeHistogramResponse describeHistogramResponse, UnmarshallerContext context) {
		
		describeHistogramResponse.setRequestId(context.stringValue("DescribeHistogramResponse.RequestId"));

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeHistogramResponse.Categories.Length"); i++) {
			categories.add(context.stringValue("DescribeHistogramResponse.Categories["+ i +"]"));
		}
		describeHistogramResponse.setCategories(categories);

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < context.lengthValue("DescribeHistogramResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();

			List<String> data = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeHistogramResponse.Items["+ i +"].Data.Length"); j++) {
				data.add(context.stringValue("DescribeHistogramResponse.Items["+ i +"].Data["+ j +"]"));
			}
			itemsItem.setData(data);

			items.add(itemsItem);
		}
		describeHistogramResponse.setItems(items);
	 
	 	return describeHistogramResponse;
	}
}