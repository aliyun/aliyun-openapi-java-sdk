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

import com.aliyuncs.vod.model.v20170321.GetDetectionJobResponse;
import com.aliyuncs.vod.model.v20170321.GetDetectionJobResponse.DetectionJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDetectionJobResponseUnmarshaller {

	public static GetDetectionJobResponse unmarshall(GetDetectionJobResponse getDetectionJobResponse, UnmarshallerContext _ctx) {
		
		getDetectionJobResponse.setRequestId(_ctx.stringValue("GetDetectionJobResponse.RequestId"));

		DetectionJob detectionJob = new DetectionJob();
		detectionJob.setJobId(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.JobId"));
		detectionJob.setCreateTime(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.CreateTime"));
		detectionJob.setModifyTime(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.ModifyTime"));
		detectionJob.setBeginTime(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.BeginTime"));
		detectionJob.setEndTime(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.EndTime"));
		detectionJob.setVideoId(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.VideoId"));
		detectionJob.setCopyrightStatus(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.CopyrightStatus"));
		detectionJob.setCopyrightBeginTime(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.CopyrightBeginTime"));
		detectionJob.setCopyrightEndTime(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.CopyrightEndTime"));
		detectionJob.setCopyrightFile(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.CopyrightFile"));
		detectionJob.setWhitelistUrls(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.WhitelistUrls"));
		detectionJob.setTemplateId(_ctx.stringValue("GetDetectionJobResponse.DetectionJob.TemplateId"));
		getDetectionJobResponse.setDetectionJob(detectionJob);
	 
	 	return getDetectionJobResponse;
	}
}