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

package com.aliyuncs.rtc.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rtc.model.v20180111.DescribeRtcScaleResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcScaleResponse.ScaleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcScaleResponseUnmarshaller {

	public static DescribeRtcScaleResponse unmarshall(DescribeRtcScaleResponse describeRtcScaleResponse, UnmarshallerContext _ctx) {
		
		describeRtcScaleResponse.setRequestId(_ctx.stringValue("DescribeRtcScaleResponse.RequestId"));

		List<ScaleItem> scale = new ArrayList<ScaleItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcScaleResponse.Scale.Length"); i++) {
			ScaleItem scaleItem = new ScaleItem();
			scaleItem.setTime(_ctx.stringValue("DescribeRtcScaleResponse.Scale["+ i +"].Time"));
			scaleItem.setChannelCount(_ctx.longValue("DescribeRtcScaleResponse.Scale["+ i +"].ChannelCount"));
			scaleItem.setUserCount(_ctx.longValue("DescribeRtcScaleResponse.Scale["+ i +"].UserCount"));
			scaleItem.setSessionCount(_ctx.longValue("DescribeRtcScaleResponse.Scale["+ i +"].SessionCount"));
			scaleItem.setAudioDuration(_ctx.longValue("DescribeRtcScaleResponse.Scale["+ i +"].AudioDuration"));
			scaleItem.setVideoDuration(_ctx.longValue("DescribeRtcScaleResponse.Scale["+ i +"].VideoDuration"));

			scale.add(scaleItem);
		}
		describeRtcScaleResponse.setScale(scale);
	 
	 	return describeRtcScaleResponse;
	}
}