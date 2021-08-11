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

import com.aliyuncs.elasticsearch.model.v20170613.ListVpcEndpointsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListVpcEndpointsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointsResponseUnmarshaller {

	public static ListVpcEndpointsResponse unmarshall(ListVpcEndpointsResponse listVpcEndpointsResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointsResponse.setRequestId(_ctx.stringValue("ListVpcEndpointsResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setConnectionStatus(_ctx.stringValue("ListVpcEndpointsResponse.Result["+ i +"].connectionStatus"));
			resultItem.setCreateTime(_ctx.stringValue("ListVpcEndpointsResponse.Result["+ i +"].createTime"));
			resultItem.setEndpointBusinessStatus(_ctx.stringValue("ListVpcEndpointsResponse.Result["+ i +"].endpointBusinessStatus"));
			resultItem.setEndpointId(_ctx.stringValue("ListVpcEndpointsResponse.Result["+ i +"].endpointId"));
			resultItem.setEndpointName(_ctx.stringValue("ListVpcEndpointsResponse.Result["+ i +"].endpointName"));
			resultItem.setEndpointStatus(_ctx.stringValue("ListVpcEndpointsResponse.Result["+ i +"].endpointStatus"));
			resultItem.setServiceId(_ctx.stringValue("ListVpcEndpointsResponse.Result["+ i +"].serviceId"));
			resultItem.setServiceName(_ctx.stringValue("ListVpcEndpointsResponse.Result["+ i +"].serviceName"));
			resultItem.setEndpointDomain(_ctx.stringValue("ListVpcEndpointsResponse.Result["+ i +"].endpointDomain"));

			result.add(resultItem);
		}
		listVpcEndpointsResponse.setResult(result);
	 
	 	return listVpcEndpointsResponse;
	}
}