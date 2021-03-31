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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetGrayAppGroupResponse;
import com.aliyuncs.edas.model.v20170801.GetGrayAppGroupResponse.DataItem;
import com.aliyuncs.edas.model.v20170801.GetGrayAppGroupResponse.DataItem.GroupListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGrayAppGroupResponseUnmarshaller {

	public static GetGrayAppGroupResponse unmarshall(GetGrayAppGroupResponse getGrayAppGroupResponse, UnmarshallerContext _ctx) {
		
		getGrayAppGroupResponse.setRequestId(_ctx.stringValue("GetGrayAppGroupResponse.RequestId"));
		getGrayAppGroupResponse.setCode(_ctx.integerValue("GetGrayAppGroupResponse.Code"));
		getGrayAppGroupResponse.setMessage(_ctx.stringValue("GetGrayAppGroupResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGrayAppGroupResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppId(_ctx.stringValue("GetGrayAppGroupResponse.Data["+ i +"].AppId"));
			dataItem.setAppName(_ctx.stringValue("GetGrayAppGroupResponse.Data["+ i +"].AppName"));
			dataItem.setRegionId(_ctx.stringValue("GetGrayAppGroupResponse.Data["+ i +"].RegionId"));
			dataItem.setRegionName(_ctx.stringValue("GetGrayAppGroupResponse.Data["+ i +"].RegionName"));

			List<GroupListItem> groupList = new ArrayList<GroupListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetGrayAppGroupResponse.Data["+ i +"].GroupList.Length"); j++) {
				GroupListItem groupListItem = new GroupListItem();
				groupListItem.setId(_ctx.stringValue("GetGrayAppGroupResponse.Data["+ i +"].GroupList["+ j +"].Id"));
				groupListItem.setGroupName(_ctx.stringValue("GetGrayAppGroupResponse.Data["+ i +"].GroupList["+ j +"].GroupName"));
				groupListItem.setPackageVersion(_ctx.stringValue("GetGrayAppGroupResponse.Data["+ i +"].GroupList["+ j +"].PackageVersion"));
				groupListItem.setInstances(_ctx.integerValue("GetGrayAppGroupResponse.Data["+ i +"].GroupList["+ j +"].Instances"));
				groupListItem.setClusterId(_ctx.stringValue("GetGrayAppGroupResponse.Data["+ i +"].GroupList["+ j +"].ClusterId"));
				groupListItem.setDpathPointcutName(_ctx.stringValue("GetGrayAppGroupResponse.Data["+ i +"].GroupList["+ j +"].DpathPointcutName"));

				groupList.add(groupListItem);
			}
			dataItem.setGroupList(groupList);

			data.add(dataItem);
		}
		getGrayAppGroupResponse.setData(data);
	 
	 	return getGrayAppGroupResponse;
	}
}