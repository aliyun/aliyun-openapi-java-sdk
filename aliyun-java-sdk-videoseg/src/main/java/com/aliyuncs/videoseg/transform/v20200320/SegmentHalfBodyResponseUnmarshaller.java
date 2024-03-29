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

package com.aliyuncs.videoseg.transform.v20200320;

import com.aliyuncs.videoseg.model.v20200320.SegmentHalfBodyResponse;
import com.aliyuncs.videoseg.model.v20200320.SegmentHalfBodyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SegmentHalfBodyResponseUnmarshaller {

	public static SegmentHalfBodyResponse unmarshall(SegmentHalfBodyResponse segmentHalfBodyResponse, UnmarshallerContext _ctx) {
		
		segmentHalfBodyResponse.setRequestId(_ctx.stringValue("SegmentHalfBodyResponse.RequestId"));
		segmentHalfBodyResponse.setCode(_ctx.stringValue("SegmentHalfBodyResponse.Code"));
		segmentHalfBodyResponse.setMessage(_ctx.stringValue("SegmentHalfBodyResponse.Message"));

		Data data = new Data();
		data.setVideoUrl(_ctx.stringValue("SegmentHalfBodyResponse.Data.VideoUrl"));
		segmentHalfBodyResponse.setData(data);
	 
	 	return segmentHalfBodyResponse;
	}
}