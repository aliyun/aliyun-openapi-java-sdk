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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.BatchResumeVsStreamResponse;
import com.aliyuncs.vs.model.v20181212.BatchResumeVsStreamResponse.ResumeResultInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchResumeVsStreamResponseUnmarshaller {

	public static BatchResumeVsStreamResponse unmarshall(BatchResumeVsStreamResponse batchResumeVsStreamResponse, UnmarshallerContext _ctx) {
		
		batchResumeVsStreamResponse.setRequestId(_ctx.stringValue("BatchResumeVsStreamResponse.RequestId"));

		List<ResumeResultInfo> resumeResult = new ArrayList<ResumeResultInfo>();
		for (int i = 0; i < _ctx.lengthValue("BatchResumeVsStreamResponse.ResumeResult.Length"); i++) {
			ResumeResultInfo resumeResultInfo = new ResumeResultInfo();
			resumeResultInfo.setResult(_ctx.stringValue("BatchResumeVsStreamResponse.ResumeResult["+ i +"].Result"));
			resumeResultInfo.setDetail(_ctx.stringValue("BatchResumeVsStreamResponse.ResumeResult["+ i +"].Detail"));
			resumeResultInfo.setCount(_ctx.integerValue("BatchResumeVsStreamResponse.ResumeResult["+ i +"].Count"));

			List<String> channels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("BatchResumeVsStreamResponse.ResumeResult["+ i +"].Channels.Length"); j++) {
				channels.add(_ctx.stringValue("BatchResumeVsStreamResponse.ResumeResult["+ i +"].Channels["+ j +"]"));
			}
			resumeResultInfo.setChannels(channels);

			resumeResult.add(resumeResultInfo);
		}
		batchResumeVsStreamResponse.setResumeResult(resumeResult);
	 
	 	return batchResumeVsStreamResponse;
	}
}