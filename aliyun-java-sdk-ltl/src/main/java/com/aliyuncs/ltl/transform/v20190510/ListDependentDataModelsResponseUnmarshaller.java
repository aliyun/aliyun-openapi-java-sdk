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

package com.aliyuncs.ltl.transform.v20190510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ltl.model.v20190510.ListDependentDataModelsResponse;
import com.aliyuncs.ltl.model.v20190510.ListDependentDataModelsResponse.DataModelInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDependentDataModelsResponseUnmarshaller {

	public static ListDependentDataModelsResponse unmarshall(ListDependentDataModelsResponse listDependentDataModelsResponse, UnmarshallerContext _ctx) {
		
		listDependentDataModelsResponse.setRequestId(_ctx.stringValue("ListDependentDataModelsResponse.RequestId"));
		listDependentDataModelsResponse.setCode(_ctx.integerValue("ListDependentDataModelsResponse.Code"));
		listDependentDataModelsResponse.setMessage(_ctx.stringValue("ListDependentDataModelsResponse.Message"));
		listDependentDataModelsResponse.setSuccess(_ctx.booleanValue("ListDependentDataModelsResponse.Success"));

		List<DataModelInfo> data = new ArrayList<DataModelInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDependentDataModelsResponse.Data.Length"); i++) {
			DataModelInfo dataModelInfo = new DataModelInfo();
			dataModelInfo.setDataModelCode(_ctx.stringValue("ListDependentDataModelsResponse.Data["+ i +"].DataModelCode"));
			dataModelInfo.setDataModelName(_ctx.stringValue("ListDependentDataModelsResponse.Data["+ i +"].DataModelName"));

			data.add(dataModelInfo);
		}
		listDependentDataModelsResponse.setData(data);
	 
	 	return listDependentDataModelsResponse;
	}
}