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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.ListVccGrantRulesResponse;
import com.aliyuncs.eflo.model.v20220530.ListVccGrantRulesResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListVccGrantRulesResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVccGrantRulesResponseUnmarshaller {

	public static ListVccGrantRulesResponse unmarshall(ListVccGrantRulesResponse listVccGrantRulesResponse, UnmarshallerContext _ctx) {
		
		listVccGrantRulesResponse.setRequestId(_ctx.stringValue("ListVccGrantRulesResponse.RequestId"));
		listVccGrantRulesResponse.setCode(_ctx.integerValue("ListVccGrantRulesResponse.Code"));
		listVccGrantRulesResponse.setMessage(_ctx.stringValue("ListVccGrantRulesResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListVccGrantRulesResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVccGrantRulesResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("ListVccGrantRulesResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setTenantId(_ctx.stringValue("ListVccGrantRulesResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setInstanceId(_ctx.stringValue("ListVccGrantRulesResponse.Content.Data["+ i +"].InstanceId"));
			dataItem.setInstanceName(_ctx.stringValue("ListVccGrantRulesResponse.Content.Data["+ i +"].InstanceName"));
			dataItem.setProduct(_ctx.stringValue("ListVccGrantRulesResponse.Content.Data["+ i +"].Product"));
			dataItem.setErId(_ctx.stringValue("ListVccGrantRulesResponse.Content.Data["+ i +"].ErId"));
			dataItem.setGrantTenantId(_ctx.stringValue("ListVccGrantRulesResponse.Content.Data["+ i +"].GrantTenantId"));
			dataItem.setUsed(_ctx.booleanValue("ListVccGrantRulesResponse.Content.Data["+ i +"].Used"));
			dataItem.setCreateTime(_ctx.stringValue("ListVccGrantRulesResponse.Content.Data["+ i +"].CreateTime"));
			dataItem.setGrantRuleId(_ctx.stringValue("ListVccGrantRulesResponse.Content.Data["+ i +"].GrantRuleId"));
			dataItem.setResourceGroupId(_ctx.stringValue("ListVccGrantRulesResponse.Content.Data["+ i +"].ResourceGroupId"));

			data.add(dataItem);
		}
		content.setData(data);
		listVccGrantRulesResponse.setContent(content);
	 
	 	return listVccGrantRulesResponse;
	}
}