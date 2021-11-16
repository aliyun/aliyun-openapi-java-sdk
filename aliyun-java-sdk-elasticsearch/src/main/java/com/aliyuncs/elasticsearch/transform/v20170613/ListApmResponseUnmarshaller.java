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

import com.aliyuncs.elasticsearch.model.v20170613.ListApmResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListApmResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListApmResponse.返回结果;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApmResponseUnmarshaller {

	public static ListApmResponse unmarshall(ListApmResponse listApmResponse, UnmarshallerContext _ctx) {
		
		listApmResponse.setRequestId(_ctx.stringValue("ListApmResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.longValue("ListApmResponse.Headers.X-Total-Count"));
		listApmResponse.setHeaders(headers);

		List<返回结果> result = new ArrayList<返回结果>();
		for (int i = 0; i < _ctx.lengthValue("ListApmResponse.Result.Length"); i++) {
			返回结果 返回结果 = new 返回结果();
			返回结果.setCreatedAt(_ctx.stringValue("ListApmResponse.Result["+ i +"].createdAt"));
			返回结果.setDeployedReplica(_ctx.longValue("ListApmResponse.Result["+ i +"].deployedReplica"));
			返回结果.setDescription(_ctx.stringValue("ListApmResponse.Result["+ i +"].description"));
			返回结果.setInstanceId(_ctx.stringValue("ListApmResponse.Result["+ i +"].instanceId"));
			返回结果.setNodeAmount(_ctx.longValue("ListApmResponse.Result["+ i +"].nodeAmount"));
			返回结果.setOutputES(_ctx.stringValue("ListApmResponse.Result["+ i +"].outputES"));
			返回结果.setOutputESUserName(_ctx.stringValue("ListApmResponse.Result["+ i +"].outputESUserName"));
			返回结果.setOwnerId(_ctx.stringValue("ListApmResponse.Result["+ i +"].ownerId"));
			返回结果.setPaymentType(_ctx.stringValue("ListApmResponse.Result["+ i +"].paymentType"));
			返回结果.setRegion(_ctx.stringValue("ListApmResponse.Result["+ i +"].region"));
			返回结果.setReplica(_ctx.longValue("ListApmResponse.Result["+ i +"].replica"));
			返回结果.setResourceSpec(_ctx.stringValue("ListApmResponse.Result["+ i +"].resourceSpec"));
			返回结果.setStatus(_ctx.stringValue("ListApmResponse.Result["+ i +"].status"));
			返回结果.setVersion(_ctx.stringValue("ListApmResponse.Result["+ i +"].version"));
			返回结果.setVpcId(_ctx.stringValue("ListApmResponse.Result["+ i +"].vpcId"));
			返回结果.setVsArea(_ctx.stringValue("ListApmResponse.Result["+ i +"].vsArea"));
			返回结果.setVswitchId(_ctx.stringValue("ListApmResponse.Result["+ i +"].vswitchId"));

			result.add(返回结果);
		}
		listApmResponse.setResult(result);
	 
	 	return listApmResponse;
	}
}