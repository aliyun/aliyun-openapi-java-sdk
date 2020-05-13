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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.FindPrepublishesByParentIdResponse;
import com.aliyuncs.iovcc.model.v20180501.FindPrepublishesByParentIdResponse.PrepublishList;
import com.aliyuncs.iovcc.model.v20180501.FindPrepublishesByParentIdResponse.PrepublishList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindPrepublishesByParentIdResponseUnmarshaller {

	public static FindPrepublishesByParentIdResponse unmarshall(FindPrepublishesByParentIdResponse findPrepublishesByParentIdResponse, UnmarshallerContext _ctx) {
		
		findPrepublishesByParentIdResponse.setRequestId(_ctx.stringValue("FindPrepublishesByParentIdResponse.RequestId"));

		PrepublishList prepublishList = new PrepublishList();
		prepublishList.setTotalCount(_ctx.integerValue("FindPrepublishesByParentIdResponse.PrepublishList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindPrepublishesByParentIdResponse.PrepublishList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.longValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].Id"));
			itemsItem.setName(_ctx.stringValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].Name"));
			itemsItem.setVersionType(_ctx.stringValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].VersionType"));
			itemsItem.setVersionId(_ctx.stringValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].VersionId"));
			itemsItem.setBarrierCount(_ctx.stringValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].BarrierCount"));
			itemsItem.setDeviceModelId(_ctx.stringValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].DeviceModelId"));
			itemsItem.setParentId(_ctx.stringValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].ParentId"));
			itemsItem.setIsActive(_ctx.stringValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].IsActive"));
			itemsItem.setIsTotalPrepublish(_ctx.stringValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].IsTotalPrepublish"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtModify(_ctx.stringValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].GmtModify"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].GmtCreateTimestamp"));
			itemsItem.setGmtModifyTimestamp(_ctx.longValue("FindPrepublishesByParentIdResponse.PrepublishList.Items["+ i +"].GmtModifyTimestamp"));

			items.add(itemsItem);
		}
		prepublishList.setItems(items);
		findPrepublishesByParentIdResponse.setPrepublishList(prepublishList);
	 
	 	return findPrepublishesByParentIdResponse;
	}
}