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

import com.aliyuncs.vod.model.v20170321.GetMediaRefreshJobsResponse;
import com.aliyuncs.vod.model.v20170321.GetMediaRefreshJobsResponse.MediaRefreshJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMediaRefreshJobsResponseUnmarshaller {

	public static GetMediaRefreshJobsResponse unmarshall(GetMediaRefreshJobsResponse getMediaRefreshJobsResponse, UnmarshallerContext _ctx) {
		
		getMediaRefreshJobsResponse.setRequestId(_ctx.stringValue("GetMediaRefreshJobsResponse.RequestId"));

		List<MediaRefreshJob> mediaRefreshJobs = new ArrayList<MediaRefreshJob>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaRefreshJobsResponse.MediaRefreshJobs.Length"); i++) {
			MediaRefreshJob mediaRefreshJob = new MediaRefreshJob();
			mediaRefreshJob.setMediaRefreshJobId(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].MediaRefreshJobId"));
			mediaRefreshJob.setMediaId(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].MediaId"));
			mediaRefreshJob.setTaskType(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].TaskType"));
			mediaRefreshJob.setFilterPolicy(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].FilterPolicy"));
			mediaRefreshJob.setStatus(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].Status"));
			mediaRefreshJob.setSuccessPlayUrls(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].SuccessPlayUrls"));
			mediaRefreshJob.setTaskIds(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].TaskIds"));
			mediaRefreshJob.setErrorCode(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].ErrorCode"));
			mediaRefreshJob.setErrorMessage(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].ErrorMessage"));
			mediaRefreshJob.setUserData(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].UserData"));
			mediaRefreshJob.setGmtCreate(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].GmtCreate"));
			mediaRefreshJob.setGmtModified(_ctx.stringValue("GetMediaRefreshJobsResponse.MediaRefreshJobs["+ i +"].GmtModified"));

			mediaRefreshJobs.add(mediaRefreshJob);
		}
		getMediaRefreshJobsResponse.setMediaRefreshJobs(mediaRefreshJobs);
	 
	 	return getMediaRefreshJobsResponse;
	}
}