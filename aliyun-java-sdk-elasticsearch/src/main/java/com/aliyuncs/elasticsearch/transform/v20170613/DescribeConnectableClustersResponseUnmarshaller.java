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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.DescribeConnectableClustersResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeConnectableClustersResponse.ConnectableClustersInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConnectableClustersResponseUnmarshaller {

	public static DescribeConnectableClustersResponse unmarshall(DescribeConnectableClustersResponse describeConnectableClustersResponse, UnmarshallerContext _ctx) {
		
		describeConnectableClustersResponse.setRequestId(_ctx.stringValue("DescribeConnectableClustersResponse.RequestId"));

		List<ConnectableClustersInfo> result = new ArrayList<ConnectableClustersInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeConnectableClustersResponse.Result.Length"); i++) {
			ConnectableClustersInfo connectableClustersInfo = new ConnectableClustersInfo();
			connectableClustersInfo.setInstances(_ctx.stringValue("DescribeConnectableClustersResponse.Result["+ i +"].instances"));
			connectableClustersInfo.setNetworkType(_ctx.stringValue("DescribeConnectableClustersResponse.Result["+ i +"].networkType"));

			result.add(connectableClustersInfo);
		}
		describeConnectableClustersResponse.setResult(result);
	 
	 	return describeConnectableClustersResponse;
	}
}