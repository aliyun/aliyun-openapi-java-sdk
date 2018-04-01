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

import com.aliyuncs.vod.model.v20170321.ListAIVideoSummaryJobResponse;
import com.aliyuncs.vod.model.v20170321.ListAIVideoSummaryJobResponse.AIVideoSummaryJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIVideoSummaryJobResponseUnmarshaller {

	public static ListAIVideoSummaryJobResponse unmarshall(ListAIVideoSummaryJobResponse listAIVideoSummaryJobResponse, UnmarshallerContext context) {
		
		listAIVideoSummaryJobResponse.setRequestId(context.stringValue("ListAIVideoSummaryJobResponse.RequestId"));

		List<String> nonExistAIVideoSummaryJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListAIVideoSummaryJobResponse.NonExistAIVideoSummaryJobIds.Length"); i++) {
			nonExistAIVideoSummaryJobIds.add(context.stringValue("ListAIVideoSummaryJobResponse.NonExistAIVideoSummaryJobIds["+ i +"]"));
		}
		listAIVideoSummaryJobResponse.setNonExistAIVideoSummaryJobIds(nonExistAIVideoSummaryJobIds);

		List<AIVideoSummaryJob> aIVideoSummaryJobList = new ArrayList<AIVideoSummaryJob>();
		for (int i = 0; i < context.lengthValue("ListAIVideoSummaryJobResponse.AIVideoSummaryJobList.Length"); i++) {
			AIVideoSummaryJob aIVideoSummaryJob = new AIVideoSummaryJob();
			aIVideoSummaryJob.setJobId(context.stringValue("ListAIVideoSummaryJobResponse.AIVideoSummaryJobList["+ i +"].JobId"));
			aIVideoSummaryJob.setMediaId(context.stringValue("ListAIVideoSummaryJobResponse.AIVideoSummaryJobList["+ i +"].MediaId"));
			aIVideoSummaryJob.setStatus(context.stringValue("ListAIVideoSummaryJobResponse.AIVideoSummaryJobList["+ i +"].Status"));
			aIVideoSummaryJob.setCode(context.stringValue("ListAIVideoSummaryJobResponse.AIVideoSummaryJobList["+ i +"].Code"));
			aIVideoSummaryJob.setMessage(context.stringValue("ListAIVideoSummaryJobResponse.AIVideoSummaryJobList["+ i +"].Message"));
			aIVideoSummaryJob.setCreationTime(context.stringValue("ListAIVideoSummaryJobResponse.AIVideoSummaryJobList["+ i +"].CreationTime"));
			aIVideoSummaryJob.setData(context.stringValue("ListAIVideoSummaryJobResponse.AIVideoSummaryJobList["+ i +"].Data"));

			aIVideoSummaryJobList.add(aIVideoSummaryJob);
		}
		listAIVideoSummaryJobResponse.setAIVideoSummaryJobList(aIVideoSummaryJobList);
	 
	 	return listAIVideoSummaryJobResponse;
	}
}