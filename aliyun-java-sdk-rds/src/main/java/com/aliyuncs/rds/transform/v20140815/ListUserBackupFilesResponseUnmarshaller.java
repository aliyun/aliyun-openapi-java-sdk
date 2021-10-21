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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.ListUserBackupFilesResponse;
import com.aliyuncs.rds.model.v20140815.ListUserBackupFilesResponse.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserBackupFilesResponseUnmarshaller {

	public static ListUserBackupFilesResponse unmarshall(ListUserBackupFilesResponse listUserBackupFilesResponse, UnmarshallerContext _ctx) {
		
		listUserBackupFilesResponse.setRequestId(_ctx.stringValue("ListUserBackupFilesResponse.RequestId"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserBackupFilesResponse.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setStatus(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].Status"));
			recordsItem.setCreationTime(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].CreationTime"));
			recordsItem.setFinishTime(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].FinishTime"));
			recordsItem.setComment(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].Comment"));
			recordsItem.setOssFilePath(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].OssFilePath"));
			recordsItem.setOssBucket(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].OssBucket"));
			recordsItem.setModificationTime(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].ModificationTime"));
			recordsItem.setOssFileSize(_ctx.longValue("ListUserBackupFilesResponse.Records["+ i +"].OssFileSize"));
			recordsItem.setOssFileName(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].OssFileName"));
			recordsItem.setEngineVersion(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].EngineVersion"));
			recordsItem.setBackupId(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].BackupId"));
			recordsItem.setRestoreSize(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].RestoreSize"));
			recordsItem.setZoneId(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].ZoneId"));
			recordsItem.setRetention(_ctx.integerValue("ListUserBackupFilesResponse.Records["+ i +"].Retention"));
			recordsItem.setDBInstanceId(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].DBInstanceId"));
			recordsItem.setEngine(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].Engine"));
			recordsItem.setOssUrl(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].OssUrl"));
			recordsItem.setOssFileMetaData(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].OssFileMetaData"));
			recordsItem.setBinlogInfo(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].BinlogInfo"));
			recordsItem.setReason(_ctx.stringValue("ListUserBackupFilesResponse.Records["+ i +"].Reason"));

			records.add(recordsItem);
		}
		listUserBackupFilesResponse.setRecords(records);
	 
	 	return listUserBackupFilesResponse;
	}
}