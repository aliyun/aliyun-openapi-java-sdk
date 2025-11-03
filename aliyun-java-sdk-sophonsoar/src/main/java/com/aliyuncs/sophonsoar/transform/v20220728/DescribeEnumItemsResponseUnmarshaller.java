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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeEnumItemsResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeEnumItemsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnumItemsResponseUnmarshaller {

	public static DescribeEnumItemsResponse unmarshall(DescribeEnumItemsResponse describeEnumItemsResponse, UnmarshallerContext _ctx) {
		
		describeEnumItemsResponse.setRequestId(_ctx.stringValue("DescribeEnumItemsResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnumItemsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("DescribeEnumItemsResponse.Data["+ i +"].Key"));
			dataItem.setValue(_ctx.stringValue("DescribeEnumItemsResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		describeEnumItemsResponse.setData(data);
	 
	 	return describeEnumItemsResponse;
	}
}