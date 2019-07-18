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

import com.aliyuncs.vod.model.v20170321.UploadMediaByURLResponse;
import com.aliyuncs.vod.model.v20170321.UploadMediaByURLResponse.UploadJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadMediaByURLResponseUnmarshaller {

	public static UploadMediaByURLResponse unmarshall(UploadMediaByURLResponse uploadMediaByURLResponse, UnmarshallerContext _ctx) {
		
		uploadMediaByURLResponse.setRequestId(_ctx.stringValue("UploadMediaByURLResponse.RequestId"));

		List<UploadJob> uploadJobs = new ArrayList<UploadJob>();
		for (int i = 0; i < _ctx.lengthValue("UploadMediaByURLResponse.UploadJobs.Length"); i++) {
			UploadJob uploadJob = new UploadJob();
			uploadJob.setJobId(_ctx.stringValue("UploadMediaByURLResponse.UploadJobs["+ i +"].JobId"));
			uploadJob.setSourceURL(_ctx.stringValue("UploadMediaByURLResponse.UploadJobs["+ i +"].SourceURL"));

			uploadJobs.add(uploadJob);
		}
		uploadMediaByURLResponse.setUploadJobs(uploadJobs);
	 
	 	return uploadMediaByURLResponse;
	}
}