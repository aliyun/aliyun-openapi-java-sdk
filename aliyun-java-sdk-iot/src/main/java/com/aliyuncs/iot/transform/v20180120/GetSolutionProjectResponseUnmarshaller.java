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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.GetSolutionProjectResponse;
import com.aliyuncs.iot.model.v20180120.GetSolutionProjectResponse.Data;
import com.aliyuncs.iot.model.v20180120.GetSolutionProjectResponse.Data.ExtMap;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSolutionProjectResponseUnmarshaller {

	public static GetSolutionProjectResponse unmarshall(GetSolutionProjectResponse getSolutionProjectResponse, UnmarshallerContext _ctx) {
		
		getSolutionProjectResponse.setRequestId(_ctx.stringValue("GetSolutionProjectResponse.RequestId"));
		getSolutionProjectResponse.setSuccess(_ctx.booleanValue("GetSolutionProjectResponse.Success"));
		getSolutionProjectResponse.setCode(_ctx.stringValue("GetSolutionProjectResponse.Code"));
		getSolutionProjectResponse.setErrorMessage(_ctx.stringValue("GetSolutionProjectResponse.ErrorMessage"));

		Data data = new Data();
		data.setGmtCreate(_ctx.longValue("GetSolutionProjectResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("GetSolutionProjectResponse.Data.GmtModified"));
		data.setCode(_ctx.stringValue("GetSolutionProjectResponse.Data.Code"));
		data.setType(_ctx.stringValue("GetSolutionProjectResponse.Data.Type"));
		data.setTenantId(_ctx.stringValue("GetSolutionProjectResponse.Data.TenantId"));
		data.setName(_ctx.stringValue("GetSolutionProjectResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetSolutionProjectResponse.Data.Description"));
		data.setStatus(_ctx.stringValue("GetSolutionProjectResponse.Data.Status"));

		ExtMap extMap = new ExtMap();
		extMap.setProductKey(_ctx.stringValue("GetSolutionProjectResponse.Data.ExtMap.ProductKey"));
		extMap.setDeviceNumLimit(_ctx.longValue("GetSolutionProjectResponse.Data.ExtMap.DeviceNumLimit"));
		data.setExtMap(extMap);
		getSolutionProjectResponse.setData(data);
	 
	 	return getSolutionProjectResponse;
	}
}