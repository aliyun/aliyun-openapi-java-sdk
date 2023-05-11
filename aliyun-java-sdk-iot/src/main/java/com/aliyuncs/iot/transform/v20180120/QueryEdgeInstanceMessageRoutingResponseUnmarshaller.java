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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceMessageRoutingResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceMessageRoutingResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceMessageRoutingResponse.Data.MessageRoute;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceMessageRoutingResponse.Data.MessageRoute.RouteContext;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeInstanceMessageRoutingResponseUnmarshaller {

	public static QueryEdgeInstanceMessageRoutingResponse unmarshall(QueryEdgeInstanceMessageRoutingResponse queryEdgeInstanceMessageRoutingResponse, UnmarshallerContext _ctx) {
		
		queryEdgeInstanceMessageRoutingResponse.setRequestId(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.RequestId"));
		queryEdgeInstanceMessageRoutingResponse.setSuccess(_ctx.booleanValue("QueryEdgeInstanceMessageRoutingResponse.Success"));
		queryEdgeInstanceMessageRoutingResponse.setCode(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Code"));
		queryEdgeInstanceMessageRoutingResponse.setErrorMessage(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryEdgeInstanceMessageRoutingResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryEdgeInstanceMessageRoutingResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryEdgeInstanceMessageRoutingResponse.Data.CurrentPage"));

		List<MessageRoute> messageRouteList = new ArrayList<MessageRoute>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList.Length"); i++) {
			MessageRoute messageRoute = new MessageRoute();
			messageRoute.setRouteId(_ctx.integerValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].RouteId"));
			messageRoute.setName(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].Name"));
			messageRoute.setTopicFilter(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].TopicFilter"));
			messageRoute.setSourceType(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].SourceType"));
			messageRoute.setSourceData(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].SourceData"));
			messageRoute.setTargetType(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].TargetType"));
			messageRoute.setTargetData(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].TargetData"));
			messageRoute.setGmtCreate(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].GmtCreate"));
			messageRoute.setGmtModified(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].GmtModified"));
			messageRoute.setGmtCreateTimestamp(_ctx.longValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].GmtCreateTimestamp"));
			messageRoute.setGmtModifiedTimestamp(_ctx.longValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].GmtModifiedTimestamp"));

			RouteContext routeContext = new RouteContext();
			routeContext.setSourceFcServiceName(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].RouteContext.SourceFcServiceName"));
			routeContext.setSourceFcFunctionName(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].RouteContext.SourceFcFunctionName"));
			routeContext.setSourceStreamName(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].RouteContext.SourceStreamName"));
			routeContext.setSourceApplicationName(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].RouteContext.SourceApplicationName"));
			routeContext.setTargetFcServiceName(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].RouteContext.TargetFcServiceName"));
			routeContext.setTargetFcFunctionName(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].RouteContext.TargetFcFunctionName"));
			routeContext.setTargetStreamName(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].RouteContext.TargetStreamName"));
			routeContext.setTargetApplicationName(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].RouteContext.TargetApplicationName"));
			routeContext.setQos(_ctx.stringValue("QueryEdgeInstanceMessageRoutingResponse.Data.MessageRouteList["+ i +"].RouteContext.Qos"));
			messageRoute.setRouteContext(routeContext);

			messageRouteList.add(messageRoute);
		}
		data.setMessageRouteList(messageRouteList);
		queryEdgeInstanceMessageRoutingResponse.setData(data);
	 
	 	return queryEdgeInstanceMessageRoutingResponse;
	}
}