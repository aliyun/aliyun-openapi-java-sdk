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

import com.aliyuncs.emr.model.v20160408.ListFlowEntitySnapshotResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowEntitySnapshotResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowEntitySnapshotResponseUnmarshaller {

	public static ListFlowEntitySnapshotResponse unmarshall(ListFlowEntitySnapshotResponse listFlowEntitySnapshotResponse, UnmarshallerContext _ctx) {
		
		listFlowEntitySnapshotResponse.setRequestId(_ctx.stringValue("ListFlowEntitySnapshotResponse.RequestId"));
		listFlowEntitySnapshotResponse.setPageNumber(_ctx.integerValue("ListFlowEntitySnapshotResponse.PageNumber"));
		listFlowEntitySnapshotResponse.setPageSize(_ctx.integerValue("ListFlowEntitySnapshotResponse.PageSize"));
		listFlowEntitySnapshotResponse.setTotalCount(_ctx.integerValue("ListFlowEntitySnapshotResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowEntitySnapshotResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setGmtCreate(_ctx.longValue("ListFlowEntitySnapshotResponse.Items["+ i +"].GmtCreate"));
			item.setRevision(_ctx.stringValue("ListFlowEntitySnapshotResponse.Items["+ i +"].Revision"));
			item.setUserId(_ctx.stringValue("ListFlowEntitySnapshotResponse.Items["+ i +"].UserId"));
			item.setCommitterId(_ctx.stringValue("ListFlowEntitySnapshotResponse.Items["+ i +"].CommitterId"));
			item.setMessage(_ctx.stringValue("ListFlowEntitySnapshotResponse.Items["+ i +"].Message"));
			item.setEntityId(_ctx.stringValue("ListFlowEntitySnapshotResponse.Items["+ i +"].EntityId"));
			item.setEntityGroupId(_ctx.stringValue("ListFlowEntitySnapshotResponse.Items["+ i +"].EntityGroupId"));
			item.setEntityType(_ctx.stringValue("ListFlowEntitySnapshotResponse.Items["+ i +"].EntityType"));
			item.setData(_ctx.stringValue("ListFlowEntitySnapshotResponse.Items["+ i +"].Data"));
			item.setActive(_ctx.booleanValue("ListFlowEntitySnapshotResponse.Items["+ i +"].Active"));

			items.add(item);
		}
		listFlowEntitySnapshotResponse.setItems(items);
	 
	 	return listFlowEntitySnapshotResponse;
	}
}