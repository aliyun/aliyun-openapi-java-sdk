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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceSSLResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceSSLResponseUnmarshaller {

	public static DescribeDBInstanceSSLResponse unmarshall(DescribeDBInstanceSSLResponse describeDBInstanceSSLResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceSSLResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceSSLResponse.RequestId"));
		describeDBInstanceSSLResponse.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceSSLResponse.DBInstanceId"));
		describeDBInstanceSSLResponse.setDBInstanceName(_ctx.stringValue("DescribeDBInstanceSSLResponse.DBInstanceName"));
		describeDBInstanceSSLResponse.setCertCommonName(_ctx.stringValue("DescribeDBInstanceSSLResponse.CertCommonName"));
		describeDBInstanceSSLResponse.setSSLExpiredTime(_ctx.stringValue("DescribeDBInstanceSSLResponse.SSLExpiredTime"));
		describeDBInstanceSSLResponse.setSSLEnabled(_ctx.booleanValue("DescribeDBInstanceSSLResponse.SSLEnabled"));
	 
	 	return describeDBInstanceSSLResponse;
	}
}