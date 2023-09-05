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

package com.aliyuncs.r_kvstore.transform.v20150101;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeBackupPolicyResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeBackupPolicyResponse.AccessDeniedDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPolicyResponseUnmarshaller {

	public static DescribeBackupPolicyResponse unmarshall(DescribeBackupPolicyResponse describeBackupPolicyResponse, UnmarshallerContext _ctx) {
		
		describeBackupPolicyResponse.setRequestId(_ctx.stringValue("DescribeBackupPolicyResponse.RequestId"));
		describeBackupPolicyResponse.setBackupRetentionPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.BackupRetentionPeriod"));
		describeBackupPolicyResponse.setPreferredBackupPeriod(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupPeriod"));
		describeBackupPolicyResponse.setPreferredNextBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredNextBackupTime"));
		describeBackupPolicyResponse.setPreferredBackupTime(_ctx.stringValue("DescribeBackupPolicyResponse.PreferredBackupTime"));
		describeBackupPolicyResponse.setEnableBackupLog(_ctx.integerValue("DescribeBackupPolicyResponse.EnableBackupLog"));
		describeBackupPolicyResponse.setDbsInstance(_ctx.stringValue("DescribeBackupPolicyResponse.DbsInstance"));

		AccessDeniedDetail accessDeniedDetail = new AccessDeniedDetail();
		accessDeniedDetail.setAuthAction(_ctx.stringValue("DescribeBackupPolicyResponse.AccessDeniedDetail.AuthAction"));
		accessDeniedDetail.setAuthPrincipalDisplayName(_ctx.stringValue("DescribeBackupPolicyResponse.AccessDeniedDetail.AuthPrincipalDisplayName"));
		accessDeniedDetail.setAuthPrincipalOwnerId(_ctx.stringValue("DescribeBackupPolicyResponse.AccessDeniedDetail.AuthPrincipalOwnerId"));
		accessDeniedDetail.setAuthPrincipalType(_ctx.stringValue("DescribeBackupPolicyResponse.AccessDeniedDetail.AuthPrincipalType"));
		accessDeniedDetail.setEncodedDiagnosticMessage(_ctx.stringValue("DescribeBackupPolicyResponse.AccessDeniedDetail.EncodedDiagnosticMessage"));
		accessDeniedDetail.setNoPermissionType(_ctx.stringValue("DescribeBackupPolicyResponse.AccessDeniedDetail.NoPermissionType"));
		accessDeniedDetail.setPolicyType(_ctx.stringValue("DescribeBackupPolicyResponse.AccessDeniedDetail.PolicyType"));
		describeBackupPolicyResponse.setAccessDeniedDetail(accessDeniedDetail);
	 
	 	return describeBackupPolicyResponse;
	}
}