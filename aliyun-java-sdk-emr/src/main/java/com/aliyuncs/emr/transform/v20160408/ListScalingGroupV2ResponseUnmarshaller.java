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

import com.aliyuncs.emr.model.v20160408.ListScalingGroupV2Response;
import com.aliyuncs.emr.model.v20160408.ListScalingGroupV2Response.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScalingGroupV2ResponseUnmarshaller {

	public static ListScalingGroupV2Response unmarshall(ListScalingGroupV2Response listScalingGroupV2Response, UnmarshallerContext _ctx) {
		
		listScalingGroupV2Response.setRequestId(_ctx.stringValue("ListScalingGroupV2Response.RequestId"));
		listScalingGroupV2Response.setPageNumber(_ctx.integerValue("ListScalingGroupV2Response.PageNumber"));
		listScalingGroupV2Response.setPageSize(_ctx.integerValue("ListScalingGroupV2Response.PageSize"));
		listScalingGroupV2Response.setTotalCount(_ctx.integerValue("ListScalingGroupV2Response.TotalCount"));
		listScalingGroupV2Response.setNextToken(_ctx.stringValue("ListScalingGroupV2Response.NextToken"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListScalingGroupV2Response.Items.Length"); i++) {
			Item item = new Item();
			item.setScalingGroupId(_ctx.stringValue("ListScalingGroupV2Response.Items["+ i +"].ScalingGroupId"));
			item.setName(_ctx.stringValue("ListScalingGroupV2Response.Items["+ i +"].Name"));
			item.setDescription(_ctx.stringValue("ListScalingGroupV2Response.Items["+ i +"].Description"));
			item.setActiveStatus(_ctx.stringValue("ListScalingGroupV2Response.Items["+ i +"].ActiveStatus"));
			item.setHostGroupBizId(_ctx.stringValue("ListScalingGroupV2Response.Items["+ i +"].HostGroupBizId"));
			item.setScalingInMode(_ctx.stringValue("ListScalingGroupV2Response.Items["+ i +"].ScalingInMode"));
			item.setScalingMinSize(_ctx.integerValue("ListScalingGroupV2Response.Items["+ i +"].ScalingMinSize"));
			item.setScalingMaxSize(_ctx.integerValue("ListScalingGroupV2Response.Items["+ i +"].ScalingMaxSize"));

			items.add(item);
		}
		listScalingGroupV2Response.setItems(items);
	 
	 	return listScalingGroupV2Response;
	}
}