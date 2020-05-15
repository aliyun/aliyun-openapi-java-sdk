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

import com.aliyuncs.iovcc.model.v20180501.FindOsVersionsResponse;
import com.aliyuncs.iovcc.model.v20180501.FindOsVersionsResponse.OsVersionList;
import com.aliyuncs.iovcc.model.v20180501.FindOsVersionsResponse.OsVersionList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindOsVersionsResponseUnmarshaller {

	public static FindOsVersionsResponse unmarshall(FindOsVersionsResponse findOsVersionsResponse, UnmarshallerContext _ctx) {
		
		findOsVersionsResponse.setRequestId(_ctx.stringValue("FindOsVersionsResponse.RequestId"));

		OsVersionList osVersionList = new OsVersionList();
		osVersionList.setTotalCount(_ctx.integerValue("FindOsVersionsResponse.OsVersionList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindOsVersionsResponse.OsVersionList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.longValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].Id"));
			itemsItem.setDeviceModelId(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].DeviceModelId"));
			itemsItem.setSystemVersion(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].SystemVersion"));
			itemsItem.setStatus(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].Status"));
			itemsItem.setIsMilestone(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].IsMilestone"));
			itemsItem.setIsForceUpgrade(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].IsForceUpgrade"));
			itemsItem.setIsSilentUpgrade(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].IsSilentUpgrade"));
			itemsItem.setIsForceReboot(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].IsForceReboot"));
			itemsItem.setIsForceNightUpgrade(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].IsForceNightUpgrade"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtModify(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].GmtModify"));
			itemsItem.setRemark(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].Remark"));
			itemsItem.setStatusName(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].StatusName"));
			itemsItem.setDeviceModelName(_ctx.stringValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].DeviceModelName"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].GmtCreateTimestamp"));
			itemsItem.setGmtModifyTimestamp(_ctx.longValue("FindOsVersionsResponse.OsVersionList.Items["+ i +"].GmtModifyTimestamp"));

			items.add(itemsItem);
		}
		osVersionList.setItems(items);
		findOsVersionsResponse.setOsVersionList(osVersionList);
	 
	 	return findOsVersionsResponse;
	}
}