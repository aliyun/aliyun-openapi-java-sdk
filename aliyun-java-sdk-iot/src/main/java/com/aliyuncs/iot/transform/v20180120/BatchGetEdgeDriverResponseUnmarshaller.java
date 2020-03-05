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

import com.aliyuncs.iot.model.v20180120.BatchGetEdgeDriverResponse;
import com.aliyuncs.iot.model.v20180120.BatchGetEdgeDriverResponse.Driver;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetEdgeDriverResponseUnmarshaller {

	public static BatchGetEdgeDriverResponse unmarshall(BatchGetEdgeDriverResponse batchGetEdgeDriverResponse, UnmarshallerContext _ctx) {
		
		batchGetEdgeDriverResponse.setRequestId(_ctx.stringValue("BatchGetEdgeDriverResponse.RequestId"));
		batchGetEdgeDriverResponse.setSuccess(_ctx.booleanValue("BatchGetEdgeDriverResponse.Success"));
		batchGetEdgeDriverResponse.setCode(_ctx.stringValue("BatchGetEdgeDriverResponse.Code"));
		batchGetEdgeDriverResponse.setErrorMessage(_ctx.stringValue("BatchGetEdgeDriverResponse.ErrorMessage"));

		List<Driver> driverList = new ArrayList<Driver>();
		for (int i = 0; i < _ctx.lengthValue("BatchGetEdgeDriverResponse.DriverList.Length"); i++) {
			Driver driver = new Driver();
			driver.setDriverId(_ctx.stringValue("BatchGetEdgeDriverResponse.DriverList["+ i +"].DriverId"));
			driver.setDriverName(_ctx.stringValue("BatchGetEdgeDriverResponse.DriverList["+ i +"].DriverName"));
			driver.setDriverProtocol(_ctx.stringValue("BatchGetEdgeDriverResponse.DriverList["+ i +"].DriverProtocol"));
			driver.setRuntime(_ctx.stringValue("BatchGetEdgeDriverResponse.DriverList["+ i +"].Runtime"));
			driver.setCpuArch(_ctx.stringValue("BatchGetEdgeDriverResponse.DriverList["+ i +"].CpuArch"));
			driver.setType(_ctx.integerValue("BatchGetEdgeDriverResponse.DriverList["+ i +"].Type"));
			driver.setIsBuiltIn(_ctx.booleanValue("BatchGetEdgeDriverResponse.DriverList["+ i +"].IsBuiltIn"));
			driver.setGmtCreateTimestamp(_ctx.longValue("BatchGetEdgeDriverResponse.DriverList["+ i +"].GmtCreateTimestamp"));
			driver.setGmtModifiedTimestamp(_ctx.longValue("BatchGetEdgeDriverResponse.DriverList["+ i +"].GmtModifiedTimestamp"));

			driverList.add(driver);
		}
		batchGetEdgeDriverResponse.setDriverList(driverList);
	 
	 	return batchGetEdgeDriverResponse;
	}
}