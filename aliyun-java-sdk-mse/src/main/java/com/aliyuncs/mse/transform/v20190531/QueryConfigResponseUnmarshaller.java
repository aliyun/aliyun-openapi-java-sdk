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

import com.aliyuncs.mse.model.v20190531.QueryConfigResponse;
import com.aliyuncs.mse.model.v20190531.QueryConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryConfigResponseUnmarshaller {

	public static QueryConfigResponse unmarshall(QueryConfigResponse queryConfigResponse, UnmarshallerContext _ctx) {
		
		queryConfigResponse.setRequestId(_ctx.stringValue("QueryConfigResponse.RequestId"));
		queryConfigResponse.setMessage(_ctx.stringValue("QueryConfigResponse.Message"));
		queryConfigResponse.setSuccess(_ctx.booleanValue("QueryConfigResponse.Success"));
		queryConfigResponse.setCode(_ctx.integerValue("QueryConfigResponse.Code"));
		queryConfigResponse.setHttpStatusCode(_ctx.integerValue("QueryConfigResponse.HttpStatusCode"));

		Data data = new Data();
		data.setMaxClientCnxns(_ctx.stringValue("QueryConfigResponse.Data.MaxClientCnxns"));
		data.setConfigAuthSupported(_ctx.booleanValue("QueryConfigResponse.Data.ConfigAuthSupported"));
		data.setInitLimit(_ctx.stringValue("QueryConfigResponse.Data.InitLimit"));
		data.setMCPEnabled(_ctx.booleanValue("QueryConfigResponse.Data.MCPEnabled"));
		data.setOpenSuperAcl(_ctx.booleanValue("QueryConfigResponse.Data.OpenSuperAcl"));
		data.setRestartFlag(_ctx.booleanValue("QueryConfigResponse.Data.RestartFlag"));
		data.setJvmFlagsCustom(_ctx.stringValue("QueryConfigResponse.Data.JvmFlagsCustom"));
		data.setAutopurgePurgeInterval(_ctx.stringValue("QueryConfigResponse.Data.AutopurgePurgeInterval"));
		data.setAutopurgeSnapRetainCount(_ctx.stringValue("QueryConfigResponse.Data.AutopurgeSnapRetainCount"));
		data.setSyncLimit(_ctx.stringValue("QueryConfigResponse.Data.SyncLimit"));
		data.setConfigAuthEnabled(_ctx.booleanValue("QueryConfigResponse.Data.ConfigAuthEnabled"));
		data.setClusterName(_ctx.stringValue("QueryConfigResponse.Data.ClusterName"));
		data.setMCPSupported(_ctx.booleanValue("QueryConfigResponse.Data.MCPSupported"));
		data.setJuteMaxbuffer(_ctx.stringValue("QueryConfigResponse.Data.JuteMaxbuffer"));
		data.setTickTime(_ctx.stringValue("QueryConfigResponse.Data.TickTime"));
		data.setPassWord(_ctx.stringValue("QueryConfigResponse.Data.PassWord"));
		data.setUserName(_ctx.stringValue("QueryConfigResponse.Data.UserName"));
		data.setConfigSecretSupported(_ctx.booleanValue("QueryConfigResponse.Data.ConfigSecretSupported"));
		data.setConfigSecretEnabled(_ctx.booleanValue("QueryConfigResponse.Data.ConfigSecretEnabled"));
		queryConfigResponse.setData(data);
	 
	 	return queryConfigResponse;
	}
}