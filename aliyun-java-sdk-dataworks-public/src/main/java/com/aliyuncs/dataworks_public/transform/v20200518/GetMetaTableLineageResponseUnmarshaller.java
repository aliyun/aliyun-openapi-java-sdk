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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableLineageResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableLineageResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableLineageResponse.Data.DataEntityListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableLineageResponseUnmarshaller {

	public static GetMetaTableLineageResponse unmarshall(GetMetaTableLineageResponse getMetaTableLineageResponse, UnmarshallerContext _ctx) {
		
		getMetaTableLineageResponse.setRequestId(_ctx.stringValue("GetMetaTableLineageResponse.RequestId"));
		getMetaTableLineageResponse.setErrorCode(_ctx.stringValue("GetMetaTableLineageResponse.ErrorCode"));
		getMetaTableLineageResponse.setErrorMessage(_ctx.stringValue("GetMetaTableLineageResponse.ErrorMessage"));
		getMetaTableLineageResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTableLineageResponse.HttpStatusCode"));
		getMetaTableLineageResponse.setSuccess(_ctx.booleanValue("GetMetaTableLineageResponse.Success"));

		Data data = new Data();
		data.setHasNext(_ctx.booleanValue("GetMetaTableLineageResponse.Data.HasNext"));
		data.setNextPrimaryKey(_ctx.stringValue("GetMetaTableLineageResponse.Data.NextPrimaryKey"));

		List<DataEntityListItem> dataEntityList = new ArrayList<DataEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableLineageResponse.Data.DataEntityList.Length"); i++) {
			DataEntityListItem dataEntityListItem = new DataEntityListItem();
			dataEntityListItem.setTableName(_ctx.stringValue("GetMetaTableLineageResponse.Data.DataEntityList["+ i +"].TableName"));
			dataEntityListItem.setTableGuid(_ctx.stringValue("GetMetaTableLineageResponse.Data.DataEntityList["+ i +"].TableGuid"));

			dataEntityList.add(dataEntityListItem);
		}
		data.setDataEntityList(dataEntityList);
		getMetaTableLineageResponse.setData(data);
	 
	 	return getMetaTableLineageResponse;
	}
}