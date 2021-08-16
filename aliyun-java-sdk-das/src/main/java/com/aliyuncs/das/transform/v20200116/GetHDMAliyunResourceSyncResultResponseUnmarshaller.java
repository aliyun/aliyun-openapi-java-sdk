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

import com.aliyuncs.das.model.v20200116.GetHDMAliyunResourceSyncResultResponse;
import com.aliyuncs.das.model.v20200116.GetHDMAliyunResourceSyncResultResponse.Data;
import com.aliyuncs.das.model.v20200116.GetHDMAliyunResourceSyncResultResponse.Data.ResourceSyncSubResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHDMAliyunResourceSyncResultResponseUnmarshaller {

	public static GetHDMAliyunResourceSyncResultResponse unmarshall(GetHDMAliyunResourceSyncResultResponse getHDMAliyunResourceSyncResultResponse, UnmarshallerContext _ctx) {
		
		getHDMAliyunResourceSyncResultResponse.setRequestId(_ctx.stringValue("GetHDMAliyunResourceSyncResultResponse.RequestId"));
		getHDMAliyunResourceSyncResultResponse.setMessage(_ctx.stringValue("GetHDMAliyunResourceSyncResultResponse.Message"));
		getHDMAliyunResourceSyncResultResponse.setSynchro(_ctx.stringValue("GetHDMAliyunResourceSyncResultResponse.Synchro"));
		getHDMAliyunResourceSyncResultResponse.setCode(_ctx.stringValue("GetHDMAliyunResourceSyncResultResponse.Code"));
		getHDMAliyunResourceSyncResultResponse.setSuccess(_ctx.stringValue("GetHDMAliyunResourceSyncResultResponse.Success"));

		Data data = new Data();
		data.setResults(_ctx.stringValue("GetHDMAliyunResourceSyncResultResponse.Data.Results"));
		data.setErrorMsg(_ctx.stringValue("GetHDMAliyunResourceSyncResultResponse.Data.ErrorMsg"));
		data.setSyncStatus(_ctx.stringValue("GetHDMAliyunResourceSyncResultResponse.Data.SyncStatus"));

		List<ResourceSyncSubResult> subResults = new ArrayList<ResourceSyncSubResult>();
		for (int i = 0; i < _ctx.lengthValue("GetHDMAliyunResourceSyncResultResponse.Data.SubResults.Length"); i++) {
			ResourceSyncSubResult resourceSyncSubResult = new ResourceSyncSubResult();
			resourceSyncSubResult.setErrMsg(_ctx.stringValue("GetHDMAliyunResourceSyncResultResponse.Data.SubResults["+ i +"].ErrMsg"));
			resourceSyncSubResult.setResourceType(_ctx.stringValue("GetHDMAliyunResourceSyncResultResponse.Data.SubResults["+ i +"].ResourceType"));
			resourceSyncSubResult.setSyncCount(_ctx.integerValue("GetHDMAliyunResourceSyncResultResponse.Data.SubResults["+ i +"].SyncCount"));
			resourceSyncSubResult.setSuccess(_ctx.booleanValue("GetHDMAliyunResourceSyncResultResponse.Data.SubResults["+ i +"].Success"));

			subResults.add(resourceSyncSubResult);
		}
		data.setSubResults(subResults);
		getHDMAliyunResourceSyncResultResponse.setData(data);
	 
	 	return getHDMAliyunResourceSyncResultResponse;
	}
}