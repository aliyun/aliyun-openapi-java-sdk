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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryDeviceGroupListResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceGroupListResponse.GroupInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceGroupListResponseUnmarshaller {

	public static QueryDeviceGroupListResponse unmarshall(QueryDeviceGroupListResponse queryDeviceGroupListResponse, UnmarshallerContext _ctx) {
		
		queryDeviceGroupListResponse.setRequestId(_ctx.stringValue("QueryDeviceGroupListResponse.RequestId"));
		queryDeviceGroupListResponse.setCurrentPage(_ctx.integerValue("QueryDeviceGroupListResponse.CurrentPage"));
		queryDeviceGroupListResponse.setErrorMessage(_ctx.stringValue("QueryDeviceGroupListResponse.ErrorMessage"));
		queryDeviceGroupListResponse.setSuccess(_ctx.booleanValue("QueryDeviceGroupListResponse.Success"));
		queryDeviceGroupListResponse.setCode(_ctx.stringValue("QueryDeviceGroupListResponse.Code"));
		queryDeviceGroupListResponse.setPageSize(_ctx.integerValue("QueryDeviceGroupListResponse.PageSize"));
		queryDeviceGroupListResponse.setTotal(_ctx.integerValue("QueryDeviceGroupListResponse.Total"));
		queryDeviceGroupListResponse.setPageCount(_ctx.integerValue("QueryDeviceGroupListResponse.PageCount"));

		List<GroupInfo> data = new ArrayList<GroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceGroupListResponse.Data.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setGroupName(_ctx.stringValue("QueryDeviceGroupListResponse.Data["+ i +"].GroupName"));
			groupInfo.setGroupId(_ctx.stringValue("QueryDeviceGroupListResponse.Data["+ i +"].GroupId"));
			groupInfo.setGroupType(_ctx.stringValue("QueryDeviceGroupListResponse.Data["+ i +"].GroupType"));
			groupInfo.setGroupDesc(_ctx.stringValue("QueryDeviceGroupListResponse.Data["+ i +"].GroupDesc"));
			groupInfo.setUtcCreate(_ctx.stringValue("QueryDeviceGroupListResponse.Data["+ i +"].UtcCreate"));

			data.add(groupInfo);
		}
		queryDeviceGroupListResponse.setData(data);
	 
	 	return queryDeviceGroupListResponse;
	}
}