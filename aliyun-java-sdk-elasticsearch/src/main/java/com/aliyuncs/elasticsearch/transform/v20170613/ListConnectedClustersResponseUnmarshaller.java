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

import com.aliyuncs.elasticsearch.model.v20170613.ListConnectedClustersResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListConnectedClustersResponse.ConnectableClustersInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConnectedClustersResponseUnmarshaller {

	public static ListConnectedClustersResponse unmarshall(ListConnectedClustersResponse listConnectedClustersResponse, UnmarshallerContext _ctx) {
		
		listConnectedClustersResponse.setRequestId(_ctx.stringValue("ListConnectedClustersResponse.RequestId"));

		List<ConnectableClustersInfo> result = new ArrayList<ConnectableClustersInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListConnectedClustersResponse.Result.Length"); i++) {
			ConnectableClustersInfo connectableClustersInfo = new ConnectableClustersInfo();
			connectableClustersInfo.setInstances(_ctx.stringValue("ListConnectedClustersResponse.Result["+ i +"].instances"));
			connectableClustersInfo.setNetworkType(_ctx.stringValue("ListConnectedClustersResponse.Result["+ i +"].networkType"));

			result.add(connectableClustersInfo);
		}
		listConnectedClustersResponse.setResult(result);
	 
	 	return listConnectedClustersResponse;
	}
}