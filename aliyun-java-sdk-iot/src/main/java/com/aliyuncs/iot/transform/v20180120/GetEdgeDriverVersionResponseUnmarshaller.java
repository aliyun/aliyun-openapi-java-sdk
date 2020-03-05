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

import com.aliyuncs.iot.model.v20180120.GetEdgeDriverVersionResponse;
import com.aliyuncs.iot.model.v20180120.GetEdgeDriverVersionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEdgeDriverVersionResponseUnmarshaller {

	public static GetEdgeDriverVersionResponse unmarshall(GetEdgeDriverVersionResponse getEdgeDriverVersionResponse, UnmarshallerContext _ctx) {
		
		getEdgeDriverVersionResponse.setRequestId(_ctx.stringValue("GetEdgeDriverVersionResponse.RequestId"));
		getEdgeDriverVersionResponse.setSuccess(_ctx.booleanValue("GetEdgeDriverVersionResponse.Success"));
		getEdgeDriverVersionResponse.setCode(_ctx.stringValue("GetEdgeDriverVersionResponse.Code"));
		getEdgeDriverVersionResponse.setErrorMessage(_ctx.stringValue("GetEdgeDriverVersionResponse.ErrorMessage"));

		Data data = new Data();
		data.setDriverId(_ctx.stringValue("GetEdgeDriverVersionResponse.Data.DriverId"));
		data.setDriverVersion(_ctx.stringValue("GetEdgeDriverVersionResponse.Data.DriverVersion"));
		data.setVersionState(_ctx.stringValue("GetEdgeDriverVersionResponse.Data.VersionState"));
		data.setEdgeVersion(_ctx.stringValue("GetEdgeDriverVersionResponse.Data.EdgeVersion"));
		data.setDescription(_ctx.stringValue("GetEdgeDriverVersionResponse.Data.Description"));
		data.setSourceConfig(_ctx.stringValue("GetEdgeDriverVersionResponse.Data.SourceConfig"));
		data.setDriverConfig(_ctx.stringValue("GetEdgeDriverVersionResponse.Data.DriverConfig"));
		data.setContainerConfig(_ctx.stringValue("GetEdgeDriverVersionResponse.Data.ContainerConfig"));
		data.setConfigCheckRule(_ctx.stringValue("GetEdgeDriverVersionResponse.Data.ConfigCheckRule"));
		data.setGmtCreateTimestamp(_ctx.longValue("GetEdgeDriverVersionResponse.Data.GmtCreateTimestamp"));
		data.setGmtModifiedTimestamp(_ctx.longValue("GetEdgeDriverVersionResponse.Data.GmtModifiedTimestamp"));
		getEdgeDriverVersionResponse.setData(data);
	 
	 	return getEdgeDriverVersionResponse;
	}
}