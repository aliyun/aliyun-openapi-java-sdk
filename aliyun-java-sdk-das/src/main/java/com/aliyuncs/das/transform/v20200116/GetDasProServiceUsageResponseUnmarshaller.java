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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetDasProServiceUsageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDasProServiceUsageResponseUnmarshaller {

	public static GetDasProServiceUsageResponse unmarshall(GetDasProServiceUsageResponse getDasProServiceUsageResponse, UnmarshallerContext _ctx) {
		
		getDasProServiceUsageResponse.setRequestId(_ctx.stringValue("GetDasProServiceUsageResponse.RequestId"));
		getDasProServiceUsageResponse.setMessage(_ctx.stringValue("GetDasProServiceUsageResponse.Message"));
		getDasProServiceUsageResponse.setData(_ctx.stringValue("GetDasProServiceUsageResponse.Data"));
		getDasProServiceUsageResponse.setCode(_ctx.stringValue("GetDasProServiceUsageResponse.Code"));
		getDasProServiceUsageResponse.setSuccess(_ctx.stringValue("GetDasProServiceUsageResponse.Success"));
	 
	 	return getDasProServiceUsageResponse;
	}
}