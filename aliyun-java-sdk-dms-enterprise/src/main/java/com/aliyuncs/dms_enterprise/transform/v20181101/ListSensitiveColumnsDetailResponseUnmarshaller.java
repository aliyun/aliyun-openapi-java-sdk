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

import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveColumnsDetailResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveColumnsDetailResponse.SensitiveColumnsDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSensitiveColumnsDetailResponseUnmarshaller {

	public static ListSensitiveColumnsDetailResponse unmarshall(ListSensitiveColumnsDetailResponse listSensitiveColumnsDetailResponse, UnmarshallerContext _ctx) {
		
		listSensitiveColumnsDetailResponse.setRequestId(_ctx.stringValue("ListSensitiveColumnsDetailResponse.RequestId"));
		listSensitiveColumnsDetailResponse.setErrorCode(_ctx.stringValue("ListSensitiveColumnsDetailResponse.ErrorCode"));
		listSensitiveColumnsDetailResponse.setErrorMessage(_ctx.stringValue("ListSensitiveColumnsDetailResponse.ErrorMessage"));
		listSensitiveColumnsDetailResponse.setSuccess(_ctx.booleanValue("ListSensitiveColumnsDetailResponse.Success"));

		List<SensitiveColumnsDetail> sensitiveColumnsDetailList = new ArrayList<SensitiveColumnsDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList.Length"); i++) {
			SensitiveColumnsDetail sensitiveColumnsDetail = new SensitiveColumnsDetail();
			sensitiveColumnsDetail.setTableName(_ctx.stringValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList["+ i +"].TableName"));
			sensitiveColumnsDetail.setColumnName(_ctx.stringValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList["+ i +"].ColumnName"));
			sensitiveColumnsDetail.setColumnType(_ctx.stringValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList["+ i +"].ColumnType"));
			sensitiveColumnsDetail.setSearchName(_ctx.stringValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList["+ i +"].SearchName"));
			sensitiveColumnsDetail.setColumnDescription(_ctx.stringValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList["+ i +"].ColumnDescription"));
			sensitiveColumnsDetail.setDbId(_ctx.longValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList["+ i +"].DbId"));
			sensitiveColumnsDetail.setLogic(_ctx.booleanValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList["+ i +"].Logic"));
			sensitiveColumnsDetail.setEnvType(_ctx.stringValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList["+ i +"].EnvType"));
			sensitiveColumnsDetail.setSchemaName(_ctx.stringValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList["+ i +"].SchemaName"));
			sensitiveColumnsDetail.setDbType(_ctx.stringValue("ListSensitiveColumnsDetailResponse.SensitiveColumnsDetailList["+ i +"].DbType"));

			sensitiveColumnsDetailList.add(sensitiveColumnsDetail);
		}
		listSensitiveColumnsDetailResponse.setSensitiveColumnsDetailList(sensitiveColumnsDetailList);
	 
	 	return listSensitiveColumnsDetailResponse;
	}
}