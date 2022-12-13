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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribeAddonsResponse;
import com.aliyuncs.cs.model.v20151215.DescribeAddonsResponse.ComponentGroup;
import com.aliyuncs.cs.model.v20151215.DescribeAddonsResponse.ComponentGroup.Item;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAddonsResponseUnmarshaller {

	public static DescribeAddonsResponse unmarshall(DescribeAddonsResponse describeAddonsResponse, UnmarshallerContext _ctx) {
		
		describeAddonsResponse.setStandardComponents(_ctx.mapValue("DescribeAddonsResponse.StandardComponents"));

		List<ComponentGroup> componentGroups = new ArrayList<ComponentGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAddonsResponse.ComponentGroups.Length"); i++) {
			ComponentGroup componentGroup = new ComponentGroup();
			componentGroup.setGroup_name(_ctx.stringValue("DescribeAddonsResponse.ComponentGroups["+ i +"].group_name"));

			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAddonsResponse.ComponentGroups["+ i +"].items.Length"); j++) {
				Item item = new Item();
				item.setName(_ctx.stringValue("DescribeAddonsResponse.ComponentGroups["+ i +"].items["+ j +"].name"));

				items.add(item);
			}
			componentGroup.setItems(items);

			componentGroups.add(componentGroup);
		}
		describeAddonsResponse.setComponentGroups(componentGroups);
	 
	 	return describeAddonsResponse;
	}
}