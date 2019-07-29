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

import com.aliyuncs.vs.model.v20181212.BatchForbidVsStreamResponse;
import com.aliyuncs.vs.model.v20181212.BatchForbidVsStreamResponse.ForbidResultInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchForbidVsStreamResponseUnmarshaller {

	public static BatchForbidVsStreamResponse unmarshall(BatchForbidVsStreamResponse batchForbidVsStreamResponse, UnmarshallerContext _ctx) {
		
		batchForbidVsStreamResponse.setRequestId(_ctx.stringValue("BatchForbidVsStreamResponse.RequestId"));

		List<ForbidResultInfo> forbidResult = new ArrayList<ForbidResultInfo>();
		for (int i = 0; i < _ctx.lengthValue("BatchForbidVsStreamResponse.ForbidResult.Length"); i++) {
			ForbidResultInfo forbidResultInfo = new ForbidResultInfo();
			forbidResultInfo.setResult(_ctx.stringValue("BatchForbidVsStreamResponse.ForbidResult["+ i +"].Result"));
			forbidResultInfo.setDetail(_ctx.stringValue("BatchForbidVsStreamResponse.ForbidResult["+ i +"].Detail"));
			forbidResultInfo.setCount(_ctx.integerValue("BatchForbidVsStreamResponse.ForbidResult["+ i +"].Count"));

			List<String> channels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("BatchForbidVsStreamResponse.ForbidResult["+ i +"].Channels.Length"); j++) {
				channels.add(_ctx.stringValue("BatchForbidVsStreamResponse.ForbidResult["+ i +"].Channels["+ j +"]"));
			}
			forbidResultInfo.setChannels(channels);

			forbidResult.add(forbidResultInfo);
		}
		batchForbidVsStreamResponse.setForbidResult(forbidResult);
	 
	 	return batchForbidVsStreamResponse;
	}
}