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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.DescribeDatabaseInstancesResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeDatabaseInstancesResponse.DatabaseInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabaseInstancesResponseUnmarshaller {

	public static DescribeDatabaseInstancesResponse unmarshall(DescribeDatabaseInstancesResponse describeDatabaseInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDatabaseInstancesResponse.setRequestId(_ctx.stringValue("DescribeDatabaseInstancesResponse.RequestId"));
		describeDatabaseInstancesResponse.setPageSize(_ctx.integerValue("DescribeDatabaseInstancesResponse.PageSize"));
		describeDatabaseInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDatabaseInstancesResponse.PageNumber"));
		describeDatabaseInstancesResponse.setTotalCount(_ctx.integerValue("DescribeDatabaseInstancesResponse.TotalCount"));

		List<DatabaseInstance> databaseInstances = new ArrayList<DatabaseInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatabaseInstancesResponse.DatabaseInstances.Length"); i++) {
			DatabaseInstance databaseInstance = new DatabaseInstance();
			databaseInstance.setRegionId(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].RegionId"));
			databaseInstance.setDatabaseInstanceId(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].DatabaseInstanceId"));
			databaseInstance.setDatabaseInstanceName(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].DatabaseInstanceName"));
			databaseInstance.setDatabaseInstanceEdition(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].DatabaseInstanceEdition"));
			databaseInstance.setDatabaseVersion(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].DatabaseVersion"));
			databaseInstance.setCpu(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].Cpu"));
			databaseInstance.setMemory(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].Memory"));
			databaseInstance.setStorage(_ctx.integerValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].Storage"));
			databaseInstance.setPrivateConnection(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].PrivateConnection"));
			databaseInstance.setPublicConnection(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].PublicConnection"));
			databaseInstance.setDatabaseInstanceStatus(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].DatabaseInstanceStatus"));
			databaseInstance.setBusinessStatus(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].BusinessStatus"));
			databaseInstance.setCreationTime(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].CreationTime"));
			databaseInstance.setExpiredTime(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].ExpiredTime"));
			databaseInstance.setChargeType(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].ChargeType"));
			databaseInstance.setSuperAccountName(_ctx.stringValue("DescribeDatabaseInstancesResponse.DatabaseInstances["+ i +"].SuperAccountName"));

			databaseInstances.add(databaseInstance);
		}
		describeDatabaseInstancesResponse.setDatabaseInstances(databaseInstances);
	 
	 	return describeDatabaseInstancesResponse;
	}
}