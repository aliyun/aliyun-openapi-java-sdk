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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayOptionResponse;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayOptionResponse.Data;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayOptionResponse.Data.LogConfigDetails;
import com.aliyuncs.mse.model.v20190531.UpdateGatewayOptionResponse.Data.TraceDetails;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayOptionResponseUnmarshaller {

	public static UpdateGatewayOptionResponse unmarshall(UpdateGatewayOptionResponse updateGatewayOptionResponse, UnmarshallerContext _ctx) {
		
		updateGatewayOptionResponse.setRequestId(_ctx.stringValue("UpdateGatewayOptionResponse.RequestId"));
		updateGatewayOptionResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayOptionResponse.HttpStatusCode"));
		updateGatewayOptionResponse.setMessage(_ctx.stringValue("UpdateGatewayOptionResponse.Message"));
		updateGatewayOptionResponse.setCode(_ctx.integerValue("UpdateGatewayOptionResponse.Code"));
		updateGatewayOptionResponse.setSuccess(_ctx.booleanValue("UpdateGatewayOptionResponse.Success"));

		Data data = new Data();
		data.setEnableHardwareAcceleration(_ctx.booleanValue("UpdateGatewayOptionResponse.Data.EnableHardwareAcceleration"));
		data.setDisableHttp2Alpn(_ctx.booleanValue("UpdateGatewayOptionResponse.Data.DisableHttp2Alpn"));
		data.setEnableWaf(_ctx.booleanValue("UpdateGatewayOptionResponse.Data.EnableWaf"));

		TraceDetails traceDetails = new TraceDetails();
		traceDetails.setTraceEnabled(_ctx.booleanValue("UpdateGatewayOptionResponse.Data.TraceDetails.TraceEnabled"));
		traceDetails.setSample(_ctx.longValue("UpdateGatewayOptionResponse.Data.TraceDetails.Sample"));
		data.setTraceDetails(traceDetails);

		LogConfigDetails logConfigDetails = new LogConfigDetails();
		logConfigDetails.setLogEnabled(_ctx.booleanValue("UpdateGatewayOptionResponse.Data.LogConfigDetails.LogEnabled"));
		logConfigDetails.setProjectName(_ctx.stringValue("UpdateGatewayOptionResponse.Data.LogConfigDetails.ProjectName"));
		logConfigDetails.setLogStoreName(_ctx.stringValue("UpdateGatewayOptionResponse.Data.LogConfigDetails.LogStoreName"));
		data.setLogConfigDetails(logConfigDetails);
		updateGatewayOptionResponse.setData(data);
	 
	 	return updateGatewayOptionResponse;
	}
}