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

import com.aliyuncs.iovcc.model.v20180501.FindVersionTestsResponse;
import com.aliyuncs.iovcc.model.v20180501.FindVersionTestsResponse.VersionTestList;
import com.aliyuncs.iovcc.model.v20180501.FindVersionTestsResponse.VersionTestList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindVersionTestsResponseUnmarshaller {

	public static FindVersionTestsResponse unmarshall(FindVersionTestsResponse findVersionTestsResponse, UnmarshallerContext _ctx) {
		
		findVersionTestsResponse.setRequestId(_ctx.stringValue("FindVersionTestsResponse.RequestId"));

		VersionTestList versionTestList = new VersionTestList();
		versionTestList.setTotalCount(_ctx.integerValue("FindVersionTestsResponse.VersionTestList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindVersionTestsResponse.VersionTestList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.longValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].Id"));
			itemsItem.setVersionId(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].VersionId"));
			itemsItem.setVersionType(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].VersionType"));
			itemsItem.setName(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].Name"));
			itemsItem.setDescription(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].Description"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtModify(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].GmtModify"));
			itemsItem.setDeviceGroupId(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].DeviceGroupId"));
			itemsItem.setDeviceGroupName(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].DeviceGroupName"));
			itemsItem.setSucceededCount(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].SucceededCount"));
			itemsItem.setFailedCount(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].FailedCount"));
			itemsItem.setSkippedCount(_ctx.stringValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].SkippedCount"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].GmtCreateTimestamp"));
			itemsItem.setGmtModifyTimestamp(_ctx.longValue("FindVersionTestsResponse.VersionTestList.Items["+ i +"].GmtModifyTimestamp"));

			items.add(itemsItem);
		}
		versionTestList.setItems(items);
		findVersionTestsResponse.setVersionTestList(versionTestList);
	 
	 	return findVersionTestsResponse;
	}
}