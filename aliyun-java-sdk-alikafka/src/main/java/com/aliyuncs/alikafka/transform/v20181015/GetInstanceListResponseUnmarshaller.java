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

package com.aliyuncs.alikafka.transform.v20181015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20181015.GetInstanceListResponse;
import com.aliyuncs.alikafka.model.v20181015.GetInstanceListResponse.InstanceListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceListResponseUnmarshaller {

	public static GetInstanceListResponse unmarshall(GetInstanceListResponse getInstanceListResponse, UnmarshallerContext context) {
		
		getInstanceListResponse.setRequestId(context.stringValue("GetInstanceListResponse.RequestId"));
		getInstanceListResponse.setSuccess(context.booleanValue("GetInstanceListResponse.Success"));
		getInstanceListResponse.setCode(context.integerValue("GetInstanceListResponse.Code"));
		getInstanceListResponse.setMessage(context.stringValue("GetInstanceListResponse.Message"));

		List<InstanceListItem> instanceList = new ArrayList<InstanceListItem>();
		for (int i = 0; i < context.lengthValue("GetInstanceListResponse.InstanceList.Length"); i++) {
			InstanceListItem instanceListItem = new InstanceListItem();
			instanceListItem.setInstanceId(context.stringValue("GetInstanceListResponse.InstanceList["+ i +"].InstanceId"));
			instanceListItem.setRegionId(context.stringValue("GetInstanceListResponse.InstanceList["+ i +"].RegionId"));
			instanceListItem.setServiceStatus(context.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ServiceStatus"));
			instanceListItem.setVpcId(context.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VpcId"));
			instanceListItem.setVSwitchId(context.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VSwitchId"));
			instanceListItem.setEndPoint(context.stringValue("GetInstanceListResponse.InstanceList["+ i +"].EndPoint"));
			instanceListItem.setCreateTime(context.longValue("GetInstanceListResponse.InstanceList["+ i +"].CreateTime"));
			instanceListItem.setExpiredTime(context.longValue("GetInstanceListResponse.InstanceList["+ i +"].ExpiredTime"));

			instanceList.add(instanceListItem);
		}
		getInstanceListResponse.setInstanceList(instanceList);
	 
	 	return getInstanceListResponse;
	}
}