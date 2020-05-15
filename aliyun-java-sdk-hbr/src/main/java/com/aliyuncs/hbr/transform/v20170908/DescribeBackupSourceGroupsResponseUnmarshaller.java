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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeBackupSourceGroupsResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupSourceGroupsResponse.BackupSourceGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupSourceGroupsResponseUnmarshaller {

	public static DescribeBackupSourceGroupsResponse unmarshall(DescribeBackupSourceGroupsResponse describeBackupSourceGroupsResponse, UnmarshallerContext _ctx) {
		
		describeBackupSourceGroupsResponse.setRequestId(_ctx.stringValue("DescribeBackupSourceGroupsResponse.RequestId"));
		describeBackupSourceGroupsResponse.setSuccess(_ctx.booleanValue("DescribeBackupSourceGroupsResponse.Success"));
		describeBackupSourceGroupsResponse.setCode(_ctx.stringValue("DescribeBackupSourceGroupsResponse.Code"));
		describeBackupSourceGroupsResponse.setMessage(_ctx.stringValue("DescribeBackupSourceGroupsResponse.Message"));
		describeBackupSourceGroupsResponse.setTotalCount(_ctx.longValue("DescribeBackupSourceGroupsResponse.TotalCount"));
		describeBackupSourceGroupsResponse.setPageSize(_ctx.integerValue("DescribeBackupSourceGroupsResponse.PageSize"));
		describeBackupSourceGroupsResponse.setPageNumber(_ctx.integerValue("DescribeBackupSourceGroupsResponse.PageNumber"));

		List<BackupSourceGroup> backupSourceGroups = new ArrayList<BackupSourceGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupSourceGroupsResponse.BackupSourceGroups.Length"); i++) {
			BackupSourceGroup backupSourceGroup = new BackupSourceGroup();
			backupSourceGroup.setBackupSourceGroupId(_ctx.stringValue("DescribeBackupSourceGroupsResponse.BackupSourceGroups["+ i +"].BackupSourceGroupId"));
			backupSourceGroup.setDescription(_ctx.stringValue("DescribeBackupSourceGroupsResponse.BackupSourceGroups["+ i +"].Description"));
			backupSourceGroup.setSourceType(_ctx.stringValue("DescribeBackupSourceGroupsResponse.BackupSourceGroups["+ i +"].SourceType"));
			backupSourceGroup.setBackupSourceCount(_ctx.integerValue("DescribeBackupSourceGroupsResponse.BackupSourceGroups["+ i +"].BackupSourceCount"));
			backupSourceGroup.setClusterId(_ctx.stringValue("DescribeBackupSourceGroupsResponse.BackupSourceGroups["+ i +"].ClusterId"));
			backupSourceGroup.setCreatedTime(_ctx.longValue("DescribeBackupSourceGroupsResponse.BackupSourceGroups["+ i +"].CreatedTime"));
			backupSourceGroup.setUpdatedTime(_ctx.longValue("DescribeBackupSourceGroupsResponse.BackupSourceGroups["+ i +"].UpdatedTime"));

			backupSourceGroups.add(backupSourceGroup);
		}
		describeBackupSourceGroupsResponse.setBackupSourceGroups(backupSourceGroups);
	 
	 	return describeBackupSourceGroupsResponse;
	}
}