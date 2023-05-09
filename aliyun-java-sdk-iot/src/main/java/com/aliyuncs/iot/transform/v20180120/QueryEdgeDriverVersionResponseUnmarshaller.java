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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryEdgeDriverVersionResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeDriverVersionResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryEdgeDriverVersionResponse.Data.DriverVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeDriverVersionResponseUnmarshaller {

	public static QueryEdgeDriverVersionResponse unmarshall(QueryEdgeDriverVersionResponse queryEdgeDriverVersionResponse, UnmarshallerContext _ctx) {
		
		queryEdgeDriverVersionResponse.setRequestId(_ctx.stringValue("QueryEdgeDriverVersionResponse.RequestId"));
		queryEdgeDriverVersionResponse.setCode(_ctx.stringValue("QueryEdgeDriverVersionResponse.Code"));
		queryEdgeDriverVersionResponse.setErrorMessage(_ctx.stringValue("QueryEdgeDriverVersionResponse.ErrorMessage"));
		queryEdgeDriverVersionResponse.setSuccess(_ctx.booleanValue("QueryEdgeDriverVersionResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("QueryEdgeDriverVersionResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryEdgeDriverVersionResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("QueryEdgeDriverVersionResponse.Data.Total"));

		List<DriverVersion> driverVersionList = new ArrayList<DriverVersion>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList.Length"); i++) {
			DriverVersion driverVersion = new DriverVersion();
			driverVersion.setGmtCreateTimestamp(_ctx.longValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].GmtCreateTimestamp"));
			driverVersion.setConfigCheckRule(_ctx.stringValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].ConfigCheckRule"));
			driverVersion.setDriverId(_ctx.stringValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].DriverId"));
			driverVersion.setEdgeVersion(_ctx.stringValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].EdgeVersion"));
			driverVersion.setGmtModifiedTimestamp(_ctx.longValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].GmtModifiedTimestamp"));
			driverVersion.setVersionState(_ctx.stringValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].VersionState"));
			driverVersion.setContainerConfig(_ctx.stringValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].ContainerConfig"));
			driverVersion.setDescription(_ctx.stringValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].Description"));
			driverVersion.setDriverConfig(_ctx.stringValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].DriverConfig"));
			driverVersion.setDriverVersion(_ctx.stringValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].DriverVersion"));
			driverVersion.setArgument(_ctx.stringValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].Argument"));
			driverVersion.setSourceConfig(_ctx.stringValue("QueryEdgeDriverVersionResponse.Data.DriverVersionList["+ i +"].SourceConfig"));

			driverVersionList.add(driverVersion);
		}
		data.setDriverVersionList(driverVersionList);
		queryEdgeDriverVersionResponse.setData(data);
	 
	 	return queryEdgeDriverVersionResponse;
	}
}