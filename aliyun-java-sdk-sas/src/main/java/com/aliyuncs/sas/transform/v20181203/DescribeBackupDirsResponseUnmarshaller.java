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

import com.aliyuncs.sas.model.v20181203.DescribeBackupDirsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeBackupDirsResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeBackupDirsResponse.SimpleBackupJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupDirsResponseUnmarshaller {

	public static DescribeBackupDirsResponse unmarshall(DescribeBackupDirsResponse describeBackupDirsResponse, UnmarshallerContext _ctx) {
		
		describeBackupDirsResponse.setRequestId(_ctx.stringValue("DescribeBackupDirsResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeBackupDirsResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeBackupDirsResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeBackupDirsResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeBackupDirsResponse.PageInfo.CurrentPage"));
		describeBackupDirsResponse.setPageInfo(pageInfo);

		List<SimpleBackupJob> backupDirs = new ArrayList<SimpleBackupJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupDirsResponse.BackupDirs.Length"); i++) {
			SimpleBackupJob simpleBackupJob = new SimpleBackupJob();
			simpleBackupJob.setBackupJobId(_ctx.longValue("DescribeBackupDirsResponse.BackupDirs["+ i +"].BackupJobId"));
			simpleBackupJob.setSource(_ctx.stringValue("DescribeBackupDirsResponse.BackupDirs["+ i +"].Source"));

			backupDirs.add(simpleBackupJob);
		}
		describeBackupDirsResponse.setBackupDirs(backupDirs);
	 
	 	return describeBackupDirsResponse;
	}
}