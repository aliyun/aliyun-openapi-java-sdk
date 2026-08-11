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

import com.aliyuncs.ecs.model.v20140526.DescribeTerminalSessionsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeTerminalSessionsResponse.Session;
import com.aliyuncs.ecs.model.v20140526.DescribeTerminalSessionsResponse.Session.Connection;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTerminalSessionsResponseUnmarshaller {

	public static DescribeTerminalSessionsResponse unmarshall(DescribeTerminalSessionsResponse describeTerminalSessionsResponse, UnmarshallerContext _ctx) {
		
		describeTerminalSessionsResponse.setRequestId(_ctx.stringValue("DescribeTerminalSessionsResponse.RequestId"));
		describeTerminalSessionsResponse.setNextToken(_ctx.stringValue("DescribeTerminalSessionsResponse.NextToken"));

		List<Session> sessions = new ArrayList<Session>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTerminalSessionsResponse.Sessions.Length"); i++) {
			Session session = new Session();
			session.setIdentityType(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].IdentityType"));
			session.setPrincipalId(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].PrincipalId"));
			session.setUsername(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].Username"));
			session.setCreationTime(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].CreationTime"));
			session.setTargetServer(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].TargetServer"));
			session.setPortNumber(_ctx.integerValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].PortNumber"));
			session.setClientIP(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].ClientIP"));
			session.setSessionId(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].SessionId"));

			List<Connection> connections = new ArrayList<Connection>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].Connections.Length"); j++) {
				Connection connection = new Connection();
				connection.setStatus(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].Connections["+ j +"].Status"));
				connection.setFailedDetail(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].Connections["+ j +"].FailedDetail"));
				connection.setEndTime(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].Connections["+ j +"].EndTime"));
				connection.setInstanceId(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].Connections["+ j +"].InstanceId"));
				connection.setStartTime(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].Connections["+ j +"].StartTime"));
				connection.setClosedReason(_ctx.stringValue("DescribeTerminalSessionsResponse.Sessions["+ i +"].Connections["+ j +"].ClosedReason"));

				connections.add(connection);
			}
			session.setConnections(connections);

			sessions.add(session);
		}
		describeTerminalSessionsResponse.setSessions(sessions);
	 
	 	return describeTerminalSessionsResponse;
	}
}