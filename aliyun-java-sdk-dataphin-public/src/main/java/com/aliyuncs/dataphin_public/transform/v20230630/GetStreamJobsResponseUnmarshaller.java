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

import com.aliyuncs.dataphin_public.model.v20230630.GetStreamJobsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetStreamJobsResponse.StreamJobMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStreamJobsResponseUnmarshaller {

	public static GetStreamJobsResponse unmarshall(GetStreamJobsResponse getStreamJobsResponse, UnmarshallerContext _ctx) {
		
		getStreamJobsResponse.setRequestId(_ctx.stringValue("GetStreamJobsResponse.RequestId"));
		getStreamJobsResponse.setSuccess(_ctx.booleanValue("GetStreamJobsResponse.Success"));
		getStreamJobsResponse.setHttpStatusCode(_ctx.integerValue("GetStreamJobsResponse.HttpStatusCode"));
		getStreamJobsResponse.setCode(_ctx.stringValue("GetStreamJobsResponse.Code"));
		getStreamJobsResponse.setMessage(_ctx.stringValue("GetStreamJobsResponse.Message"));

		List<StreamJobMapping> data = new ArrayList<StreamJobMapping>();
		for (int i = 0; i < _ctx.lengthValue("GetStreamJobsResponse.Data.Length"); i++) {
			StreamJobMapping streamJobMapping = new StreamJobMapping();
			streamJobMapping.setStatus(_ctx.stringValue("GetStreamJobsResponse.Data["+ i +"].Status"));
			streamJobMapping.setType(_ctx.stringValue("GetStreamJobsResponse.Data["+ i +"].Type"));
			streamJobMapping.setOwnerId(_ctx.stringValue("GetStreamJobsResponse.Data["+ i +"].OwnerId"));
			streamJobMapping.setJobName(_ctx.stringValue("GetStreamJobsResponse.Data["+ i +"].JobName"));
			streamJobMapping.setProjectId(_ctx.stringValue("GetStreamJobsResponse.Data["+ i +"].ProjectId"));
			streamJobMapping.setId(_ctx.longValue("GetStreamJobsResponse.Data["+ i +"].Id"));
			streamJobMapping.setEnv(_ctx.stringValue("GetStreamJobsResponse.Data["+ i +"].Env"));
			streamJobMapping.setModifierId(_ctx.stringValue("GetStreamJobsResponse.Data["+ i +"].ModifierId"));

			data.add(streamJobMapping);
		}
		getStreamJobsResponse.setData(data);
	 
	 	return getStreamJobsResponse;
	}
}