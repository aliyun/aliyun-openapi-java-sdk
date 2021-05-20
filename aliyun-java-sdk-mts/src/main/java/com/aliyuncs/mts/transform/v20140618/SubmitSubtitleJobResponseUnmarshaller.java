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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.SubmitSubtitleJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitSubtitleJobResponse.SubtitleJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitSubtitleJobResponseUnmarshaller {

	public static SubmitSubtitleJobResponse unmarshall(SubmitSubtitleJobResponse submitSubtitleJobResponse, UnmarshallerContext _ctx) {
		
		submitSubtitleJobResponse.setRequestId(_ctx.stringValue("SubmitSubtitleJobResponse.RequestId"));

		SubtitleJob subtitleJob = new SubtitleJob();
		subtitleJob.setOutputConfig(_ctx.stringValue("SubmitSubtitleJobResponse.SubtitleJob.OutputConfig"));
		subtitleJob.setState(_ctx.stringValue("SubmitSubtitleJobResponse.SubtitleJob.State"));
		subtitleJob.setJobId(_ctx.stringValue("SubmitSubtitleJobResponse.SubtitleJob.JobId"));
		subtitleJob.setUserData(_ctx.stringValue("SubmitSubtitleJobResponse.SubtitleJob.UserData"));
		subtitleJob.setInputConfig(_ctx.stringValue("SubmitSubtitleJobResponse.SubtitleJob.InputConfig"));
		submitSubtitleJobResponse.setSubtitleJob(subtitleJob);
	 
	 	return submitSubtitleJobResponse;
	}
}