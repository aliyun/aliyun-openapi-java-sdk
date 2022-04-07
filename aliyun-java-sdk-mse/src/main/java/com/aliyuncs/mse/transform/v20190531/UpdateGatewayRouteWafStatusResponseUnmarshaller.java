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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.Cors;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.DirectResponse;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.HTTPRewrite;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.HeaderOp;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.HeaderOp.HeaderOpItemsItem;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.Redirect;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.Retry;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.HeaderPredicatesItem;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.PathPredicates;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.QueryPredicatesItem;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.RouteServicesItem;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteWafStatusResponse.Data.Timeout;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayRouteWafStatusResponseUnmarshaller {

	public static UpdateGatewayRouteWafStatusResponse unmarshall(UpdateGatewayRouteWafStatusResponse updateGatewayRouteWafStatusResponse, UnmarshallerContext _ctx) {
		
		updateGatewayRouteWafStatusResponse.setRequestId(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.RequestId"));
		updateGatewayRouteWafStatusResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayRouteWafStatusResponse.HttpStatusCode"));
		updateGatewayRouteWafStatusResponse.setMessage(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Message"));
		updateGatewayRouteWafStatusResponse.setCode(_ctx.integerValue("UpdateGatewayRouteWafStatusResponse.Code"));
		updateGatewayRouteWafStatusResponse.setSuccess(_ctx.booleanValue("UpdateGatewayRouteWafStatusResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("UpdateGatewayRouteWafStatusResponse.Data.Id"));
		data.setName(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Name"));
		data.setGatewayUniqueId(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.GatewayUniqueId"));
		data.setGatewayId(_ctx.longValue("UpdateGatewayRouteWafStatusResponse.Data.GatewayId"));
		data.setDefaultServiceId(_ctx.longValue("UpdateGatewayRouteWafStatusResponse.Data.DefaultServiceId"));
		data.setDefaultServiceName(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.DefaultServiceName"));
		data.setStatus(_ctx.integerValue("UpdateGatewayRouteWafStatusResponse.Data.Status"));
		data.setGmtCreate(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.GmtModified"));
		data.setRouteOrder(_ctx.integerValue("UpdateGatewayRouteWafStatusResponse.Data.RouteOrder"));
		data.setPredicates(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Predicates"));
		data.setDomainId(_ctx.longValue("UpdateGatewayRouteWafStatusResponse.Data.DomainId"));
		data.setDomainName(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.DomainName"));
		data.setServices(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Services"));
		data.setDestinationType(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.DestinationType"));
		data.setEnableWaf(_ctx.booleanValue("UpdateGatewayRouteWafStatusResponse.Data.EnableWaf"));

		List<Long> domainIdList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateGatewayRouteWafStatusResponse.Data.DomainIdList.Length"); i++) {
			domainIdList.add(_ctx.longValue("UpdateGatewayRouteWafStatusResponse.Data.DomainIdList["+ i +"]"));
		}
		data.setDomainIdList(domainIdList);

		List<String> domainNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateGatewayRouteWafStatusResponse.Data.DomainNameList.Length"); i++) {
			domainNameList.add(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.DomainNameList["+ i +"]"));
		}
		data.setDomainNameList(domainNameList);

		RoutePredicates routePredicates = new RoutePredicates();

		List<String> methodPredicates = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.MethodPredicates.Length"); i++) {
			methodPredicates.add(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.MethodPredicates["+ i +"]"));
		}
		routePredicates.setMethodPredicates(methodPredicates);

		PathPredicates pathPredicates = new PathPredicates();
		pathPredicates.setPath(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.PathPredicates.Path"));
		pathPredicates.setType(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.PathPredicates.Type"));
		pathPredicates.setIgnoreCase(_ctx.booleanValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.PathPredicates.IgnoreCase"));
		routePredicates.setPathPredicates(pathPredicates);

		List<HeaderPredicatesItem> headerPredicates = new ArrayList<HeaderPredicatesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.HeaderPredicates.Length"); i++) {
			HeaderPredicatesItem headerPredicatesItem = new HeaderPredicatesItem();
			headerPredicatesItem.setKey(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.HeaderPredicates["+ i +"].Key"));
			headerPredicatesItem.setValue(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.HeaderPredicates["+ i +"].Value"));
			headerPredicatesItem.setType(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.HeaderPredicates["+ i +"].Type"));

			headerPredicates.add(headerPredicatesItem);
		}
		routePredicates.setHeaderPredicates(headerPredicates);

		List<QueryPredicatesItem> queryPredicates = new ArrayList<QueryPredicatesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.QueryPredicates.Length"); i++) {
			QueryPredicatesItem queryPredicatesItem = new QueryPredicatesItem();
			queryPredicatesItem.setKey(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.QueryPredicates["+ i +"].Key"));
			queryPredicatesItem.setValue(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.QueryPredicates["+ i +"].Value"));
			queryPredicatesItem.setType(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RoutePredicates.QueryPredicates["+ i +"].Type"));

			queryPredicates.add(queryPredicatesItem);
		}
		routePredicates.setQueryPredicates(queryPredicates);
		data.setRoutePredicates(routePredicates);

		HTTPRewrite hTTPRewrite = new HTTPRewrite();
		hTTPRewrite.setStatus(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HTTPRewrite.Status"));
		hTTPRewrite.setPath(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HTTPRewrite.Path"));
		hTTPRewrite.setHost(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HTTPRewrite.Host"));
		hTTPRewrite.setPathType(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HTTPRewrite.PathType"));
		hTTPRewrite.setPattern(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HTTPRewrite.Pattern"));
		hTTPRewrite.setSubstitution(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HTTPRewrite.Substitution"));
		data.setHTTPRewrite(hTTPRewrite);

		HeaderOp headerOp = new HeaderOp();
		headerOp.setStatus(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HeaderOp.Status"));

		List<HeaderOpItemsItem> headerOpItems = new ArrayList<HeaderOpItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateGatewayRouteWafStatusResponse.Data.HeaderOp.HeaderOpItems.Length"); i++) {
			HeaderOpItemsItem headerOpItemsItem = new HeaderOpItemsItem();
			headerOpItemsItem.setDirectionType(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HeaderOp.HeaderOpItems["+ i +"].DirectionType"));
			headerOpItemsItem.setOpType(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HeaderOp.HeaderOpItems["+ i +"].OpType"));
			headerOpItemsItem.setKey(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HeaderOp.HeaderOpItems["+ i +"].Key"));
			headerOpItemsItem.setValue(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.HeaderOp.HeaderOpItems["+ i +"].Value"));

			headerOpItems.add(headerOpItemsItem);
		}
		headerOp.setHeaderOpItems(headerOpItems);
		data.setHeaderOp(headerOp);

		DirectResponse directResponse = new DirectResponse();
		directResponse.setCode(_ctx.integerValue("UpdateGatewayRouteWafStatusResponse.Data.DirectResponse.Code"));
		directResponse.setBody(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.DirectResponse.Body"));
		data.setDirectResponse(directResponse);

		Cors cors = new Cors();
		cors.setStatus(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Cors.Status"));
		cors.setAllowOrigins(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Cors.AllowOrigins"));
		cors.setAllowMethods(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Cors.AllowMethods"));
		cors.setAllowHeaders(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Cors.AllowHeaders"));
		cors.setExposeHeaders(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Cors.ExposeHeaders"));
		cors.setTimeUnit(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Cors.TimeUnit"));
		cors.setUnitNum(_ctx.longValue("UpdateGatewayRouteWafStatusResponse.Data.Cors.UnitNum"));
		cors.setAllowCredentials(_ctx.booleanValue("UpdateGatewayRouteWafStatusResponse.Data.Cors.AllowCredentials"));
		data.setCors(cors);

		Timeout timeout = new Timeout();
		timeout.setUnitNum(_ctx.integerValue("UpdateGatewayRouteWafStatusResponse.Data.Timeout.UnitNum"));
		timeout.setTimeUnit(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Timeout.TimeUnit"));
		timeout.setStatus(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Timeout.Status"));
		data.setTimeout(timeout);

		Retry retry = new Retry();
		retry.setAttempts(_ctx.integerValue("UpdateGatewayRouteWafStatusResponse.Data.Retry.Attempts"));
		retry.setStatus(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Retry.Status"));

		List<String> retryOn = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateGatewayRouteWafStatusResponse.Data.Retry.RetryOn.Length"); i++) {
			retryOn.add(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Retry.RetryOn["+ i +"]"));
		}
		retry.setRetryOn(retryOn);

		List<String> httpCodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateGatewayRouteWafStatusResponse.Data.Retry.HttpCodes.Length"); i++) {
			httpCodes.add(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Retry.HttpCodes["+ i +"]"));
		}
		retry.setHttpCodes(httpCodes);
		data.setRetry(retry);

		Redirect redirect = new Redirect();
		redirect.setCode(_ctx.integerValue("UpdateGatewayRouteWafStatusResponse.Data.Redirect.Code"));
		redirect.setHost(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Redirect.Host"));
		redirect.setPath(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.Redirect.Path"));
		data.setRedirect(redirect);

		List<RouteServicesItem> routeServices = new ArrayList<RouteServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateGatewayRouteWafStatusResponse.Data.RouteServices.Length"); i++) {
			RouteServicesItem routeServicesItem = new RouteServicesItem();
			routeServicesItem.setServiceId(_ctx.longValue("UpdateGatewayRouteWafStatusResponse.Data.RouteServices["+ i +"].ServiceId"));
			routeServicesItem.setServiceName(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RouteServices["+ i +"].ServiceName"));
			routeServicesItem.setPercent(_ctx.integerValue("UpdateGatewayRouteWafStatusResponse.Data.RouteServices["+ i +"].Percent"));
			routeServicesItem.setVersion(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RouteServices["+ i +"].Version"));
			routeServicesItem.setName(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RouteServices["+ i +"].Name"));
			routeServicesItem.setSourceType(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RouteServices["+ i +"].SourceType"));
			routeServicesItem.setNamespace(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RouteServices["+ i +"].Namespace"));
			routeServicesItem.setGroupName(_ctx.stringValue("UpdateGatewayRouteWafStatusResponse.Data.RouteServices["+ i +"].GroupName"));

			routeServices.add(routeServicesItem);
		}
		data.setRouteServices(routeServices);
		updateGatewayRouteWafStatusResponse.setData(data);
	 
	 	return updateGatewayRouteWafStatusResponse;
	}
}