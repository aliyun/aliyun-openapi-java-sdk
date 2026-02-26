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

package com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListEndpointsResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListEndpointsResponse.EndpointsItem;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListEndpointsResponse.EndpointsItem.Status;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListEndpointsResponse.EndpointsItem.Status.Detail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEndpointsResponseUnmarshaller {

	public static ListEndpointsResponse unmarshall(ListEndpointsResponse listEndpointsResponse, UnmarshallerContext _ctx) {
		
		listEndpointsResponse.setRequestId(_ctx.stringValue("ListEndpointsResponse.RequestId"));
		listEndpointsResponse.setTotalCount(_ctx.integerValue("ListEndpointsResponse.TotalCount"));

		List<EndpointsItem> endpoints = new ArrayList<EndpointsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEndpointsResponse.Endpoints.Length"); i++) {
			EndpointsItem endpointsItem = new EndpointsItem();
			endpointsItem.setUserId(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].UserId"));
			endpointsItem.setOwnerId(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].OwnerId"));
			endpointsItem.setGmtCreateTime(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].GmtCreateTime"));
			endpointsItem.setGmtModifiedTime(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].GmtModifiedTime"));
			endpointsItem.setUuid(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].Uuid"));
			endpointsItem.setName(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].Name"));
			endpointsItem.setType(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].Type"));
			endpointsItem.setVpcId(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].VpcId"));
			endpointsItem.setVswitchId(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].VswitchId"));
			endpointsItem.setInstanceId(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].InstanceId"));

			Status status = new Status();
			status.setPhase(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].Status.Phase"));
			status.setCode(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].Status.Code"));
			status.setMessage(_ctx.stringValue("ListEndpointsResponse.Endpoints["+ i +"].Status.Message"));

			Detail detail = new Detail();
			detail.setIpPortMapping(_ctx.mapValue("ListEndpointsResponse.Endpoints["+ i +"].Status.Detail.IpPortMapping"));
			status.setDetail(detail);
			endpointsItem.setStatus(status);

			endpoints.add(endpointsItem);
		}
		listEndpointsResponse.setEndpoints(endpoints);
	 
	 	return listEndpointsResponse;
	}
}