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

package com.aliyuncs.ivision.transform.v20190308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivision.model.v20190308.DescribeStreamPredictsResponse;
import com.aliyuncs.ivision.model.v20190308.DescribeStreamPredictsResponse.StreamPredict;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStreamPredictsResponseUnmarshaller {

	public static DescribeStreamPredictsResponse unmarshall(DescribeStreamPredictsResponse describeStreamPredictsResponse, UnmarshallerContext _ctx) {
		
		describeStreamPredictsResponse.setRequestId(_ctx.stringValue("DescribeStreamPredictsResponse.RequestId"));
		describeStreamPredictsResponse.setTotalNum(_ctx.longValue("DescribeStreamPredictsResponse.TotalNum"));
		describeStreamPredictsResponse.setPageSize(_ctx.longValue("DescribeStreamPredictsResponse.PageSize"));
		describeStreamPredictsResponse.setCurrentPage(_ctx.longValue("DescribeStreamPredictsResponse.CurrentPage"));
		describeStreamPredictsResponse.setNextPageToken(_ctx.stringValue("DescribeStreamPredictsResponse.NextPageToken"));

		List<StreamPredict> streamPredicts = new ArrayList<StreamPredict>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStreamPredictsResponse.StreamPredicts.Length"); i++) {
			StreamPredict streamPredict = new StreamPredict();
			streamPredict.setStatus(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].Status"));
			streamPredict.setStreamType(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].StreamType"));
			streamPredict.setProbabilityThresholds(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].ProbabilityThresholds"));
			streamPredict.setStreamId(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].StreamId"));
			streamPredict.setUserData(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].UserData"));
			streamPredict.setNotify(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].Notify"));
			streamPredict.setPredictId(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].PredictId"));
			streamPredict.setDetectIntervals(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].DetectIntervals"));
			streamPredict.setModelUserData(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].ModelUserData"));
			streamPredict.setPredictTemplateId(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].PredictTemplateId"));
			streamPredict.setOutput(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].Output"));
			streamPredict.setCreationTime(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].CreationTime"));
			streamPredict.setModelIds(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].ModelIds"));
			streamPredict.setFaceGroupId(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].FaceGroupId"));
			streamPredict.setAutoStart(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].AutoStart"));

			streamPredicts.add(streamPredict);
		}
		describeStreamPredictsResponse.setStreamPredicts(streamPredicts);
	 
	 	return describeStreamPredictsResponse;
	}
}