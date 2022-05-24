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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceSSLResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceSSLResponseUnmarshaller {

	public static DescribeDBInstanceSSLResponse unmarshall(DescribeDBInstanceSSLResponse describeDBInstanceSSLResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceSSLResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceSSLResponse.RequestId"));
		describeDBInstanceSSLResponse.setServerCert(_ctx.stringValue("DescribeDBInstanceSSLResponse.ServerCert"));
		describeDBInstanceSSLResponse.setClientCACertExpireTime(_ctx.stringValue("DescribeDBInstanceSSLResponse.ClientCACertExpireTime"));
		describeDBInstanceSSLResponse.setRequireUpdateItem(_ctx.stringValue("DescribeDBInstanceSSLResponse.RequireUpdateItem"));
		describeDBInstanceSSLResponse.setServerCAUrl(_ctx.stringValue("DescribeDBInstanceSSLResponse.ServerCAUrl"));
		describeDBInstanceSSLResponse.setRequireUpdate(_ctx.stringValue("DescribeDBInstanceSSLResponse.RequireUpdate"));
		describeDBInstanceSSLResponse.setClientCertRevocationList(_ctx.stringValue("DescribeDBInstanceSSLResponse.ClientCertRevocationList"));
		describeDBInstanceSSLResponse.setSSLExpireTime(_ctx.stringValue("DescribeDBInstanceSSLResponse.SSLExpireTime"));
		describeDBInstanceSSLResponse.setCAType(_ctx.stringValue("DescribeDBInstanceSSLResponse.CAType"));
		describeDBInstanceSSLResponse.setSSLCreateTime(_ctx.stringValue("DescribeDBInstanceSSLResponse.SSLCreateTime"));
		describeDBInstanceSSLResponse.setReplicationACL(_ctx.stringValue("DescribeDBInstanceSSLResponse.ReplicationACL"));
		describeDBInstanceSSLResponse.setACL(_ctx.stringValue("DescribeDBInstanceSSLResponse.ACL"));
		describeDBInstanceSSLResponse.setLastModifyStatus(_ctx.stringValue("DescribeDBInstanceSSLResponse.LastModifyStatus"));
		describeDBInstanceSSLResponse.setSSLEnabled(_ctx.stringValue("DescribeDBInstanceSSLResponse.SSLEnabled"));
		describeDBInstanceSSLResponse.setConnectionString(_ctx.stringValue("DescribeDBInstanceSSLResponse.ConnectionString"));
		describeDBInstanceSSLResponse.setRequireUpdateReason(_ctx.stringValue("DescribeDBInstanceSSLResponse.RequireUpdateReason"));
		describeDBInstanceSSLResponse.setClientCACert(_ctx.stringValue("DescribeDBInstanceSSLResponse.ClientCACert"));
		describeDBInstanceSSLResponse.setServerKey(_ctx.stringValue("DescribeDBInstanceSSLResponse.ServerKey"));
		describeDBInstanceSSLResponse.setModifyStatusReason(_ctx.stringValue("DescribeDBInstanceSSLResponse.ModifyStatusReason"));
	 
	 	return describeDBInstanceSSLResponse;
	}
}