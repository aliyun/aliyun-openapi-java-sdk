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

import com.aliyuncs.dds.model.v20151201.DescribeDBInstanceTDEInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceTDEInfoResponseUnmarshaller {

	public static DescribeDBInstanceTDEInfoResponse unmarshall(DescribeDBInstanceTDEInfoResponse describeDBInstanceTDEInfoResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceTDEInfoResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceTDEInfoResponse.RequestId"));
		describeDBInstanceTDEInfoResponse.setTDEStatus(_ctx.stringValue("DescribeDBInstanceTDEInfoResponse.TDEStatus"));
		describeDBInstanceTDEInfoResponse.setRoleARN(_ctx.stringValue("DescribeDBInstanceTDEInfoResponse.RoleARN"));
		describeDBInstanceTDEInfoResponse.setEncryptionKey(_ctx.stringValue("DescribeDBInstanceTDEInfoResponse.EncryptionKey"));
		describeDBInstanceTDEInfoResponse.setEncryptorName(_ctx.stringValue("DescribeDBInstanceTDEInfoResponse.EncryptorName"));
	 
	 	return describeDBInstanceTDEInfoResponse;
	}
}