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

import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceDriverResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceDriverResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceDriverResponse.Data.Driver;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeInstanceDriverResponseUnmarshaller {

	public static QueryEdgeInstanceDriverResponse unmarshall(QueryEdgeInstanceDriverResponse queryEdgeInstanceDriverResponse, UnmarshallerContext _ctx) {
		
		queryEdgeInstanceDriverResponse.setRequestId(_ctx.stringValue("QueryEdgeInstanceDriverResponse.RequestId"));
		queryEdgeInstanceDriverResponse.setSuccess(_ctx.booleanValue("QueryEdgeInstanceDriverResponse.Success"));
		queryEdgeInstanceDriverResponse.setCode(_ctx.stringValue("QueryEdgeInstanceDriverResponse.Code"));
		queryEdgeInstanceDriverResponse.setErrorMessage(_ctx.stringValue("QueryEdgeInstanceDriverResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryEdgeInstanceDriverResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryEdgeInstanceDriverResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryEdgeInstanceDriverResponse.Data.CurrentPage"));

		List<Driver> driverList = new ArrayList<Driver>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeInstanceDriverResponse.Data.DriverList.Length"); i++) {
			Driver driver = new Driver();
			driver.setDriverId(_ctx.stringValue("QueryEdgeInstanceDriverResponse.Data.DriverList["+ i +"].DriverId"));
			driver.setDriverVersion(_ctx.stringValue("QueryEdgeInstanceDriverResponse.Data.DriverList["+ i +"].DriverVersion"));
			driver.setOrderId(_ctx.stringValue("QueryEdgeInstanceDriverResponse.Data.DriverList["+ i +"].OrderId"));
			driver.setGmtCreate(_ctx.stringValue("QueryEdgeInstanceDriverResponse.Data.DriverList["+ i +"].GmtCreate"));
			driver.setGmtModified(_ctx.stringValue("QueryEdgeInstanceDriverResponse.Data.DriverList["+ i +"].GmtModified"));

			driverList.add(driver);
		}
		data.setDriverList(driverList);
		queryEdgeInstanceDriverResponse.setData(data);
	 
	 	return queryEdgeInstanceDriverResponse;
	}
}