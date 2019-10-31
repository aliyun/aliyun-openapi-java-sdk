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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupsPacketStatResponse;
import com.aliyuncs.linkwan.model.v20190301.ListNodeGroupsPacketStatResponse.NodeGroupPacketStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeGroupsPacketStatResponseUnmarshaller {

	public static ListNodeGroupsPacketStatResponse unmarshall(ListNodeGroupsPacketStatResponse listNodeGroupsPacketStatResponse, UnmarshallerContext _ctx) {
		
		listNodeGroupsPacketStatResponse.setRequestId(_ctx.stringValue("ListNodeGroupsPacketStatResponse.RequestId"));
		listNodeGroupsPacketStatResponse.setSuccess(_ctx.booleanValue("ListNodeGroupsPacketStatResponse.Success"));

		List<NodeGroupPacketStat> data = new ArrayList<NodeGroupPacketStat>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeGroupsPacketStatResponse.Data.Length"); i++) {
			NodeGroupPacketStat nodeGroupPacketStat = new NodeGroupPacketStat();
			nodeGroupPacketStat.setNodeGroupId(_ctx.stringValue("ListNodeGroupsPacketStatResponse.Data["+ i +"].NodeGroupId"));
			nodeGroupPacketStat.setUplinkCount(_ctx.integerValue("ListNodeGroupsPacketStatResponse.Data["+ i +"].UplinkCount"));
			nodeGroupPacketStat.setDownlinkCount(_ctx.integerValue("ListNodeGroupsPacketStatResponse.Data["+ i +"].DownlinkCount"));

			data.add(nodeGroupPacketStat);
		}
		listNodeGroupsPacketStatResponse.setData(data);
	 
	 	return listNodeGroupsPacketStatResponse;
	}
}