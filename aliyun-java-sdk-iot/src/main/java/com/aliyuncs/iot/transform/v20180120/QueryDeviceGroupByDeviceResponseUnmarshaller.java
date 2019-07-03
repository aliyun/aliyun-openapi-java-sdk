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

import com.aliyuncs.iot.model.v20180120.QueryDeviceGroupByDeviceResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceGroupByDeviceResponse.GroupInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceGroupByDeviceResponseUnmarshaller {

	public static QueryDeviceGroupByDeviceResponse unmarshall(QueryDeviceGroupByDeviceResponse queryDeviceGroupByDeviceResponse, UnmarshallerContext _ctx) {
		
		queryDeviceGroupByDeviceResponse.setRequestId(_ctx.stringValue("QueryDeviceGroupByDeviceResponse.RequestId"));
		queryDeviceGroupByDeviceResponse.setSuccess(_ctx.booleanValue("QueryDeviceGroupByDeviceResponse.Success"));
		queryDeviceGroupByDeviceResponse.setCode(_ctx.stringValue("QueryDeviceGroupByDeviceResponse.Code"));
		queryDeviceGroupByDeviceResponse.setErrorMessage(_ctx.stringValue("QueryDeviceGroupByDeviceResponse.ErrorMessage"));

		List<GroupInfo> groupInfos = new ArrayList<GroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceGroupByDeviceResponse.GroupInfos.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setGroupId(_ctx.stringValue("QueryDeviceGroupByDeviceResponse.GroupInfos["+ i +"].GroupId"));
			groupInfo.setGroupName(_ctx.stringValue("QueryDeviceGroupByDeviceResponse.GroupInfos["+ i +"].GroupName"));
			groupInfo.setUtcCreate(_ctx.stringValue("QueryDeviceGroupByDeviceResponse.GroupInfos["+ i +"].UtcCreate"));
			groupInfo.setGroupDesc(_ctx.stringValue("QueryDeviceGroupByDeviceResponse.GroupInfos["+ i +"].GroupDesc"));

			groupInfos.add(groupInfo);
		}
		queryDeviceGroupByDeviceResponse.setGroupInfos(groupInfos);
	 
	 	return queryDeviceGroupByDeviceResponse;
	}
}