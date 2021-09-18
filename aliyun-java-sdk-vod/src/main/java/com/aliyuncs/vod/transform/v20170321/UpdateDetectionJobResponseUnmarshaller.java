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

import com.aliyuncs.vod.model.v20170321.UpdateDetectionJobResponse;
import com.aliyuncs.vod.model.v20170321.UpdateDetectionJobResponse.DetectionJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDetectionJobResponseUnmarshaller {

	public static UpdateDetectionJobResponse unmarshall(UpdateDetectionJobResponse updateDetectionJobResponse, UnmarshallerContext _ctx) {
		
		updateDetectionJobResponse.setRequestId(_ctx.stringValue("UpdateDetectionJobResponse.RequestId"));

		DetectionJob detectionJob = new DetectionJob();
		detectionJob.setJobId(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.JobId"));
		detectionJob.setCreateTime(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.CreateTime"));
		detectionJob.setModifyTime(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.ModifyTime"));
		detectionJob.setBeginTime(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.BeginTime"));
		detectionJob.setEndTime(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.EndTime"));
		detectionJob.setVideoId(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.VideoId"));
		detectionJob.setCopyrightStatus(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.CopyrightStatus"));
		detectionJob.setCopyrightBeginTime(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.CopyrightBeginTime"));
		detectionJob.setCopyrightEndTime(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.CopyrightEndTime"));
		detectionJob.setCopyrightFile(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.CopyrightFile"));
		detectionJob.setWhitelistUrls(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.WhitelistUrls"));
		detectionJob.setTemplateId(_ctx.stringValue("UpdateDetectionJobResponse.DetectionJob.TemplateId"));
		updateDetectionJobResponse.setDetectionJob(detectionJob);
	 
	 	return updateDetectionJobResponse;
	}
}