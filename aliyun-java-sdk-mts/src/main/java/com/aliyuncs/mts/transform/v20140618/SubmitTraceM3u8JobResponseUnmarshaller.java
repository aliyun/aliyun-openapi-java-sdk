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

import com.aliyuncs.mts.model.v20140618.SubmitTraceM3u8JobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitTraceM3u8JobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitTraceM3u8JobResponseUnmarshaller {

	public static SubmitTraceM3u8JobResponse unmarshall(SubmitTraceM3u8JobResponse submitTraceM3u8JobResponse, UnmarshallerContext _ctx) {
		
		submitTraceM3u8JobResponse.setRequestId(_ctx.stringValue("SubmitTraceM3u8JobResponse.RequestId"));
		submitTraceM3u8JobResponse.setMessage(_ctx.stringValue("SubmitTraceM3u8JobResponse.Message"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("SubmitTraceM3u8JobResponse.Data.JobId"));
		submitTraceM3u8JobResponse.setData(data);
	 
	 	return submitTraceM3u8JobResponse;
	}
}