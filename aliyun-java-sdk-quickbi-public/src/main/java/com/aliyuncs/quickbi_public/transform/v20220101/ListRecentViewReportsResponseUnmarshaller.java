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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.ListRecentViewReportsResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListRecentViewReportsResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.ListRecentViewReportsResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecentViewReportsResponseUnmarshaller {

	public static ListRecentViewReportsResponse unmarshall(ListRecentViewReportsResponse listRecentViewReportsResponse, UnmarshallerContext _ctx) {
		
		listRecentViewReportsResponse.setRequestId(_ctx.stringValue("ListRecentViewReportsResponse.RequestId"));
		listRecentViewReportsResponse.setSuccess(_ctx.booleanValue("ListRecentViewReportsResponse.Success"));

		Result result = new Result();
		result.setTotalNum(_ctx.integerValue("ListRecentViewReportsResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("ListRecentViewReportsResponse.Result.TotalPages"));
		result.setPageNum(_ctx.integerValue("ListRecentViewReportsResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("ListRecentViewReportsResponse.Result.PageSize"));
		result.setAttention(_ctx.stringValue("ListRecentViewReportsResponse.Result.Attention"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRecentViewReportsResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTreeId(_ctx.stringValue("ListRecentViewReportsResponse.Result.Data["+ i +"].TreeId"));
			dataItem.setType(_ctx.stringValue("ListRecentViewReportsResponse.Result.Data["+ i +"].Type"));
			dataItem.setName(_ctx.stringValue("ListRecentViewReportsResponse.Result.Data["+ i +"].Name"));
			dataItem.setOwnerNum(_ctx.stringValue("ListRecentViewReportsResponse.Result.Data["+ i +"].OwnerNum"));
			dataItem.setOwnerName(_ctx.stringValue("ListRecentViewReportsResponse.Result.Data["+ i +"].OwnerName"));
			dataItem.setGmtCreate(_ctx.stringValue("ListRecentViewReportsResponse.Result.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListRecentViewReportsResponse.Result.Data["+ i +"].GmtModified"));
			dataItem.setPublishStatus(_ctx.integerValue("ListRecentViewReportsResponse.Result.Data["+ i +"].PublishStatus"));
			dataItem.setFavorite(_ctx.booleanValue("ListRecentViewReportsResponse.Result.Data["+ i +"].Favorite"));
			dataItem.setHasViewAuth(_ctx.booleanValue("ListRecentViewReportsResponse.Result.Data["+ i +"].HasViewAuth"));
			dataItem.setHasEditAuth(_ctx.booleanValue("ListRecentViewReportsResponse.Result.Data["+ i +"].HasEditAuth"));
			dataItem.setWorkspaceId(_ctx.stringValue("ListRecentViewReportsResponse.Result.Data["+ i +"].WorkspaceId"));
			dataItem.setWorkspaceName(_ctx.stringValue("ListRecentViewReportsResponse.Result.Data["+ i +"].WorkspaceName"));
			dataItem.setViewCount(_ctx.longValue("ListRecentViewReportsResponse.Result.Data["+ i +"].ViewCount"));
			dataItem.setLatestViewTime(_ctx.stringValue("ListRecentViewReportsResponse.Result.Data["+ i +"].LatestViewTime"));

			data.add(dataItem);
		}
		result.setData(data);
		listRecentViewReportsResponse.setResult(result);
	 
	 	return listRecentViewReportsResponse;
	}
}