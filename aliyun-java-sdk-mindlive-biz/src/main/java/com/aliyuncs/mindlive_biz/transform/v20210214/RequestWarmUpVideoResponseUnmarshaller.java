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

package com.aliyuncs.mindlive_biz.transform.v20210214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mindlive_biz.model.v20210214.RequestWarmUpVideoResponse;
import com.aliyuncs.mindlive_biz.model.v20210214.RequestWarmUpVideoResponse.WarmUpVideo;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestWarmUpVideoResponseUnmarshaller {

	public static RequestWarmUpVideoResponse unmarshall(RequestWarmUpVideoResponse requestWarmUpVideoResponse, UnmarshallerContext _ctx) {
		
		requestWarmUpVideoResponse.setRequestId(_ctx.stringValue("RequestWarmUpVideoResponse.RequestId"));
		requestWarmUpVideoResponse.setErrorCode(_ctx.stringValue("RequestWarmUpVideoResponse.ErrorCode"));
		requestWarmUpVideoResponse.setErrorMessage(_ctx.stringValue("RequestWarmUpVideoResponse.ErrorMessage"));
		requestWarmUpVideoResponse.setSuccess(_ctx.booleanValue("RequestWarmUpVideoResponse.Success"));

		List<WarmUpVideo> data = new ArrayList<WarmUpVideo>();
		for (int i = 0; i < _ctx.lengthValue("RequestWarmUpVideoResponse.Data.Length"); i++) {
			WarmUpVideo warmUpVideo = new WarmUpVideo();
			warmUpVideo.setConfigs(_ctx.stringValue("RequestWarmUpVideoResponse.Data["+ i +"].Configs"));
			warmUpVideo.setDownloadUrl(_ctx.stringValue("RequestWarmUpVideoResponse.Data["+ i +"].DownloadUrl"));
			warmUpVideo.setResourceUuid(_ctx.stringValue("RequestWarmUpVideoResponse.Data["+ i +"].ResourceUuid"));

			data.add(warmUpVideo);
		}
		requestWarmUpVideoResponse.setData(data);
	 
	 	return requestWarmUpVideoResponse;
	}
}