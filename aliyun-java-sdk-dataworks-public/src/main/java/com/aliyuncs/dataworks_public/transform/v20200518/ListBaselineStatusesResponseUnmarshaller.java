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

import com.aliyuncs.dataworks_public.model.v20200518.ListBaselineStatusesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListBaselineStatusesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListBaselineStatusesResponse.Data.BaselineStatusesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBaselineStatusesResponseUnmarshaller {

	public static ListBaselineStatusesResponse unmarshall(ListBaselineStatusesResponse listBaselineStatusesResponse, UnmarshallerContext _ctx) {
		
		listBaselineStatusesResponse.setRequestId(_ctx.stringValue("ListBaselineStatusesResponse.RequestId"));
		listBaselineStatusesResponse.setHttpStatusCode(_ctx.integerValue("ListBaselineStatusesResponse.HttpStatusCode"));
		listBaselineStatusesResponse.setErrorMessage(_ctx.stringValue("ListBaselineStatusesResponse.ErrorMessage"));
		listBaselineStatusesResponse.setErrorCode(_ctx.stringValue("ListBaselineStatusesResponse.ErrorCode"));
		listBaselineStatusesResponse.setSuccess(_ctx.booleanValue("ListBaselineStatusesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListBaselineStatusesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListBaselineStatusesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListBaselineStatusesResponse.Data.TotalCount"));

		List<BaselineStatusesItem> baselineStatuses = new ArrayList<BaselineStatusesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBaselineStatusesResponse.Data.BaselineStatuses.Length"); i++) {
			BaselineStatusesItem baselineStatusesItem = new BaselineStatusesItem();
			baselineStatusesItem.setStatus(_ctx.stringValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].Status"));
			baselineStatusesItem.setOwner(_ctx.stringValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].Owner"));
			baselineStatusesItem.setFinishTime(_ctx.longValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].FinishTime"));
			baselineStatusesItem.setProjectId(_ctx.longValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].ProjectId"));
			baselineStatusesItem.setPriority(_ctx.integerValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].Priority"));
			baselineStatusesItem.setEndCast(_ctx.longValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].EndCast"));
			baselineStatusesItem.setInGroupId(_ctx.integerValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].InGroupId"));
			baselineStatusesItem.setBaselineName(_ctx.stringValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].BaselineName"));
			baselineStatusesItem.setBaselineId(_ctx.longValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].BaselineId"));
			baselineStatusesItem.setFinishStatus(_ctx.stringValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].FinishStatus"));
			baselineStatusesItem.setBizdate(_ctx.longValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].Bizdate"));
			baselineStatusesItem.setBuffer(_ctx.longValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].Buffer"));
			baselineStatusesItem.setSlaTime(_ctx.longValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].SlaTime"));
			baselineStatusesItem.setExpTime(_ctx.longValue("ListBaselineStatusesResponse.Data.BaselineStatuses["+ i +"].ExpTime"));

			baselineStatuses.add(baselineStatusesItem);
		}
		data.setBaselineStatuses(baselineStatuses);
		listBaselineStatusesResponse.setData(data);
	 
	 	return listBaselineStatusesResponse;
	}
}