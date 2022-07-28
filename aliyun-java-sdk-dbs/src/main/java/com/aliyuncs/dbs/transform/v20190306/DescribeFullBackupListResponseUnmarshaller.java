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

	public static DescribeFullBackupListResponse unmarshall(DescribeFullBackupListResponse describeFullBackupListResponse, UnmarshallerContext _ctx) {
		
		describeFullBackupListResponse.setRequestId(_ctx.stringValue("DescribeFullBackupListResponse.RequestId"));
		describeFullBackupListResponse.setHttpStatusCode(_ctx.integerValue("DescribeFullBackupListResponse.HttpStatusCode"));
		describeFullBackupListResponse.setPageNum(_ctx.integerValue("DescribeFullBackupListResponse.PageNum"));
		describeFullBackupListResponse.setErrCode(_ctx.stringValue("DescribeFullBackupListResponse.ErrCode"));
		describeFullBackupListResponse.setSuccess(_ctx.booleanValue("DescribeFullBackupListResponse.Success"));
		describeFullBackupListResponse.setErrMessage(_ctx.stringValue("DescribeFullBackupListResponse.ErrMessage"));
		describeFullBackupListResponse.setTotalPages(_ctx.integerValue("DescribeFullBackupListResponse.TotalPages"));
		describeFullBackupListResponse.setTotalElements(_ctx.integerValue("DescribeFullBackupListResponse.TotalElements"));
		describeFullBackupListResponse.setPageSize(_ctx.integerValue("DescribeFullBackupListResponse.PageSize"));

		List<FullBackupFile> items = new ArrayList<FullBackupFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFullBackupListResponse.Items.Length"); i++) {
			FullBackupFile fullBackupFile = new FullBackupFile();
			fullBackupFile.setFinishTime(_ctx.longValue("DescribeFullBackupListResponse.Items["+ i +"].FinishTime"));
			fullBackupFile.setBackupStatus(_ctx.stringValue("DescribeFullBackupListResponse.Items["+ i +"].BackupStatus"));
			fullBackupFile.setSourceEndpointIpPort(_ctx.stringValue("DescribeFullBackupListResponse.Items["+ i +"].SourceEndpointIpPort"));
			fullBackupFile.setCreateTime(_ctx.longValue("DescribeFullBackupListResponse.Items["+ i +"].CreateTime"));
			fullBackupFile.setErrMessage(_ctx.stringValue("DescribeFullBackupListResponse.Items["+ i +"].ErrMessage"));
			fullBackupFile.setBackupObjects(_ctx.stringValue("DescribeFullBackupListResponse.Items["+ i +"].BackupObjects"));
			fullBackupFile.setEndTime(_ctx.longValue("DescribeFullBackupListResponse.Items["+ i +"].EndTime"));
			fullBackupFile.setStartTime(_ctx.longValue("DescribeFullBackupListResponse.Items["+ i +"].StartTime"));
			fullBackupFile.setBackupSetExpiredTime(_ctx.longValue("DescribeFullBackupListResponse.Items["+ i +"].BackupSetExpiredTime"));
			fullBackupFile.setStorageMethod(_ctx.stringValue("DescribeFullBackupListResponse.Items["+ i +"].StorageMethod"));
			fullBackupFile.setBackupSetId(_ctx.stringValue("DescribeFullBackupListResponse.Items["+ i +"].BackupSetId"));
			fullBackupFile.setBackupSize(_ctx.longValue("DescribeFullBackupListResponse.Items["+ i +"].BackupSize"));

			items.add(fullBackupFile);
		}
		describeFullBackupListResponse.setItems(items);
	 
	 	return describeFullBackupListResponse;
	}
}