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

import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseSpecResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCasDatabaseSpecResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCasDatabaseSpecResponseUnmarshaller {

	public static QueryCasDatabaseSpecResponse unmarshall(QueryCasDatabaseSpecResponse queryCasDatabaseSpecResponse, UnmarshallerContext _ctx) {
		
		queryCasDatabaseSpecResponse.setRequestId(_ctx.stringValue("QueryCasDatabaseSpecResponse.RequestId"));
		queryCasDatabaseSpecResponse.setResultCode(_ctx.stringValue("QueryCasDatabaseSpecResponse.ResultCode"));
		queryCasDatabaseSpecResponse.setResultMessage(_ctx.stringValue("QueryCasDatabaseSpecResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCasDatabaseSpecResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCpu(_ctx.longValue("QueryCasDatabaseSpecResponse.Data["+ i +"].Cpu"));
			dataItem.setCustomStorage(_ctx.booleanValue("QueryCasDatabaseSpecResponse.Data["+ i +"].CustomStorage"));
			dataItem.setEngine(_ctx.stringValue("QueryCasDatabaseSpecResponse.Data["+ i +"].Engine"));
			dataItem.setIaasId(_ctx.stringValue("QueryCasDatabaseSpecResponse.Data["+ i +"].IaasId"));
			dataItem.setId(_ctx.stringValue("QueryCasDatabaseSpecResponse.Data["+ i +"].Id"));
			dataItem.setMaxConnections(_ctx.longValue("QueryCasDatabaseSpecResponse.Data["+ i +"].MaxConnections"));
			dataItem.setMaxIops(_ctx.longValue("QueryCasDatabaseSpecResponse.Data["+ i +"].MaxIops"));
			dataItem.setMaxStorage(_ctx.longValue("QueryCasDatabaseSpecResponse.Data["+ i +"].MaxStorage"));
			dataItem.setMemory(_ctx.longValue("QueryCasDatabaseSpecResponse.Data["+ i +"].Memory"));
			dataItem.setMinStorage(_ctx.longValue("QueryCasDatabaseSpecResponse.Data["+ i +"].MinStorage"));
			dataItem.setName(_ctx.stringValue("QueryCasDatabaseSpecResponse.Data["+ i +"].Name"));
			dataItem.setType(_ctx.stringValue("QueryCasDatabaseSpecResponse.Data["+ i +"].Type"));

			List<String> engineVersion = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseSpecResponse.Data["+ i +"].EngineVersion.Length"); j++) {
				engineVersion.add(_ctx.stringValue("QueryCasDatabaseSpecResponse.Data["+ i +"].EngineVersion["+ j +"]"));
			}
			dataItem.setEngineVersion(engineVersion);

			List<String> supportedStorages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryCasDatabaseSpecResponse.Data["+ i +"].SupportedStorages.Length"); j++) {
				supportedStorages.add(_ctx.stringValue("QueryCasDatabaseSpecResponse.Data["+ i +"].SupportedStorages["+ j +"]"));
			}
			dataItem.setSupportedStorages(supportedStorages);

			data.add(dataItem);
		}
		queryCasDatabaseSpecResponse.setData(data);
	 
	 	return queryCasDatabaseSpecResponse;
	}
}