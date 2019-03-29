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

	public static DescribeStreamPredictsResponse unmarshall(DescribeStreamPredictsResponse describeStreamPredictsResponse, UnmarshallerContext context) {
		
		describeStreamPredictsResponse.setRequestId(context.stringValue("DescribeStreamPredictsResponse.RequestId"));
		describeStreamPredictsResponse.setTotalNum(context.longValue("DescribeStreamPredictsResponse.TotalNum"));
		describeStreamPredictsResponse.setCurrentPage(context.longValue("DescribeStreamPredictsResponse.CurrentPage"));
		describeStreamPredictsResponse.setPageSize(context.longValue("DescribeStreamPredictsResponse.PageSize"));
		describeStreamPredictsResponse.setNextPageToken(context.stringValue("DescribeStreamPredictsResponse.NextPageToken"));

		List<StreamPredict> streamPredicts = new ArrayList<StreamPredict>();
		for (int i = 0; i < context.lengthValue("DescribeStreamPredictsResponse.StreamPredicts.Length"); i++) {
			StreamPredict streamPredict = new StreamPredict();
			streamPredict.setPredictId(context.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].PredictId"));
			streamPredict.setStreamType(context.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].StreamType"));
			streamPredict.setStreamId(context.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].StreamId"));
			streamPredict.setModelIds(context.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].ModelIds"));
			streamPredict.setProbabilityThresholds(context.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].ProbabilityThresholds"));
			streamPredict.setOutput(context.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].Output"));
			streamPredict.setNotify(context.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].Notify"));
			streamPredict.setUserData(context.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].UserData"));
			streamPredict.setCreationTime(context.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].CreationTime"));
			streamPredict.setStatus(context.stringValue("DescribeStreamPredictsResponse.StreamPredicts["+ i +"].Status"));

			streamPredicts.add(streamPredict);
		}
		describeStreamPredictsResponse.setStreamPredicts(streamPredicts);
	 
	 	return describeStreamPredictsResponse;
	}
}