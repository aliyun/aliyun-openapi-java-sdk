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

import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data.Services;
import com.aliyuncs.mse.model.v20190531.ListGatewayServiceResponse.Data.Services.VersionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayServiceResponseUnmarshaller {

	public static ListGatewayServiceResponse unmarshall(ListGatewayServiceResponse listGatewayServiceResponse, UnmarshallerContext _ctx) {
		
		listGatewayServiceResponse.setRequestId(_ctx.stringValue("ListGatewayServiceResponse.RequestId"));
		listGatewayServiceResponse.setHttpStatusCode(_ctx.integerValue("ListGatewayServiceResponse.HttpStatusCode"));
		listGatewayServiceResponse.setMessage(_ctx.stringValue("ListGatewayServiceResponse.Message"));
		listGatewayServiceResponse.setCode(_ctx.integerValue("ListGatewayServiceResponse.Code"));
		listGatewayServiceResponse.setSuccess(_ctx.booleanValue("ListGatewayServiceResponse.Success"));

		Data data = new Data();
		data.setTotalSize(_ctx.longValue("ListGatewayServiceResponse.Data.TotalSize"));
		data.setPageNumber(_ctx.integerValue("ListGatewayServiceResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListGatewayServiceResponse.Data.PageSize"));

		List<Services> result = new ArrayList<Services>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayServiceResponse.Data.Result.Length"); i++) {
			Services services = new Services();
			services.setId(_ctx.longValue("ListGatewayServiceResponse.Data.Result["+ i +"].Id"));
			services.setName(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].Name"));
			services.setGatewayUniqueId(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayUniqueId"));
			services.setGatewayId(_ctx.longValue("ListGatewayServiceResponse.Data.Result["+ i +"].GatewayId"));
			services.setSourceType(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].SourceType"));
			services.setNamespace(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].Namespace"));
			services.setGroupName(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GroupName"));
			services.setSourceId(_ctx.longValue("ListGatewayServiceResponse.Data.Result["+ i +"].SourceId"));
			services.setServiceNameInRegistry(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].ServiceNameInRegistry"));
			services.setMetaInfo(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].MetaInfo"));
			services.setGmtCreate(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GmtCreate"));
			services.setGmtModified(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].GmtModified"));
			services.setServiceProtocol(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].ServiceProtocol"));
			services.setServicePort(_ctx.longValue("ListGatewayServiceResponse.Data.Result["+ i +"].ServicePort"));
			services.setHealehStatus(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].HealehStatus"));

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayServiceResponse.Data.Result["+ i +"].Ips.Length"); j++) {
				ips.add(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].Ips["+ j +"]"));
			}
			services.setIps(ips);

			List<VersionsItem> versions = new ArrayList<VersionsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListGatewayServiceResponse.Data.Result["+ i +"].Versions.Length"); j++) {
				VersionsItem versionsItem = new VersionsItem();
				versionsItem.setName(_ctx.stringValue("ListGatewayServiceResponse.Data.Result["+ i +"].Versions["+ j +"].Name"));

				versions.add(versionsItem);
			}
			services.setVersions(versions);

			result.add(services);
		}
		data.setResult(result);
		listGatewayServiceResponse.setData(data);
	 
	 	return listGatewayServiceResponse;
	}
}