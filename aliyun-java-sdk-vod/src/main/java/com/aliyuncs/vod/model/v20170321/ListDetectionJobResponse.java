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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.ListDetectionJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDetectionJobResponse extends AcsResponse {

	private String requestId;

	private List<DetectionJob> detectionJobList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DetectionJob> getDetectionJobList() {
		return this.detectionJobList;
	}

	public void setDetectionJobList(List<DetectionJob> detectionJobList) {
		this.detectionJobList = detectionJobList;
	}

	public static class DetectionJob {

		private String jobId;

		private String createTime;

		private String modifyTime;

		private String beginTime;

		private String endTime;

		private String videoId;

		private String copyrightStatus;

		private String copyrightBeginTime;

		private String copyrightEndTime;

		private String copyrightFile;

		private String whitelistUrls;

		private String templateId;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
		}

		public String getCopyrightStatus() {
			return this.copyrightStatus;
		}

		public void setCopyrightStatus(String copyrightStatus) {
			this.copyrightStatus = copyrightStatus;
		}

		public String getCopyrightBeginTime() {
			return this.copyrightBeginTime;
		}

		public void setCopyrightBeginTime(String copyrightBeginTime) {
			this.copyrightBeginTime = copyrightBeginTime;
		}

		public String getCopyrightEndTime() {
			return this.copyrightEndTime;
		}

		public void setCopyrightEndTime(String copyrightEndTime) {
			this.copyrightEndTime = copyrightEndTime;
		}

		public String getCopyrightFile() {
			return this.copyrightFile;
		}

		public void setCopyrightFile(String copyrightFile) {
			this.copyrightFile = copyrightFile;
		}

		public String getWhitelistUrls() {
			return this.whitelistUrls;
		}

		public void setWhitelistUrls(String whitelistUrls) {
			this.whitelistUrls = whitelistUrls;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}
	}

	@Override
	public ListDetectionJobResponse getInstance(UnmarshallerContext context) {
		return	ListDetectionJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
