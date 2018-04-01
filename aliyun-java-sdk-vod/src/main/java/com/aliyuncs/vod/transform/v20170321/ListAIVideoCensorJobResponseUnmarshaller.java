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

import com.aliyuncs.vod.model.v20170321.ListAIVideoCensorJobResponse;
import com.aliyuncs.vod.model.v20170321.ListAIVideoCensorJobResponse.AIVideoCensorJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIVideoCensorJobResponseUnmarshaller {

	public static ListAIVideoCensorJobResponse unmarshall(ListAIVideoCensorJobResponse listAIVideoCensorJobResponse, UnmarshallerContext context) {
		
		listAIVideoCensorJobResponse.setRequestId(context.stringValue("ListAIVideoCensorJobResponse.RequestId"));

		List<String> nonExistAIVideoCensorJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListAIVideoCensorJobResponse.NonExistAIVideoCensorJobIds.Length"); i++) {
			nonExistAIVideoCensorJobIds.add(context.stringValue("ListAIVideoCensorJobResponse.NonExistAIVideoCensorJobIds["+ i +"]"));
		}
		listAIVideoCensorJobResponse.setNonExistAIVideoCensorJobIds(nonExistAIVideoCensorJobIds);

		List<AIVideoCensorJob> aIVideoCensorJobList = new ArrayList<AIVideoCensorJob>();
		for (int i = 0; i < context.lengthValue("ListAIVideoCensorJobResponse.AIVideoCensorJobList.Length"); i++) {
			AIVideoCensorJob aIVideoCensorJob = new AIVideoCensorJob();
			aIVideoCensorJob.setJobId(context.stringValue("ListAIVideoCensorJobResponse.AIVideoCensorJobList["+ i +"].JobId"));
			aIVideoCensorJob.setMediaId(context.stringValue("ListAIVideoCensorJobResponse.AIVideoCensorJobList["+ i +"].MediaId"));
			aIVideoCensorJob.setStatus(context.stringValue("ListAIVideoCensorJobResponse.AIVideoCensorJobList["+ i +"].Status"));
			aIVideoCensorJob.setCode(context.stringValue("ListAIVideoCensorJobResponse.AIVideoCensorJobList["+ i +"].Code"));
			aIVideoCensorJob.setMessage(context.stringValue("ListAIVideoCensorJobResponse.AIVideoCensorJobList["+ i +"].Message"));
			aIVideoCensorJob.setCreationTime(context.stringValue("ListAIVideoCensorJobResponse.AIVideoCensorJobList["+ i +"].CreationTime"));
			aIVideoCensorJob.setData(context.stringValue("ListAIVideoCensorJobResponse.AIVideoCensorJobList["+ i +"].Data"));

			aIVideoCensorJobList.add(aIVideoCensorJob);
		}
		listAIVideoCensorJobResponse.setAIVideoCensorJobList(aIVideoCensorJobList);
	 
	 	return listAIVideoCensorJobResponse;
	}
}