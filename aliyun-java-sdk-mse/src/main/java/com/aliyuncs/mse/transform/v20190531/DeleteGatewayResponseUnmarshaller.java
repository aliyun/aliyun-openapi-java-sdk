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

import com.aliyuncs.mse.model.v20190531.DeleteGatewayResponse;
import com.aliyuncs.mse.model.v20190531.DeleteGatewayResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewayResponseUnmarshaller {

	public static DeleteGatewayResponse unmarshall(DeleteGatewayResponse deleteGatewayResponse, UnmarshallerContext _ctx) {
		
		deleteGatewayResponse.setRequestId(_ctx.stringValue("DeleteGatewayResponse.RequestId"));
		deleteGatewayResponse.setHttpStatusCode(_ctx.integerValue("DeleteGatewayResponse.HttpStatusCode"));
		deleteGatewayResponse.setMessage(_ctx.stringValue("DeleteGatewayResponse.Message"));
		deleteGatewayResponse.setCode(_ctx.integerValue("DeleteGatewayResponse.Code"));
		deleteGatewayResponse.setSuccess(_ctx.booleanValue("DeleteGatewayResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteGatewayResponse.Data.Id"));
		data.setName(_ctx.stringValue("DeleteGatewayResponse.Data.Name"));
		data.setGatewayUniqueId(_ctx.stringValue("DeleteGatewayResponse.Data.GatewayUniqueId"));
		data.setRegion(_ctx.stringValue("DeleteGatewayResponse.Data.Region"));
		data.setPrimaryUser(_ctx.stringValue("DeleteGatewayResponse.Data.PrimaryUser"));
		data.setStatus(_ctx.integerValue("DeleteGatewayResponse.Data.Status"));
		data.setVpc(_ctx.stringValue("DeleteGatewayResponse.Data.Vpc"));
		data.setVswitch(_ctx.stringValue("DeleteGatewayResponse.Data.Vswitch"));
		data.setSecurityGroup(_ctx.stringValue("DeleteGatewayResponse.Data.SecurityGroup"));
		data.setSpec(_ctx.stringValue("DeleteGatewayResponse.Data.Spec"));
		data.setReplica(_ctx.integerValue("DeleteGatewayResponse.Data.Replica"));
		data.setGmtCreate(_ctx.stringValue("DeleteGatewayResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("DeleteGatewayResponse.Data.GmtModified"));
		deleteGatewayResponse.setData(data);
	 
	 	return deleteGatewayResponse;
	}
}