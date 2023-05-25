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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.ListPluginStatusResponse;
import com.aliyuncs.ecs.model.v20140526.ListPluginStatusResponse.InstancePluginStatus;
import com.aliyuncs.ecs.model.v20140526.ListPluginStatusResponse.InstancePluginStatus.PluginStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPluginStatusResponseUnmarshaller {

	public static ListPluginStatusResponse unmarshall(ListPluginStatusResponse listPluginStatusResponse, UnmarshallerContext _ctx) {
		
		listPluginStatusResponse.setRequestId(_ctx.stringValue("ListPluginStatusResponse.RequestId"));
		listPluginStatusResponse.setPageSize(_ctx.longValue("ListPluginStatusResponse.PageSize"));
		listPluginStatusResponse.setPageNumber(_ctx.longValue("ListPluginStatusResponse.PageNumber"));
		listPluginStatusResponse.setTotalCount(_ctx.longValue("ListPluginStatusResponse.TotalCount"));

		List<InstancePluginStatus> instancePluginStatusSet = new ArrayList<InstancePluginStatus>();
		for (int i = 0; i < _ctx.lengthValue("ListPluginStatusResponse.InstancePluginStatusSet.Length"); i++) {
			InstancePluginStatus instancePluginStatus = new InstancePluginStatus();
			instancePluginStatus.setInstanceId(_ctx.stringValue("ListPluginStatusResponse.InstancePluginStatusSet["+ i +"].InstanceId"));

			List<PluginStatus> pluginStatusSet = new ArrayList<PluginStatus>();
			for (int j = 0; j < _ctx.lengthValue("ListPluginStatusResponse.InstancePluginStatusSet["+ i +"].PluginStatusSet.Length"); j++) {
				PluginStatus pluginStatus = new PluginStatus();
				pluginStatus.setPluginVersion(_ctx.stringValue("ListPluginStatusResponse.InstancePluginStatusSet["+ i +"].PluginStatusSet["+ j +"].PluginVersion"));
				pluginStatus.setPluginName(_ctx.stringValue("ListPluginStatusResponse.InstancePluginStatusSet["+ i +"].PluginStatusSet["+ j +"].PluginName"));
				pluginStatus.setFirstHeartbeatTime(_ctx.stringValue("ListPluginStatusResponse.InstancePluginStatusSet["+ i +"].PluginStatusSet["+ j +"].FirstHeartbeatTime"));
				pluginStatus.setLastHeartbeatTime(_ctx.stringValue("ListPluginStatusResponse.InstancePluginStatusSet["+ i +"].PluginStatusSet["+ j +"].LastHeartbeatTime"));
				pluginStatus.setPluginStatus(_ctx.stringValue("ListPluginStatusResponse.InstancePluginStatusSet["+ i +"].PluginStatusSet["+ j +"].PluginStatus"));

				pluginStatusSet.add(pluginStatus);
			}
			instancePluginStatus.setPluginStatusSet(pluginStatusSet);

			instancePluginStatusSet.add(instancePluginStatus);
		}
		listPluginStatusResponse.setInstancePluginStatusSet(instancePluginStatusSet);
	 
	 	return listPluginStatusResponse;
	}
}