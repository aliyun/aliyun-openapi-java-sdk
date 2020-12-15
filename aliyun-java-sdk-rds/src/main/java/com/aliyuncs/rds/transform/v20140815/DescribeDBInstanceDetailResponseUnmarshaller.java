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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceDetailResponseUnmarshaller {

	public static DescribeDBInstanceDetailResponse unmarshall(DescribeDBInstanceDetailResponse describeDBInstanceDetailResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceDetailResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceDetailResponse.RequestId"));
		describeDBInstanceDetailResponse.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceDetailResponse.DBInstanceId"));
		describeDBInstanceDetailResponse.setRegionId(_ctx.stringValue("DescribeDBInstanceDetailResponse.RegionId"));
		describeDBInstanceDetailResponse.setLicenseType(_ctx.stringValue("DescribeDBInstanceDetailResponse.LicenseType"));
		describeDBInstanceDetailResponse.setActivationState(_ctx.stringValue("DescribeDBInstanceDetailResponse.ActivationState"));
	 
	 	return describeDBInstanceDetailResponse;
	}
}