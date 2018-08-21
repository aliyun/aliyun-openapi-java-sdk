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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeDatabaseListResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeDatabaseListResponse.Database;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatabaseListResponseUnmarshaller {

	public static DescribeDatabaseListResponse unmarshall(DescribeDatabaseListResponse describeDatabaseListResponse, UnmarshallerContext context) {
		
		describeDatabaseListResponse.setRequestId(context.stringValue("DescribeDatabaseListResponse.RequestId"));
		describeDatabaseListResponse.setPageNumber(context.integerValue("DescribeDatabaseListResponse.PageNumber"));
		describeDatabaseListResponse.setPageSize(context.integerValue("DescribeDatabaseListResponse.PageSize"));
		describeDatabaseListResponse.setTotalCount(context.integerValue("DescribeDatabaseListResponse.TotalCount"));

		List<Database> databases = new ArrayList<Database>();
		for (int i = 0; i < context.lengthValue("DescribeDatabaseListResponse.Databases.Length"); i++) {
			Database database = new Database();
			database.setInstanceId(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].InstanceId"));
			database.setInstanceName(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].InstanceName"));
			database.setRegionId(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].RegionId"));
			database.setZoneId(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].ZoneId"));
			database.setInstanceStatus(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].InstanceStatus"));
			database.setDBName(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].DBName"));
			database.setNodeSpec(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].NodeSpec"));
			database.setNodeNumber(context.integerValue("DescribeDatabaseListResponse.Databases["+ i +"].NodeNumber"));
			database.setChargeType(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].ChargeType"));
			database.setCreateTime(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].CreateTime"));
			database.setEndTime(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].EndTime"));
			database.setNetworkType(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].NetworkType"));
			database.setVPCId(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].VPCId"));
			database.setVSwitchId(context.stringValue("DescribeDatabaseListResponse.Databases["+ i +"].VSwitchId"));

			databases.add(database);
		}
		describeDatabaseListResponse.setDatabases(databases);
	 
	 	return describeDatabaseListResponse;
	}
}