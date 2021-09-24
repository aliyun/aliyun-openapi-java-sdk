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

import com.aliyuncs.mse.model.v20190531.GetGatewayResponse;
import com.aliyuncs.mse.model.v20190531.GetGatewayResponse.Data;
import com.aliyuncs.mse.model.v20190531.GetGatewayResponse.Data.LogConfigDetails;
import com.aliyuncs.mse.model.v20190531.GetGatewayResponse.Data.XtraceDetails;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayResponseUnmarshaller {

	public static GetGatewayResponse unmarshall(GetGatewayResponse getGatewayResponse, UnmarshallerContext _ctx) {
		
		getGatewayResponse.setRequestId(_ctx.stringValue("GetGatewayResponse.RequestId"));
		getGatewayResponse.setHttpStatusCode(_ctx.integerValue("GetGatewayResponse.HttpStatusCode"));
		getGatewayResponse.setMessage(_ctx.stringValue("GetGatewayResponse.Message"));
		getGatewayResponse.setCode(_ctx.integerValue("GetGatewayResponse.Code"));
		getGatewayResponse.setSuccess(_ctx.booleanValue("GetGatewayResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetGatewayResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetGatewayResponse.Data.Name"));
		data.setGatewayUniqueId(_ctx.stringValue("GetGatewayResponse.Data.GatewayUniqueId"));
		data.setGatewayType(_ctx.stringValue("GetGatewayResponse.Data.GatewayType"));
		data.setRegion(_ctx.stringValue("GetGatewayResponse.Data.Region"));
		data.setPrimaryUser(_ctx.stringValue("GetGatewayResponse.Data.PrimaryUser"));
		data.setStatus(_ctx.integerValue("GetGatewayResponse.Data.Status"));
		data.setArmsOn(_ctx.booleanValue("GetGatewayResponse.Data.ArmsOn"));
		data.setVpc(_ctx.stringValue("GetGatewayResponse.Data.Vpc"));
		data.setVswitch(_ctx.stringValue("GetGatewayResponse.Data.Vswitch"));
		data.setSecurityGroup(_ctx.stringValue("GetGatewayResponse.Data.SecurityGroup"));
		data.setSpec(_ctx.stringValue("GetGatewayResponse.Data.Spec"));
		data.setReplica(_ctx.integerValue("GetGatewayResponse.Data.Replica"));
		data.setGmtCreate(_ctx.stringValue("GetGatewayResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetGatewayResponse.Data.GmtModified"));
		data.setVswitch2(_ctx.stringValue("GetGatewayResponse.Data.Vswitch2"));
		data.setInstanceId(_ctx.stringValue("GetGatewayResponse.Data.InstanceId"));
		data.setChargeType(_ctx.stringValue("GetGatewayResponse.Data.ChargeType"));
		data.setEndDate(_ctx.stringValue("GetGatewayResponse.Data.EndDate"));

		XtraceDetails xtraceDetails = new XtraceDetails();
		xtraceDetails.setSample(_ctx.integerValue("GetGatewayResponse.Data.XtraceDetails.Sample"));
		xtraceDetails.setTraceOn(_ctx.booleanValue("GetGatewayResponse.Data.XtraceDetails.TraceOn"));
		data.setXtraceDetails(xtraceDetails);

		LogConfigDetails logConfigDetails = new LogConfigDetails();
		logConfigDetails.setLogEnabled(_ctx.booleanValue("GetGatewayResponse.Data.LogConfigDetails.LogEnabled"));
		logConfigDetails.setProjectName(_ctx.stringValue("GetGatewayResponse.Data.LogConfigDetails.ProjectName"));
		logConfigDetails.setLogStoreName(_ctx.stringValue("GetGatewayResponse.Data.LogConfigDetails.LogStoreName"));
		data.setLogConfigDetails(logConfigDetails);
		getGatewayResponse.setData(data);
	 
	 	return getGatewayResponse;
	}
}