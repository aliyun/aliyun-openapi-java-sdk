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

import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceSecurityipResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceSecurityipResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasLoadbalanceSecurityipResponseUnmarshaller {

	public static QueryCasLoadbalanceSecurityipResponse unmarshall(QueryCasLoadbalanceSecurityipResponse queryCasLoadbalanceSecurityipResponse, UnmarshallerContext _ctx) {
		
		queryCasLoadbalanceSecurityipResponse.setRequestId(_ctx.stringValue("QueryCasLoadbalanceSecurityipResponse.RequestId"));
		queryCasLoadbalanceSecurityipResponse.setResultCode(_ctx.stringValue("QueryCasLoadbalanceSecurityipResponse.ResultCode"));
		queryCasLoadbalanceSecurityipResponse.setResultMessage(_ctx.stringValue("QueryCasLoadbalanceSecurityipResponse.ResultMessage"));

		Data data = new Data();
		data.setAccessControl(_ctx.booleanValue("QueryCasLoadbalanceSecurityipResponse.Data.AccessControl"));

		List<String> ips = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasLoadbalanceSecurityipResponse.Data.Ips.Length"); i++) {
			ips.add(_ctx.stringValue("QueryCasLoadbalanceSecurityipResponse.Data.Ips["+ i +"]"));
		}
		data.setIps(ips);
		queryCasLoadbalanceSecurityipResponse.setData(data);
	 
	 	return queryCasLoadbalanceSecurityipResponse;
	}
}