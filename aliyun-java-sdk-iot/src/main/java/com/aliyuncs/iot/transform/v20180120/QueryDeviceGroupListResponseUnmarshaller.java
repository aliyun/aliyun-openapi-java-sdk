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

	public static QueryDeviceGroupListResponse unmarshall(QueryDeviceGroupListResponse queryDeviceGroupListResponse, UnmarshallerContext context) {
		
		queryDeviceGroupListResponse.setRequestId(context.stringValue("QueryDeviceGroupListResponse.RequestId"));
		queryDeviceGroupListResponse.setSuccess(context.booleanValue("QueryDeviceGroupListResponse.Success"));
		queryDeviceGroupListResponse.setCode(context.stringValue("QueryDeviceGroupListResponse.Code"));
		queryDeviceGroupListResponse.setErrorMessage(context.stringValue("QueryDeviceGroupListResponse.ErrorMessage"));
		queryDeviceGroupListResponse.setCurrentPage(context.integerValue("QueryDeviceGroupListResponse.CurrentPage"));
		queryDeviceGroupListResponse.setPageCount(context.integerValue("QueryDeviceGroupListResponse.PageCount"));
		queryDeviceGroupListResponse.setPageSize(context.integerValue("QueryDeviceGroupListResponse.PageSize"));
		queryDeviceGroupListResponse.setTotal(context.integerValue("QueryDeviceGroupListResponse.Total"));

		List<GroupInfo> data = new ArrayList<GroupInfo>();
		for (int i = 0; i < context.lengthValue("QueryDeviceGroupListResponse.Data.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setGroupId(context.stringValue("QueryDeviceGroupListResponse.Data["+ i +"].GroupId"));
			groupInfo.setUtcCreate(context.stringValue("QueryDeviceGroupListResponse.Data["+ i +"].UtcCreate"));
			groupInfo.setGroupName(context.stringValue("QueryDeviceGroupListResponse.Data["+ i +"].GroupName"));
			groupInfo.setGroupDesc(context.stringValue("QueryDeviceGroupListResponse.Data["+ i +"].GroupDesc"));

			data.add(groupInfo);
		}
		queryDeviceGroupListResponse.setData(data);
	 
	 	return queryDeviceGroupListResponse;
	}
}