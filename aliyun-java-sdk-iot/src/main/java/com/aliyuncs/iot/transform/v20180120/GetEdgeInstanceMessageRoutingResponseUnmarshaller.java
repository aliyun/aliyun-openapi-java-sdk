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

import com.aliyuncs.iot.model.v20180120.GetEdgeInstanceMessageRoutingResponse;
import com.aliyuncs.iot.model.v20180120.GetEdgeInstanceMessageRoutingResponse.Data;
import com.aliyuncs.iot.model.v20180120.GetEdgeInstanceMessageRoutingResponse.Data.RouteContext;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEdgeInstanceMessageRoutingResponseUnmarshaller {

	public static GetEdgeInstanceMessageRoutingResponse unmarshall(GetEdgeInstanceMessageRoutingResponse getEdgeInstanceMessageRoutingResponse, UnmarshallerContext _ctx) {
		
		getEdgeInstanceMessageRoutingResponse.setRequestId(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.RequestId"));
		getEdgeInstanceMessageRoutingResponse.setSuccess(_ctx.booleanValue("GetEdgeInstanceMessageRoutingResponse.Success"));
		getEdgeInstanceMessageRoutingResponse.setCode(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Code"));
		getEdgeInstanceMessageRoutingResponse.setErrorMessage(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.ErrorMessage"));

		Data data = new Data();
		data.setTopicFilter(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.TopicFilter"));
		data.setSourceType(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.SourceType"));
		data.setName(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.Name"));
		data.setSourceData(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.SourceData"));
		data.setTargetType(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.TargetType"));
		data.setTargetData(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.TargetData"));
		data.setGmtCreate(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.GmtModified"));
		data.setGmtCreateTimestamp(_ctx.longValue("GetEdgeInstanceMessageRoutingResponse.Data.GmtCreateTimestamp"));
		data.setGmtModifiedTimestamp(_ctx.longValue("GetEdgeInstanceMessageRoutingResponse.Data.GmtModifiedTimestamp"));

		RouteContext routeContext = new RouteContext();
		routeContext.setSourceFcServiceName(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.RouteContext.SourceFcServiceName"));
		routeContext.setSourceFcFunctionName(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.RouteContext.SourceFcFunctionName"));
		routeContext.setSourceStreamName(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.RouteContext.SourceStreamName"));
		routeContext.setSourceApplicationName(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.RouteContext.SourceApplicationName"));
		routeContext.setTargetFcServiceName(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.RouteContext.TargetFcServiceName"));
		routeContext.setTargetFcFunctionName(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.RouteContext.TargetFcFunctionName"));
		routeContext.setTargetStreamName(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.RouteContext.TargetStreamName"));
		routeContext.setTargetApplicationName(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.RouteContext.TargetApplicationName"));
		routeContext.setQos(_ctx.stringValue("GetEdgeInstanceMessageRoutingResponse.Data.RouteContext.Qos"));
		data.setRouteContext(routeContext);
		getEdgeInstanceMessageRoutingResponse.setData(data);
	 
	 	return getEdgeInstanceMessageRoutingResponse;
	}
}