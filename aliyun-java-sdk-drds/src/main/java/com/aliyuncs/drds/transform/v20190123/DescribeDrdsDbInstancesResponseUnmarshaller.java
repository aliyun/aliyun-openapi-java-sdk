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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstancesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstancesResponse.DbInstance;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstancesResponse.DbInstance.ReadOnlyInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDbInstancesResponseUnmarshaller {

	public static DescribeDrdsDbInstancesResponse unmarshall(DescribeDrdsDbInstancesResponse describeDrdsDbInstancesResponse, UnmarshallerContext context) {
		
		describeDrdsDbInstancesResponse.setRequestId(context.stringValue("DescribeDrdsDbInstancesResponse.RequestId"));
		describeDrdsDbInstancesResponse.setSuccess(context.booleanValue("DescribeDrdsDbInstancesResponse.Success"));
		describeDrdsDbInstancesResponse.setPageNumber(context.stringValue("DescribeDrdsDbInstancesResponse.PageNumber"));
		describeDrdsDbInstancesResponse.setPageSize(context.stringValue("DescribeDrdsDbInstancesResponse.PageSize"));
		describeDrdsDbInstancesResponse.setTotal(context.stringValue("DescribeDrdsDbInstancesResponse.Total"));

		List<DbInstance> dbInstances = new ArrayList<DbInstance>();
		for (int i = 0; i < context.lengthValue("DescribeDrdsDbInstancesResponse.DbInstances.Length"); i++) {
			DbInstance dbInstance = new DbInstance();
			dbInstance.setDBInstanceId(context.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].DBInstanceId"));
			dbInstance.setConnectUrl(context.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ConnectUrl"));
			dbInstance.setPort(context.integerValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].Port"));
			dbInstance.setDBInstanceStatus(context.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].DBInstanceStatus"));
			dbInstance.setDbInstType(context.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].DbInstType"));
			dbInstance.setReadWeight(context.integerValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadWeight"));
			dbInstance.setNetworkType(context.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].NetworkType"));

			List<ReadOnlyInstance> readOnlyInstances = new ArrayList<ReadOnlyInstance>();
			for (int j = 0; j < context.lengthValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances.Length"); j++) {
				ReadOnlyInstance readOnlyInstance = new ReadOnlyInstance();
				readOnlyInstance.setInstanceName(context.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].InstanceName"));
				readOnlyInstance.setConnectUrl(context.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].ConnectUrl"));
				readOnlyInstance.setPort(context.integerValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].Port"));
				readOnlyInstance.setDBInstanceStatus(context.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].DBInstanceStatus"));
				readOnlyInstance.setDbInstType(context.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].DbInstType"));
				readOnlyInstance.setReadWeight(context.integerValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].ReadWeight"));
				readOnlyInstance.setNetworkType(context.stringValue("DescribeDrdsDbInstancesResponse.DbInstances["+ i +"].ReadOnlyInstances["+ j +"].NetworkType"));

				readOnlyInstances.add(readOnlyInstance);
			}
			dbInstance.setReadOnlyInstances(readOnlyInstances);

			dbInstances.add(dbInstance);
		}
		describeDrdsDbInstancesResponse.setDbInstances(dbInstances);
	 
	 	return describeDrdsDbInstancesResponse;
	}
}