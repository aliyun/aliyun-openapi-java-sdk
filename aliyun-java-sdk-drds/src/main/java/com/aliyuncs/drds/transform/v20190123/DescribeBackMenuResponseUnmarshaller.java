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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeBackMenuResponse;
import com.aliyuncs.drds.model.v20190123.DescribeBackMenuResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackMenuResponseUnmarshaller {

	public static DescribeBackMenuResponse unmarshall(DescribeBackMenuResponse describeBackMenuResponse, UnmarshallerContext _ctx) {
		
		describeBackMenuResponse.setRequestId(_ctx.stringValue("DescribeBackMenuResponse.RequestId"));
		describeBackMenuResponse.setSuccess(_ctx.booleanValue("DescribeBackMenuResponse.Success"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackMenuResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setMenuName(_ctx.stringValue("DescribeBackMenuResponse.List["+ i +"].MenuName"));
			listItem.setSupport(_ctx.booleanValue("DescribeBackMenuResponse.List["+ i +"].Support"));

			list.add(listItem);
		}
		describeBackMenuResponse.setList(list);
	 
	 	return describeBackMenuResponse;
	}
}