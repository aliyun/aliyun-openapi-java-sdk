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

import com.aliyuncs.quickbi_public.model.v20220101.ListAccelerationOfWorkspaceResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListAccelerationOfWorkspaceResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.ListAccelerationOfWorkspaceResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccelerationOfWorkspaceResponseUnmarshaller {

	public static ListAccelerationOfWorkspaceResponse unmarshall(ListAccelerationOfWorkspaceResponse listAccelerationOfWorkspaceResponse, UnmarshallerContext _ctx) {
		
		listAccelerationOfWorkspaceResponse.setRequestId(_ctx.stringValue("ListAccelerationOfWorkspaceResponse.RequestId"));
		listAccelerationOfWorkspaceResponse.setSuccess(_ctx.booleanValue("ListAccelerationOfWorkspaceResponse.Success"));

		Result result = new Result();
		result.setTotalPages(_ctx.integerValue("ListAccelerationOfWorkspaceResponse.Result.TotalPages"));
		result.setTotalNum(_ctx.integerValue("ListAccelerationOfWorkspaceResponse.Result.TotalNum"));
		result.setPageNum(_ctx.integerValue("ListAccelerationOfWorkspaceResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("ListAccelerationOfWorkspaceResponse.Result.PageSize"));
		result.setPre(_ctx.integerValue("ListAccelerationOfWorkspaceResponse.Result.Pre"));
		result.setNext(_ctx.integerValue("ListAccelerationOfWorkspaceResponse.Result.Next"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAccelerationOfWorkspaceResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCubeId(_ctx.stringValue("ListAccelerationOfWorkspaceResponse.Result.Data["+ i +"].CubeId"));
			dataItem.setCubeName(_ctx.stringValue("ListAccelerationOfWorkspaceResponse.Result.Data["+ i +"].CubeName"));
			dataItem.setCreatorName(_ctx.stringValue("ListAccelerationOfWorkspaceResponse.Result.Data["+ i +"].CreatorName"));
			dataItem.setSize(_ctx.stringValue("ListAccelerationOfWorkspaceResponse.Result.Data["+ i +"].Size"));
			dataItem.setLastModifyTime(_ctx.stringValue("ListAccelerationOfWorkspaceResponse.Result.Data["+ i +"].LastModifyTime"));
			dataItem.setEnableQuickindexTime(_ctx.stringValue("ListAccelerationOfWorkspaceResponse.Result.Data["+ i +"].EnableQuickindexTime"));
			dataItem.setJobId(_ctx.stringValue("ListAccelerationOfWorkspaceResponse.Result.Data["+ i +"].JobId"));
			dataItem.setJobStatus(_ctx.integerValue("ListAccelerationOfWorkspaceResponse.Result.Data["+ i +"].JobStatus"));
			dataItem.setJobHistoryId(_ctx.stringValue("ListAccelerationOfWorkspaceResponse.Result.Data["+ i +"].JobHistoryId"));

			data.add(dataItem);
		}
		result.setData(data);
		listAccelerationOfWorkspaceResponse.setResult(result);
	 
	 	return listAccelerationOfWorkspaceResponse;
	}
}