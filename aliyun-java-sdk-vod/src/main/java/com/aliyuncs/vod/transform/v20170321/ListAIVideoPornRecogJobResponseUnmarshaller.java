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

import com.aliyuncs.vod.model.v20170321.ListAIVideoPornRecogJobResponse;
import com.aliyuncs.vod.model.v20170321.ListAIVideoPornRecogJobResponse.AIVideoPornRecogJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIVideoPornRecogJobResponseUnmarshaller {

	public static ListAIVideoPornRecogJobResponse unmarshall(ListAIVideoPornRecogJobResponse listAIVideoPornRecogJobResponse, UnmarshallerContext context) {
		
		listAIVideoPornRecogJobResponse.setRequestId(context.stringValue("ListAIVideoPornRecogJobResponse.RequestId"));

		List<String> nonExistPornRecogJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListAIVideoPornRecogJobResponse.NonExistPornRecogJobIds.Length"); i++) {
			nonExistPornRecogJobIds.add(context.stringValue("ListAIVideoPornRecogJobResponse.NonExistPornRecogJobIds["+ i +"]"));
		}
		listAIVideoPornRecogJobResponse.setNonExistPornRecogJobIds(nonExistPornRecogJobIds);

		List<AIVideoPornRecogJob> aIVideoPornRecogJobList = new ArrayList<AIVideoPornRecogJob>();
		for (int i = 0; i < context.lengthValue("ListAIVideoPornRecogJobResponse.AIVideoPornRecogJobList.Length"); i++) {
			AIVideoPornRecogJob aIVideoPornRecogJob = new AIVideoPornRecogJob();
			aIVideoPornRecogJob.setJobId(context.stringValue("ListAIVideoPornRecogJobResponse.AIVideoPornRecogJobList["+ i +"].JobId"));
			aIVideoPornRecogJob.setMediaId(context.stringValue("ListAIVideoPornRecogJobResponse.AIVideoPornRecogJobList["+ i +"].MediaId"));
			aIVideoPornRecogJob.setStatus(context.stringValue("ListAIVideoPornRecogJobResponse.AIVideoPornRecogJobList["+ i +"].Status"));
			aIVideoPornRecogJob.setCode(context.stringValue("ListAIVideoPornRecogJobResponse.AIVideoPornRecogJobList["+ i +"].Code"));
			aIVideoPornRecogJob.setMessage(context.stringValue("ListAIVideoPornRecogJobResponse.AIVideoPornRecogJobList["+ i +"].Message"));
			aIVideoPornRecogJob.setCreationTime(context.stringValue("ListAIVideoPornRecogJobResponse.AIVideoPornRecogJobList["+ i +"].CreationTime"));
			aIVideoPornRecogJob.setData(context.stringValue("ListAIVideoPornRecogJobResponse.AIVideoPornRecogJobList["+ i +"].Data"));

			aIVideoPornRecogJobList.add(aIVideoPornRecogJob);
		}
		listAIVideoPornRecogJobResponse.setAIVideoPornRecogJobList(aIVideoPornRecogJobList);
	 
	 	return listAIVideoPornRecogJobResponse;
	}
}