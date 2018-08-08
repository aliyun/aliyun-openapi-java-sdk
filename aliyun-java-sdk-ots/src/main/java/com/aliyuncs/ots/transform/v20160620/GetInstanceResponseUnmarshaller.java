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

package com.aliyuncs.ots.transform.v20160620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ots.model.v20160620.GetInstanceResponse;
import com.aliyuncs.ots.model.v20160620.GetInstanceResponse.InstanceInfo;
import com.aliyuncs.ots.model.v20160620.GetInstanceResponse.InstanceInfo.Quota;
import com.aliyuncs.ots.model.v20160620.GetInstanceResponse.InstanceInfo.TagInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext context) {
		
		getInstanceResponse.setRequestId(context.stringValue("GetInstanceResponse.RequestId"));

		InstanceInfo instanceInfo = new InstanceInfo();
		instanceInfo.setInstanceName(context.stringValue("GetInstanceResponse.InstanceInfo.InstanceName"));
		instanceInfo.setUserId(context.stringValue("GetInstanceResponse.InstanceInfo.UserId"));
		instanceInfo.setNetwork(context.stringValue("GetInstanceResponse.InstanceInfo.Network"));
		instanceInfo.setStatus(context.integerValue("GetInstanceResponse.InstanceInfo.Status"));
		instanceInfo.setWriteCapacity(context.integerValue("GetInstanceResponse.InstanceInfo.WriteCapacity"));
		instanceInfo.setReadCapacity(context.integerValue("GetInstanceResponse.InstanceInfo.ReadCapacity"));
		instanceInfo.setDescription(context.stringValue("GetInstanceResponse.InstanceInfo.Description"));
		instanceInfo.setCreateTime(context.stringValue("GetInstanceResponse.InstanceInfo.CreateTime"));
		instanceInfo.setClusterType(context.stringValue("GetInstanceResponse.InstanceInfo.ClusterType"));

		Quota quota = new Quota();
		quota.setEntityQuota(context.integerValue("GetInstanceResponse.InstanceInfo.Quota.EntityQuota"));
		instanceInfo.setQuota(quota);

		List<TagInfo> tagInfos = new ArrayList<TagInfo>();
		for (int i = 0; i < context.lengthValue("GetInstanceResponse.InstanceInfo.TagInfos.Length"); i++) {
			TagInfo tagInfo = new TagInfo();
			tagInfo.setTagKey(context.stringValue("GetInstanceResponse.InstanceInfo.TagInfos["+ i +"].TagKey"));
			tagInfo.setTagValue(context.stringValue("GetInstanceResponse.InstanceInfo.TagInfos["+ i +"].TagValue"));

			tagInfos.add(tagInfo);
		}
		instanceInfo.setTagInfos(tagInfos);
		getInstanceResponse.setInstanceInfo(instanceInfo);
	 
	 	return getInstanceResponse;
	}
}