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

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstanceResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstanceResponse.DbInstance;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDbInstanceResponseUnmarshaller {

	public static DescribeDrdsDbInstanceResponse unmarshall(DescribeDrdsDbInstanceResponse describeDrdsDbInstanceResponse, UnmarshallerContext context) {
		
		describeDrdsDbInstanceResponse.setRequestId(context.stringValue("DescribeDrdsDbInstanceResponse.RequestId"));
		describeDrdsDbInstanceResponse.setSuccess(context.booleanValue("DescribeDrdsDbInstanceResponse.Success"));

		DbInstance dbInstance = new DbInstance();
		dbInstance.setDBInstanceId(context.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.DBInstanceId"));
		dbInstance.setConnectUrl(context.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ConnectUrl"));
		dbInstance.setPort(context.integerValue("DescribeDrdsDbInstanceResponse.DbInstance.Port"));
		dbInstance.setDBInstanceStatus(context.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.DBInstanceStatus"));
		dbInstance.setDbInstType(context.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.DbInstType"));
		dbInstance.setReadWeight(context.integerValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadWeight"));

		List<ReadOnlyInstance> readOnlyInstances = new ArrayList<ReadOnlyInstance>();
		for (int i = 0; i < context.lengthValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances.Length"); i++) {
			ReadOnlyInstance readOnlyInstance = new ReadOnlyInstance();
			readOnlyInstance.setDBInstanceId(context.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].DBInstanceId"));
			readOnlyInstance.setConnectUrl(context.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].ConnectUrl"));
			readOnlyInstance.setPort(context.integerValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].Port"));
			readOnlyInstance.setDBInstanceStatus(context.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].DBInstanceStatus"));
			readOnlyInstance.setDbInstType(context.stringValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].DbInstType"));
			readOnlyInstance.setReadWeight(context.integerValue("DescribeDrdsDbInstanceResponse.DbInstance.ReadOnlyInstances["+ i +"].ReadWeight"));

			readOnlyInstances.add(readOnlyInstance);
		}
		dbInstance.setReadOnlyInstances(readOnlyInstances);
		describeDrdsDbInstanceResponse.setDbInstance(dbInstance);
	 
	 	return describeDrdsDbInstanceResponse;
	}
}