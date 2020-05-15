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

import com.aliyuncs.hbr.model.v20170908.DescribeBackupSourcesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeBackupSourcesResponse.BackupSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupSourcesResponseUnmarshaller {

	public static DescribeBackupSourcesResponse unmarshall(DescribeBackupSourcesResponse describeBackupSourcesResponse, UnmarshallerContext _ctx) {
		
		describeBackupSourcesResponse.setRequestId(_ctx.stringValue("DescribeBackupSourcesResponse.RequestId"));
		describeBackupSourcesResponse.setSuccess(_ctx.booleanValue("DescribeBackupSourcesResponse.Success"));
		describeBackupSourcesResponse.setCode(_ctx.stringValue("DescribeBackupSourcesResponse.Code"));
		describeBackupSourcesResponse.setMessage(_ctx.stringValue("DescribeBackupSourcesResponse.Message"));
		describeBackupSourcesResponse.setTotalCount(_ctx.longValue("DescribeBackupSourcesResponse.TotalCount"));
		describeBackupSourcesResponse.setPageSize(_ctx.integerValue("DescribeBackupSourcesResponse.PageSize"));
		describeBackupSourcesResponse.setPageNumber(_ctx.integerValue("DescribeBackupSourcesResponse.PageNumber"));

		List<BackupSource> backupSources = new ArrayList<BackupSource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupSourcesResponse.BackupSources.Length"); i++) {
			BackupSource backupSource = new BackupSource();
			backupSource.setBackupSourceId(_ctx.stringValue("DescribeBackupSourcesResponse.BackupSources["+ i +"].BackupSourceId"));
			backupSource.setDescription(_ctx.stringValue("DescribeBackupSourcesResponse.BackupSources["+ i +"].Description"));
			backupSource.setSourceType(_ctx.stringValue("DescribeBackupSourcesResponse.BackupSources["+ i +"].SourceType"));
			backupSource.setBackupSourceGroupId(_ctx.stringValue("DescribeBackupSourcesResponse.BackupSources["+ i +"].BackupSourceGroupId"));
			backupSource.setClusterId(_ctx.stringValue("DescribeBackupSourcesResponse.BackupSources["+ i +"].ClusterId"));
			backupSource.setDatabaseName(_ctx.stringValue("DescribeBackupSourcesResponse.BackupSources["+ i +"].DatabaseName"));
			backupSource.setAllDatabase(_ctx.booleanValue("DescribeBackupSourcesResponse.BackupSources["+ i +"].AllDatabase"));
			backupSource.setCreatedTime(_ctx.longValue("DescribeBackupSourcesResponse.BackupSources["+ i +"].CreatedTime"));
			backupSource.setUpdatedTime(_ctx.longValue("DescribeBackupSourcesResponse.BackupSources["+ i +"].UpdatedTime"));

			backupSources.add(backupSource);
		}
		describeBackupSourcesResponse.setBackupSources(backupSources);
	 
	 	return describeBackupSourcesResponse;
	}
}