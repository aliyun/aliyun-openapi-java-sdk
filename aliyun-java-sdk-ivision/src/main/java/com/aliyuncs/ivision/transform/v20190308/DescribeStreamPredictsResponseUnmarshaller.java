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
		describeStreamPredictsResponse.setCurrentPage(_ctx.longValue("DescribeStreamPredictsResponse.CurrentPage"));
		describeStreamPredictsResponse.setPageSize(_ctx.longValue("DescribeStreamPredictsResponse.PageSize"));
		describeStreamPredictsResponse.setNextPageToken(_ctx.stringValue("DescribeStreamPredictsResponse.NextPageToken"));

		List<StreamPredict> streamPredicts = new ArrayList<StreamPredict>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStreamPredictsResponse.StreamPredicts.Length"); i++) {
			StreamPredict streamPredict = new StreamPredict();
			streamPredict.setPredictId(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].PredictId"));
			streamPredict.setPredictTemplateId(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].PredictTemplateId"));
			streamPredict.setStreamType(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].StreamType"));
			streamPredict.setStreamId(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].StreamId"));
			streamPredict.setModelIds(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].ModelIds"));
			streamPredict.setProbabilityThresholds(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].ProbabilityThresholds"));
			streamPredict.setDetectIntervals(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].DetectIntervals"));
			streamPredict.setOutput(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].Output"));
			streamPredict.setNotify(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].Notify"));
			streamPredict.setUserData(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].UserData"));
			streamPredict.setFaceGroupId(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].FaceGroupId"));
			streamPredict.setModelUserData(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].ModelUserData"));
			streamPredict.setCreationTime(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].CreationTime"));
			streamPredict.setAutoStart(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].AutoStart"));
			streamPredict.setStatus(_ctx.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].Status"));

			streamPredicts.add(streamPredict);
		}
		describeStreamPredictsResponse.setStreamPredicts(streamPredicts);
	 
	 	return describeStreamPredictsResponse;
	}
}