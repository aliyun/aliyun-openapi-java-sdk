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

package com.aliyuncs.green.transform.v20170823;

import com.aliyuncs.green.model.v20170823.DescribeOssIncrementOverviewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssIncrementOverviewResponseUnmarshaller {

	public static DescribeOssIncrementOverviewResponse unmarshall(DescribeOssIncrementOverviewResponse describeOssIncrementOverviewResponse, UnmarshallerContext _ctx) {
		
		describeOssIncrementOverviewResponse.setRequestId(_ctx.stringValue("DescribeOssIncrementOverviewResponse.RequestId"));
		describeOssIncrementOverviewResponse.setImageCount(_ctx.integerValue("DescribeOssIncrementOverviewResponse.ImageCount"));
		describeOssIncrementOverviewResponse.setVideoCount(_ctx.integerValue("DescribeOssIncrementOverviewResponse.VideoCount"));
		describeOssIncrementOverviewResponse.setVideoFrameCount(_ctx.integerValue("DescribeOssIncrementOverviewResponse.VideoFrameCount"));
		describeOssIncrementOverviewResponse.setPornUnhandleCount(_ctx.integerValue("DescribeOssIncrementOverviewResponse.PornUnhandleCount"));
		describeOssIncrementOverviewResponse.setTerrorismUnhandleCount(_ctx.integerValue("DescribeOssIncrementOverviewResponse.TerrorismUnhandleCount"));
	 
	 	return describeOssIncrementOverviewResponse;
	}
}