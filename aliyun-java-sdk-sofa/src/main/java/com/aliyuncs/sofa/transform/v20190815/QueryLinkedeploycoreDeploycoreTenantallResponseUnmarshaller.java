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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreTenantallResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreTenantallResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreTenantallResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreTenantallResponse unmarshall(QueryLinkedeploycoreDeploycoreTenantallResponse queryLinkedeploycoreDeploycoreTenantallResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreTenantallResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreTenantallResponse.RequestId"));
		queryLinkedeploycoreDeploycoreTenantallResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreTenantallResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreTenantallResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreTenantallResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreTenantallResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreTenantallResponse.Message"));
		queryLinkedeploycoreDeploycoreTenantallResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreTenantallResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreTenantallResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreTenantallResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreTenantallResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDescription(_ctx.stringValue("QueryLinkedeploycoreDeploycoreTenantallResponse.Data["+ i +"].Description"));
			dataItem.setExtraInfo(_ctx.stringValue("QueryLinkedeploycoreDeploycoreTenantallResponse.Data["+ i +"].ExtraInfo"));
			dataItem.setId(_ctx.longValue("QueryLinkedeploycoreDeploycoreTenantallResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreTenantallResponse.Data["+ i +"].Name"));

			data.add(dataItem);
		}
		queryLinkedeploycoreDeploycoreTenantallResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreTenantallResponse;
	}
}