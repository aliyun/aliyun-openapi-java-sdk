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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeAvailableClassesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeAvailableClassesResponse.DBInstanceClass;
import com.aliyuncs.rds.model.v20140815.DescribeAvailableClassesResponse.DBInstanceClass.DBInstanceStorageRange;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableClassesResponseUnmarshaller {

	public static DescribeAvailableClassesResponse unmarshall(DescribeAvailableClassesResponse describeAvailableClassesResponse, UnmarshallerContext _ctx) {
		
		describeAvailableClassesResponse.setRequestId(_ctx.stringValue("DescribeAvailableClassesResponse.RequestId"));

		List<DBInstanceClass> dBInstanceClasses = new ArrayList<DBInstanceClass>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableClassesResponse.DBInstanceClasses.Length"); i++) {
			DBInstanceClass dBInstanceClass = new DBInstanceClass();
			dBInstanceClass.setDBInstanceClass(_ctx.stringValue("DescribeAvailableClassesResponse.DBInstanceClasses["+ i +"].DBInstanceClass"));
			dBInstanceClass.setStorageRange(_ctx.stringValue("DescribeAvailableClassesResponse.DBInstanceClasses["+ i +"].StorageRange"));

			DBInstanceStorageRange dBInstanceStorageRange = new DBInstanceStorageRange();
			dBInstanceStorageRange.setMaxValue(_ctx.integerValue("DescribeAvailableClassesResponse.DBInstanceClasses["+ i +"].DBInstanceStorageRange.MaxValue"));
			dBInstanceStorageRange.setMinValue(_ctx.integerValue("DescribeAvailableClassesResponse.DBInstanceClasses["+ i +"].DBInstanceStorageRange.MinValue"));
			dBInstanceStorageRange.setStep(_ctx.integerValue("DescribeAvailableClassesResponse.DBInstanceClasses["+ i +"].DBInstanceStorageRange.Step"));
			dBInstanceClass.setDBInstanceStorageRange(dBInstanceStorageRange);

			dBInstanceClasses.add(dBInstanceClass);
		}
		describeAvailableClassesResponse.setDBInstanceClasses(dBInstanceClasses);
	 
	 	return describeAvailableClassesResponse;
	}
}