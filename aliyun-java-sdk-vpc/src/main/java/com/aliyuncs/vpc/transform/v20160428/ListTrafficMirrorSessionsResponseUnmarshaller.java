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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrafficMirrorSessionsResponseUnmarshaller {

	public static ListTrafficMirrorSessionsResponse unmarshall(ListTrafficMirrorSessionsResponse listTrafficMirrorSessionsResponse, UnmarshallerContext _ctx) {
		
		listTrafficMirrorSessionsResponse.setRequestId(_ctx.stringValue("ListTrafficMirrorSessionsResponse.RequestId"));
		listTrafficMirrorSessionsResponse.setNextToken(_ctx.stringValue("ListTrafficMirrorSessionsResponse.NextToken"));
		listTrafficMirrorSessionsResponse.setTotalCount(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TotalCount"));

		List<TrafficMirrorSession> trafficMirrorSessions = new ArrayList<TrafficMirrorSession>();
		for (int i = 0; i < _ctx.lengthValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions.Length"); i++) {
			TrafficMirrorSession trafficMirrorSession = new TrafficMirrorSession();
			trafficMirrorSession.setTrafficMirrorSessionName(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSessionName"));
			trafficMirrorSession.setTrafficMirrorSessionDescription(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSessionDescription"));
			trafficMirrorSession.setTrafficMirrorSessionId(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSessionId"));
			trafficMirrorSession.setTrafficMirrorSessionStatus(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSessionStatus"));
			trafficMirrorSession.setTrafficMirrorTargetId(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorTargetId"));
			trafficMirrorSession.setTrafficMirrorTargetType(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorTargetType"));
			trafficMirrorSession.setTrafficMirrorFilterId(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorFilterId"));
			trafficMirrorSession.setVirtualNetworkId(_ctx.integerValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].VirtualNetworkId"));
			trafficMirrorSession.setPriority(_ctx.integerValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].Priority"));
			trafficMirrorSession.setEnabled(_ctx.booleanValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].Enabled"));
			trafficMirrorSession.setPacketLength(_ctx.integerValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].PacketLength"));
			trafficMirrorSession.setTrafficMirrorSessionBusinessStatus(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSessionBusinessStatus"));

			List<String> trafficMirrorSourceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSourceIds.Length"); j++) {
				trafficMirrorSourceIds.add(_ctx.stringValue("ListTrafficMirrorSessionsResponse.TrafficMirrorSessions["+ i +"].TrafficMirrorSourceIds["+ j +"]"));
			}
			trafficMirrorSession.setTrafficMirrorSourceIds(trafficMirrorSourceIds);

			trafficMirrorSessions.add(trafficMirrorSession);
		}
		listTrafficMirrorSessionsResponse.setTrafficMirrorSessions(trafficMirrorSessions);
	 
	 	return listTrafficMirrorSessionsResponse;
	}
}