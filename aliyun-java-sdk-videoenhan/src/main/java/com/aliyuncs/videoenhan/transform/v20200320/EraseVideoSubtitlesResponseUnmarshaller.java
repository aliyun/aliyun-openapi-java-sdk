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

package com.aliyuncs.videoenhan.transform.v20200320;

import com.aliyuncs.videoenhan.model.v20200320.EraseVideoSubtitlesResponse;
import com.aliyuncs.videoenhan.model.v20200320.EraseVideoSubtitlesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EraseVideoSubtitlesResponseUnmarshaller {

	public static EraseVideoSubtitlesResponse unmarshall(EraseVideoSubtitlesResponse eraseVideoSubtitlesResponse, UnmarshallerContext _ctx) {
		
		eraseVideoSubtitlesResponse.setRequestId(_ctx.stringValue("EraseVideoSubtitlesResponse.RequestId"));
		eraseVideoSubtitlesResponse.setCode(_ctx.stringValue("EraseVideoSubtitlesResponse.Code"));
		eraseVideoSubtitlesResponse.setMessage(_ctx.stringValue("EraseVideoSubtitlesResponse.Message"));

		Data data = new Data();
		data.setVideoUrl(_ctx.stringValue("EraseVideoSubtitlesResponse.Data.VideoUrl"));
		eraseVideoSubtitlesResponse.setData(data);
	 
	 	return eraseVideoSubtitlesResponse;
	}
}