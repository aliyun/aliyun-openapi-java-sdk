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

import com.aliyuncs.vod.model.v20170321.ListMediaDNADeleteJobResponse;
import com.aliyuncs.vod.model.v20170321.ListMediaDNADeleteJobResponse.AIJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMediaDNADeleteJobResponseUnmarshaller {

	public static ListMediaDNADeleteJobResponse unmarshall(ListMediaDNADeleteJobResponse listMediaDNADeleteJobResponse, UnmarshallerContext _ctx) {
		
		listMediaDNADeleteJobResponse.setRequestId(_ctx.stringValue("ListMediaDNADeleteJobResponse.RequestId"));

		List<String> nonExistAIJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListMediaDNADeleteJobResponse.NonExistAIJobIds.Length"); i++) {
			nonExistAIJobIds.add(_ctx.stringValue("ListMediaDNADeleteJobResponse.NonExistAIJobIds["+ i +"]"));
		}
		listMediaDNADeleteJobResponse.setNonExistAIJobIds(nonExistAIJobIds);

		List<AIJob> aIJobList = new ArrayList<AIJob>();
		for (int i = 0; i < _ctx.lengthValue("ListMediaDNADeleteJobResponse.AIJobList.Length"); i++) {
			AIJob aIJob = new AIJob();
			aIJob.setJobId(_ctx.stringValue("ListMediaDNADeleteJobResponse.AIJobList["+ i +"].JobId"));
			aIJob.setMediaId(_ctx.stringValue("ListMediaDNADeleteJobResponse.AIJobList["+ i +"].MediaId"));
			aIJob.setStatus(_ctx.stringValue("ListMediaDNADeleteJobResponse.AIJobList["+ i +"].Status"));
			aIJob.setCode(_ctx.stringValue("ListMediaDNADeleteJobResponse.AIJobList["+ i +"].Code"));
			aIJob.setMessage(_ctx.stringValue("ListMediaDNADeleteJobResponse.AIJobList["+ i +"].Message"));
			aIJob.setFpDBId(_ctx.stringValue("ListMediaDNADeleteJobResponse.AIJobList["+ i +"].FpDBId"));

			aIJobList.add(aIJob);
		}
		listMediaDNADeleteJobResponse.setAIJobList(aIJobList);
	 
	 	return listMediaDNADeleteJobResponse;
	}
}