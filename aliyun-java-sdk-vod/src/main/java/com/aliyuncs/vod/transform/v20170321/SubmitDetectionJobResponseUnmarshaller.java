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

import com.aliyuncs.vod.model.v20170321.SubmitDetectionJobResponse;
import com.aliyuncs.vod.model.v20170321.SubmitDetectionJobResponse.DetectionJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitDetectionJobResponseUnmarshaller {

	public static SubmitDetectionJobResponse unmarshall(SubmitDetectionJobResponse submitDetectionJobResponse, UnmarshallerContext _ctx) {
		
		submitDetectionJobResponse.setRequestId(_ctx.stringValue("SubmitDetectionJobResponse.RequestId"));

		DetectionJob detectionJob = new DetectionJob();
		detectionJob.setJobId(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.JobId"));
		detectionJob.setCreateTime(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.CreateTime"));
		detectionJob.setModifyTime(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.ModifyTime"));
		detectionJob.setBeginTime(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.BeginTime"));
		detectionJob.setEndTime(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.EndTime"));
		detectionJob.setVideoId(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.VideoId"));
		detectionJob.setCopyrightStatus(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.CopyrightStatus"));
		detectionJob.setCopyrightBeginTime(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.CopyrightBeginTime"));
		detectionJob.setCopyrightEndTime(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.CopyrightEndTime"));
		detectionJob.setCopyrightFile(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.CopyrightFile"));
		detectionJob.setWhitelistUrls(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.WhitelistUrls"));
		detectionJob.setTemplateId(_ctx.stringValue("SubmitDetectionJobResponse.DetectionJob.TemplateId"));
		submitDetectionJobResponse.setDetectionJob(detectionJob);
	 
	 	return submitDetectionJobResponse;
	}
}