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

import com.aliyuncs.quickbi_public.model.v20220101.GetWorksEmbedListResponse;
import com.aliyuncs.quickbi_public.model.v20220101.GetWorksEmbedListResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.GetWorksEmbedListResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorksEmbedListResponseUnmarshaller {

	public static GetWorksEmbedListResponse unmarshall(GetWorksEmbedListResponse getWorksEmbedListResponse, UnmarshallerContext _ctx) {
		
		getWorksEmbedListResponse.setRequestId(_ctx.stringValue("GetWorksEmbedListResponse.RequestId"));
		getWorksEmbedListResponse.setSuccess(_ctx.booleanValue("GetWorksEmbedListResponse.Success"));

		Result result = new Result();
		result.setPageNo(_ctx.longValue("GetWorksEmbedListResponse.Result.PageNo"));
		result.setPageSize(_ctx.longValue("GetWorksEmbedListResponse.Result.PageSize"));
		result.setTotalNum(_ctx.longValue("GetWorksEmbedListResponse.Result.TotalNum"));
		result.setTotalPages(_ctx.longValue("GetWorksEmbedListResponse.Result.TotalPages"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetWorksEmbedListResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEmbedTime(_ctx.stringValue("GetWorksEmbedListResponse.Result.Data["+ i +"].EmbedTime"));
			dataItem.setWorksId(_ctx.stringValue("GetWorksEmbedListResponse.Result.Data["+ i +"].WorksId"));
			dataItem.setWorksName(_ctx.stringValue("GetWorksEmbedListResponse.Result.Data["+ i +"].WorksName"));
			dataItem.setWorksType(_ctx.stringValue("GetWorksEmbedListResponse.Result.Data["+ i +"].WorksType"));
			dataItem.setWorkspaceId(_ctx.stringValue("GetWorksEmbedListResponse.Result.Data["+ i +"].WorkspaceId"));

			data.add(dataItem);
		}
		result.setData(data);
		getWorksEmbedListResponse.setResult(result);
	 
	 	return getWorksEmbedListResponse;
	}
}