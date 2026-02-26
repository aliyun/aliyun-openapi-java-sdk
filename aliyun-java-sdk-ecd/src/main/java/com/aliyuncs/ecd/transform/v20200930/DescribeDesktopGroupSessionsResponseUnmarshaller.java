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

import com.aliyuncs.ecd.model.v20200930.DescribeDesktopGroupSessionsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopGroupSessionsResponse.Session;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopGroupSessionsResponseUnmarshaller {

	public static DescribeDesktopGroupSessionsResponse unmarshall(DescribeDesktopGroupSessionsResponse describeDesktopGroupSessionsResponse, UnmarshallerContext _ctx) {
		
		describeDesktopGroupSessionsResponse.setRequestId(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.RequestId"));
		describeDesktopGroupSessionsResponse.setTotalCount(_ctx.integerValue("DescribeDesktopGroupSessionsResponse.TotalCount"));
		describeDesktopGroupSessionsResponse.setNextToken(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.NextToken"));

		List<Session> sessions = new ArrayList<Session>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopGroupSessionsResponse.Sessions.Length"); i++) {
			Session session = new Session();
			session.setEndUserId(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].EndUserId"));
			session.setDesktopGroupId(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].DesktopGroupId"));
			session.setDesktopGroupName(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].DesktopGroupName"));
			session.setOfficeSiteId(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].OfficeSiteId"));
			session.setOfficeSiteName(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].OfficeSiteName"));
			session.setOwnType(_ctx.integerValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].OwnType"));
			session.setSessionStatus(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].SessionStatus"));
			session.setDesktopId(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].DesktopId"));
			session.setClientOS(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].ClientOS"));
			session.setClientVersion(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].ClientVersion"));
			session.setClientIp(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].ClientIp"));
			session.setLatestConnectionTime(_ctx.longValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].LatestConnectionTime"));
			session.setTotalConnectionDuration(_ctx.longValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].TotalConnectionDuration"));
			session.setSessionIdleTime(_ctx.longValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].SessionIdleTime"));
			session.setProtocolType(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].ProtocolType"));
			session.setLastSessionStartTime(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].LastSessionStartTime"));
			session.setLastSessionEndTime(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].LastSessionEndTime"));
			session.setOsType(_ctx.stringValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].OsType"));
			session.setEndUserApplyCoordinateTime(_ctx.longValue("DescribeDesktopGroupSessionsResponse.Sessions["+ i +"].EndUserApplyCoordinateTime"));

			sessions.add(session);
		}
		describeDesktopGroupSessionsResponse.setSessions(sessions);
	 
	 	return describeDesktopGroupSessionsResponse;
	}
}