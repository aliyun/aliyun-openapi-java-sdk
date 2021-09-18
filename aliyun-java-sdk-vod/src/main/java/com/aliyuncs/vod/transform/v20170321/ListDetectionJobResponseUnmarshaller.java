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

import com.aliyuncs.vod.model.v20170321.ListDetectionJobResponse;
import com.aliyuncs.vod.model.v20170321.ListDetectionJobResponse.DetectionJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDetectionJobResponseUnmarshaller {

	public static ListDetectionJobResponse unmarshall(ListDetectionJobResponse listDetectionJobResponse, UnmarshallerContext _ctx) {
		
		listDetectionJobResponse.setRequestId(_ctx.stringValue("ListDetectionJobResponse.RequestId"));

		List<DetectionJob> detectionJobList = new ArrayList<DetectionJob>();
		for (int i = 0; i < _ctx.lengthValue("ListDetectionJobResponse.DetectionJobList.Length"); i++) {
			DetectionJob detectionJob = new DetectionJob();
			detectionJob.setJobId(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].JobId"));
			detectionJob.setCreateTime(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].CreateTime"));
			detectionJob.setModifyTime(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].ModifyTime"));
			detectionJob.setBeginTime(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].BeginTime"));
			detectionJob.setEndTime(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].EndTime"));
			detectionJob.setVideoId(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].VideoId"));
			detectionJob.setCopyrightStatus(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].CopyrightStatus"));
			detectionJob.setCopyrightBeginTime(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].CopyrightBeginTime"));
			detectionJob.setCopyrightEndTime(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].CopyrightEndTime"));
			detectionJob.setCopyrightFile(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].CopyrightFile"));
			detectionJob.setWhitelistUrls(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].WhitelistUrls"));
			detectionJob.setTemplateId(_ctx.stringValue("ListDetectionJobResponse.DetectionJobList["+ i +"].TemplateId"));

			detectionJobList.add(detectionJob);
		}
		listDetectionJobResponse.setDetectionJobList(detectionJobList);
	 
	 	return listDetectionJobResponse;
	}
}