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

import com.aliyuncs.sofa.model.v20190815.QueryODPEnvironmentResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPEnvironmentResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPEnvironmentResponseUnmarshaller {

	public static QueryODPEnvironmentResponse unmarshall(QueryODPEnvironmentResponse queryODPEnvironmentResponse, UnmarshallerContext _ctx) {
		
		queryODPEnvironmentResponse.setRequestId(_ctx.stringValue("QueryODPEnvironmentResponse.RequestId"));
		queryODPEnvironmentResponse.setResultCode(_ctx.stringValue("QueryODPEnvironmentResponse.ResultCode"));
		queryODPEnvironmentResponse.setResultMessage(_ctx.stringValue("QueryODPEnvironmentResponse.ResultMessage"));

		Data data = new Data();
		data.setAdvancedUser(_ctx.booleanValue("QueryODPEnvironmentResponse.Data.AdvancedUser"));
		data.setAutoCreateSchema(_ctx.booleanValue("QueryODPEnvironmentResponse.Data.AutoCreateSchema"));
		data.setDepolyMode(_ctx.stringValue("QueryODPEnvironmentResponse.Data.DepolyMode"));
		data.setNetMode(_ctx.stringValue("QueryODPEnvironmentResponse.Data.NetMode"));
		queryODPEnvironmentResponse.setData(data);
	 
	 	return queryODPEnvironmentResponse;
	}
}