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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListIoTCloudConnectorAccessSessionLogsResponse;
import com.aliyuncs.iotcc.model.v20210513.ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIoTCloudConnectorAccessSessionLogsResponseUnmarshaller {

	public static ListIoTCloudConnectorAccessSessionLogsResponse unmarshall(ListIoTCloudConnectorAccessSessionLogsResponse listIoTCloudConnectorAccessSessionLogsResponse, UnmarshallerContext _ctx) {
		
		listIoTCloudConnectorAccessSessionLogsResponse.setRequestId(_ctx.stringValue("ListIoTCloudConnectorAccessSessionLogsResponse.RequestId"));
		listIoTCloudConnectorAccessSessionLogsResponse.setTotalCount(_ctx.integerValue("ListIoTCloudConnectorAccessSessionLogsResponse.TotalCount"));
		listIoTCloudConnectorAccessSessionLogsResponse.setNextToken(_ctx.stringValue("ListIoTCloudConnectorAccessSessionLogsResponse.NextToken"));
		listIoTCloudConnectorAccessSessionLogsResponse.setMaxResults(_ctx.integerValue("ListIoTCloudConnectorAccessSessionLogsResponse.MaxResults"));

		List<AccessSessionLog> accessSessionLogs = new ArrayList<AccessSessionLog>();
		for (int i = 0; i < _ctx.lengthValue("ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLogs.Length"); i++) {
			AccessSessionLog accessSessionLog = new AccessSessionLog();
			accessSessionLog.setSourceIp(_ctx.stringValue("ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLogs["+ i +"].SourceIp"));
			accessSessionLog.setDestinationIp(_ctx.stringValue("ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLogs["+ i +"].DestinationIp"));
			accessSessionLog.setDestinationPort(_ctx.stringValue("ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLogs["+ i +"].DestinationPort"));
			accessSessionLog.setTime(_ctx.stringValue("ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLogs["+ i +"].Time"));
			accessSessionLog.setClientToServiceFlow(_ctx.stringValue("ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLogs["+ i +"].ClientToServiceFlow"));
			accessSessionLog.setServiceToClientFlow(_ctx.stringValue("ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLogs["+ i +"].ServiceToClientFlow"));
			accessSessionLog.setType(_ctx.stringValue("ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLogs["+ i +"].Type"));

			List<String> destinations = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLogs["+ i +"].Destinations.Length"); j++) {
				destinations.add(_ctx.stringValue("ListIoTCloudConnectorAccessSessionLogsResponse.AccessSessionLogs["+ i +"].Destinations["+ j +"]"));
			}
			accessSessionLog.setDestinations(destinations);

			accessSessionLogs.add(accessSessionLog);
		}
		listIoTCloudConnectorAccessSessionLogsResponse.setAccessSessionLogs(accessSessionLogs);
	 
	 	return listIoTCloudConnectorAccessSessionLogsResponse;
	}
}