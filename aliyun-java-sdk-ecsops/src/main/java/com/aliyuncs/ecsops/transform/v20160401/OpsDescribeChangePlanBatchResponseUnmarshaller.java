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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanBatchResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeChangePlanBatchResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeChangePlanBatchResponseUnmarshaller {

	public static OpsDescribeChangePlanBatchResponse unmarshall(OpsDescribeChangePlanBatchResponse opsDescribeChangePlanBatchResponse, UnmarshallerContext _ctx) {
		
		opsDescribeChangePlanBatchResponse.setRequestId(_ctx.stringValue("OpsDescribeChangePlanBatchResponse.RequestId"));
		opsDescribeChangePlanBatchResponse.setMessage(_ctx.stringValue("OpsDescribeChangePlanBatchResponse.Message"));
		opsDescribeChangePlanBatchResponse.setCode(_ctx.stringValue("OpsDescribeChangePlanBatchResponse.Code"));
		opsDescribeChangePlanBatchResponse.setSuccess(_ctx.stringValue("OpsDescribeChangePlanBatchResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("OpsDescribeChangePlanBatchResponse.Data.Status"));

		List<String> servers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeChangePlanBatchResponse.Data.Servers.Length"); i++) {
			servers.add(_ctx.stringValue("OpsDescribeChangePlanBatchResponse.Data.Servers["+ i +"]"));
		}
		data.setServers(servers);
		opsDescribeChangePlanBatchResponse.setData(data);
	 
	 	return opsDescribeChangePlanBatchResponse;
	}
}