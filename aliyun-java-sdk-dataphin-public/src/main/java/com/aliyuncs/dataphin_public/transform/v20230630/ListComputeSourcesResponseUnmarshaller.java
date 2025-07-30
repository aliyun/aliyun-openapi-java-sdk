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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListComputeSourcesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListComputeSourcesResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListComputeSourcesResponse.PageResult.ComputeSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListComputeSourcesResponseUnmarshaller {

	public static ListComputeSourcesResponse unmarshall(ListComputeSourcesResponse listComputeSourcesResponse, UnmarshallerContext _ctx) {
		
		listComputeSourcesResponse.setRequestId(_ctx.stringValue("ListComputeSourcesResponse.RequestId"));
		listComputeSourcesResponse.setSuccess(_ctx.booleanValue("ListComputeSourcesResponse.Success"));
		listComputeSourcesResponse.setHttpStatusCode(_ctx.integerValue("ListComputeSourcesResponse.HttpStatusCode"));
		listComputeSourcesResponse.setCode(_ctx.stringValue("ListComputeSourcesResponse.Code"));
		listComputeSourcesResponse.setMessage(_ctx.stringValue("ListComputeSourcesResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListComputeSourcesResponse.PageResult.TotalCount"));

		List<ComputeSource> computeSourceList = new ArrayList<ComputeSource>();
		for (int i = 0; i < _ctx.lengthValue("ListComputeSourcesResponse.PageResult.ComputeSourceList.Length"); i++) {
			ComputeSource computeSource = new ComputeSource();
			computeSource.setOwner(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].Owner"));
			computeSource.setOwnerName(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].OwnerName"));
			computeSource.setBindProjectId(_ctx.longValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].BindProjectId"));
			computeSource.setDescription(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].Description"));
			computeSource.setBindProject(_ctx.booleanValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].BindProject"));
			computeSource.setGmtModified(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].GmtModified"));
			computeSource.setCreator(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].Creator"));
			computeSource.setName(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].Name"));
			computeSource.setGmtCreate(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].GmtCreate"));
			computeSource.setType(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].Type"));
			computeSource.setDisplayName(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].DisplayName"));
			computeSource.setId(_ctx.longValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].Id"));
			computeSource.setBindProjectName(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].BindProjectName"));
			computeSource.setCreatorName(_ctx.stringValue("ListComputeSourcesResponse.PageResult.ComputeSourceList["+ i +"].CreatorName"));

			computeSourceList.add(computeSource);
		}
		pageResult.setComputeSourceList(computeSourceList);
		listComputeSourcesResponse.setPageResult(pageResult);
	 
	 	return listComputeSourcesResponse;
	}
}