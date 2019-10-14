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

import com.aliyuncs.linkwan.model.v20190301.ListLabGatewayLogsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListLabGatewayLogsResponse.LabGatewayLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabGatewayLogsResponseUnmarshaller {

	public static ListLabGatewayLogsResponse unmarshall(ListLabGatewayLogsResponse listLabGatewayLogsResponse, UnmarshallerContext _ctx) {
		
		listLabGatewayLogsResponse.setRequestId(_ctx.stringValue("ListLabGatewayLogsResponse.RequestId"));
		listLabGatewayLogsResponse.setSuccess(_ctx.booleanValue("ListLabGatewayLogsResponse.Success"));

		List<LabGatewayLog> data = new ArrayList<LabGatewayLog>();
		for (int i = 0; i < _ctx.lengthValue("ListLabGatewayLogsResponse.Data.Length"); i++) {
			LabGatewayLog labGatewayLog = new LabGatewayLog();
			labGatewayLog.setLogType(_ctx.stringValue("ListLabGatewayLogsResponse.Data["+ i +"].LogType"));
			labGatewayLog.setLogMillis(_ctx.longValue("ListLabGatewayLogsResponse.Data["+ i +"].LogMillis"));
			labGatewayLog.setContent(_ctx.stringValue("ListLabGatewayLogsResponse.Data["+ i +"].Content"));

			data.add(labGatewayLog);
		}
		listLabGatewayLogsResponse.setData(data);
	 
	 	return listLabGatewayLogsResponse;
	}
}