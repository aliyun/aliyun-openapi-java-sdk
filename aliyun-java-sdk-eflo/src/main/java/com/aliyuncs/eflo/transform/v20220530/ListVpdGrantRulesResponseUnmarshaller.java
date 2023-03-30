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

import com.aliyuncs.eflo.model.v20220530.ListVpdGrantRulesResponse;
import com.aliyuncs.eflo.model.v20220530.ListVpdGrantRulesResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListVpdGrantRulesResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpdGrantRulesResponseUnmarshaller {

	public static ListVpdGrantRulesResponse unmarshall(ListVpdGrantRulesResponse listVpdGrantRulesResponse, UnmarshallerContext _ctx) {
		
		listVpdGrantRulesResponse.setRequestId(_ctx.stringValue("ListVpdGrantRulesResponse.RequestId"));
		listVpdGrantRulesResponse.setCode(_ctx.integerValue("ListVpdGrantRulesResponse.Code"));
		listVpdGrantRulesResponse.setMessage(_ctx.stringValue("ListVpdGrantRulesResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListVpdGrantRulesResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVpdGrantRulesResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("ListVpdGrantRulesResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setTenantId(_ctx.stringValue("ListVpdGrantRulesResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setInstanceId(_ctx.stringValue("ListVpdGrantRulesResponse.Content.Data["+ i +"].InstanceId"));
			dataItem.setInstanceName(_ctx.stringValue("ListVpdGrantRulesResponse.Content.Data["+ i +"].InstanceName"));
			dataItem.setProduct(_ctx.stringValue("ListVpdGrantRulesResponse.Content.Data["+ i +"].Product"));
			dataItem.setErId(_ctx.stringValue("ListVpdGrantRulesResponse.Content.Data["+ i +"].ErId"));
			dataItem.setGrantTenantId(_ctx.stringValue("ListVpdGrantRulesResponse.Content.Data["+ i +"].GrantTenantId"));
			dataItem.setUsed(_ctx.booleanValue("ListVpdGrantRulesResponse.Content.Data["+ i +"].Used"));
			dataItem.setCreateTime(_ctx.stringValue("ListVpdGrantRulesResponse.Content.Data["+ i +"].CreateTime"));
			dataItem.setGrantRuleId(_ctx.stringValue("ListVpdGrantRulesResponse.Content.Data["+ i +"].GrantRuleId"));

			data.add(dataItem);
		}
		content.setData(data);
		listVpdGrantRulesResponse.setContent(content);
	 
	 	return listVpdGrantRulesResponse;
	}
}