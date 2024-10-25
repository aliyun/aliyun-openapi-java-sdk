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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListTrafficMirrorSessionsResponse;
import com.aliyuncs.vpc.model.v20160428.ListTrafficMirrorSessionsResponse.TrafficMirrorSession;
import com.aliyuncs.vpc.model.v20160428.ListTrafficMirrorSessionsResponse.TrafficMirrorSession.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrafficMirrorSessionsResponseUnmarshaller {

	public static ListTrafficMirrorSessionsResponse unmarshall(ListTrafficMirrorSessionsResponse listTrafficMirrorSessionsResponse, UnmarshallerContext _ctx) {
		
		listTrafficMirrorSessionsResponse.setRequestId(_ctx.stringValue("ListTrafficMirrorSessionsResponse.RequestId"));
		listTrafficMirrorSessionsResponse.setNextToken(_ctx.stringValue("ListTrafficMirrorSessionsResponse.NextToken"));
		listTrafficMirrorSessionsResponse.setTotalCount(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TotalCount"));

		List<TrafficMirrorSession> trafficMirrorSessions = new ArrayList<TrafficMirrorSession>();
		for (int i = 0; i < _ctx.lengthValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions.Length"); i++) {
			TrafficMirrorSession trafficMirrorSession = new TrafficMirrorSession();
			trafficMirrorSession.setTrafficMirrorTargetId(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorTargetId"));
			trafficMirrorSession.setTrafficMirrorSessionId(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSessionId"));
			trafficMirrorSession.setPriority(_ctx.integerValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].Priority"));
			trafficMirrorSession.setTrafficMirrorTargetType(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorTargetType"));
			trafficMirrorSession.setPacketLength(_ctx.integerValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].PacketLength"));
			trafficMirrorSession.setTrafficMirrorSessionDescription(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSessionDescription"));
			trafficMirrorSession.setTrafficMirrorSessionStatus(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSessionStatus"));
			trafficMirrorSession.setEnabled(_ctx.booleanValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].Enabled"));
			trafficMirrorSession.setTrafficMirrorSessionBusinessStatus(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSessionBusinessStatus"));
			trafficMirrorSession.setVirtualNetworkId(_ctx.integerValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].VirtualNetworkId"));
			trafficMirrorSession.setTrafficMirrorFilterId(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorFilterId"));
			trafficMirrorSession.setTrafficMirrorSessionName(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSessionName"));
			trafficMirrorSession.setResourceGroupId(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].ResourceGroupId"));
			trafficMirrorSession.setCreationTime(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].CreationTime"));

			List<String> trafficMirrorSourceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSourceIds.Length"); j++) {
				trafficMirrorSourceIds.add(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSourceIds["+ j +"]"));
			}
			trafficMirrorSession.setTrafficMirrorSourceIds(trafficMirrorSourceIds);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			trafficMirrorSession.setTags(tags);

			trafficMirrorSessions.add(trafficMirrorSession);
		}
		listTrafficMirrorSessionsResponse.setTrafficMirrorSessions(trafficMirrorSessions);
	 
	 	return listTrafficMirrorSessionsResponse;
	}
}