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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DescribeAiotVehicleTablesResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotVehicleTablesResponse.VehicleTableRespType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAiotVehicleTablesResponseUnmarshaller {

	public static DescribeAiotVehicleTablesResponse unmarshall(DescribeAiotVehicleTablesResponse describeAiotVehicleTablesResponse, UnmarshallerContext _ctx) {
		
		describeAiotVehicleTablesResponse.setRequestId(_ctx.stringValue("DescribeAiotVehicleTablesResponse.RequestId"));
		describeAiotVehicleTablesResponse.setCode(_ctx.stringValue("DescribeAiotVehicleTablesResponse.Code"));
		describeAiotVehicleTablesResponse.setMessage(_ctx.stringValue("DescribeAiotVehicleTablesResponse.Message"));

		List<VehicleTableRespType> vehicleTableList = new ArrayList<VehicleTableRespType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAiotVehicleTablesResponse.VehicleTableList.Length"); i++) {
			VehicleTableRespType vehicleTableRespType = new VehicleTableRespType();
			vehicleTableRespType.setVehicleTableId(_ctx.stringValue("DescribeAiotVehicleTablesResponse.VehicleTableList["+ i +"].VehicleTableId"));
			vehicleTableRespType.setVehicleTableName(_ctx.stringValue("DescribeAiotVehicleTablesResponse.VehicleTableList["+ i +"].VehicleTableName"));

			vehicleTableList.add(vehicleTableRespType);
		}
		describeAiotVehicleTablesResponse.setVehicleTableList(vehicleTableList);
	 
	 	return describeAiotVehicleTablesResponse;
	}
}