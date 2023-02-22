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

import com.aliyuncs.videoenhan.model.v20200320.GenerateHumanAnimeStyleVideoResponse;
import com.aliyuncs.videoenhan.model.v20200320.GenerateHumanAnimeStyleVideoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateHumanAnimeStyleVideoResponseUnmarshaller {

	public static GenerateHumanAnimeStyleVideoResponse unmarshall(GenerateHumanAnimeStyleVideoResponse generateHumanAnimeStyleVideoResponse, UnmarshallerContext _ctx) {
		
		generateHumanAnimeStyleVideoResponse.setRequestId(_ctx.stringValue("GenerateHumanAnimeStyleVideoResponse.RequestId"));
		generateHumanAnimeStyleVideoResponse.setCode(_ctx.stringValue("GenerateHumanAnimeStyleVideoResponse.Code"));
		generateHumanAnimeStyleVideoResponse.setMessage(_ctx.stringValue("GenerateHumanAnimeStyleVideoResponse.Message"));

		Data data = new Data();
		data.setVideoUrl(_ctx.stringValue("GenerateHumanAnimeStyleVideoResponse.Data.VideoUrl"));
		generateHumanAnimeStyleVideoResponse.setData(data);
	 
	 	return generateHumanAnimeStyleVideoResponse;
	}
}