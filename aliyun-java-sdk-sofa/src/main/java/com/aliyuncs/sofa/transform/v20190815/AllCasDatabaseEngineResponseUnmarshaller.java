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

import com.aliyuncs.sofa.model.v20190815.AllCasDatabaseEngineResponse;
import com.aliyuncs.sofa.model.v20190815.AllCasDatabaseEngineResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllCasDatabaseEngineResponseUnmarshaller {

	public static AllCasDatabaseEngineResponse unmarshall(AllCasDatabaseEngineResponse allCasDatabaseEngineResponse, UnmarshallerContext _ctx) {
		
		allCasDatabaseEngineResponse.setRequestId(_ctx.stringValue("AllCasDatabaseEngineResponse.RequestId"));
		allCasDatabaseEngineResponse.setResultCode(_ctx.stringValue("AllCasDatabaseEngineResponse.ResultCode"));
		allCasDatabaseEngineResponse.setResultMessage(_ctx.stringValue("AllCasDatabaseEngineResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("AllCasDatabaseEngineResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEngine(_ctx.stringValue("AllCasDatabaseEngineResponse.Data["+ i +"].Engine"));
			dataItem.setIaasType(_ctx.stringValue("AllCasDatabaseEngineResponse.Data["+ i +"].IaasType"));

			List<String> engineVersions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AllCasDatabaseEngineResponse.Data["+ i +"].EngineVersions.Length"); j++) {
				engineVersions.add(_ctx.stringValue("AllCasDatabaseEngineResponse.Data["+ i +"].EngineVersions["+ j +"]"));
			}
			dataItem.setEngineVersions(engineVersions);

			data.add(dataItem);
		}
		allCasDatabaseEngineResponse.setData(data);
	 
	 	return allCasDatabaseEngineResponse;
	}
}