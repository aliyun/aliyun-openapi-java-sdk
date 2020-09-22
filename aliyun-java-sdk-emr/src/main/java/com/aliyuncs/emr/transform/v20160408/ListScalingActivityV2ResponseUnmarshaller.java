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

import com.aliyuncs.emr.model.v20160408.ListScalingActivityV2Response;
import com.aliyuncs.emr.model.v20160408.ListScalingActivityV2Response.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScalingActivityV2ResponseUnmarshaller {

	public static ListScalingActivityV2Response unmarshall(ListScalingActivityV2Response listScalingActivityV2Response, UnmarshallerContext _ctx) {
		
		listScalingActivityV2Response.setRequestId(_ctx.stringValue("ListScalingActivityV2Response.RequestId"));
		listScalingActivityV2Response.setPageNumber(_ctx.integerValue("ListScalingActivityV2Response.PageNumber"));
		listScalingActivityV2Response.setPageSize(_ctx.integerValue("ListScalingActivityV2Response.PageSize"));
		listScalingActivityV2Response.setTotalCount(_ctx.integerValue("ListScalingActivityV2Response.TotalCount"));
		listScalingActivityV2Response.setNextToken(_ctx.stringValue("ListScalingActivityV2Response.NextToken"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListScalingActivityV2Response.Items.Length"); i++) {
			Item item = new Item();
			item.setBizId(_ctx.stringValue("ListScalingActivityV2Response.Items["+ i +"].BizId"));
			item.setStartTime(_ctx.longValue("ListScalingActivityV2Response.Items["+ i +"].StartTime"));
			item.setEndTime(_ctx.longValue("ListScalingActivityV2Response.Items["+ i +"].EndTime"));
			item.setExpectNum(_ctx.integerValue("ListScalingActivityV2Response.Items["+ i +"].ExpectNum"));
			item.setInstanceIds(_ctx.stringValue("ListScalingActivityV2Response.Items["+ i +"].InstanceIds"));
			item.setTotalCapacity(_ctx.integerValue("ListScalingActivityV2Response.Items["+ i +"].TotalCapacity"));
			item.setCause(_ctx.stringValue("ListScalingActivityV2Response.Items["+ i +"].Cause"));
			item.setDescription(_ctx.stringValue("ListScalingActivityV2Response.Items["+ i +"].Description"));
			item.setTransition(_ctx.stringValue("ListScalingActivityV2Response.Items["+ i +"].Transition"));
			item.setStatus(_ctx.stringValue("ListScalingActivityV2Response.Items["+ i +"].Status"));
			item.setScalingRuleId(_ctx.stringValue("ListScalingActivityV2Response.Items["+ i +"].ScalingRuleId"));
			item.setScalingRuleName(_ctx.stringValue("ListScalingActivityV2Response.Items["+ i +"].ScalingRuleName"));
			item.setHostGroupBizId(_ctx.stringValue("ListScalingActivityV2Response.Items["+ i +"].HostGroupBizId"));
			item.setHostGroupName(_ctx.stringValue("ListScalingActivityV2Response.Items["+ i +"].HostGroupName"));

			items.add(item);
		}
		listScalingActivityV2Response.setItems(items);
	 
	 	return listScalingActivityV2Response;
	}
}