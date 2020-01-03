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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.GetCloudMetricProfilingResponse;
import com.aliyuncs.ehpc.model.v20180412.GetCloudMetricProfilingResponse.SvgInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCloudMetricProfilingResponseUnmarshaller {

	public static GetCloudMetricProfilingResponse unmarshall(GetCloudMetricProfilingResponse getCloudMetricProfilingResponse, UnmarshallerContext _ctx) {
		
		getCloudMetricProfilingResponse.setRequestId(_ctx.stringValue("GetCloudMetricProfilingResponse.RequestId"));

		List<SvgInfo> svgUrls = new ArrayList<SvgInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetCloudMetricProfilingResponse.SvgUrls.Length"); i++) {
			SvgInfo svgInfo = new SvgInfo();
			svgInfo.setName(_ctx.stringValue("GetCloudMetricProfilingResponse.SvgUrls["+ i +"].Name"));
			svgInfo.setType(_ctx.stringValue("GetCloudMetricProfilingResponse.SvgUrls["+ i +"].Type"));
			svgInfo.setUrl(_ctx.stringValue("GetCloudMetricProfilingResponse.SvgUrls["+ i +"].Url"));
			svgInfo.setSize(_ctx.integerValue("GetCloudMetricProfilingResponse.SvgUrls["+ i +"].Size"));

			svgUrls.add(svgInfo);
		}
		getCloudMetricProfilingResponse.setSvgUrls(svgUrls);
	 
	 	return getCloudMetricProfilingResponse;
	}
}