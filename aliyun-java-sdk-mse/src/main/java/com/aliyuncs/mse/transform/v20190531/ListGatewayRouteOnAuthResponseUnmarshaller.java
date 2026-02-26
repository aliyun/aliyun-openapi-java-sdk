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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListGatewayRouteOnAuthResponse;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteOnAuthResponse.DataItem;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteOnAuthResponse.DataItem.RoutePredicates;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteOnAuthResponse.DataItem.RoutePredicates.PathPredicates;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayRouteOnAuthResponseUnmarshaller {

	public static ListGatewayRouteOnAuthResponse unmarshall(ListGatewayRouteOnAuthResponse listGatewayRouteOnAuthResponse, UnmarshallerContext _ctx) {
		
		listGatewayRouteOnAuthResponse.setRequestId(_ctx.stringValue("ListGatewayRouteOnAuthResponse.RequestId"));
		listGatewayRouteOnAuthResponse.setHttpStatusCode(_ctx.integerValue("ListGatewayRouteOnAuthResponse.HttpStatusCode"));
		listGatewayRouteOnAuthResponse.setMessage(_ctx.stringValue("ListGatewayRouteOnAuthResponse.Message"));
		listGatewayRouteOnAuthResponse.setCode(_ctx.integerValue("ListGatewayRouteOnAuthResponse.Code"));
		listGatewayRouteOnAuthResponse.setSuccess(_ctx.booleanValue("ListGatewayRouteOnAuthResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayRouteOnAuthResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.integerValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].Name"));
			dataItem.setGatewayUniqueId(_ctx.stringValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].GatewayUniqueId"));
			dataItem.setGatewayId(_ctx.stringValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].GatewayId"));
			dataItem.setDomainId(_ctx.longValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].DomainId"));
			dataItem.setDomainName(_ctx.stringValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].DomainName"));

			List<Long> domainIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].DomainIdList.Length"); j++) {
				domainIdList.add(_ctx.longValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].DomainIdList["+ j +"]"));
			}
			dataItem.setDomainIdList(domainIdList);

			List<String> domainNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].DomainNameList.Length"); j++) {
				domainNameList.add(_ctx.stringValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].DomainNameList["+ j +"]"));
			}
			dataItem.setDomainNameList(domainNameList);

			RoutePredicates routePredicates = new RoutePredicates();

			PathPredicates pathPredicates = new PathPredicates();
			pathPredicates.setPath(_ctx.stringValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].RoutePredicates.PathPredicates.Path"));
			pathPredicates.setType(_ctx.stringValue("ListGatewayRouteOnAuthResponse.Data["+ i +"].RoutePredicates.PathPredicates.Type"));
			routePredicates.setPathPredicates(pathPredicates);
			dataItem.setRoutePredicates(routePredicates);

			data.add(dataItem);
		}
		listGatewayRouteOnAuthResponse.setData(data);
	 
	 	return listGatewayRouteOnAuthResponse;
	}
}