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

import com.aliyuncs.vod.model.v20170321.ListJobInfoResponse;
import com.aliyuncs.vod.model.v20170321.ListJobInfoResponse.JobInfoDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobInfoResponseUnmarshaller {

	public static ListJobInfoResponse unmarshall(ListJobInfoResponse listJobInfoResponse, UnmarshallerContext _ctx) {
		
		listJobInfoResponse.setRequestId(_ctx.stringValue("ListJobInfoResponse.RequestId"));
		listJobInfoResponse.setMediaId(_ctx.stringValue("ListJobInfoResponse.MediaId"));
		listJobInfoResponse.setJobType(_ctx.stringValue("ListJobInfoResponse.JobType"));

		List<JobInfoDO> jobInfoList = new ArrayList<JobInfoDO>();
		for (int i = 0; i < _ctx.lengthValue("ListJobInfoResponse.JobInfoList.Length"); i++) {
			JobInfoDO jobInfoDO = new JobInfoDO();
			jobInfoDO.setJobId(_ctx.stringValue("ListJobInfoResponse.JobInfoList["+ i +"].JobId"));
			jobInfoDO.setStatus(_ctx.stringValue("ListJobInfoResponse.JobInfoList["+ i +"].Status"));
			jobInfoDO.setUserId(_ctx.longValue("ListJobInfoResponse.JobInfoList["+ i +"].UserId"));
			jobInfoDO.setCreateTime(_ctx.stringValue("ListJobInfoResponse.JobInfoList["+ i +"].CreateTime"));
			jobInfoDO.setCompleteTime(_ctx.stringValue("ListJobInfoResponse.JobInfoList["+ i +"].CompleteTime"));

			jobInfoList.add(jobInfoDO);
		}
		listJobInfoResponse.setJobInfoList(jobInfoList);
	 
	 	return listJobInfoResponse;
	}
}