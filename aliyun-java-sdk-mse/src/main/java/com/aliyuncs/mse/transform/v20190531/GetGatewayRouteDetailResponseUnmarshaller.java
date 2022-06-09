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

import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.Cors;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.DirectResponse;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.HTTPRewrite;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.HeaderOp;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.HeaderOp.HeaderOpItemsItem;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.Redirect;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.Retry;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.RoutePredicates;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.RoutePredicates.HeaderPredicatesItem;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.RoutePredicates.PathPredicates;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.RoutePredicates.QueryPredicatesItem;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.RouteServicesItem;
import com.aliyuncs.mse.model.v20190531.GetGatewayRouteDetailResponse.Data.Timeout;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayRouteDetailResponseUnmarshaller {

	public static GetGatewayRouteDetailResponse unmarshall(GetGatewayRouteDetailResponse getGatewayRouteDetailResponse, UnmarshallerContext _ctx) {
		
		getGatewayRouteDetailResponse.setRequestId(_ctx.stringValue("GetGatewayRouteDetailResponse.RequestId"));
		getGatewayRouteDetailResponse.setHttpStatusCode(_ctx.integerValue("GetGatewayRouteDetailResponse.HttpStatusCode"));
		getGatewayRouteDetailResponse.setMessage(_ctx.stringValue("GetGatewayRouteDetailResponse.Message"));
		getGatewayRouteDetailResponse.setCode(_ctx.integerValue("GetGatewayRouteDetailResponse.Code"));
		getGatewayRouteDetailResponse.setSuccess(_ctx.booleanValue("GetGatewayRouteDetailResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetGatewayRouteDetailResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Name"));
		data.setGatewayUniqueId(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.GatewayUniqueId"));
		data.setGatewayId(_ctx.longValue("GetGatewayRouteDetailResponse.Data.GatewayId"));
		data.setDefaultServiceId(_ctx.longValue("GetGatewayRouteDetailResponse.Data.DefaultServiceId"));
		data.setDefaultServiceName(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.DefaultServiceName"));
		data.setStatus(_ctx.integerValue("GetGatewayRouteDetailResponse.Data.Status"));
		data.setGmtCreate(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.GmtModified"));
		data.setRouteOrder(_ctx.integerValue("GetGatewayRouteDetailResponse.Data.RouteOrder"));
		data.setPredicates(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Predicates"));
		data.setDomainId(_ctx.longValue("GetGatewayRouteDetailResponse.Data.DomainId"));
		data.setDomainName(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.DomainName"));
		data.setServices(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Services"));
		data.setDestinationType(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.DestinationType"));
		data.setEnableWaf(_ctx.booleanValue("GetGatewayRouteDetailResponse.Data.EnableWaf"));
		data.setAhasStatus(_ctx.integerValue("GetGatewayRouteDetailResponse.Data.AhasStatus"));

		List<Long> domainIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayRouteDetailResponse.Data.DomainIdList.Length"); i++) {
			domainIdList.add(_ctx.longValue("GetGatewayRouteDetailResponse.Data.DomainIdList["+ i +"]"));
		}
		data.setDomainIdList(domainIdList);

		List<String> domainNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayRouteDetailResponse.Data.DomainNameList.Length"); i++) {
			domainNameList.add(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.DomainNameList["+ i +"]"));
		}
		data.setDomainNameList(domainNameList);

		RoutePredicates routePredicates = new RoutePredicates();

		List<String> methodPredicates = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.MethodPredicates.Length"); i++) {
			methodPredicates.add(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.MethodPredicates["+ i +"]"));
		}
		routePredicates.setMethodPredicates(methodPredicates);

		PathPredicates pathPredicates = new PathPredicates();
		pathPredicates.setPath(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.PathPredicates.Path"));
		pathPredicates.setType(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.PathPredicates.Type"));
		pathPredicates.setIgnoreCase(_ctx.booleanValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.PathPredicates.IgnoreCase"));
		routePredicates.setPathPredicates(pathPredicates);

		List<HeaderPredicatesItem> headerPredicates = new ArrayList<HeaderPredicatesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.HeaderPredicates.Length"); i++) {
			HeaderPredicatesItem headerPredicatesItem = new HeaderPredicatesItem();
			headerPredicatesItem.setKey(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.HeaderPredicates["+ i +"].Key"));
			headerPredicatesItem.setValue(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.HeaderPredicates["+ i +"].Value"));
			headerPredicatesItem.setType(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.HeaderPredicates["+ i +"].Type"));

			headerPredicates.add(headerPredicatesItem);
		}
		routePredicates.setHeaderPredicates(headerPredicates);

		List<QueryPredicatesItem> queryPredicates = new ArrayList<QueryPredicatesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.QueryPredicates.Length"); i++) {
			QueryPredicatesItem queryPredicatesItem = new QueryPredicatesItem();
			queryPredicatesItem.setKey(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.QueryPredicates["+ i +"].Key"));
			queryPredicatesItem.setValue(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.QueryPredicates["+ i +"].Value"));
			queryPredicatesItem.setType(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RoutePredicates.QueryPredicates["+ i +"].Type"));

			queryPredicates.add(queryPredicatesItem);
		}
		routePredicates.setQueryPredicates(queryPredicates);
		data.setRoutePredicates(routePredicates);

		HTTPRewrite hTTPRewrite = new HTTPRewrite();
		hTTPRewrite.setStatus(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HTTPRewrite.Status"));
		hTTPRewrite.setPath(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HTTPRewrite.Path"));
		hTTPRewrite.setHost(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HTTPRewrite.Host"));
		hTTPRewrite.setPathType(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HTTPRewrite.PathType"));
		hTTPRewrite.setPattern(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HTTPRewrite.Pattern"));
		hTTPRewrite.setSubstitution(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HTTPRewrite.Substitution"));
		data.setHTTPRewrite(hTTPRewrite);

		HeaderOp headerOp = new HeaderOp();
		headerOp.setStatus(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HeaderOp.Status"));

		List<HeaderOpItemsItem> headerOpItems = new ArrayList<HeaderOpItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayRouteDetailResponse.Data.HeaderOp.HeaderOpItems.Length"); i++) {
			HeaderOpItemsItem headerOpItemsItem = new HeaderOpItemsItem();
			headerOpItemsItem.setDirectionType(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HeaderOp.HeaderOpItems["+ i +"].DirectionType"));
			headerOpItemsItem.setOpType(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HeaderOp.HeaderOpItems["+ i +"].OpType"));
			headerOpItemsItem.setKey(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HeaderOp.HeaderOpItems["+ i +"].Key"));
			headerOpItemsItem.setValue(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.HeaderOp.HeaderOpItems["+ i +"].Value"));

			headerOpItems.add(headerOpItemsItem);
		}
		headerOp.setHeaderOpItems(headerOpItems);
		data.setHeaderOp(headerOp);

		DirectResponse directResponse = new DirectResponse();
		directResponse.setCode(_ctx.integerValue("GetGatewayRouteDetailResponse.Data.DirectResponse.Code"));
		directResponse.setBody(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.DirectResponse.Body"));
		data.setDirectResponse(directResponse);

		Cors cors = new Cors();
		cors.setStatus(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Cors.Status"));
		cors.setAllowOrigins(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Cors.AllowOrigins"));
		cors.setAllowMethods(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Cors.AllowMethods"));
		cors.setAllowHeaders(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Cors.AllowHeaders"));
		cors.setExposeHeaders(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Cors.ExposeHeaders"));
		cors.setTimeUnit(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Cors.TimeUnit"));
		cors.setUnitNum(_ctx.longValue("GetGatewayRouteDetailResponse.Data.Cors.UnitNum"));
		cors.setAllowCredentials(_ctx.booleanValue("GetGatewayRouteDetailResponse.Data.Cors.AllowCredentials"));
		data.setCors(cors);

		Timeout timeout = new Timeout();
		timeout.setUnitNum(_ctx.integerValue("GetGatewayRouteDetailResponse.Data.Timeout.UnitNum"));
		timeout.setTimeUnit(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Timeout.TimeUnit"));
		timeout.setStatus(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Timeout.Status"));
		data.setTimeout(timeout);

		Retry retry = new Retry();
		retry.setAttempts(_ctx.integerValue("GetGatewayRouteDetailResponse.Data.Retry.Attempts"));
		retry.setStatus(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Retry.Status"));

		List<String> retryOn = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayRouteDetailResponse.Data.Retry.RetryOn.Length"); i++) {
			retryOn.add(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Retry.RetryOn["+ i +"]"));
		}
		retry.setRetryOn(retryOn);

		List<String> httpCodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayRouteDetailResponse.Data.Retry.HttpCodes.Length"); i++) {
			httpCodes.add(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Retry.HttpCodes["+ i +"]"));
		}
		retry.setHttpCodes(httpCodes);
		data.setRetry(retry);

		Redirect redirect = new Redirect();
		redirect.setCode(_ctx.integerValue("GetGatewayRouteDetailResponse.Data.Redirect.Code"));
		redirect.setHost(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Redirect.Host"));
		redirect.setPath(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.Redirect.Path"));
		data.setRedirect(redirect);

		List<RouteServicesItem> routeServices = new ArrayList<RouteServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetGatewayRouteDetailResponse.Data.RouteServices.Length"); i++) {
			RouteServicesItem routeServicesItem = new RouteServicesItem();
			routeServicesItem.setServiceId(_ctx.longValue("GetGatewayRouteDetailResponse.Data.RouteServices["+ i +"].ServiceId"));
			routeServicesItem.setServiceName(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RouteServices["+ i +"].ServiceName"));
			routeServicesItem.setPercent(_ctx.integerValue("GetGatewayRouteDetailResponse.Data.RouteServices["+ i +"].Percent"));
			routeServicesItem.setVersion(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RouteServices["+ i +"].Version"));
			routeServicesItem.setName(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RouteServices["+ i +"].Name"));
			routeServicesItem.setSourceType(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RouteServices["+ i +"].SourceType"));
			routeServicesItem.setNamespace(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RouteServices["+ i +"].Namespace"));
			routeServicesItem.setGroupName(_ctx.stringValue("GetGatewayRouteDetailResponse.Data.RouteServices["+ i +"].GroupName"));

			routeServices.add(routeServicesItem);
		}
		data.setRouteServices(routeServices);
		getGatewayRouteDetailResponse.setData(data);
	 
	 	return getGatewayRouteDetailResponse;
	}
}