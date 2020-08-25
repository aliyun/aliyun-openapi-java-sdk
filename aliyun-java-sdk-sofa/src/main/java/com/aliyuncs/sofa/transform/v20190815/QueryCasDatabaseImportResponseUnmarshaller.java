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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseImportResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseImportResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseImportResponse.DataItem.ImportInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasDatabaseImportResponseUnmarshaller {

	public static QueryCasDatabaseImportResponse unmarshall(QueryCasDatabaseImportResponse queryCasDatabaseImportResponse, UnmarshallerContext _ctx) {
		
		queryCasDatabaseImportResponse.setRequestId(_ctx.stringValue("QueryCasDatabaseImportResponse.RequestId"));
		queryCasDatabaseImportResponse.setResultCode(_ctx.stringValue("QueryCasDatabaseImportResponse.ResultCode"));
		queryCasDatabaseImportResponse.setResultMessage(_ctx.stringValue("QueryCasDatabaseImportResponse.ResultMessage"));
		queryCasDatabaseImportResponse.setTotalCount(_ctx.longValue("QueryCasDatabaseImportResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasDatabaseImportResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDescription(_ctx.stringValue("QueryCasDatabaseImportResponse.Data["+ i +"].Description"));
			dataItem.setEngine(_ctx.stringValue("QueryCasDatabaseImportResponse.Data["+ i +"].Engine"));
			dataItem.setIaasId(_ctx.stringValue("QueryCasDatabaseImportResponse.Data["+ i +"].IaasId"));
			dataItem.setNetType(_ctx.stringValue("QueryCasDatabaseImportResponse.Data["+ i +"].NetType"));
			dataItem.setStatus(_ctx.stringValue("QueryCasDatabaseImportResponse.Data["+ i +"].Status"));
			dataItem.setType(_ctx.stringValue("QueryCasDatabaseImportResponse.Data["+ i +"].Type"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCasDatabaseImportResponse.Data["+ i +"].UtcCreate"));

			ImportInfo importInfo = new ImportInfo();
			importInfo.setImportedWorkspaceName(_ctx.stringValue("QueryCasDatabaseImportResponse.Data["+ i +"].ImportInfo.ImportedWorkspaceName"));
			importInfo.setIsImported(_ctx.booleanValue("QueryCasDatabaseImportResponse.Data["+ i +"].ImportInfo.IsImported"));
			importInfo.setIsUnimportable(_ctx.booleanValue("QueryCasDatabaseImportResponse.Data["+ i +"].ImportInfo.IsUnimportable"));
			importInfo.setUnimportableReason(_ctx.stringValue("QueryCasDatabaseImportResponse.Data["+ i +"].ImportInfo.UnimportableReason"));
			dataItem.setImportInfo(importInfo);

			data.add(dataItem);
		}
		queryCasDatabaseImportResponse.setData(data);
	 
	 	return queryCasDatabaseImportResponse;
	}
}