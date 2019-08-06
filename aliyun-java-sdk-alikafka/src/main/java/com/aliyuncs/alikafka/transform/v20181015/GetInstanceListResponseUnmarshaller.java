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
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceListResponseUnmarshaller {

	public static GetInstanceListResponse unmarshall(GetInstanceListResponse getInstanceListResponse, UnmarshallerContext _ctx) {
		
		getInstanceListResponse.setRequestId(_ctx.stringValue("GetInstanceListResponse.RequestId"));
		getInstanceListResponse.setSuccess(_ctx.booleanValue("GetInstanceListResponse.Success"));
		getInstanceListResponse.setCode(_ctx.integerValue("GetInstanceListResponse.Code"));
		getInstanceListResponse.setMessage(_ctx.stringValue("GetInstanceListResponse.Message"));

		List<InstanceListItem> instanceList = new ArrayList<InstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceListResponse.InstanceList.Length"); i++) {
			InstanceListItem instanceListItem = new InstanceListItem();
			instanceListItem.setInstanceId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].InstanceId"));
			instanceListItem.setRegionId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].RegionId"));
			instanceListItem.setServiceStatus(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].ServiceStatus"));
			instanceListItem.setVpcId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VpcId"));
			instanceListItem.setVSwitchId(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].VSwitchId"));
			instanceListItem.setEndPoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].EndPoint"));
			instanceListItem.setCreateTime(_ctx.longValue("GetInstanceListResponse.InstanceList["+ i +"].CreateTime"));
			instanceListItem.setExpiredTime(_ctx.longValue("GetInstanceListResponse.InstanceList["+ i +"].ExpiredTime"));
			instanceListItem.setDeployType(_ctx.integerValue("GetInstanceListResponse.InstanceList["+ i +"].DeployType"));
			instanceListItem.setSslEndPoint(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].SslEndPoint"));
			instanceListItem.setName(_ctx.stringValue("GetInstanceListResponse.InstanceList["+ i +"].Name"));

			instanceList.add(instanceListItem);
		}
		getInstanceListResponse.setInstanceList(instanceList);
	 
	 	return getInstanceListResponse;
	}
}