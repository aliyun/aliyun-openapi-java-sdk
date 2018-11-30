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

import com.aliyuncs.vod.model.v20170321.ListAIVideoTerrorismRecogJobResponse;
import com.aliyuncs.vod.model.v20170321.ListAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJob;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIVideoTerrorismRecogJobResponseUnmarshaller {

	public static ListAIVideoTerrorismRecogJobResponse unmarshall(ListAIVideoTerrorismRecogJobResponse listAIVideoTerrorismRecogJobResponse, UnmarshallerContext context) {
		
		listAIVideoTerrorismRecogJobResponse.setRequestId(context.stringValue("ListAIVideoTerrorismRecogJobResponse.RequestId"));

		List<String> nonExistTerrorismRecogJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListAIVideoTerrorismRecogJobResponse.NonExistTerrorismRecogJobIds.Length"); i++) {
			nonExistTerrorismRecogJobIds.add(context.stringValue("ListAIVideoTerrorismRecogJobResponse.NonExistTerrorismRecogJobIds["+ i +"]"));
		}
		listAIVideoTerrorismRecogJobResponse.setNonExistTerrorismRecogJobIds(nonExistTerrorismRecogJobIds);

		List<AIVideoTerrorismRecogJob> aIVideoTerrorismRecogJobList = new ArrayList<AIVideoTerrorismRecogJob>();
		for (int i = 0; i < context.lengthValue("ListAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJobList.Length"); i++) {
			AIVideoTerrorismRecogJob aIVideoTerrorismRecogJob = new AIVideoTerrorismRecogJob();
			aIVideoTerrorismRecogJob.setJobId(context.stringValue("ListAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJobList["+ i +"].JobId"));
			aIVideoTerrorismRecogJob.setMediaId(context.stringValue("ListAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJobList["+ i +"].MediaId"));
			aIVideoTerrorismRecogJob.setStatus(context.stringValue("ListAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJobList["+ i +"].Status"));
			aIVideoTerrorismRecogJob.setCode(context.stringValue("ListAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJobList["+ i +"].Code"));
			aIVideoTerrorismRecogJob.setMessage(context.stringValue("ListAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJobList["+ i +"].Message"));
			aIVideoTerrorismRecogJob.setCreationTime(context.stringValue("ListAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJobList["+ i +"].CreationTime"));
			aIVideoTerrorismRecogJob.setData(context.stringValue("ListAIVideoTerrorismRecogJobResponse.AIVideoTerrorismRecogJobList["+ i +"].Data"));

			aIVideoTerrorismRecogJobList.add(aIVideoTerrorismRecogJob);
		}
		listAIVideoTerrorismRecogJobResponse.setAIVideoTerrorismRecogJobList(aIVideoTerrorismRecogJobList);
	 
	 	return listAIVideoTerrorismRecogJobResponse;
	}
}