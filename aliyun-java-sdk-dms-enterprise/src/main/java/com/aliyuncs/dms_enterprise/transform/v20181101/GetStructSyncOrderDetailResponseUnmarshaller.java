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

import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncOrderDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncOrderDetailResponse.StructSyncOrderDetail;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncOrderDetailResponse.StructSyncOrderDetail.SourceDatabaseInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncOrderDetailResponse.StructSyncOrderDetail.SourceVersionInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TableInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TargetDatabaseInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TargetVersionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStructSyncOrderDetailResponseUnmarshaller {

	public static GetStructSyncOrderDetailResponse unmarshall(GetStructSyncOrderDetailResponse getStructSyncOrderDetailResponse, UnmarshallerContext _ctx) {
		
		getStructSyncOrderDetailResponse.setRequestId(_ctx.stringValue("GetStructSyncOrderDetailResponse.RequestId"));
		getStructSyncOrderDetailResponse.setSuccess(_ctx.booleanValue("GetStructSyncOrderDetailResponse.Success"));
		getStructSyncOrderDetailResponse.setErrorMessage(_ctx.stringValue("GetStructSyncOrderDetailResponse.ErrorMessage"));
		getStructSyncOrderDetailResponse.setErrorCode(_ctx.stringValue("GetStructSyncOrderDetailResponse.ErrorCode"));

		StructSyncOrderDetail structSyncOrderDetail = new StructSyncOrderDetail();
		structSyncOrderDetail.setSourceType(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.SourceType"));
		structSyncOrderDetail.setTargetType(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TargetType"));
		structSyncOrderDetail.setIgnoreError(_ctx.booleanValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.IgnoreError"));

		SourceDatabaseInfo sourceDatabaseInfo = new SourceDatabaseInfo();
		sourceDatabaseInfo.setDbId(_ctx.longValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.SourceDatabaseInfo.DbId"));
		sourceDatabaseInfo.setSearchName(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.SourceDatabaseInfo.SearchName"));
		sourceDatabaseInfo.setDbType(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.SourceDatabaseInfo.DbType"));
		sourceDatabaseInfo.setEnvType(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.SourceDatabaseInfo.EnvType"));
		sourceDatabaseInfo.setLogic(_ctx.booleanValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.SourceDatabaseInfo.Logic"));
		structSyncOrderDetail.setSourceDatabaseInfo(sourceDatabaseInfo);

		TargetDatabaseInfo targetDatabaseInfo = new TargetDatabaseInfo();
		targetDatabaseInfo.setDbId(_ctx.longValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TargetDatabaseInfo.DbId"));
		targetDatabaseInfo.setSearchName(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TargetDatabaseInfo.SearchName"));
		targetDatabaseInfo.setDbType(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TargetDatabaseInfo.DbType"));
		targetDatabaseInfo.setEnvType(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TargetDatabaseInfo.EnvType"));
		targetDatabaseInfo.setLogic(_ctx.booleanValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TargetDatabaseInfo.Logic"));
		structSyncOrderDetail.setTargetDatabaseInfo(targetDatabaseInfo);

		SourceVersionInfo sourceVersionInfo = new SourceVersionInfo();
		sourceVersionInfo.setVersionId(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.SourceVersionInfo.VersionId"));
		structSyncOrderDetail.setSourceVersionInfo(sourceVersionInfo);

		TargetVersionInfo targetVersionInfo = new TargetVersionInfo();
		targetVersionInfo.setVersionId(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TargetVersionInfo.VersionId"));
		structSyncOrderDetail.setTargetVersionInfo(targetVersionInfo);

		List<TableInfo> tableInfoList = new ArrayList<TableInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TableInfoList.Length"); i++) {
			TableInfo tableInfo = new TableInfo();
			tableInfo.setSourceTableName(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TableInfoList["+ i +"].SourceTableName"));
			tableInfo.setTargetTableName(_ctx.stringValue("GetStructSyncOrderDetailResponse.StructSyncOrderDetail.TableInfoList["+ i +"].TargetTableName"));

			tableInfoList.add(tableInfo);
		}
		structSyncOrderDetail.setTableInfoList(tableInfoList);
		getStructSyncOrderDetailResponse.setStructSyncOrderDetail(structSyncOrderDetail);
	 
	 	return getStructSyncOrderDetailResponse;
	}
}