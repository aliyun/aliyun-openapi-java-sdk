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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.QueryContentInfoResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryContentInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryContentInfoResponseUnmarshaller {

	public static QueryContentInfoResponse unmarshall(QueryContentInfoResponse queryContentInfoResponse, UnmarshallerContext _ctx) {
		
		queryContentInfoResponse.setRequestId(_ctx.stringValue("QueryContentInfoResponse.RequestId"));
		queryContentInfoResponse.setCode(_ctx.integerValue("QueryContentInfoResponse.Code"));
		queryContentInfoResponse.setSuccess(_ctx.booleanValue("QueryContentInfoResponse.Success"));
		queryContentInfoResponse.setErrorMessage(_ctx.stringValue("QueryContentInfoResponse.ErrorMessage"));

		Data data = new Data();
		data.setId(_ctx.longValue("QueryContentInfoResponse.Data.Id"));
		data.setName(_ctx.stringValue("QueryContentInfoResponse.Data.Name"));
		data.setBrandUserId(_ctx.longValue("QueryContentInfoResponse.Data.BrandUserId"));
		data.setProxyUserId(_ctx.longValue("QueryContentInfoResponse.Data.ProxyUserId"));
		data.setStatus(_ctx.integerValue("QueryContentInfoResponse.Data.Status"));
		data.setTemplateType(_ctx.stringValue("QueryContentInfoResponse.Data.TemplateType"));
		data.setChainValue(_ctx.stringValue("QueryContentInfoResponse.Data.ChainValue"));
		data.setOpenScene(_ctx.integerValue("QueryContentInfoResponse.Data.OpenScene"));
		queryContentInfoResponse.setData(data);
	 
	 	return queryContentInfoResponse;
	}
}