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

import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskVersionsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskVersionsResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetBatchTaskVersionsResponse.Data.BatchTaskVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBatchTaskVersionsResponseUnmarshaller {

	public static GetBatchTaskVersionsResponse unmarshall(GetBatchTaskVersionsResponse getBatchTaskVersionsResponse, UnmarshallerContext _ctx) {
		
		getBatchTaskVersionsResponse.setRequestId(_ctx.stringValue("GetBatchTaskVersionsResponse.RequestId"));
		getBatchTaskVersionsResponse.setSuccess(_ctx.booleanValue("GetBatchTaskVersionsResponse.Success"));
		getBatchTaskVersionsResponse.setHttpStatusCode(_ctx.integerValue("GetBatchTaskVersionsResponse.HttpStatusCode"));
		getBatchTaskVersionsResponse.setCode(_ctx.stringValue("GetBatchTaskVersionsResponse.Code"));
		getBatchTaskVersionsResponse.setMessage(_ctx.stringValue("GetBatchTaskVersionsResponse.Message"));

		Data data = new Data();

		List<BatchTaskVersion> batchTaskVersionList = new ArrayList<BatchTaskVersion>();
		for (int i = 0; i < _ctx.lengthValue("GetBatchTaskVersionsResponse.Data.BatchTaskVersionList.Length"); i++) {
			BatchTaskVersion batchTaskVersion = new BatchTaskVersion();
			batchTaskVersion.setNodeId(_ctx.stringValue("GetBatchTaskVersionsResponse.Data.BatchTaskVersionList["+ i +"].NodeId"));
			batchTaskVersion.setVersion(_ctx.stringValue("GetBatchTaskVersionsResponse.Data.BatchTaskVersionList["+ i +"].Version"));
			batchTaskVersion.setUserId(_ctx.stringValue("GetBatchTaskVersionsResponse.Data.BatchTaskVersionList["+ i +"].UserId"));
			batchTaskVersion.setUserName(_ctx.stringValue("GetBatchTaskVersionsResponse.Data.BatchTaskVersionList["+ i +"].UserName"));
			batchTaskVersion.setComment(_ctx.stringValue("GetBatchTaskVersionsResponse.Data.BatchTaskVersionList["+ i +"].Comment"));
			batchTaskVersion.setPublished(_ctx.booleanValue("GetBatchTaskVersionsResponse.Data.BatchTaskVersionList["+ i +"].Published"));
			batchTaskVersion.setProjectId(_ctx.longValue("GetBatchTaskVersionsResponse.Data.BatchTaskVersionList["+ i +"].ProjectId"));
			batchTaskVersion.setGmtCreate(_ctx.stringValue("GetBatchTaskVersionsResponse.Data.BatchTaskVersionList["+ i +"].GmtCreate"));
			batchTaskVersion.setGmtModified(_ctx.stringValue("GetBatchTaskVersionsResponse.Data.BatchTaskVersionList["+ i +"].GmtModified"));

			batchTaskVersionList.add(batchTaskVersion);
		}
		data.setBatchTaskVersionList(batchTaskVersionList);
		getBatchTaskVersionsResponse.setData(data);
	 
	 	return getBatchTaskVersionsResponse;
	}
}