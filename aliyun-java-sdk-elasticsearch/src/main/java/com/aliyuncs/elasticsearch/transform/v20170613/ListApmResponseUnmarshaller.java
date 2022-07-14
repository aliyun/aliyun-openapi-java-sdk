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
import com.aliyuncs.elasticsearch.model.v20170613.ListApmResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApmResponseUnmarshaller {

	public static ListApmResponse unmarshall(ListApmResponse listApmResponse, UnmarshallerContext _ctx) {
		
		listApmResponse.setRequestId(_ctx.stringValue("ListApmResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.longValue("ListApmResponse.Headers.X-Total-Count"));
		listApmResponse.setHeaders(headers);

		List<Object> result = new ArrayList<Object>();
		for (int i = 0; i < _ctx.lengthValue("ListApmResponse.Result.Length"); i++) {
			Object object = new Object();
			object.setCreatedAt(_ctx.stringValue("ListApmResponse.Result["+ i +"].createdAt"));
			object.setDeployedReplica(_ctx.longValue("ListApmResponse.Result["+ i +"].deployedReplica"));
			object.setDescription(_ctx.stringValue("ListApmResponse.Result["+ i +"].description"));
			object.setInstanceId(_ctx.stringValue("ListApmResponse.Result["+ i +"].instanceId"));
			object.setNodeAmount(_ctx.longValue("ListApmResponse.Result["+ i +"].nodeAmount"));
			object.setOutputES(_ctx.stringValue("ListApmResponse.Result["+ i +"].outputES"));
			object.setOutputESUserName(_ctx.stringValue("ListApmResponse.Result["+ i +"].outputESUserName"));
			object.setOwnerId(_ctx.stringValue("ListApmResponse.Result["+ i +"].ownerId"));
			object.setPaymentType(_ctx.stringValue("ListApmResponse.Result["+ i +"].paymentType"));
			object.setRegion(_ctx.stringValue("ListApmResponse.Result["+ i +"].region"));
			object.setReplica(_ctx.longValue("ListApmResponse.Result["+ i +"].replica"));
			object.setResourceSpec(_ctx.stringValue("ListApmResponse.Result["+ i +"].resourceSpec"));
			object.setStatus(_ctx.stringValue("ListApmResponse.Result["+ i +"].status"));
			object.setVersion(_ctx.stringValue("ListApmResponse.Result["+ i +"].version"));
			object.setVpcId(_ctx.stringValue("ListApmResponse.Result["+ i +"].vpcId"));
			object.setVsArea(_ctx.stringValue("ListApmResponse.Result["+ i +"].vsArea"));
			object.setVswitchId(_ctx.stringValue("ListApmResponse.Result["+ i +"].vswitchId"));

			result.add(object);
		}
		listApmResponse.setResult(result);
	 
	 	return listApmResponse;
	}
}