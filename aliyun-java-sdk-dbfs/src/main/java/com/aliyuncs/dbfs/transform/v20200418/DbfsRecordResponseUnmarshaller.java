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

package com.aliyuncs.dbfs.transform.v20200418;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbfs.model.v20200418.DbfsRecordResponse;
import com.aliyuncs.dbfs.model.v20200418.DbfsRecordResponse.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DbfsRecordResponseUnmarshaller {

	public static DbfsRecordResponse unmarshall(DbfsRecordResponse dbfsRecordResponse, UnmarshallerContext _ctx) {
		
		dbfsRecordResponse.setRequestId(_ctx.stringValue("DbfsRecordResponse.RequestId"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("DbfsRecordResponse.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setId(_ctx.longValue("DbfsRecordResponse.Records["+ i +"].Id"));
			recordsItem.setBatchStrategyNo(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].BatchStrategyNo"));
			recordsItem.setAccountId(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].AccountId"));
			recordsItem.setDbfsId(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].DbfsId"));
			recordsItem.setEcsId(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].EcsId"));
			recordsItem.setTaskId(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].TaskId"));
			recordsItem.setRegionId(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].RegionId"));
			recordsItem.setZoneId(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].ZoneId"));
			recordsItem.setState(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].State"));
			recordsItem.setCurrentVersion(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].CurrentVersion"));
			recordsItem.setTargetVersion(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].TargetVersion"));
			recordsItem.setUpgradeStartTime(_ctx.longValue("DbfsRecordResponse.Records["+ i +"].UpgradeStartTime"));
			recordsItem.setUpgradeEndTime(_ctx.longValue("DbfsRecordResponse.Records["+ i +"].UpgradeEndTime"));
			recordsItem.setTaskExecutionCounts(_ctx.integerValue("DbfsRecordResponse.Records["+ i +"].TaskExecutionCounts"));
			recordsItem.setTaskErrorReason(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].TaskErrorReason"));
			recordsItem.setCreateTime(_ctx.longValue("DbfsRecordResponse.Records["+ i +"].CreateTime"));
			recordsItem.setUpdateTime(_ctx.longValue("DbfsRecordResponse.Records["+ i +"].UpdateTime"));
			recordsItem.setIsDel(_ctx.stringValue("DbfsRecordResponse.Records["+ i +"].IsDel"));

			records.add(recordsItem);
		}
		dbfsRecordResponse.setRecords(records);
	 
	 	return dbfsRecordResponse;
	}
}