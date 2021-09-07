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

package com.aliyuncs.polardbx.transform.v20200202;

import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceSSLResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceSSLResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceSSLResponseUnmarshaller {

	public static DescribeDBInstanceSSLResponse unmarshall(DescribeDBInstanceSSLResponse describeDBInstanceSSLResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceSSLResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceSSLResponse.RequestId"));

		Data data = new Data();
		data.setSSLEnabled(_ctx.booleanValue("DescribeDBInstanceSSLResponse.Data.SSLEnabled"));
		data.setSSLExpiredTime(_ctx.stringValue("DescribeDBInstanceSSLResponse.Data.SSLExpiredTime"));
		data.setCertCommonName(_ctx.stringValue("DescribeDBInstanceSSLResponse.Data.CertCommonName"));
		describeDBInstanceSSLResponse.setData(data);
	 
	 	return describeDBInstanceSSLResponse;
	}
}