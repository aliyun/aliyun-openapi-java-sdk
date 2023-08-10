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

package com.aliyuncs.adcp.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterLogsResponse;
import com.aliyuncs.adcp.model.v20220101.DescribeHubClusterLogsResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHubClusterLogsResponseUnmarshaller {

	public static DescribeHubClusterLogsResponse unmarshall(DescribeHubClusterLogsResponse describeHubClusterLogsResponse, UnmarshallerContext _ctx) {
		
		describeHubClusterLogsResponse.setRequestId(_ctx.stringValue("DescribeHubClusterLogsResponse.RequestId"));

		List<Log> logs = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHubClusterLogsResponse.Logs.Length"); i++) {
			Log log = new Log();
			log.setCreationTime(_ctx.stringValue("DescribeHubClusterLogsResponse.Logs["+ i +"].CreationTime"));
			log.setClusterId(_ctx.stringValue("DescribeHubClusterLogsResponse.Logs["+ i +"].ClusterId"));
			log.setClusterLog(_ctx.stringValue("DescribeHubClusterLogsResponse.Logs["+ i +"].ClusterLog"));
			log.setLogLevel(_ctx.stringValue("DescribeHubClusterLogsResponse.Logs["+ i +"].LogLevel"));

			logs.add(log);
		}
		describeHubClusterLogsResponse.setLogs(logs);
	 
	 	return describeHubClusterLogsResponse;
	}
}