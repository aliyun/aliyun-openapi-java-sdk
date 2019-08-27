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

import com.aliyuncs.emr.model.v20160408.GetFlowAuditLogsResponse;
import com.aliyuncs.emr.model.v20160408.GetFlowAuditLogsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowAuditLogsResponseUnmarshaller {

	public static GetFlowAuditLogsResponse unmarshall(GetFlowAuditLogsResponse getFlowAuditLogsResponse, UnmarshallerContext _ctx) {
		
		getFlowAuditLogsResponse.setRequestId(_ctx.stringValue("GetFlowAuditLogsResponse.RequestId"));
		getFlowAuditLogsResponse.setPageNumber(_ctx.integerValue("GetFlowAuditLogsResponse.PageNumber"));
		getFlowAuditLogsResponse.setPageSize(_ctx.integerValue("GetFlowAuditLogsResponse.PageSize"));
		getFlowAuditLogsResponse.setTotalCount(_ctx.integerValue("GetFlowAuditLogsResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("GetFlowAuditLogsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setTs(_ctx.longValue("GetFlowAuditLogsResponse.Items["+ i +"].Ts"));
			item.setUserId(_ctx.stringValue("GetFlowAuditLogsResponse.Items["+ i +"].UserId"));
			item.setOperatorId(_ctx.stringValue("GetFlowAuditLogsResponse.Items["+ i +"].OperatorId"));
			item.setEntityId(_ctx.stringValue("GetFlowAuditLogsResponse.Items["+ i +"].EntityId"));
			item.setEntityType(_ctx.stringValue("GetFlowAuditLogsResponse.Items["+ i +"].EntityType"));
			item.setEntityGroupId(_ctx.stringValue("GetFlowAuditLogsResponse.Items["+ i +"].EntityGroupId"));
			item.setOperation(_ctx.stringValue("GetFlowAuditLogsResponse.Items["+ i +"].Operation"));
			item.setStatus(_ctx.stringValue("GetFlowAuditLogsResponse.Items["+ i +"].Status"));
			item.setContent(_ctx.stringValue("GetFlowAuditLogsResponse.Items["+ i +"].Content"));

			items.add(item);
		}
		getFlowAuditLogsResponse.setItems(items);
	 
	 	return getFlowAuditLogsResponse;
	}
}