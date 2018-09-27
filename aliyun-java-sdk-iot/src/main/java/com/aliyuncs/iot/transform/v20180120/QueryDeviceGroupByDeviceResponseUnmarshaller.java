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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceGroupByDeviceResponseUnmarshaller {

	public static QueryDeviceGroupByDeviceResponse unmarshall(QueryDeviceGroupByDeviceResponse queryDeviceGroupByDeviceResponse, UnmarshallerContext context) {
		
		queryDeviceGroupByDeviceResponse.setRequestId(context.stringValue("QueryDeviceGroupByDeviceResponse.RequestId"));
		queryDeviceGroupByDeviceResponse.setSuccess(context.booleanValue("QueryDeviceGroupByDeviceResponse.Success"));
		queryDeviceGroupByDeviceResponse.setCode(context.stringValue("QueryDeviceGroupByDeviceResponse.Code"));
		queryDeviceGroupByDeviceResponse.setErrorMessage(context.stringValue("QueryDeviceGroupByDeviceResponse.ErrorMessage"));

		List<GroupInfo> groupInfos = new ArrayList<GroupInfo>();
		for (int i = 0; i < context.lengthValue("QueryDeviceGroupByDeviceResponse.GroupInfos.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setGroupId(context.stringValue("QueryDeviceGroupByDeviceResponse.GroupInfos["+ i +"].GroupId"));
			groupInfo.setGroupName(context.stringValue("QueryDeviceGroupByDeviceResponse.GroupInfos["+ i +"].GroupName"));
			groupInfo.setUtcCreate(context.stringValue("QueryDeviceGroupByDeviceResponse.GroupInfos["+ i +"].UtcCreate"));
			groupInfo.setGroupDesc(context.stringValue("QueryDeviceGroupByDeviceResponse.GroupInfos["+ i +"].GroupDesc"));

			groupInfos.add(groupInfo);
		}
		queryDeviceGroupByDeviceResponse.setGroupInfos(groupInfos);
	 
	 	return queryDeviceGroupByDeviceResponse;
	}
}