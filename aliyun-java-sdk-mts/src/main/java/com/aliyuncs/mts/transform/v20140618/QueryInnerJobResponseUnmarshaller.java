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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryInnerJobResponse;
import com.aliyuncs.mts.model.v20140618.QueryInnerJobResponse.Result;
import com.aliyuncs.mts.model.v20140618.QueryInnerJobResponse.Video;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInnerJobResponseUnmarshaller {

	public static QueryInnerJobResponse unmarshall(QueryInnerJobResponse queryInnerJobResponse, UnmarshallerContext _ctx) {
		
		queryInnerJobResponse.setRequestId(_ctx.stringValue("QueryInnerJobResponse.RequestId"));
		queryInnerJobResponse.setStatus(_ctx.stringValue("QueryInnerJobResponse.Status"));
		queryInnerJobResponse.setSuggestion(_ctx.stringValue("QueryInnerJobResponse.Suggestion"));

		Video video = new Video();
		video.setIndex(_ctx.integerValue("QueryInnerJobResponse.Video.Index"));
		video.setResult(_ctx.integerValue("QueryInnerJobResponse.Video.Result"));
		video.setCode(_ctx.stringValue("QueryInnerJobResponse.Video.Code"));
		queryInnerJobResponse.setVideo(video);

		List<Result> image = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("QueryInnerJobResponse.Image.Length"); i++) {
			Result result = new Result();
			result.setIndex(_ctx.integerValue("QueryInnerJobResponse.Image["+ i +"].Index"));
			result.setResult(_ctx.integerValue("QueryInnerJobResponse.Image["+ i +"].Result"));
			result.setCode(_ctx.stringValue("QueryInnerJobResponse.Image["+ i +"].Code"));

			image.add(result);
		}
		queryInnerJobResponse.setImage(image);
	 
	 	return queryInnerJobResponse;
	}
}