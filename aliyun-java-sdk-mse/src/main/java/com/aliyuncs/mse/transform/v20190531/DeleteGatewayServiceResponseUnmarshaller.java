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

import com.aliyuncs.mse.model.v20190531.DeleteGatewayServiceResponse;
import com.aliyuncs.mse.model.v20190531.DeleteGatewayServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewayServiceResponseUnmarshaller {

	public static DeleteGatewayServiceResponse unmarshall(DeleteGatewayServiceResponse deleteGatewayServiceResponse, UnmarshallerContext _ctx) {
		
		deleteGatewayServiceResponse.setRequestId(_ctx.stringValue("DeleteGatewayServiceResponse.RequestId"));
		deleteGatewayServiceResponse.setHttpStatusCode(_ctx.integerValue("DeleteGatewayServiceResponse.HttpStatusCode"));
		deleteGatewayServiceResponse.setMessage(_ctx.stringValue("DeleteGatewayServiceResponse.Message"));
		deleteGatewayServiceResponse.setCode(_ctx.integerValue("DeleteGatewayServiceResponse.Code"));
		deleteGatewayServiceResponse.setSuccess(_ctx.booleanValue("DeleteGatewayServiceResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("DeleteGatewayServiceResponse.Data.Id"));
		data.setName(_ctx.stringValue("DeleteGatewayServiceResponse.Data.Name"));
		data.setGatewayUniqueId(_ctx.stringValue("DeleteGatewayServiceResponse.Data.GatewayUniqueId"));
		data.setGatewayId(_ctx.longValue("DeleteGatewayServiceResponse.Data.GatewayId"));
		data.setSourceType(_ctx.stringValue("DeleteGatewayServiceResponse.Data.SourceType"));
		data.setNamespace(_ctx.stringValue("DeleteGatewayServiceResponse.Data.Namespace"));
		data.setGroupName(_ctx.stringValue("DeleteGatewayServiceResponse.Data.GroupName"));
		data.setSourceId(_ctx.longValue("DeleteGatewayServiceResponse.Data.SourceId"));
		data.setServiceNameInRegistry(_ctx.stringValue("DeleteGatewayServiceResponse.Data.ServiceNameInRegistry"));
		data.setMetaInfo(_ctx.stringValue("DeleteGatewayServiceResponse.Data.MetaInfo"));
		data.setGmtCreate(_ctx.stringValue("DeleteGatewayServiceResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("DeleteGatewayServiceResponse.Data.GmtModified"));

		List<String> ips = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteGatewayServiceResponse.Data.Ips.Length"); i++) {
			ips.add(_ctx.stringValue("DeleteGatewayServiceResponse.Data.Ips["+ i +"]"));
		}
		data.setIps(ips);
		deleteGatewayServiceResponse.setData(data);
	 
	 	return deleteGatewayServiceResponse;
	}
}