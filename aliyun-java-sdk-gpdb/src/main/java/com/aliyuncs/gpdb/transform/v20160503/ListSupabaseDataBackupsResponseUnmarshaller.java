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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListSupabaseDataBackupsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListSupabaseDataBackupsResponse.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSupabaseDataBackupsResponseUnmarshaller {

	public static ListSupabaseDataBackupsResponse unmarshall(ListSupabaseDataBackupsResponse listSupabaseDataBackupsResponse, UnmarshallerContext _ctx) {
		
		listSupabaseDataBackupsResponse.setRequestId(_ctx.stringValue("ListSupabaseDataBackupsResponse.RequestId"));
		listSupabaseDataBackupsResponse.setTotalCount(_ctx.integerValue("ListSupabaseDataBackupsResponse.TotalCount"));
		listSupabaseDataBackupsResponse.setPageSize(_ctx.integerValue("ListSupabaseDataBackupsResponse.PageSize"));
		listSupabaseDataBackupsResponse.setNextToken(_ctx.stringValue("ListSupabaseDataBackupsResponse.NextToken"));
		listSupabaseDataBackupsResponse.setPageNumber(_ctx.integerValue("ListSupabaseDataBackupsResponse.PageNumber"));
		listSupabaseDataBackupsResponse.setMaxResults(_ctx.integerValue("ListSupabaseDataBackupsResponse.MaxResults"));
		listSupabaseDataBackupsResponse.setTotalBackupSize(_ctx.longValue("ListSupabaseDataBackupsResponse.TotalBackupSize"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < _ctx.lengthValue("ListSupabaseDataBackupsResponse.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupMethod(_ctx.stringValue("ListSupabaseDataBackupsResponse.Items["+ i +"].BackupMethod"));
			backup.setBackupEndTimeLocal(_ctx.stringValue("ListSupabaseDataBackupsResponse.Items["+ i +"].BackupEndTimeLocal"));
			backup.setBackupEndTime(_ctx.stringValue("ListSupabaseDataBackupsResponse.Items["+ i +"].BackupEndTime"));
			backup.setBackupSize(_ctx.longValue("ListSupabaseDataBackupsResponse.Items["+ i +"].BackupSize"));
			backup.setBackupMode(_ctx.stringValue("ListSupabaseDataBackupsResponse.Items["+ i +"].BackupMode"));
			backup.setConsistentTime(_ctx.longValue("ListSupabaseDataBackupsResponse.Items["+ i +"].ConsistentTime"));
			backup.setBackupStartTime(_ctx.stringValue("ListSupabaseDataBackupsResponse.Items["+ i +"].BackupStartTime"));
			backup.setDataType(_ctx.stringValue("ListSupabaseDataBackupsResponse.Items["+ i +"].DataType"));
			backup.setBaksetName(_ctx.stringValue("ListSupabaseDataBackupsResponse.Items["+ i +"].BaksetName"));
			backup.setBackupStartTimeLocal(_ctx.stringValue("ListSupabaseDataBackupsResponse.Items["+ i +"].BackupStartTimeLocal"));
			backup.setBackupSetId(_ctx.stringValue("ListSupabaseDataBackupsResponse.Items["+ i +"].BackupSetId"));
			backup.setBackupStatus(_ctx.stringValue("ListSupabaseDataBackupsResponse.Items["+ i +"].BackupStatus"));

			items.add(backup);
		}
		listSupabaseDataBackupsResponse.setItems(items);
	 
	 	return listSupabaseDataBackupsResponse;
	}
}