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

import com.aliyuncs.mse.model.v20190531.GetGatewayOptionResponse;
import com.aliyuncs.mse.model.v20190531.GetGatewayOptionResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetGatewayOptionResponse.Data.LogConfigDetails;
import com.aliyuncs.mse.model.v20190531.GetGatewayOptionResponse.Data.TraceDetails;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayOptionResponseUnmarshaller {

	public static GetGatewayOptionResponse unmarshall(GetGatewayOptionResponse getGatewayOptionResponse, UnmarshallerContext _ctx) {
		
		getGatewayOptionResponse.setRequestId(_ctx.stringValue("GetGatewayOptionResponse.RequestId"));
		getGatewayOptionResponse.setHttpStatusCode(_ctx.integerValue("GetGatewayOptionResponse.HttpStatusCode"));
		getGatewayOptionResponse.setMessage(_ctx.stringValue("GetGatewayOptionResponse.Message"));
		getGatewayOptionResponse.setCode(_ctx.integerValue("GetGatewayOptionResponse.Code"));
		getGatewayOptionResponse.setSuccess(_ctx.booleanValue("GetGatewayOptionResponse.Success"));

		Data data = new Data();
		data.setEnableHardwareAcceleration(_ctx.booleanValue("GetGatewayOptionResponse.Data.EnableHardwareAcceleration"));
		data.setDisableHttp2Alpn(_ctx.booleanValue("GetGatewayOptionResponse.Data.DisableHttp2Alpn"));
		data.setEnableWaf(_ctx.booleanValue("GetGatewayOptionResponse.Data.EnableWaf"));

		TraceDetails traceDetails = new TraceDetails();
		traceDetails.setTraceEnabled(_ctx.booleanValue("GetGatewayOptionResponse.Data.TraceDetails.TraceEnabled"));
		traceDetails.setSample(_ctx.longValue("GetGatewayOptionResponse.Data.TraceDetails.Sample"));
		data.setTraceDetails(traceDetails);

		LogConfigDetails logConfigDetails = new LogConfigDetails();
		logConfigDetails.setLogEnabled(_ctx.booleanValue("GetGatewayOptionResponse.Data.LogConfigDetails.LogEnabled"));
		logConfigDetails.setProjectName(_ctx.stringValue("GetGatewayOptionResponse.Data.LogConfigDetails.ProjectName"));
		logConfigDetails.setLogStoreName(_ctx.stringValue("GetGatewayOptionResponse.Data.LogConfigDetails.LogStoreName"));
		data.setLogConfigDetails(logConfigDetails);
		getGatewayOptionResponse.setData(data);
	 
	 	return getGatewayOptionResponse;
	}
}