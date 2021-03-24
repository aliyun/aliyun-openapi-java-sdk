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

import com.aliyuncs.sas.model.v20181203.DescribeBackupFilesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeBackupFilesResponse.BrowseFile;
import com.aliyuncs.sas.model.v20181203.DescribeBackupFilesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBackupFilesResponseUnmarshaller {

	public static DescribeBackupFilesResponse unmarshall(DescribeBackupFilesResponse describeBackupFilesResponse, UnmarshallerContext _ctx) {
		
		describeBackupFilesResponse.setRequestId(_ctx.stringValue("DescribeBackupFilesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeBackupFilesResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeBackupFilesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeBackupFilesResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeBackupFilesResponse.PageInfo.CurrentPage"));
		describeBackupFilesResponse.setPageInfo(pageInfo);

		List<BrowseFile> backupFiles = new ArrayList<BrowseFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBackupFilesResponse.BackupFiles.Length"); i++) {
			BrowseFile browseFile = new BrowseFile();
			browseFile.setName(_ctx.stringValue("DescribeBackupFilesResponse.BackupFiles["+ i +"].Name"));
			browseFile.setType(_ctx.stringValue("DescribeBackupFilesResponse.BackupFiles["+ i +"].Type"));
			browseFile.setSubtree(_ctx.stringValue("DescribeBackupFilesResponse.BackupFiles["+ i +"].Subtree"));
			browseFile.setSize(_ctx.longValue("DescribeBackupFilesResponse.BackupFiles["+ i +"].Size"));

			backupFiles.add(browseFile);
		}
		describeBackupFilesResponse.setBackupFiles(backupFiles);
	 
	 	return describeBackupFilesResponse;
	}
}