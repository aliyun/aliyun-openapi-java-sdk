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

import com.aliyuncs.emr.model.v20160408.GetAuditLogsResponse;
import com.aliyuncs.emr.model.v20160408.GetAuditLogsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAuditLogsResponseUnmarshaller {

	public static GetAuditLogsResponse unmarshall(GetAuditLogsResponse getAuditLogsResponse, UnmarshallerContext _ctx) {
		
		getAuditLogsResponse.setRequestId(_ctx.stringValue("GetAuditLogsResponse.RequestId"));
		getAuditLogsResponse.setPageNumber(_ctx.integerValue("GetAuditLogsResponse.PageNumber"));
		getAuditLogsResponse.setPageSize(_ctx.integerValue("GetAuditLogsResponse.PageSize"));
		getAuditLogsResponse.setTotalCount(_ctx.integerValue("GetAuditLogsResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("GetAuditLogsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setTs(_ctx.longValue("GetAuditLogsResponse.Items["+ i +"].Ts"));
			item.setUserId(_ctx.stringValue("GetAuditLogsResponse.Items["+ i +"].UserId"));
			item.setEntityId(_ctx.stringValue("GetAuditLogsResponse.Items["+ i +"].EntityId"));
			item.setOperation(_ctx.stringValue("GetAuditLogsResponse.Items["+ i +"].Operation"));
			item.setContent(_ctx.stringValue("GetAuditLogsResponse.Items["+ i +"].Content"));

			items.add(item);
		}
		getAuditLogsResponse.setItems(items);
	 
	 	return getAuditLogsResponse;
	}
}