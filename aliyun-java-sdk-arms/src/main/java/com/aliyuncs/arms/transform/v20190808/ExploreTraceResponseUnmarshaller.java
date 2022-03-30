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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ExploreTraceResponse;
import com.aliyuncs.arms.model.v20190808.ExploreTraceResponse.SpanVO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExploreTraceResponseUnmarshaller {

	public static ExploreTraceResponse unmarshall(ExploreTraceResponse exploreTraceResponse, UnmarshallerContext _ctx) {
		
		exploreTraceResponse.setRequestId(_ctx.stringValue("ExploreTraceResponse.RequestId"));

		List<SpanVO> spanVOs = new ArrayList<SpanVO>();
		for (int i = 0; i < _ctx.lengthValue("ExploreTraceResponse.SpanVOs.Length"); i++) {
			SpanVO spanVO = new SpanVO();
			spanVO.setTraceId(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].TraceId"));
			spanVO.setSpanId(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].SpanId"));
			spanVO.setParentSpanId(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].ParentSpanId"));
			spanVO.setStartTime(_ctx.longValue("ExploreTraceResponse.SpanVOs["+ i +"].StartTime"));
			spanVO.setDuration(_ctx.longValue("ExploreTraceResponse.SpanVOs["+ i +"].Duration"));
			spanVO.setKind(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].Kind"));
			spanVO.setPid(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].Pid"));
			spanVO.setServiceName(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].ServiceName"));
			spanVO.setSpanName(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].SpanName"));
			spanVO.setIp(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].Ip"));
			spanVO.setHostname(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].Hostname"));
			spanVO.setSampleIds(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].SampleIds"));
			spanVO.setStatusCode(_ctx.integerValue("ExploreTraceResponse.SpanVOs["+ i +"].StatusCode"));
			spanVO.setStatusMessage(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].StatusMessage"));
			spanVO.setAttributes(_ctx.mapValue("ExploreTraceResponse.SpanVOs["+ i +"].Attributes"));
			spanVO.setResource(_ctx.mapValue("ExploreTraceResponse.SpanVOs["+ i +"].Resource"));
			spanVO.setEvents(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].Events"));
			spanVO.setLinks(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].Links"));
			spanVO.setHiddenAttributes(_ctx.mapValue("ExploreTraceResponse.SpanVOs["+ i +"].HiddenAttributes"));
			spanVO.setMeta(_ctx.mapValue("ExploreTraceResponse.SpanVOs["+ i +"].Meta"));

			List<String> children = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExploreTraceResponse.SpanVOs["+ i +"].Children.Length"); j++) {
				children.add(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].Children["+ j +"]"));
			}
			spanVO.setChildren(children);

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExploreTraceResponse.SpanVOs["+ i +"].Labels.Length"); j++) {
				labels.add(_ctx.stringValue("ExploreTraceResponse.SpanVOs["+ i +"].Labels["+ j +"]"));
			}
			spanVO.setLabels(labels);

			spanVOs.add(spanVO);
		}
		exploreTraceResponse.setSpanVOs(spanVOs);
	 
	 	return exploreTraceResponse;
	}
}