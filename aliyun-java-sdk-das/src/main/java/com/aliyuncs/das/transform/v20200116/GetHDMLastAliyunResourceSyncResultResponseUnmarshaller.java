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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetHDMLastAliyunResourceSyncResultResponse;
import com.aliyuncs.das.model.v20200116.GetHDMLastAliyunResourceSyncResultResponse.Data;
import com.aliyuncs.das.model.v20200116.GetHDMLastAliyunResourceSyncResultResponse.Data.ResourceSyncSubResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHDMLastAliyunResourceSyncResultResponseUnmarshaller {

	public static GetHDMLastAliyunResourceSyncResultResponse unmarshall(GetHDMLastAliyunResourceSyncResultResponse getHDMLastAliyunResourceSyncResultResponse, UnmarshallerContext _ctx) {
		
		getHDMLastAliyunResourceSyncResultResponse.setRequestId(_ctx.stringValue("GetHDMLastAliyunResourceSyncResultResponse.RequestId"));
		getHDMLastAliyunResourceSyncResultResponse.setMessage(_ctx.stringValue("GetHDMLastAliyunResourceSyncResultResponse.Message"));
		getHDMLastAliyunResourceSyncResultResponse.setSynchro(_ctx.stringValue("GetHDMLastAliyunResourceSyncResultResponse.Synchro"));
		getHDMLastAliyunResourceSyncResultResponse.setCode(_ctx.stringValue("GetHDMLastAliyunResourceSyncResultResponse.Code"));
		getHDMLastAliyunResourceSyncResultResponse.setSuccess(_ctx.stringValue("GetHDMLastAliyunResourceSyncResultResponse.Success"));

		Data data = new Data();
		data.setResults(_ctx.stringValue("GetHDMLastAliyunResourceSyncResultResponse.Data.Results"));
		data.setErrorMsg(_ctx.stringValue("GetHDMLastAliyunResourceSyncResultResponse.Data.ErrorMsg"));
		data.setSyncStatus(_ctx.stringValue("GetHDMLastAliyunResourceSyncResultResponse.Data.SyncStatus"));

		List<ResourceSyncSubResult> subResults = new ArrayList<ResourceSyncSubResult>();
		for (int i = 0; i < _ctx.lengthValue("GetHDMLastAliyunResourceSyncResultResponse.Data.SubResults.Length"); i++) {
			ResourceSyncSubResult resourceSyncSubResult = new ResourceSyncSubResult();
			resourceSyncSubResult.setErrMsg(_ctx.stringValue("GetHDMLastAliyunResourceSyncResultResponse.Data.SubResults["+ i +"].ErrMsg"));
			resourceSyncSubResult.setResourceType(_ctx.stringValue("GetHDMLastAliyunResourceSyncResultResponse.Data.SubResults["+ i +"].ResourceType"));
			resourceSyncSubResult.setSyncCount(_ctx.integerValue("GetHDMLastAliyunResourceSyncResultResponse.Data.SubResults["+ i +"].SyncCount"));
			resourceSyncSubResult.setSuccess(_ctx.booleanValue("GetHDMLastAliyunResourceSyncResultResponse.Data.SubResults["+ i +"].Success"));

			subResults.add(resourceSyncSubResult);
		}
		data.setSubResults(subResults);
		getHDMLastAliyunResourceSyncResultResponse.setData(data);
	 
	 	return getHDMLastAliyunResourceSyncResultResponse;
	}
}