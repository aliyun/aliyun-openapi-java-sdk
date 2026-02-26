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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDatabaseExportOrderDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatabaseExportOrderDetailResponseUnmarshaller {

	public static GetDatabaseExportOrderDetailResponse unmarshall(GetDatabaseExportOrderDetailResponse getDatabaseExportOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getDatabaseExportOrderDetailResponse.setRequestId(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.RequestId"));
		getDatabaseExportOrderDetailResponse.setErrorCode(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.ErrorCode"));
		getDatabaseExportOrderDetailResponse.setErrorMessage(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.ErrorMessage"));
		getDatabaseExportOrderDetailResponse.setSuccess(_ctx.booleanValue("GetDatabaseExportOrderDetailResponse.Success"));

		DatabaseExportOrderDetail databaseExportOrderDetail = new DatabaseExportOrderDetail();
		databaseExportOrderDetail.setId(_ctx.longValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.Id"));
		databaseExportOrderDetail.setCommitter(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.Committer"));
		databaseExportOrderDetail.setCommitterId(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.CommitterId"));
		databaseExportOrderDetail.setComment(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.Comment"));
		databaseExportOrderDetail.setSearchName(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.SearchName"));
		databaseExportOrderDetail.setStatusDesc(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.StatusDesc"));
		databaseExportOrderDetail.setWorkflowStatusDesc(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.WorkflowStatusDesc"));
		databaseExportOrderDetail.setLog(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.Log"));

		KeyInfo keyInfo = new KeyInfo();
		keyInfo.setDbId(_ctx.longValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.DbId"));
		keyInfo.setDownloadURL(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.DownloadURL"));
		keyInfo.setAuditDate(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.AuditDate"));

		Config config = new Config();
		config.setDbName(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.Config.DbName"));
		config.setExportContent(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.Config.ExportContent"));
		config.setTargetOption(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.Config.TargetOption"));

		List<String> exportTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.Config.ExportTypes.Length"); i++) {
			exportTypes.add(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.Config.ExportTypes["+ i +"]"));
		}
		config.setExportTypes(exportTypes);

		List<String> selectedTables = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.Config.SelectedTables.Length"); i++) {
			selectedTables.add(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.Config.SelectedTables["+ i +"]"));
		}
		config.setSelectedTables(selectedTables);

		List<String> sQLExtOption = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.Config.SQLExtOption.Length"); i++) {
			sQLExtOption.add(_ctx.stringValue("GetDatabaseExportOrderDetailResponse.DatabaseExportOrderDetail.KeyInfo.Config.SQLExtOption["+ i +"]"));
		}
		config.setSQLExtOption(sQLExtOption);
		keyInfo.setConfig(config);
		databaseExportOrderDetail.setKeyInfo(keyInfo);
		getDatabaseExportOrderDetailResponse.setDatabaseExportOrderDetail(databaseExportOrderDetail);
	 
	 	return getDatabaseExportOrderDetailResponse;
	}
}