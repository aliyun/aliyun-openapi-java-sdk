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

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataImportSQLResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataImportSQLResponse.SQLDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataImportSQLResponseUnmarshaller {

	public static GetDataImportSQLResponse unmarshall(GetDataImportSQLResponse getDataImportSQLResponse, UnmarshallerContext _ctx) {
		
		getDataImportSQLResponse.setRequestId(_ctx.stringValue("GetDataImportSQLResponse.RequestId"));
		getDataImportSQLResponse.setSuccess(_ctx.booleanValue("GetDataImportSQLResponse.Success"));
		getDataImportSQLResponse.setErrorMessage(_ctx.stringValue("GetDataImportSQLResponse.ErrorMessage"));
		getDataImportSQLResponse.setErrorCode(_ctx.stringValue("GetDataImportSQLResponse.ErrorCode"));

		SQLDetail sQLDetail = new SQLDetail();
		sQLDetail.setExecSql(_ctx.stringValue("GetDataImportSQLResponse.SQLDetail.ExecSql"));
		getDataImportSQLResponse.setSQLDetail(sQLDetail);
	 
	 	return getDataImportSQLResponse;
	}
}