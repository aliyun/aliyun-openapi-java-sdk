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
		getMetaTablePartitionResponse.setErrorCode(_ctx.stringValue("GetMetaTablePartitionResponse.ErrorCode"));
		getMetaTablePartitionResponse.setErrorMessage(_ctx.stringValue("GetMetaTablePartitionResponse.ErrorMessage"));
		getMetaTablePartitionResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTablePartitionResponse.HttpStatusCode"));
		getMetaTablePartitionResponse.setSuccess(_ctx.booleanValue("GetMetaTablePartitionResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("GetMetaTablePartitionResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetMetaTablePartitionResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("GetMetaTablePartitionResponse.Data.TotalCount"));

		List<DataEntityListItem> dataEntityList = new ArrayList<DataEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTablePartitionResponse.Data.DataEntityList.Length"); i++) {
			DataEntityListItem dataEntityListItem = new DataEntityListItem();
			dataEntityListItem.setPartitionGuid(_ctx.stringValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].PartitionGuid"));
			dataEntityListItem.setPartitionName(_ctx.stringValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].PartitionName"));
			dataEntityListItem.setCreateTime(_ctx.longValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].CreateTime"));
			dataEntityListItem.setDataSize(_ctx.longValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].DataSize"));
			dataEntityListItem.setRecordCount(_ctx.longValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].RecordCount"));
			dataEntityListItem.setModifiedTime(_ctx.longValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].ModifiedTime"));
			dataEntityListItem.setTableGuid(_ctx.stringValue("GetMetaTablePartitionResponse.Data.DataEntityList["+ i +"].TableGuid"));

			dataEntityList.add(dataEntityListItem);
		}
		data.setDataEntityList(dataEntityList);
		getMetaTablePartitionResponse.setData(data);
	 
	 	return getMetaTablePartitionResponse;
	}
}