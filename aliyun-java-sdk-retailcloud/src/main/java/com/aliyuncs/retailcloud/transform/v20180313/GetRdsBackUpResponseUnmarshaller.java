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

	public static GetRdsBackUpResponse unmarshall(GetRdsBackUpResponse getRdsBackUpResponse, UnmarshallerContext _ctx) {
		
		getRdsBackUpResponse.setRequestId(_ctx.stringValue("GetRdsBackUpResponse.RequestId"));
		getRdsBackUpResponse.setCode(_ctx.integerValue("GetRdsBackUpResponse.Code"));
		getRdsBackUpResponse.setErrMsg(_ctx.stringValue("GetRdsBackUpResponse.ErrMsg"));

		Result result = new Result();
		result.setTotalRecordCount(_ctx.stringValue("GetRdsBackUpResponse.Result.TotalRecordCount"));
		result.setPageNumber(_ctx.stringValue("GetRdsBackUpResponse.Result.PageNumber"));
		result.setPageRecordCount(_ctx.stringValue("GetRdsBackUpResponse.Result.PageRecordCount"));
		result.setTotalBackupSize(_ctx.longValue("GetRdsBackUpResponse.Result.TotalBackupSize"));

		List<Backup> items = new ArrayList<Backup>();
		for (int i = 0; i < _ctx.lengthValue("GetRdsBackUpResponse.Result.Items.Length"); i++) {
			Backup backup = new Backup();
			backup.setBackupId(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupId"));
			backup.setDBInstanceId(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].DBInstanceId"));
			backup.setBackupStatus(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupStatus"));
			backup.setBackupStartTime(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupStartTime"));
			backup.setBackupEndTime(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupEndTime"));
			backup.setBackupType(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupType"));
			backup.setBackupMode(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupMode"));
			backup.setBackupMethod(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupMethod"));
			backup.setBackupLocation(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupLocation"));
			backup.setBackupExtractionStatus(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupExtractionStatus"));
			backup.setBackupScale(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupScale"));
			backup.setBackupDBNames(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupDBNames"));
			backup.setTotalBackupSize(_ctx.longValue("GetRdsBackUpResponse.Result.Items["+ i +"].TotalBackupSize"));
			backup.setBackupSize(_ctx.longValue("GetRdsBackUpResponse.Result.Items["+ i +"].BackupSize"));
			backup.setHostInstanceID(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].HostInstanceID"));
			backup.setStoreStatus(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].StoreStatus"));
			backup.setMetaStatus(_ctx.stringValue("GetRdsBackUpResponse.Result.Items["+ i +"].MetaStatus"));

			items.add(backup);
		}
		result.setItems(items);
		getRdsBackUpResponse.setResult(result);
	 
	 	return getRdsBackUpResponse;
	}
}