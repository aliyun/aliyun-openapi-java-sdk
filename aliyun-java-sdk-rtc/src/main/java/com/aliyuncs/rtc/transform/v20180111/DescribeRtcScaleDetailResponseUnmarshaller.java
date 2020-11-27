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

import com.aliyuncs.rtc.model.v20180111.DescribeRtcScaleDetailResponse;
import com.aliyuncs.rtc.model.v20180111.DescribeRtcScaleDetailResponse.ScaleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcScaleDetailResponseUnmarshaller {

	public static DescribeRtcScaleDetailResponse unmarshall(DescribeRtcScaleDetailResponse describeRtcScaleDetailResponse, UnmarshallerContext _ctx) {
		
		describeRtcScaleDetailResponse.setRequestId(_ctx.stringValue("DescribeRtcScaleDetailResponse.RequestId"));

		List<ScaleItem> scale = new ArrayList<ScaleItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRtcScaleDetailResponse.Scale.Length"); i++) {
			ScaleItem scaleItem = new ScaleItem();
			scaleItem.setTS(_ctx.stringValue("DescribeRtcScaleDetailResponse.Scale["+ i +"].TS"));
			scaleItem.setCC(_ctx.longValue("DescribeRtcScaleDetailResponse.Scale["+ i +"].CC"));
			scaleItem.setUC(_ctx.longValue("DescribeRtcScaleDetailResponse.Scale["+ i +"].UC"));

			scale.add(scaleItem);
		}
		describeRtcScaleDetailResponse.setScale(scale);
	 
	 	return describeRtcScaleDetailResponse;
	}
}