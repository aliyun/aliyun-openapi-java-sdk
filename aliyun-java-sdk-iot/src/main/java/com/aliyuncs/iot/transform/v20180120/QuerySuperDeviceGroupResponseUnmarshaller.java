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

import com.aliyuncs.iot.model.v20180120.QuerySuperDeviceGroupResponse;
import com.aliyuncs.iot.model.v20180120.QuerySuperDeviceGroupResponse.GroupInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySuperDeviceGroupResponseUnmarshaller {

	public static QuerySuperDeviceGroupResponse unmarshall(QuerySuperDeviceGroupResponse querySuperDeviceGroupResponse, UnmarshallerContext context) {
		
		querySuperDeviceGroupResponse.setRequestId(context.stringValue("QuerySuperDeviceGroupResponse.RequestId"));
		querySuperDeviceGroupResponse.setSuccess(context.booleanValue("QuerySuperDeviceGroupResponse.Success"));
		querySuperDeviceGroupResponse.setCode(context.stringValue("QuerySuperDeviceGroupResponse.Code"));
		querySuperDeviceGroupResponse.setErrorMessage(context.stringValue("QuerySuperDeviceGroupResponse.ErrorMessage"));

		List<GroupInfo> data = new ArrayList<GroupInfo>();
		for (int i = 0; i < context.lengthValue("QuerySuperDeviceGroupResponse.Data.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setGroupId(context.stringValue("QuerySuperDeviceGroupResponse.Data["+ i +"].GroupId"));
			groupInfo.setGroupName(context.stringValue("QuerySuperDeviceGroupResponse.Data["+ i +"].GroupName"));
			groupInfo.setGroupDesc(context.stringValue("QuerySuperDeviceGroupResponse.Data["+ i +"].GroupDesc"));

			data.add(groupInfo);
		}
		querySuperDeviceGroupResponse.setData(data);
	 
	 	return querySuperDeviceGroupResponse;
	}
}