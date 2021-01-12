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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.ExecuteStatusResponse;
import com.aliyuncs.edas.model.v20170801.ExecuteStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteStatusResponseUnmarshaller {

	public static ExecuteStatusResponse unmarshall(ExecuteStatusResponse executeStatusResponse, UnmarshallerContext _ctx) {
		
		executeStatusResponse.setRequestId(_ctx.stringValue("ExecuteStatusResponse.RequestId"));
		executeStatusResponse.setCode(_ctx.integerValue("ExecuteStatusResponse.Code"));
		executeStatusResponse.setMessage(_ctx.stringValue("ExecuteStatusResponse.Message"));
		executeStatusResponse.setSuccess(_ctx.booleanValue("ExecuteStatusResponse.Success"));

		Data data = new Data();
		data.setId(_ctx.longValue("ExecuteStatusResponse.Data.Id"));
		data.setRegion(_ctx.stringValue("ExecuteStatusResponse.Data.Region"));
		data.setNamespaceId(_ctx.stringValue("ExecuteStatusResponse.Data.NamespaceId"));
		data.setTenantId(_ctx.stringValue("ExecuteStatusResponse.Data.TenantId"));
		data.setSource(_ctx.stringValue("ExecuteStatusResponse.Data.Source"));
		data.setAccountId(_ctx.stringValue("ExecuteStatusResponse.Data.AccountId"));
		data.setAppId(_ctx.stringValue("ExecuteStatusResponse.Data.AppId"));
		data.setIp(_ctx.stringValue("ExecuteStatusResponse.Data.Ip"));
		data.setPodName(_ctx.stringValue("ExecuteStatusResponse.Data.PodName"));
		data.setStatus(_ctx.stringValue("ExecuteStatusResponse.Data.Status"));
		executeStatusResponse.setData(data);
	 
	 	return executeStatusResponse;
	}
}