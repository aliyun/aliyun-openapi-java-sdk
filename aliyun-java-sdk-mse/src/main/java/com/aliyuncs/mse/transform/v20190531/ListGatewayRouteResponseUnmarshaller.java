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

import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse.Data.Routes;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse.Data.Routes.Comment;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse.Data.Routes.DirectResponse;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse.Data.Routes.Redirect;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse.Data.Routes.RoutePredicates;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse.Data.Routes.RoutePredicates.HeaderPredicatesItem;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse.Data.Routes.RoutePredicates.PathPredicates;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse.Data.Routes.RoutePredicates.QueryPredicatesItem;
import com.aliyuncs.mse.model.v20190531.ListGatewayRouteResponse.Data.Routes.RouteServicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayRouteResponseUnmarshaller {

	public static ListGatewayRouteResponse unmarshall(ListGatewayRouteResponse listGatewayRouteResponse, UnmarshallerContext _ctx) {
		
		listGatewayRouteResponse.setRequestId(_ctx.stringValue("ListGatewayRouteResponse.RequestId"));
		listGatewayRouteResponse.setHttpStatusCode(_ctx.integerValue("ListGatewayRouteResponse.HttpStatusCode"));
		listGatewayRouteResponse.setMessage(_ctx.stringValue("ListGatewayRouteResponse.Message"));
		listGatewayRouteResponse.setCode(_ctx.integerValue("ListGatewayRouteResponse.Code"));
		listGatewayRouteResponse.setSuccess(_ctx.booleanValue("ListGatewayRouteResponse.Success"));

		Data data = new Data();
		data.setTotalSize(_ctx.longValue("ListGatewayRouteResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("ListGatewayRouteResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListGatewayRouteResponse.Data.PageSize"));

		List<Routes> result = new ArrayList<Routes>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayRouteResponse.Data.Result.Length"); i++) {
			Routes routes = new Routes();
			routes.setId(_ctx.longValue("ListGatewayRouteResponse.Data.Result["+ i +"].Id"));
			routes.setName(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].Name"));
			routes.setGatewayUniqueId(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].GatewayUniqueId"));
			routes.setGatewayId(_ctx.longValue("ListGatewayRouteResponse.Data.Result["+ i +"].GatewayId"));
			routes.setStatus(_ctx.integerValue("ListGatewayRouteResponse.Data.Result["+ i +"].Status"));
			routes.setRouteOrder(_ctx.integerValue("ListGatewayRouteResponse.Data.Result["+ i +"].RouteOrder"));
			routes.setDefaultServiceName(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].DefaultServiceName"));
			routes.setDefaultServiceId(_ctx.longValue("ListGatewayRouteResponse.Data.Result["+ i +"].DefaultServiceId"));
			routes.setPredicates(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].Predicates"));
			routes.setGmtCreate(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].GmtCreate"));
			routes.setGmtModified(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].GmtModified"));
			routes.setServices(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].Services"));
			routes.setDomainId(_ctx.longValue("ListGatewayRouteResponse.Data.Result["+ i +"].DomainId"));
			routes.setDomainName(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].DomainName"));
			routes.setDestinationType(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].DestinationType"));
			routes.setType(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].Type"));
			routes.setEnableWaf(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].EnableWaf"));

			List<Long> domainIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayRouteResponse.Data.Result["+ i +"].DomainIdList.Length"); j++) {
				domainIdList.add(_ctx.longValue("ListGatewayRouteResponse.Data.Result["+ i +"].DomainIdList["+ j +"]"));
			}
			routes.setDomainIdList(domainIdList);

			List<String> domainNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayRouteResponse.Data.Result["+ i +"].DomainNameList.Length"); j++) {
				domainNameList.add(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].DomainNameList["+ j +"]"));
			}
			routes.setDomainNameList(domainNameList);

			RoutePredicates routePredicates = new RoutePredicates();

			List<String> methodPredicates = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.MethodPredicates.Length"); j++) {
				methodPredicates.add(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.MethodPredicates["+ j +"]"));
			}
			routePredicates.setMethodPredicates(methodPredicates);

			PathPredicates pathPredicates = new PathPredicates();
			pathPredicates.setPath(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.PathPredicates.Path"));
			pathPredicates.setType(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.PathPredicates.Type"));
			pathPredicates.setIgnoreCase(_ctx.booleanValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.PathPredicates.IgnoreCase"));
			routePredicates.setPathPredicates(pathPredicates);

			List<HeaderPredicatesItem> headerPredicates = new ArrayList<HeaderPredicatesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.HeaderPredicates.Length"); j++) {
				HeaderPredicatesItem headerPredicatesItem = new HeaderPredicatesItem();
				headerPredicatesItem.setKey(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.HeaderPredicates["+ j +"].Key"));
				headerPredicatesItem.setValue(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.HeaderPredicates["+ j +"].Value"));
				headerPredicatesItem.setType(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.HeaderPredicates["+ j +"].Type"));

				headerPredicates.add(headerPredicatesItem);
			}
			routePredicates.setHeaderPredicates(headerPredicates);

			List<QueryPredicatesItem> queryPredicates = new ArrayList<QueryPredicatesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.QueryPredicates.Length"); j++) {
				QueryPredicatesItem queryPredicatesItem = new QueryPredicatesItem();
				queryPredicatesItem.setKey(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.QueryPredicates["+ j +"].Key"));
				queryPredicatesItem.setValue(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.QueryPredicates["+ j +"].Value"));
				queryPredicatesItem.setType(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RoutePredicates.QueryPredicates["+ j +"].Type"));

				queryPredicates.add(queryPredicatesItem);
			}
			routePredicates.setQueryPredicates(queryPredicates);
			routes.setRoutePredicates(routePredicates);

			DirectResponse directResponse = new DirectResponse();
			directResponse.setCode(_ctx.integerValue("ListGatewayRouteResponse.Data.Result["+ i +"].DirectResponse.Code"));
			directResponse.setBody(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].DirectResponse.Body"));
			routes.setDirectResponse(directResponse);

			Redirect redirect = new Redirect();
			redirect.setCode(_ctx.integerValue("ListGatewayRouteResponse.Data.Result["+ i +"].Redirect.Code"));
			redirect.setHost(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].Redirect.Host"));
			redirect.setPath(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].Redirect.Path"));
			routes.setRedirect(redirect);

			Comment comment = new Comment();
			comment.setStatus(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].Comment.Status"));
			routes.setComment(comment);

			List<RouteServicesItem> routeServices = new ArrayList<RouteServicesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayRouteResponse.Data.Result["+ i +"].RouteServices.Length"); j++) {
				RouteServicesItem routeServicesItem = new RouteServicesItem();
				routeServicesItem.setServiceId(_ctx.longValue("ListGatewayRouteResponse.Data.Result["+ i +"].RouteServices["+ j +"].ServiceId"));
				routeServicesItem.setServiceName(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RouteServices["+ j +"].ServiceName"));
				routeServicesItem.setPercent(_ctx.integerValue("ListGatewayRouteResponse.Data.Result["+ i +"].RouteServices["+ j +"].Percent"));
				routeServicesItem.setVersion(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RouteServices["+ j +"].Version"));
				routeServicesItem.setName(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RouteServices["+ j +"].Name"));
				routeServicesItem.setSourceType(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RouteServices["+ j +"].SourceType"));
				routeServicesItem.setNamespace(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RouteServices["+ j +"].Namespace"));
				routeServicesItem.setGroupName(_ctx.stringValue("ListGatewayRouteResponse.Data.Result["+ i +"].RouteServices["+ j +"].GroupName"));

				routeServices.add(routeServicesItem);
			}
			routes.setRouteServices(routeServices);

			result.add(routes);
		}
		data.setResult(result);
		listGatewayRouteResponse.setData(data);
	 
	 	return listGatewayRouteResponse;
	}
}