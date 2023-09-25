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

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableChangeLogResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableChangeLogResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableChangeLogResponse.Data.DataEntityListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableChangeLogResponseUnmarshaller {

	public static GetMetaTableChangeLogResponse unmarshall(GetMetaTableChangeLogResponse getMetaTableChangeLogResponse, UnmarshallerContext _ctx) {
		
		getMetaTableChangeLogResponse.setRequestId(_ctx.stringValue("GetMetaTableChangeLogResponse.RequestId"));
		getMetaTableChangeLogResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTableChangeLogResponse.HttpStatusCode"));
		getMetaTableChangeLogResponse.setErrorMessage(_ctx.stringValue("GetMetaTableChangeLogResponse.ErrorMessage"));
		getMetaTableChangeLogResponse.setSuccess(_ctx.booleanValue("GetMetaTableChangeLogResponse.Success"));
		getMetaTableChangeLogResponse.setErrorCode(_ctx.stringValue("GetMetaTableChangeLogResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("GetMetaTableChangeLogResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetMetaTableChangeLogResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("GetMetaTableChangeLogResponse.Data.TotalCount"));

		List<DataEntityListItem> dataEntityList = new ArrayList<DataEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableChangeLogResponse.Data.DataEntityList.Length"); i++) {
			DataEntityListItem dataEntityListItem = new DataEntityListItem();
			dataEntityListItem.setObjectType(_ctx.stringValue("GetMetaTableChangeLogResponse.Data.DataEntityList["+ i +"].ObjectType"));
			dataEntityListItem.setModifiedTime(_ctx.longValue("GetMetaTableChangeLogResponse.Data.DataEntityList["+ i +"].ModifiedTime"));
			dataEntityListItem.setCreateTime(_ctx.longValue("GetMetaTableChangeLogResponse.Data.DataEntityList["+ i +"].CreateTime"));
			dataEntityListItem.setChangeContent(_ctx.stringValue("GetMetaTableChangeLogResponse.Data.DataEntityList["+ i +"].ChangeContent"));
			dataEntityListItem.setOperator(_ctx.stringValue("GetMetaTableChangeLogResponse.Data.DataEntityList["+ i +"].Operator"));
			dataEntityListItem.setChangeType(_ctx.stringValue("GetMetaTableChangeLogResponse.Data.DataEntityList["+ i +"].ChangeType"));

			dataEntityList.add(dataEntityListItem);
		}
		data.setDataEntityList(dataEntityList);
		getMetaTableChangeLogResponse.setData(data);
	 
	 	return getMetaTableChangeLogResponse;
	}
}