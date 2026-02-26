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

import com.aliyuncs.ecd.model.v20200930.DisconnectDesktopSessionsResponse;
import com.aliyuncs.ecd.model.v20200930.DisconnectDesktopSessionsResponse.InvalidSession;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisconnectDesktopSessionsResponseUnmarshaller {

	public static DisconnectDesktopSessionsResponse unmarshall(DisconnectDesktopSessionsResponse disconnectDesktopSessionsResponse, UnmarshallerContext _ctx) {
		
		disconnectDesktopSessionsResponse.setRequestId(_ctx.stringValue("DisconnectDesktopSessionsResponse.RequestId"));

		List<InvalidSession> invalidSessions = new ArrayList<InvalidSession>();
		for (int i = 0; i < _ctx.lengthValue("DisconnectDesktopSessionsResponse.InvalidSessions.Length"); i++) {
			InvalidSession invalidSession = new InvalidSession();
			invalidSession.setEndUserId(_ctx.stringValue("DisconnectDesktopSessionsResponse.InvalidSessions["+ i +"].EndUserId"));
			invalidSession.setDesktopId(_ctx.stringValue("DisconnectDesktopSessionsResponse.InvalidSessions["+ i +"].DesktopId"));

			invalidSessions.add(invalidSession);
		}
		disconnectDesktopSessionsResponse.setInvalidSessions(invalidSessions);
	 
	 	return disconnectDesktopSessionsResponse;
	}
}