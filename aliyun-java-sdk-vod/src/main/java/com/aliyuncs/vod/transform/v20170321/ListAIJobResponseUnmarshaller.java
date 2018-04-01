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

	public static ListAIJobResponse unmarshall(ListAIJobResponse listAIJobResponse, UnmarshallerContext context) {
		
		listAIJobResponse.setRequestId(context.stringValue("ListAIJobResponse.RequestId"));

		List<String> nonExistAIJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListAIJobResponse.NonExistAIJobIds.Length"); i++) {
			nonExistAIJobIds.add(context.stringValue("ListAIJobResponse.NonExistAIJobIds["+ i +"]"));
		}
		listAIJobResponse.setNonExistAIJobIds(nonExistAIJobIds);

		List<AIJob> aIJobList = new ArrayList<AIJob>();
		for (int i = 0; i < context.lengthValue("ListAIJobResponse.AIJobList.Length"); i++) {
			AIJob aIJob = new AIJob();
			aIJob.setJobId(context.stringValue("ListAIJobResponse.AIJobList["+ i +"].JobId"));
			aIJob.setMediaId(context.stringValue("ListAIJobResponse.AIJobList["+ i +"].MediaId"));
			aIJob.setType(context.stringValue("ListAIJobResponse.AIJobList["+ i +"].Type"));
			aIJob.setStatus(context.stringValue("ListAIJobResponse.AIJobList["+ i +"].Status"));
			aIJob.setCode(context.stringValue("ListAIJobResponse.AIJobList["+ i +"].Code"));
			aIJob.setMessage(context.stringValue("ListAIJobResponse.AIJobList["+ i +"].Message"));
			aIJob.setCreationTime(context.stringValue("ListAIJobResponse.AIJobList["+ i +"].CreationTime"));
			aIJob.setCompleteTime(context.stringValue("ListAIJobResponse.AIJobList["+ i +"].CompleteTime"));
			aIJob.setData(context.stringValue("ListAIJobResponse.AIJobList["+ i +"].Data"));

			aIJobList.add(aIJob);
		}
		listAIJobResponse.setAIJobList(aIJobList);
	 
	 	return listAIJobResponse;
	}
}