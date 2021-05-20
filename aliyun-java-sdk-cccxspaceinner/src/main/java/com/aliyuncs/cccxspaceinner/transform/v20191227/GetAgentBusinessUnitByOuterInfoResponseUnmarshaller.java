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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import com.aliyuncs.cccxspaceinner.model.v20191227.GetAgentBusinessUnitByOuterInfoResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.GetAgentBusinessUnitByOuterInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentBusinessUnitByOuterInfoResponseUnmarshaller {

	public static GetAgentBusinessUnitByOuterInfoResponse unmarshall(GetAgentBusinessUnitByOuterInfoResponse getAgentBusinessUnitByOuterInfoResponse, UnmarshallerContext _ctx) {
		
		getAgentBusinessUnitByOuterInfoResponse.setMessage(_ctx.stringValue("GetAgentBusinessUnitByOuterInfoResponse.Message"));
		getAgentBusinessUnitByOuterInfoResponse.setCode(_ctx.stringValue("GetAgentBusinessUnitByOuterInfoResponse.Code"));
		getAgentBusinessUnitByOuterInfoResponse.setSuccess(_ctx.booleanValue("GetAgentBusinessUnitByOuterInfoResponse.Success"));

		Data data = new Data();
		data.setBuName(_ctx.stringValue("GetAgentBusinessUnitByOuterInfoResponse.Data.buName"));
		data.setBuId(_ctx.longValue("GetAgentBusinessUnitByOuterInfoResponse.Data.buId"));
		data.setBuKey(_ctx.stringValue("GetAgentBusinessUnitByOuterInfoResponse.Data.buKey"));
		getAgentBusinessUnitByOuterInfoResponse.setData(data);
	 
	 	return getAgentBusinessUnitByOuterInfoResponse;
	}
}