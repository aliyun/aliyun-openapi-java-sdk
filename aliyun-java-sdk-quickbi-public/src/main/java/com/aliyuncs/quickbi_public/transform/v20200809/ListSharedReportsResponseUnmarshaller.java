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

package com.aliyuncs.quickbi_public.transform.v20200809;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200809.ListSharedReportsResponse;
import com.aliyuncs.quickbi_public.model.v20200809.ListSharedReportsResponse.Result;
import com.aliyuncs.quickbi_public.model.v20200809.ListSharedReportsResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSharedReportsResponseUnmarshaller {

	public static ListSharedReportsResponse unmarshall(ListSharedReportsResponse listSharedReportsResponse, UnmarshallerContext _ctx) {
		
		listSharedReportsResponse.setRequestId(_ctx.stringValue("ListSharedReportsResponse.RequestId"));
		listSharedReportsResponse.setSuccess(_ctx.booleanValue("ListSharedReportsResponse.Success"));

		Result result = new Result();
		result.setTotalNum(_ctx.integerValue("ListSharedReportsResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.integerValue("ListSharedReportsResponse.Result.TotalPages"));
		result.setPageNum(_ctx.integerValue("ListSharedReportsResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("ListSharedReportsResponse.Result.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSharedReportsResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTreeId(_ctx.stringValue("ListSharedReportsResponse.Result.Data["+ i +"].TreeId"));
			dataItem.setType(_ctx.stringValue("ListSharedReportsResponse.Result.Data["+ i +"].Type"));
			dataItem.setName(_ctx.stringValue("ListSharedReportsResponse.Result.Data["+ i +"].Name"));
			dataItem.setOwnerNum(_ctx.stringValue("ListSharedReportsResponse.Result.Data["+ i +"].OwnerNum"));
			dataItem.setOwnerName(_ctx.stringValue("ListSharedReportsResponse.Result.Data["+ i +"].OwnerName"));
			dataItem.setGmtCreate(_ctx.stringValue("ListSharedReportsResponse.Result.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListSharedReportsResponse.Result.Data["+ i +"].GmtModified"));
			dataItem.setPublishStatus(_ctx.integerValue("ListSharedReportsResponse.Result.Data["+ i +"].PublishStatus"));
			dataItem.setFavorite(_ctx.booleanValue("ListSharedReportsResponse.Result.Data["+ i +"].Favorite"));
			dataItem.setHasViewAuth(_ctx.booleanValue("ListSharedReportsResponse.Result.Data["+ i +"].HasViewAuth"));
			dataItem.setHasEditAuth(_ctx.booleanValue("ListSharedReportsResponse.Result.Data["+ i +"].HasEditAuth"));
			dataItem.setWorkspaceId(_ctx.stringValue("ListSharedReportsResponse.Result.Data["+ i +"].WorkspaceId"));
			dataItem.setWorkspaceName(_ctx.stringValue("ListSharedReportsResponse.Result.Data["+ i +"].WorkspaceName"));

			data.add(dataItem);
		}
		result.setData(data);
		listSharedReportsResponse.setResult(result);
	 
	 	return listSharedReportsResponse;
	}
}