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

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTablePartitionResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTablePartitionResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTablePartitionResponse.Data.DataEntityListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTablePartitionResponseUnmarshaller {

	public static GetMetaTablePartitionResponse unmarshall(GetMetaTablePartitionResponse getMetaTablePartitionResponse, UnmarshallerContext _ctx) {
		
		getMetaTablePartitionResponse.setRequestId(_ctx.stringValue("GetMetaTablePartitionResponse.RequestId"));
		getMetaTablePartitionResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTablePartitionResponse.HttpStatusCode"));
		getMetaTablePartitionResponse.setErrorMessage(_ctx.stringValue("GetMetaTablePartitionResponse.ErrorMessage"));
		getMetaTablePartitionResponse.setSuccess(_ctx.booleanValue("GetMetaTablePartitionResponse.Success"));
		getMetaTablePartitionResponse.setErrorCode(_ctx.stringValue("GetMetaTablePartitionResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("GetMetaTablePartitionResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetMetaTablePartitionResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("GetMetaTablePartitionResponse.Data.TotalCount"));

		List<DataEntityListItem> dataEntityList = new ArrayList<DataEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTablePartitionResponse.Data.DataEntityList.Length"); i++) {
			DataEntityListItem dataEntityListItem = new DataEntityListItem();
			dataEntityListItem.setPartitionPath(_ctx.stringValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].PartitionPath"));
			dataEntityListItem.setDataSize(_ctx.longValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].DataSize"));
			dataEntityListItem.setPartitionName(_ctx.stringValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].PartitionName"));
			dataEntityListItem.setComment(_ctx.stringValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].Comment"));
			dataEntityListItem.setModifiedTime(_ctx.longValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].ModifiedTime"));
			dataEntityListItem.setCreateTime(_ctx.longValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].CreateTime"));
			dataEntityListItem.setRecordCount(_ctx.longValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].RecordCount"));
			dataEntityListItem.setPartitionType(_ctx.stringValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].PartitionType"));
			dataEntityListItem.setPartitionGuid(_ctx.stringValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].PartitionGuid"));
			dataEntityListItem.setPartitionLocation(_ctx.stringValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].PartitionLocation"));
			dataEntityListItem.setTableGuid(_ctx.stringValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].TableGuid"));

			dataEntityList.add(dataEntityListItem);
		}
		data.setDataEntityList(dataEntityList);
		getMetaTablePartitionResponse.setData(data);
	 
	 	return getMetaTablePartitionResponse;
	}
}