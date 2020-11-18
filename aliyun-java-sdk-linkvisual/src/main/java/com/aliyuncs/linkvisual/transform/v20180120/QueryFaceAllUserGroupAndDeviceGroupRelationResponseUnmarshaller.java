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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllUserGroupAndDeviceGroupRelationResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaceAllUserGroupAndDeviceGroupRelationResponseUnmarshaller {

	public static QueryFaceAllUserGroupAndDeviceGroupRelationResponse unmarshall(QueryFaceAllUserGroupAndDeviceGroupRelationResponse queryFaceAllUserGroupAndDeviceGroupRelationResponse, UnmarshallerContext _ctx) {
		
		queryFaceAllUserGroupAndDeviceGroupRelationResponse.setRequestId(_ctx.stringValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.RequestId"));
		queryFaceAllUserGroupAndDeviceGroupRelationResponse.setSuccess(_ctx.booleanValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Success"));
		queryFaceAllUserGroupAndDeviceGroupRelationResponse.setErrorMessage(_ctx.stringValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.ErrorMessage"));
		queryFaceAllUserGroupAndDeviceGroupRelationResponse.setCode(_ctx.stringValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data.PageSize"));
		data.setPage(_ctx.integerValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data.Page"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setControlId(_ctx.stringValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data.List["+ i +"].ControlId"));
			listItem.setUserGroupId(_ctx.stringValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data.List["+ i +"].UserGroupId"));
			listItem.setDeviceGroupId(_ctx.stringValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data.List["+ i +"].DeviceGroupId"));
			listItem.setControlType(_ctx.stringValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data.List["+ i +"].ControlType"));
			listItem.setModifiedTime(_ctx.stringValue("QueryFaceAllUserGroupAndDeviceGroupRelationResponse.Data.List["+ i +"].ModifiedTime"));

			list.add(listItem);
		}
		data.setList(list);
		queryFaceAllUserGroupAndDeviceGroupRelationResponse.setData(data);
	 
	 	return queryFaceAllUserGroupAndDeviceGroupRelationResponse;
	}
}