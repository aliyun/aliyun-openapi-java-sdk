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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeRestoreDBInstanceListResponse;
import com.aliyuncs.dds.model.v20151201.DescribeRestoreDBInstanceListResponse.DBInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoreDBInstanceListResponseUnmarshaller {

	public static DescribeRestoreDBInstanceListResponse unmarshall(DescribeRestoreDBInstanceListResponse describeRestoreDBInstanceListResponse, UnmarshallerContext _ctx) {
		
		describeRestoreDBInstanceListResponse.setRequestId(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.RequestId"));
		describeRestoreDBInstanceListResponse.setTotalCount(_ctx.integerValue("DescribeRestoreDBInstanceListResponse.TotalCount"));
		describeRestoreDBInstanceListResponse.setPageSize(_ctx.integerValue("DescribeRestoreDBInstanceListResponse.PageSize"));
		describeRestoreDBInstanceListResponse.setPageNumber(_ctx.integerValue("DescribeRestoreDBInstanceListResponse.PageNumber"));

		List<DBInstance> dBInstances = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoreDBInstanceListResponse.DBInstances.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setIsDeleted(_ctx.integerValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].IsDeleted"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].EngineVersion"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].DBInstanceStatus"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].DBInstanceId"));
			dBInstance.setHiddenZoneId(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].HiddenZoneId"));
			dBInstance.setCreationTime(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].CreationTime"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].DBInstanceType"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].DBInstanceDescription"));
			dBInstance.setSecondaryZoneId(_ctx.stringValue("DescribeRestoreDBInstanceListResponse.DBInstances["+ i +"].SecondaryZoneId"));

			dBInstances.add(dBInstance);
		}
		describeRestoreDBInstanceListResponse.setDBInstances(dBInstances);
	 
	 	return describeRestoreDBInstanceListResponse;
	}
}