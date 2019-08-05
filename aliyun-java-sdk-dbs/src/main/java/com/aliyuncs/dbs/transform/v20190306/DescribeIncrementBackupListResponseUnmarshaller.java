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

import com.aliyuncs.dbs.model.v20190306.DescribeIncrementBackupListResponse;
import com.aliyuncs.dbs.model.v20190306.DescribeIncrementBackupListResponse.IncrementBackupFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIncrementBackupListResponseUnmarshaller {

	public static DescribeIncrementBackupListResponse unmarshall(DescribeIncrementBackupListResponse describeIncrementBackupListResponse, UnmarshallerContext _ctx) {
		
		describeIncrementBackupListResponse.setRequestId(_ctx.stringValue("DescribeIncrementBackupListResponse.RequestId"));
		describeIncrementBackupListResponse.setSuccess(_ctx.booleanValue("DescribeIncrementBackupListResponse.Success"));
		describeIncrementBackupListResponse.setErrCode(_ctx.stringValue("DescribeIncrementBackupListResponse.ErrCode"));
		describeIncrementBackupListResponse.setErrMessage(_ctx.stringValue("DescribeIncrementBackupListResponse.ErrMessage"));
		describeIncrementBackupListResponse.setHttpStatusCode(_ctx.integerValue("DescribeIncrementBackupListResponse.HttpStatusCode"));
		describeIncrementBackupListResponse.setTotalPages(_ctx.integerValue("DescribeIncrementBackupListResponse.TotalPages"));
		describeIncrementBackupListResponse.setPageSize(_ctx.integerValue("DescribeIncrementBackupListResponse.PageSize"));
		describeIncrementBackupListResponse.setPageNum(_ctx.integerValue("DescribeIncrementBackupListResponse.PageNum"));
		describeIncrementBackupListResponse.setTotalElements(_ctx.integerValue("DescribeIncrementBackupListResponse.TotalElements"));

		List<IncrementBackupFile> items = new ArrayList<IncrementBackupFile>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIncrementBackupListResponse.Items.Length"); i++) {
			IncrementBackupFile incrementBackupFile = new IncrementBackupFile();
			incrementBackupFile.setBackupSetId(_ctx.stringValue("DescribeIncrementBackupListResponse.Items["+ i +"].BackupSetId"));
			incrementBackupFile.setSourceEndpointIpPort(_ctx.stringValue("DescribeIncrementBackupListResponse.Items["+ i +"].SourceEndpointIpPort"));
			incrementBackupFile.setStartTime(_ctx.longValue("DescribeIncrementBackupListResponse.Items["+ i +"].StartTime"));
			incrementBackupFile.setEndTime(_ctx.longValue("DescribeIncrementBackupListResponse.Items["+ i +"].EndTime"));
			incrementBackupFile.setBackupStatus(_ctx.stringValue("DescribeIncrementBackupListResponse.Items["+ i +"].BackupStatus"));
			incrementBackupFile.setBackupSetExpiredTime(_ctx.longValue("DescribeIncrementBackupListResponse.Items["+ i +"].BackupSetExpiredTime"));
			incrementBackupFile.setBackupSize(_ctx.longValue("DescribeIncrementBackupListResponse.Items["+ i +"].BackupSize"));
			incrementBackupFile.setStorageMethod(_ctx.stringValue("DescribeIncrementBackupListResponse.Items["+ i +"].StorageMethod"));

			items.add(incrementBackupFile);
		}
		describeIncrementBackupListResponse.setItems(items);
	 
	 	return describeIncrementBackupListResponse;
	}
}