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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeClassListResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeClassListResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClassListResponseUnmarshaller {

	public static DescribeClassListResponse unmarshall(DescribeClassListResponse describeClassListResponse, UnmarshallerContext _ctx) {
		
		describeClassListResponse.setRequestId(_ctx.stringValue("DescribeClassListResponse.RequestId"));
		describeClassListResponse.setRegionId(_ctx.stringValue("DescribeClassListResponse.RegionId"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClassListResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setPsl4MaxIOPS(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].Psl4MaxIOPS"));
			itemsItem.setClassTypeLevel(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].ClassTypeLevel"));
			itemsItem.setCpu(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].Cpu"));
			itemsItem.setReferencePrice(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].ReferencePrice"));
			itemsItem.setReferenceExtPrice(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].ReferenceExtPrice"));
			itemsItem.setMaxConnections(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].MaxConnections"));
			itemsItem.setMemoryClass(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].MemoryClass"));
			itemsItem.setClassCode(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].ClassCode"));
			itemsItem.setClassGroup(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].ClassGroup"));
			itemsItem.setPsl5MaxIOPS(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].Psl5MaxIOPS"));
			itemsItem.setMaxIOPS(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].MaxIOPS"));
			itemsItem.setMaxStorageCapacity(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].MaxStorageCapacity"));
			itemsItem.setPl1MaxIOPS(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].Pl1MaxIOPS"));
			itemsItem.setPl2MaxIOPS(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].Pl2MaxIOPS"));
			itemsItem.setPl3MaxIOPS(_ctx.stringValue("DescribeClassListResponse.Items["+ i +"].Pl3MaxIOPS"));

			items.add(itemsItem);
		}
		describeClassListResponse.setItems(items);
	 
	 	return describeClassListResponse;
	}
}