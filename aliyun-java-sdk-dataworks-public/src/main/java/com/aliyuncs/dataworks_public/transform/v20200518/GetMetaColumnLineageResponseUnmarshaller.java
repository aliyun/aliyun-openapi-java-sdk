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

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaColumnLineageResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaColumnLineageResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaColumnLineageResponse.Data.DataEntityListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaColumnLineageResponseUnmarshaller {

	public static GetMetaColumnLineageResponse unmarshall(GetMetaColumnLineageResponse getMetaColumnLineageResponse, UnmarshallerContext _ctx) {
		
		getMetaColumnLineageResponse.setRequestId(_ctx.stringValue("GetMetaColumnLineageResponse.RequestId"));
		getMetaColumnLineageResponse.setErrorCode(_ctx.stringValue("GetMetaColumnLineageResponse.ErrorCode"));
		getMetaColumnLineageResponse.setErrorMessage(_ctx.stringValue("GetMetaColumnLineageResponse.ErrorMessage"));
		getMetaColumnLineageResponse.setHttpStatusCode(_ctx.integerValue("GetMetaColumnLineageResponse.HttpStatusCode"));
		getMetaColumnLineageResponse.setSuccess(_ctx.booleanValue("GetMetaColumnLineageResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("GetMetaColumnLineageResponse.Data.TotalCount"));
		data.setPageNum(_ctx.integerValue("GetMetaColumnLineageResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("GetMetaColumnLineageResponse.Data.PageSize"));

		List<DataEntityListItem> dataEntityList = new ArrayList<DataEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaColumnLineageResponse.Data.DataEntityList.Length"); i++) {
			DataEntityListItem dataEntityListItem = new DataEntityListItem();
			dataEntityListItem.setColumnName(_ctx.stringValue("GetMetaColumnLineageResponse.Data.DataEntityList["+ i +"].ColumnName"));
			dataEntityListItem.setColumnGuid(_ctx.stringValue("GetMetaColumnLineageResponse.Data.DataEntityList["+ i +"].ColumnGuid"));
			dataEntityListItem.setClusterId(_ctx.stringValue("GetMetaColumnLineageResponse.Data.DataEntityList["+ i +"].ClusterId"));
			dataEntityListItem.setDatabaseName(_ctx.stringValue("GetMetaColumnLineageResponse.Data.DataEntityList["+ i +"].DatabaseName"));
			dataEntityListItem.setTableName(_ctx.stringValue("GetMetaColumnLineageResponse.Data.DataEntityList["+ i +"].TableName"));

			dataEntityList.add(dataEntityListItem);
		}
		data.setDataEntityList(dataEntityList);
		getMetaColumnLineageResponse.setData(data);
	 
	 	return getMetaColumnLineageResponse;
	}
}