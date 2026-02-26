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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListSupabaseProjectsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListSupabaseProjectsResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSupabaseProjectsResponseUnmarshaller {

	public static ListSupabaseProjectsResponse unmarshall(ListSupabaseProjectsResponse listSupabaseProjectsResponse, UnmarshallerContext _ctx) {
		
		listSupabaseProjectsResponse.setRequestId(_ctx.stringValue("ListSupabaseProjectsResponse.RequestId"));
		listSupabaseProjectsResponse.setPageNumber(_ctx.integerValue("ListSupabaseProjectsResponse.PageNumber"));
		listSupabaseProjectsResponse.setPageRecordCount(_ctx.integerValue("ListSupabaseProjectsResponse.PageRecordCount"));
		listSupabaseProjectsResponse.setTotalRecordCount(_ctx.integerValue("ListSupabaseProjectsResponse.TotalRecordCount"));
		listSupabaseProjectsResponse.setNextToken(_ctx.stringValue("ListSupabaseProjectsResponse.NextToken"));
		listSupabaseProjectsResponse.setMaxResults(_ctx.integerValue("ListSupabaseProjectsResponse.MaxResults"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSupabaseProjectsResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setStatus(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].Status"));
			itemsItem.setPublicConnectUrl(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].PublicConnectUrl"));
			itemsItem.setDashboardUserName(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].DashboardUserName"));
			itemsItem.setEngineVersion(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].EngineVersion"));
			itemsItem.setZoneId(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].ZoneId"));
			itemsItem.setProjectName(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].ProjectName"));
			itemsItem.setVSwitchId(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].VSwitchId"));
			itemsItem.setCreateTime(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].CreateTime"));
			itemsItem.setProjectId(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].ProjectId"));
			itemsItem.setDiskPerformanceLevel(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].DiskPerformanceLevel"));
			itemsItem.setStorageSize(_ctx.longValue("ListSupabaseProjectsResponse.Items["+ i +"].StorageSize"));
			itemsItem.setPayType(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].PayType"));
			itemsItem.setPrivateConnectUrl(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].PrivateConnectUrl"));
			itemsItem.setProjectSpec(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].ProjectSpec"));
			itemsItem.setVpcId(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].VpcId"));
			itemsItem.setSecurityIPList(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].SecurityIPList"));
			itemsItem.setDashboardPassword(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].DashboardPassword"));
			itemsItem.setRegionId(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].RegionId"));
			itemsItem.setEngine(_ctx.stringValue("ListSupabaseProjectsResponse.Items["+ i +"].Engine"));

			items.add(itemsItem);
		}
		listSupabaseProjectsResponse.setItems(items);
	 
	 	return listSupabaseProjectsResponse;
	}
}