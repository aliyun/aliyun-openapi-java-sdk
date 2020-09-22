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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListScalingConfigItemV2Response;
import com.aliyuncs.emr.model.v20160408.ListScalingConfigItemV2Response.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScalingConfigItemV2ResponseUnmarshaller {

	public static ListScalingConfigItemV2Response unmarshall(ListScalingConfigItemV2Response listScalingConfigItemV2Response, UnmarshallerContext _ctx) {
		
		listScalingConfigItemV2Response.setRequestId(_ctx.stringValue("ListScalingConfigItemV2Response.RequestId"));
		listScalingConfigItemV2Response.setPageNumber(_ctx.integerValue("ListScalingConfigItemV2Response.PageNumber"));
		listScalingConfigItemV2Response.setPageSize(_ctx.integerValue("ListScalingConfigItemV2Response.PageSize"));
		listScalingConfigItemV2Response.setTotalCount(_ctx.integerValue("ListScalingConfigItemV2Response.TotalCount"));
		listScalingConfigItemV2Response.setNextToken(_ctx.stringValue("ListScalingConfigItemV2Response.NextToken"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListScalingConfigItemV2Response.Items.Length"); i++) {
			Item item = new Item();
			item.setConfigItemType(_ctx.stringValue("ListScalingConfigItemV2Response.Items["+ i +"].ConfigItemType"));
			item.setScalingGroupBizId(_ctx.stringValue("ListScalingConfigItemV2Response.Items["+ i +"].ScalingGroupBizId"));
			item.setScalingConfigItemBizId(_ctx.stringValue("ListScalingConfigItemV2Response.Items["+ i +"].ScalingConfigItemBizId"));
			item.setConfigItemInformation(_ctx.stringValue("ListScalingConfigItemV2Response.Items["+ i +"].ConfigItemInformation"));

			items.add(item);
		}
		listScalingConfigItemV2Response.setItems(items);
	 
	 	return listScalingConfigItemV2Response;
	}
}