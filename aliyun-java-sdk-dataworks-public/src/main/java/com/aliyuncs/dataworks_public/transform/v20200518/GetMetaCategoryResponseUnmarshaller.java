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

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaCategoryResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaCategoryResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaCategoryResponse.Data.DataEntityListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaCategoryResponseUnmarshaller {

	public static GetMetaCategoryResponse unmarshall(GetMetaCategoryResponse getMetaCategoryResponse, UnmarshallerContext _ctx) {
		
		getMetaCategoryResponse.setRequestId(_ctx.stringValue("GetMetaCategoryResponse.RequestId"));
		getMetaCategoryResponse.setHttpStatusCode(_ctx.integerValue("GetMetaCategoryResponse.HttpStatusCode"));
		getMetaCategoryResponse.setErrorMessage(_ctx.stringValue("GetMetaCategoryResponse.ErrorMessage"));
		getMetaCategoryResponse.setSuccess(_ctx.booleanValue("GetMetaCategoryResponse.Success"));
		getMetaCategoryResponse.setErrorCode(_ctx.stringValue("GetMetaCategoryResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("GetMetaCategoryResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("GetMetaCategoryResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("GetMetaCategoryResponse.Data.TotalCount"));

		List<DataEntityListItem> dataEntityList = new ArrayList<DataEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaCategoryResponse.Data.DataEntityList.Length"); i++) {
			DataEntityListItem dataEntityListItem = new DataEntityListItem();
			dataEntityListItem.setDepth(_ctx.integerValue("GetMetaCategoryResponse.Data.DataEntityList["+ i +"].Depth"));
			dataEntityListItem.setComment(_ctx.stringValue("GetMetaCategoryResponse.Data.DataEntityList["+ i +"].Comment"));
			dataEntityListItem.setModifiedTime(_ctx.longValue("GetMetaCategoryResponse.Data.DataEntityList["+ i +"].ModifiedTime"));
			dataEntityListItem.setCreateTime(_ctx.longValue("GetMetaCategoryResponse.Data.DataEntityList["+ i +"].CreateTime"));
			dataEntityListItem.setCategoryId(_ctx.longValue("GetMetaCategoryResponse.Data.DataEntityList["+ i +"].CategoryId"));
			dataEntityListItem.setLastOperatorId(_ctx.stringValue("GetMetaCategoryResponse.Data.DataEntityList["+ i +"].LastOperatorId"));
			dataEntityListItem.setName(_ctx.stringValue("GetMetaCategoryResponse.Data.DataEntityList["+ i +"].Name"));
			dataEntityListItem.setParentCategoryId(_ctx.longValue("GetMetaCategoryResponse.Data.DataEntityList["+ i +"].ParentCategoryId"));
			dataEntityListItem.setOwnerId(_ctx.stringValue("GetMetaCategoryResponse.Data.DataEntityList["+ i +"].OwnerId"));

			dataEntityList.add(dataEntityListItem);
		}
		data.setDataEntityList(dataEntityList);
		getMetaCategoryResponse.setData(data);
	 
	 	return getMetaCategoryResponse;
	}
}