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
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));

		InstanceInfo instanceInfo = new InstanceInfo();
		instanceInfo.setInstanceName(_ctx.stringValue("GetInstanceResponse.InstanceInfo.InstanceName"));
		instanceInfo.setUserId(_ctx.stringValue("GetInstanceResponse.InstanceInfo.UserId"));
		instanceInfo.setNetwork(_ctx.stringValue("GetInstanceResponse.InstanceInfo.Network"));
		instanceInfo.setStatus(_ctx.integerValue("GetInstanceResponse.InstanceInfo.Status"));
		instanceInfo.setWriteCapacity(_ctx.integerValue("GetInstanceResponse.InstanceInfo.WriteCapacity"));
		instanceInfo.setReadCapacity(_ctx.integerValue("GetInstanceResponse.InstanceInfo.ReadCapacity"));
		instanceInfo.setDescription(_ctx.stringValue("GetInstanceResponse.InstanceInfo.Description"));
		instanceInfo.setCreateTime(_ctx.stringValue("GetInstanceResponse.InstanceInfo.CreateTime"));
		instanceInfo.setClusterType(_ctx.stringValue("GetInstanceResponse.InstanceInfo.ClusterType"));

		Quota quota = new Quota();
		quota.setEntityQuota(_ctx.integerValue("GetInstanceResponse.InstanceInfo.Quota.EntityQuota"));
		instanceInfo.setQuota(quota);

		List<TagInfo> tagInfos = new ArrayList<TagInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.InstanceInfo.TagInfos.Length"); i++) {
			TagInfo tagInfo = new TagInfo();
			tagInfo.setTagKey(_ctx.stringValue("GetInstanceResponse.InstanceInfo.TagInfos["+ i +"].TagKey"));
			tagInfo.setTagValue(_ctx.stringValue("GetInstanceResponse.InstanceInfo.TagInfos["+ i +"].TagValue"));

			tagInfos.add(tagInfo);
		}
		instanceInfo.setTagInfos(tagInfos);
		getInstanceResponse.setInstanceInfo(instanceInfo);
	 
	 	return getInstanceResponse;
	}
}