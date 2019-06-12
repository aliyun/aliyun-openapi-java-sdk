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

package com.aliyuncs.dbs.transform.v20190306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbs.model.v20190306.DescribeFullBackupListResponse;
import com.aliyuncs.dbs.model.v20190306.DescribeFullBackupListResponse.FullBackupFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFullBackupListResponseUnmarshaller {

	public static DescribeFullBackupListResponse unmarshall(DescribeFullBackupListResponse describeFullBackupListResponse, UnmarshallerContext context) {
		
		describeFullBackupListResponse.setRequestId(context.stringValue("DescribeFullBackupListResponse.RequestId"));
		describeFullBackupListResponse.setSuccess(context.booleanValue("DescribeFullBackupListResponse.Success"));
		describeFullBackupListResponse.setErrCode(context.stringValue("DescribeFullBackupListResponse.ErrCode"));
		describeFullBackupListResponse.setErrMessage(context.stringValue("DescribeFullBackupListResponse.ErrMessage"));
		describeFullBackupListResponse.setHttpStatusCode(context.integerValue("DescribeFullBackupListResponse.HttpStatusCode"));
		describeFullBackupListResponse.setTotalPages(context.integerValue("DescribeFullBackupListResponse.TotalPages"));
		describeFullBackupListResponse.setPageSize(context.integerValue("DescribeFullBackupListResponse.PageSize"));
		describeFullBackupListResponse.setPageNum(context.integerValue("DescribeFullBackupListResponse.PageNum"));
		describeFullBackupListResponse.setTotalElements(context.integerValue("DescribeFullBackupListResponse.TotalElements"));

		List<FullBackupFile> items = new ArrayList<FullBackupFile>();
		for (int i = 0; i < context.lengthValue("DescribeFullBackupListResponse.Items.Length"); i++) {
			FullBackupFile fullBackupFile = new FullBackupFile();
			fullBackupFile.setBackupSetId(context.stringValue("DescribeFullBackupListResponse.Items["+ i +"].BackupSetId"));
			fullBackupFile.setSourceEndpointIpPort(context.stringValue("DescribeFullBackupListResponse.Items["+ i +"].SourceEndpointIpPort"));
			fullBackupFile.setStartTime(context.longValue("DescribeFullBackupListResponse.Items["+ i +"].StartTime"));
			fullBackupFile.setEndTime(context.longValue("DescribeFullBackupListResponse.Items["+ i +"].EndTime"));
			fullBackupFile.setBackupStatus(context.stringValue("DescribeFullBackupListResponse.Items["+ i +"].BackupStatus"));
			fullBackupFile.setBackupSetExpiredTime(context.longValue("DescribeFullBackupListResponse.Items["+ i +"].BackupSetExpiredTime"));
			fullBackupFile.setBackupSize(context.longValue("DescribeFullBackupListResponse.Items["+ i +"].BackupSize"));
			fullBackupFile.setStorageMethod(context.stringValue("DescribeFullBackupListResponse.Items["+ i +"].StorageMethod"));
			fullBackupFile.setErrMessage(context.stringValue("DescribeFullBackupListResponse.Items["+ i +"].ErrMessage"));

			items.add(fullBackupFile);
		}
		describeFullBackupListResponse.setItems(items);
	 
	 	return describeFullBackupListResponse;
	}
}