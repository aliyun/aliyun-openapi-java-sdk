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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.GetRdsBackUpResponse;
import com.aliyuncs.retailcloud.model.v20180313.GetRdsBackUpResponse.Result;
import com.aliyuncs.retailcloud.model.v20180313.GetRdsBackUpResponse.Result.Backup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRdsBackUpResponseUnmarshaller {

	public static GetRdsBackUpResponse unmarshall(GetRdsBackUpResponse getRdsBackUpResponse, UnmarshallerContext context) {
		
		getRdsBackUpResponse.setRequestId(context.stringValue("GetRdsBackUpResponse.RequestId"));
		getRdsBackUpResponse.setCode(context.integerValue("GetRdsBackUpResponse.Code"));
		getRdsBackUpResponse.setErrMsg(context.stringValue("GetRdsBackUpResponse.ErrMsg"));

		Result result = new Result();
		result.setTotalRecordCount(context.stringValue("GetRdsBackUpResponse.Result.TotalRecordCount"));
		result.setPageNumber(context.stringValue("GetRdsBackUpResponse.Result.PageNumber"));
		result.setPageRecordCount(context.stringValue("GetRdsBackUpResponse.Result.PageRecordCount"));
		result.setTotalBackupSize(context.longValue("GetRdsBackUpResponse.Result.TotalBackupSize"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < context.lengthValue("GetRdsBackUpResponse.Result.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupId(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupId"));
			backup.setDBInstanceId(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].DBInstanceId"));
			backup.setBackupStatus(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupStatus"));
			backup.setBackupStartTime(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupEndTime"));
			backup.setBackupType(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupType"));
			backup.setBackupMode(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupMode"));
			backup.setBackupMethod(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupMethod"));
			backup.setBackupLocation(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupLocation"));
			backup.setBackupExtractionStatus(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupExtractionStatus"));
			backup.setBackupScale(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupScale"));
			backup.setBackupDBNames(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupDBNames"));
			backup.setTotalBackupSize(context.longValue("GetRdsBackUpResponse.Result.Items["+ i +"].TotalBackupSize"));
			backup.setBackupSize(context.longValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupSize"));
			backup.setHostInstanceID(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].HostInstanceID"));
			backup.setStoreStatus(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].StoreStatus"));
			backup.setMetaStatus(context.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].MetaStatus"));

			items.add(backup);
		}
		result.setItems(items);
		getRdsBackUpResponse.setResult(result);
	 
	 	return getRdsBackUpResponse;
	}
}