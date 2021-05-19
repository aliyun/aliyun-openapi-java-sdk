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

import com.aliyuncs.cccxspaceinner.model.v20191227.GetAgentBusinessUnitByBuIdResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.GetAgentBusinessUnitByBuIdResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentBusinessUnitByBuIdResponseUnmarshaller {

	public static GetAgentBusinessUnitByBuIdResponse unmarshall(GetAgentBusinessUnitByBuIdResponse getAgentBusinessUnitByBuIdResponse, UnmarshallerContext _ctx) {
		
		getAgentBusinessUnitByBuIdResponse.setMessage(_ctx.stringValue("GetAgentBusinessUnitByBuIdResponse.Message"));
		getAgentBusinessUnitByBuIdResponse.setCode(_ctx.stringValue("GetAgentBusinessUnitByBuIdResponse.Code"));
		getAgentBusinessUnitByBuIdResponse.setSuccess(_ctx.booleanValue("GetAgentBusinessUnitByBuIdResponse.Success"));

		Data data = new Data();
		data.setBuId(_ctx.longValue("GetAgentBusinessUnitByBuIdResponse.Data.BuId"));
		data.setBuKey(_ctx.stringValue("GetAgentBusinessUnitByBuIdResponse.Data.BuKey"));
		data.setExtra(_ctx.mapValue("GetAgentBusinessUnitByBuIdResponse.Data.Extra"));
		getAgentBusinessUnitByBuIdResponse.setData(data);
	 
	 	return getAgentBusinessUnitByBuIdResponse;
	}
}