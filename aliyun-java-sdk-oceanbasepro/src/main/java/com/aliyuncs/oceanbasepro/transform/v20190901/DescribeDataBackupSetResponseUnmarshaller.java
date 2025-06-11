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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeDataBackupSetResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeDataBackupSetResponse.DataItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeDataBackupSetResponse.DataItem.BackupObjectsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeDataBackupSetResponse.DataItem.BackupObjectsItem.DatabaseTablesListItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeDataBackupSetResponse.DataItem.BackupResultsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeDataBackupSetResponse.DataItem.BackupResultsItem.TableBackupResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataBackupSetResponseUnmarshaller {

	public static DescribeDataBackupSetResponse unmarshall(DescribeDataBackupSetResponse describeDataBackupSetResponse, UnmarshallerContext _ctx) {
		
		describeDataBackupSetResponse.setRequestId(_ctx.stringValue("DescribeDataBackupSetResponse.RequestId"));
		describeDataBackupSetResponse.setTotalCount(_ctx.integerValue("DescribeDataBackupSetResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataBackupSetResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEndTime(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].EndTime"));
			dataItem.setStatus(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].Status"));
			dataItem.setType(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].Type"));
			dataItem.setStartTime(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].StartTime"));
			dataItem.setDataSize(_ctx.integerValue("DescribeDataBackupSetResponse.Data["+ i +"].DataSize"));
			dataItem.setPolicy(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].Policy"));
			dataItem.setSetId(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].SetId"));
			dataItem.setBizMethod(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].Method"));
			dataItem.setCheckpoint(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].Checkpoint"));
			dataItem.setDataVersion(_ctx.integerValue("DescribeDataBackupSetResponse.Data["+ i +"].DataVersion"));
			dataItem.setBackupObjectType(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupObjectType"));
			dataItem.setDownloadTaskStatus(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].DownloadTaskStatus"));
			dataItem.setDownloadTaskId(_ctx.longValue("DescribeDataBackupSetResponse.Data["+ i +"].DownloadTaskId"));
			dataItem.setValidity(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].Validity"));
			dataItem.setProgress(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].Progress"));
			dataItem.setStorageClass(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].StorageClass"));

			List<BackupObjectsItem> backupObjects = new ArrayList<BackupObjectsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupObjects.Length"); j++) {
				BackupObjectsItem backupObjectsItem = new BackupObjectsItem();
				backupObjectsItem.setClusterName(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupObjects["+ j +"].ClusterName"));
				backupObjectsItem.setTenantName(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupObjects["+ j +"].TenantName"));

				List<DatabaseTablesListItem> databaseTablesList = new ArrayList<DatabaseTablesListItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupObjects["+ j +"].DatabaseTablesList.Length"); k++) {
					DatabaseTablesListItem databaseTablesListItem = new DatabaseTablesListItem();
					databaseTablesListItem.setDatabase(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupObjects["+ j +"].DatabaseTablesList["+ k +"].Database"));

					List<String> tables = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupObjects["+ j +"].DatabaseTablesList["+ k +"].Tables.Length"); l++) {
						tables.add(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupObjects["+ j +"].DatabaseTablesList["+ k +"].Tables["+ l +"]"));
					}
					databaseTablesListItem.setTables(tables);

					databaseTablesList.add(databaseTablesListItem);
				}
				backupObjectsItem.setDatabaseTablesList(databaseTablesList);

				backupObjects.add(backupObjectsItem);
			}
			dataItem.setBackupObjects(backupObjects);

			List<BackupResultsItem> backupResults = new ArrayList<BackupResultsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupResults.Length"); j++) {
				BackupResultsItem backupResultsItem = new BackupResultsItem();
				backupResultsItem.setClusterName(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupResults["+ j +"].ClusterName"));
				backupResultsItem.setTenantName(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupResults["+ j +"].TenantName"));

				List<TableBackupResultsItem> tableBackupResults = new ArrayList<TableBackupResultsItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupResults["+ j +"].TableBackupResults.Length"); k++) {
					TableBackupResultsItem tableBackupResultsItem = new TableBackupResultsItem();
					tableBackupResultsItem.setDatabase(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupResults["+ j +"].TableBackupResults["+ k +"].Database"));
					tableBackupResultsItem.setTable(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupResults["+ j +"].TableBackupResults["+ k +"].Table"));
					tableBackupResultsItem.setStatus(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupResults["+ j +"].TableBackupResults["+ k +"].Status"));
					tableBackupResultsItem.setMessage(_ctx.stringValue("DescribeDataBackupSetResponse.Data["+ i +"].BackupResults["+ j +"].TableBackupResults["+ k +"].Message"));

					tableBackupResults.add(tableBackupResultsItem);
				}
				backupResultsItem.setTableBackupResults(tableBackupResults);

				backupResults.add(backupResultsItem);
			}
			dataItem.setBackupResults(backupResults);

			data.add(dataItem);
		}
		describeDataBackupSetResponse.setData(data);
	 
	 	return describeDataBackupSetResponse;
	}
}