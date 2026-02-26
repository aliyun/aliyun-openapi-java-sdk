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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeDesktopSessionsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopSessionsResponse.Session;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopSessionsResponseUnmarshaller {

	public static DescribeDesktopSessionsResponse unmarshall(DescribeDesktopSessionsResponse describeDesktopSessionsResponse, UnmarshallerContext _ctx) {
		
		describeDesktopSessionsResponse.setRequestId(_ctx.stringValue("DescribeDesktopSessionsResponse.RequestId"));
		describeDesktopSessionsResponse.setTotalCount(_ctx.integerValue("DescribeDesktopSessionsResponse.TotalCount"));

		List<Session> sessions = new ArrayList<Session>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopSessionsResponse.Sessions.Length"); i++) {
			Session session = new Session();
			session.setSessionStatus(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].SessionStatus"));
			session.setEndUserId(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].EndUserId"));
			session.setOfficeSiteId(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].OfficeSiteId"));
			session.setClientIp(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].ClientIp"));
			session.setClientOS(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].ClientOS"));
			session.setDesktopId(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].DesktopId"));
			session.setDesktopName(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].DesktopName"));
			session.setOfficeSiteName(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].OfficeSiteName"));
			session.setClientVersion(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].ClientVersion"));
			session.setProtocolType(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].ProtocolType"));
			session.setLatestConnectionTime(_ctx.longValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].LatestConnectionTime"));
			session.setTotalConnectionTime(_ctx.longValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].TotalConnectionTime"));
			session.setSessionStartTime(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].SessionStartTime"));
			session.setSessionEndTime(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].SessionEndTime"));
			session.setSessionIdleTime(_ctx.longValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].SessionIdleTime"));
			session.setOsType(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].OsType"));
			session.setEndUserApplyCoordinateTime(_ctx.longValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].EndUserApplyCoordinateTime"));
			session.setSubPayType(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].SubPayType"));
			session.setOsSessionStatus(_ctx.stringValue("DescribeDesktopSessionsResponse.Sessions["+ i +"].OsSessionStatus"));

			sessions.add(session);
		}
		describeDesktopSessionsResponse.setSessions(sessions);
	 
	 	return describeDesktopSessionsResponse;
	}
}