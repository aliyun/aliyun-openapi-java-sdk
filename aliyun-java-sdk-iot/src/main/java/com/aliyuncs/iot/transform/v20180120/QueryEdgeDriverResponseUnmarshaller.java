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

import com.aliyuncs.iot.model.v20180120.QueryEdgeDriverResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeDriverResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryEdgeDriverResponse.Data.Driver;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeDriverResponseUnmarshaller {

	public static QueryEdgeDriverResponse unmarshall(QueryEdgeDriverResponse queryEdgeDriverResponse, UnmarshallerContext _ctx) {
		
		queryEdgeDriverResponse.setRequestId(_ctx.stringValue("QueryEdgeDriverResponse.RequestId"));
		queryEdgeDriverResponse.setSuccess(_ctx.booleanValue("QueryEdgeDriverResponse.Success"));
		queryEdgeDriverResponse.setCode(_ctx.stringValue("QueryEdgeDriverResponse.Code"));
		queryEdgeDriverResponse.setErrorMessage(_ctx.stringValue("QueryEdgeDriverResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryEdgeDriverResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryEdgeDriverResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryEdgeDriverResponse.Data.CurrentPage"));

		List<Driver> driverList = new ArrayList<Driver>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeDriverResponse.Data.DriverList.Length"); i++) {
			Driver driver = new Driver();
			driver.setDriverId(_ctx.stringValue("QueryEdgeDriverResponse.Data.DriverList["+ i +"].DriverId"));
			driver.setDriverName(_ctx.stringValue("QueryEdgeDriverResponse.Data.DriverList["+ i +"].DriverName"));
			driver.setDriverProtocol(_ctx.stringValue("QueryEdgeDriverResponse.Data.DriverList["+ i +"].DriverProtocol"));
			driver.setRuntime(_ctx.stringValue("QueryEdgeDriverResponse.Data.DriverList["+ i +"].Runtime"));
			driver.setCpuArch(_ctx.stringValue("QueryEdgeDriverResponse.Data.DriverList["+ i +"].CpuArch"));
			driver.setType(_ctx.integerValue("QueryEdgeDriverResponse.Data.DriverList["+ i +"].Type"));
			driver.setIsBuiltIn(_ctx.booleanValue("QueryEdgeDriverResponse.Data.DriverList["+ i +"].IsBuiltIn"));
			driver.setGmtCreateTimestamp(_ctx.longValue("QueryEdgeDriverResponse.Data.DriverList["+ i +"].GmtCreateTimestamp"));
			driver.setGmtModifiedTimestamp(_ctx.longValue("QueryEdgeDriverResponse.Data.DriverList["+ i +"].GmtModifiedTimestamp"));

			driverList.add(driver);
		}
		data.setDriverList(driverList);
		queryEdgeDriverResponse.setData(data);
	 
	 	return queryEdgeDriverResponse;
	}
}