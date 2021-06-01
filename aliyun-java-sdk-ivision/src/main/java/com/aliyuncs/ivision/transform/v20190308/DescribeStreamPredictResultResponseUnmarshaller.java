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

import com.aliyuncs.ivision.model.v20190308.DescribeStreamPredictResultResponse;
import com.aliyuncs.ivision.model.v20190308.DescribeStreamPredictResultResponse.StreamPredictData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStreamPredictResultResponseUnmarshaller {

	public static DescribeStreamPredictResultResponse unmarshall(DescribeStreamPredictResultResponse describeStreamPredictResultResponse, UnmarshallerContext _ctx) {
		
		describeStreamPredictResultResponse.setRequestId(_ctx.stringValue("DescribeStreamPredictResultResponse.RequestId"));
		describeStreamPredictResultResponse.setTotalNum(_ctx.longValue("DescribeStreamPredictResultResponse.TotalNum"));
		describeStreamPredictResultResponse.setPageSize(_ctx.longValue("DescribeStreamPredictResultResponse.PageSize"));
		describeStreamPredictResultResponse.setCurrentPage(_ctx.longValue("DescribeStreamPredictResultResponse.CurrentPage"));
		describeStreamPredictResultResponse.setNextPageToken(_ctx.stringValue("DescribeStreamPredictResultResponse.NextPageToken"));

		List<StreamPredictData> streamPredictDatas = new ArrayList<StreamPredictData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStreamPredictResultResponse.StreamPredictDatas.Length"); i++) {
			StreamPredictData streamPredictData = new StreamPredictData();
			streamPredictData.setStatus(_ctx.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].Status"));
			streamPredictData.setPredictResult(_ctx.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictResult"));
			streamPredictData.setPredictId(_ctx.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictId"));
			streamPredictData.setPredictTime(_ctx.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictTime"));
			streamPredictData.setDataUrl(_ctx.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].DataUrl"));
			streamPredictData.setTimestamp(_ctx.longValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].Timestamp"));
			streamPredictData.setModelId(_ctx.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].ModelId"));

			streamPredictDatas.add(streamPredictData);
		}
		describeStreamPredictResultResponse.setStreamPredictDatas(streamPredictDatas);
	 
	 	return describeStreamPredictResultResponse;
	}
}