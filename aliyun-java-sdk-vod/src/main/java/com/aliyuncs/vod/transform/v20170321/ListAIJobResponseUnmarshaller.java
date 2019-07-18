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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListAIJobResponse;
import com.aliyuncs.vod.model.v20170321.ListAIJobResponse.AIJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIJobResponseUnmarshaller {

	public static ListAIJobResponse unmarshall(ListAIJobResponse listAIJobResponse, UnmarshallerContext _ctx) {
		
		listAIJobResponse.setRequestId(_ctx.stringValue("ListAIJobResponse.RequestId"));

		List<String> nonExistAIJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAIJobResponse.NonExistAIJobIds.Length"); i++) {
			nonExistAIJobIds.add(_ctx.stringValue("ListAIJobResponse.NonExistAIJobIds["+ i +"]"));
		}
		listAIJobResponse.setNonExistAIJobIds(nonExistAIJobIds);

		List<AIJob> aIJobList = new ArrayList<AIJob>();
		for (int i = 0; i < _ctx.lengthValue("ListAIJobResponse.AIJobList.Length"); i++) {
			AIJob aIJob = new AIJob();
			aIJob.setJobId(_ctx.stringValue("ListAIJobResponse.AIJobList["+ i +"].JobId"));
			aIJob.setMediaId(_ctx.stringValue("ListAIJobResponse.AIJobList["+ i +"].MediaId"));
			aIJob.setType(_ctx.stringValue("ListAIJobResponse.AIJobList["+ i +"].Type"));
			aIJob.setStatus(_ctx.stringValue("ListAIJobResponse.AIJobList["+ i +"].Status"));
			aIJob.setCode(_ctx.stringValue("ListAIJobResponse.AIJobList["+ i +"].Code"));
			aIJob.setMessage(_ctx.stringValue("ListAIJobResponse.AIJobList["+ i +"].Message"));
			aIJob.setCreationTime(_ctx.stringValue("ListAIJobResponse.AIJobList["+ i +"].CreationTime"));
			aIJob.setCompleteTime(_ctx.stringValue("ListAIJobResponse.AIJobList["+ i +"].CompleteTime"));
			aIJob.setData(_ctx.stringValue("ListAIJobResponse.AIJobList["+ i +"].Data"));

			aIJobList.add(aIJob);
		}
		listAIJobResponse.setAIJobList(aIJobList);
	 
	 	return listAIJobResponse;
	}
}