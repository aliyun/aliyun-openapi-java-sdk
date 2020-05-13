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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceValiditySchemaResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceValiditySchemaResponse.ItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceValiditySchemaResponseUnmarshaller {

	public static DescribeDeviceValiditySchemaResponse unmarshall(DescribeDeviceValiditySchemaResponse describeDeviceValiditySchemaResponse, UnmarshallerContext _ctx) {
		
		describeDeviceValiditySchemaResponse.setRequestId(_ctx.stringValue("DescribeDeviceValiditySchemaResponse.RequestId"));

		List<ItemListItem> itemList = new ArrayList<ItemListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeviceValiditySchemaResponse.ItemList.Length"); i++) {
			ItemListItem itemListItem = new ItemListItem();
			itemListItem.setPath(_ctx.stringValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].Path"));
			itemListItem.setType(_ctx.stringValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].Type"));
			itemListItem.setItemType(_ctx.stringValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].ItemType"));
			itemListItem.setDescription(_ctx.stringValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].Description"));
			itemListItem.setRequired(_ctx.stringValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].Required"));
			itemListItem.setMaximum(_ctx.floatValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].Maximum"));
			itemListItem.setMinimum(_ctx.floatValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].Minimum"));
			itemListItem.setExclusiveMaximum(_ctx.booleanValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].ExclusiveMaximum"));
			itemListItem.setExclusiveMinimum(_ctx.booleanValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].ExclusiveMinimum"));
			itemListItem.setEnumListStr(_ctx.stringValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].EnumListStr"));
			itemListItem.setMaxLength(_ctx.integerValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].MaxLength"));
			itemListItem.setMinLength(_ctx.integerValue("DescribeDeviceValiditySchemaResponse.ItemList["+ i +"].MinLength"));

			itemList.add(itemListItem);
		}
		describeDeviceValiditySchemaResponse.setItemList(itemList);
	 
	 	return describeDeviceValiditySchemaResponse;
	}
}