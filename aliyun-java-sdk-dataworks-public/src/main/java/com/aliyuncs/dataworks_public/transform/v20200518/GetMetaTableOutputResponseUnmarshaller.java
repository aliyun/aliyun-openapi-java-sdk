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

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableOutputResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableOutputResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableOutputResponse.Data.DataEntityListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableOutputResponseUnmarshaller {

	public static GetMetaTableOutputResponse unmarshall(GetMetaTableOutputResponse getMetaTableOutputResponse, UnmarshallerContext _ctx) {
		
		getMetaTableOutputResponse.setRequestId(_ctx.stringValue("GetMetaTableOutputResponse.RequestId"));
		getMetaTableOutputResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTableOutputResponse.HttpStatusCode"));
		getMetaTableOutputResponse.setErrorMessage(_ctx.stringValue("GetMetaTableOutputResponse.ErrorMessage"));
		getMetaTableOutputResponse.setSuccess(_ctx.booleanValue("GetMetaTableOutputResponse.Success"));
		getMetaTableOutputResponse.setErrorCode(_ctx.stringValue("GetMetaTableOutputResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("GetMetaTableOutputResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetMetaTableOutputResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("GetMetaTableOutputResponse.Data.TotalCount"));

		List<DataEntityListItem> dataEntityList = new ArrayList<DataEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableOutputResponse.Data.DataEntityList.Length"); i++) {
			DataEntityListItem dataEntityListItem = new DataEntityListItem();
			dataEntityListItem.setEndTime(_ctx.stringValue("GetMetaTableOutputResponse.Data.DataEntityList["+ i +"].EndTime"));
			dataEntityListItem.setTaskInstanceId(_ctx.longValue("GetMetaTableOutputResponse.Data.DataEntityList["+ i +"].TaskInstanceId"));
			dataEntityListItem.setStartTime(_ctx.stringValue("GetMetaTableOutputResponse.Data.DataEntityList["+ i +"].StartTime"));
			dataEntityListItem.setProjectId(_ctx.longValue("GetMetaTableOutputResponse.Data.DataEntityList["+ i +"].ProjectId"));
			dataEntityListItem.setWaitTime(_ctx.stringValue("GetMetaTableOutputResponse.Data.DataEntityList["+ i +"].WaitTime"));
			dataEntityListItem.setTableGuid(_ctx.stringValue("GetMetaTableOutputResponse.Data.DataEntityList["+ i +"].TableGuid"));
			dataEntityListItem.setTaskId(_ctx.stringValue("GetMetaTableOutputResponse.Data.DataEntityList["+ i +"].TaskId"));

			dataEntityList.add(dataEntityListItem);
		}
		data.setDataEntityList(dataEntityList);
		getMetaTableOutputResponse.setData(data);
	 
	 	return getMetaTableOutputResponse;
	}
}