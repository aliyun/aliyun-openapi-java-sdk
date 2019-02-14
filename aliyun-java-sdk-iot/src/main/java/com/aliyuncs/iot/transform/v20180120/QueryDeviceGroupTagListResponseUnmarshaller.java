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

import com.aliyuncs.iot.model.v20180120.QueryDeviceGroupTagListResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceGroupTagListResponse.GroupTagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceGroupTagListResponseUnmarshaller {

	public static QueryDeviceGroupTagListResponse unmarshall(QueryDeviceGroupTagListResponse queryDeviceGroupTagListResponse, UnmarshallerContext context) {
		
		queryDeviceGroupTagListResponse.setRequestId(context.stringValue("QueryDeviceGroupTagListResponse.RequestId"));
		queryDeviceGroupTagListResponse.setSuccess(context.booleanValue("QueryDeviceGroupTagListResponse.Success"));
		queryDeviceGroupTagListResponse.setCode(context.stringValue("QueryDeviceGroupTagListResponse.Code"));
		queryDeviceGroupTagListResponse.setErrorMessage(context.stringValue("QueryDeviceGroupTagListResponse.ErrorMessage"));

		List<GroupTagInfo> data = new ArrayList<GroupTagInfo>();
		for (int i = 0; i < context.lengthValue("QueryDeviceGroupTagListResponse.Data.Length"); i++) {
			GroupTagInfo groupTagInfo = new GroupTagInfo();
			groupTagInfo.setTagKey(context.stringValue("QueryDeviceGroupTagListResponse.Data["+ i +"].TagKey"));
			groupTagInfo.setTagValue(context.stringValue("QueryDeviceGroupTagListResponse.Data["+ i +"].TagValue"));

			data.add(groupTagInfo);
		}
		queryDeviceGroupTagListResponse.setData(data);
	 
	 	return queryDeviceGroupTagListResponse;
	}
}