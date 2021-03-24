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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeBackupPoliciesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeBackupPoliciesResponse.BackupPolicy;
import com.aliyuncs.sas.model.v20181203.DescribeBackupPoliciesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupPoliciesResponseUnmarshaller {

	public static DescribeBackupPoliciesResponse unmarshall(DescribeBackupPoliciesResponse describeBackupPoliciesResponse, UnmarshallerContext _ctx) {
		
		describeBackupPoliciesResponse.setRequestId(_ctx.stringValue("DescribeBackupPoliciesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeBackupPoliciesResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeBackupPoliciesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeBackupPoliciesResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeBackupPoliciesResponse.PageInfo.CurrentPage"));
		describeBackupPoliciesResponse.setPageInfo(pageInfo);

		List<BackupPolicy> policies = new ArrayList<BackupPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupPoliciesResponse.Policies.Length"); i++) {
			BackupPolicy backupPolicy = new BackupPolicy();
			backupPolicy.setId(_ctx.longValue("DescribeBackupPoliciesResponse.Policies["+ i +"].Id"));
			backupPolicy.setName(_ctx.stringValue("DescribeBackupPoliciesResponse.Policies["+ i +"].Name"));
			backupPolicy.setStatus(_ctx.stringValue("DescribeBackupPoliciesResponse.Policies["+ i +"].Status"));
			backupPolicy.setPolicy(_ctx.stringValue("DescribeBackupPoliciesResponse.Policies["+ i +"].Policy"));
			backupPolicy.setPolicyVersion(_ctx.stringValue("DescribeBackupPoliciesResponse.Policies["+ i +"].PolicyVersion"));
			backupPolicy.setClientStatus(_ctx.stringValue("DescribeBackupPoliciesResponse.Policies["+ i +"].ClientStatus"));
			backupPolicy.setClientErrorCount(_ctx.integerValue("DescribeBackupPoliciesResponse.Policies["+ i +"].ClientErrorCount"));
			backupPolicy.setServiceErrorCount(_ctx.integerValue("DescribeBackupPoliciesResponse.Policies["+ i +"].ServiceErrorCount"));
			backupPolicy.setHealthClientCount(_ctx.integerValue("DescribeBackupPoliciesResponse.Policies["+ i +"].HealthClientCount"));

			List<String> uuidList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupPoliciesResponse.Policies["+ i +"].UuidList.Length"); j++) {
				uuidList.add(_ctx.stringValue("DescribeBackupPoliciesResponse.Policies["+ i +"].UuidList["+ j +"]"));
			}
			backupPolicy.setUuidList(uuidList);

			List<String> clientErrorUuidList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupPoliciesResponse.Policies["+ i +"].ClientErrorUuidList.Length"); j++) {
				clientErrorUuidList.add(_ctx.stringValue("DescribeBackupPoliciesResponse.Policies["+ i +"].ClientErrorUuidList["+ j +"]"));
			}
			backupPolicy.setClientErrorUuidList(clientErrorUuidList);

			List<String> serviceErrorUuidList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupPoliciesResponse.Policies["+ i +"].ServiceErrorUuidList.Length"); j++) {
				serviceErrorUuidList.add(_ctx.stringValue("DescribeBackupPoliciesResponse.Policies["+ i +"].ServiceErrorUuidList["+ j +"]"));
			}
			backupPolicy.setServiceErrorUuidList(serviceErrorUuidList);

			List<String> healthClientUuidList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBackupPoliciesResponse.Policies["+ i +"].HealthClientUuidList.Length"); j++) {
				healthClientUuidList.add(_ctx.stringValue("DescribeBackupPoliciesResponse.Policies["+ i +"].HealthClientUuidList["+ j +"]"));
			}
			backupPolicy.setHealthClientUuidList(healthClientUuidList);

			policies.add(backupPolicy);
		}
		describeBackupPoliciesResponse.setPolicies(policies);
	 
	 	return describeBackupPoliciesResponse;
	}
}