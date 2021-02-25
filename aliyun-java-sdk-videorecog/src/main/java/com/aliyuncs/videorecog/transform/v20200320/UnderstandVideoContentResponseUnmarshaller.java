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

package com.aliyuncs.videorecog.transform.v20200320;

import com.aliyuncs.videorecog.model.v20200320.UnderstandVideoContentResponse;
import com.aliyuncs.videorecog.model.v20200320.UnderstandVideoContentResponse.Data;
import com.aliyuncs.videorecog.model.v20200320.UnderstandVideoContentResponse.Data.VideoInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnderstandVideoContentResponseUnmarshaller {

	public static UnderstandVideoContentResponse unmarshall(UnderstandVideoContentResponse understandVideoContentResponse, UnmarshallerContext _ctx) {
		
		understandVideoContentResponse.setRequestId(_ctx.stringValue("UnderstandVideoContentResponse.RequestId"));
		understandVideoContentResponse.setMessage(_ctx.stringValue("UnderstandVideoContentResponse.Message"));
		understandVideoContentResponse.setCode(_ctx.stringValue("UnderstandVideoContentResponse.Code"));

		Data data = new Data();
		data.setTagInfo(_ctx.mapValue("UnderstandVideoContentResponse.Data.TagInfo"));

		VideoInfo videoInfo = new VideoInfo();
		videoInfo.setFps(_ctx.floatValue("UnderstandVideoContentResponse.Data.VideoInfo.Fps"));
		videoInfo.setDuration(_ctx.longValue("UnderstandVideoContentResponse.Data.VideoInfo.Duration"));
		videoInfo.setHeight(_ctx.longValue("UnderstandVideoContentResponse.Data.VideoInfo.Height"));
		videoInfo.setWidth(_ctx.longValue("UnderstandVideoContentResponse.Data.VideoInfo.Width"));
		data.setVideoInfo(videoInfo);
		understandVideoContentResponse.setData(data);
	 
	 	return understandVideoContentResponse;
	}
}