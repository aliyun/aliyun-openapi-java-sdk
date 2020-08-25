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

import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceImportResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceImportResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCasLoadbalanceImportResponse.DataItem.ImportInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasLoadbalanceImportResponseUnmarshaller {

	public static QueryCasLoadbalanceImportResponse unmarshall(QueryCasLoadbalanceImportResponse queryCasLoadbalanceImportResponse, UnmarshallerContext _ctx) {
		
		queryCasLoadbalanceImportResponse.setRequestId(_ctx.stringValue("QueryCasLoadbalanceImportResponse.RequestId"));
		queryCasLoadbalanceImportResponse.setResultCode(_ctx.stringValue("QueryCasLoadbalanceImportResponse.ResultCode"));
		queryCasLoadbalanceImportResponse.setResultMessage(_ctx.stringValue("QueryCasLoadbalanceImportResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasLoadbalanceImportResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIaasId(_ctx.stringValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].IaasId"));
			dataItem.setName(_ctx.stringValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].Name"));
			dataItem.setNetworkType(_ctx.stringValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].NetworkType"));
			dataItem.setUtcCreate(_ctx.stringValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].UtcCreate"));

			List<String> innerIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].InnerIpAddress.Length"); j++) {
				innerIpAddress.add(_ctx.stringValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].InnerIpAddress["+ j +"]"));
			}
			dataItem.setInnerIpAddress(innerIpAddress);

			List<String> publicIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].PublicIpAddress.Length"); j++) {
				publicIpAddress.add(_ctx.stringValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].PublicIpAddress["+ j +"]"));
			}
			dataItem.setPublicIpAddress(publicIpAddress);

			ImportInfo importInfo = new ImportInfo();
			importInfo.setImportedWorkspaceName(_ctx.stringValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].ImportInfo.ImportedWorkspaceName"));
			importInfo.setIsImported(_ctx.booleanValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].ImportInfo.IsImported"));
			importInfo.setIsUnimportable(_ctx.booleanValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].ImportInfo.IsUnimportable"));
			importInfo.setUnimportableReason(_ctx.stringValue("QueryCasLoadbalanceImportResponse.Data["+ i +"].ImportInfo.UnimportableReason"));
			dataItem.setImportInfo(importInfo);

			data.add(dataItem);
		}
		queryCasLoadbalanceImportResponse.setData(data);
	 
	 	return queryCasLoadbalanceImportResponse;
	}
}