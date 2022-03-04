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

import com.aliyuncs.quickbi_public.model.v20220101.ListFavoriteReportsResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListFavoriteReportsResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.ListFavoriteReportsResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFavoriteReportsResponseUnmarshaller {

	public static ListFavoriteReportsResponse unmarshall(ListFavoriteReportsResponse listFavoriteReportsResponse, UnmarshallerContext _ctx) {
		
		listFavoriteReportsResponse.setRequestId(_ctx.stringValue("ListFavoriteReportsResponse.RequestId"));
		listFavoriteReportsResponse.setSuccess(_ctx.booleanValue("ListFavoriteReportsResponse.Success"));

		Result result = new Result();
		result.setTotalNum(_ctx.integerValue("ListFavoriteReportsResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("ListFavoriteReportsResponse.Result.TotalPages"));
		result.setPageNum(_ctx.integerValue("ListFavoriteReportsResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("ListFavoriteReportsResponse.Result.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFavoriteReportsResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTreeId(_ctx.stringValue("ListFavoriteReportsResponse.Result.Data["+ i +"].TreeId"));
			dataItem.setType(_ctx.stringValue("ListFavoriteReportsResponse.Result.Data["+ i +"].Type"));
			dataItem.setName(_ctx.stringValue("ListFavoriteReportsResponse.Result.Data["+ i +"].Name"));
			dataItem.setOwnerNum(_ctx.stringValue("ListFavoriteReportsResponse.Result.Data["+ i +"].OwnerNum"));
			dataItem.setOwnerName(_ctx.stringValue("ListFavoriteReportsResponse.Result.Data["+ i +"].OwnerName"));
			dataItem.setGmtCreate(_ctx.stringValue("ListFavoriteReportsResponse.Result.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListFavoriteReportsResponse.Result.Data["+ i +"].GmtModified"));
			dataItem.setPublishStatus(_ctx.integerValue("ListFavoriteReportsResponse.Result.Data["+ i +"].PublishStatus"));
			dataItem.setFavorite(_ctx.booleanValue("ListFavoriteReportsResponse.Result.Data["+ i +"].Favorite"));
			dataItem.setHasViewAuth(_ctx.booleanValue("ListFavoriteReportsResponse.Result.Data["+ i +"].HasViewAuth"));
			dataItem.setHasEditAuth(_ctx.booleanValue("ListFavoriteReportsResponse.Result.Data["+ i +"].HasEditAuth"));
			dataItem.setWorkspaceId(_ctx.stringValue("ListFavoriteReportsResponse.Result.Data["+ i +"].WorkspaceId"));
			dataItem.setWorkspaceName(_ctx.stringValue("ListFavoriteReportsResponse.Result.Data["+ i +"].WorkspaceName"));

			data.add(dataItem);
		}
		result.setData(data);
		listFavoriteReportsResponse.setResult(result);
	 
	 	return listFavoriteReportsResponse;
	}
}