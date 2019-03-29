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
import com.aliyuncs.ivision.model.v20190308.DescribeStreamPredictResultResponse.StreamPredictData.PredictionResult;
import com.aliyuncs.ivision.model.v20190308.DescribeStreamPredictResultResponse.StreamPredictData.PredictionResult.Properties;
import com.aliyuncs.ivision.model.v20190308.DescribeStreamPredictResultResponse.StreamPredictData.PredictionResult.Region;
import com.aliyuncs.ivision.model.v20190308.DescribeStreamPredictResultResponse.StreamPredictData.ResultStatisticsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStreamPredictResultResponseUnmarshaller {

	public static DescribeStreamPredictResultResponse unmarshall(DescribeStreamPredictResultResponse describeStreamPredictResultResponse, UnmarshallerContext context) {
		
		describeStreamPredictResultResponse.setRequestId(context.stringValue("DescribeStreamPredictResultResponse.RequestId"));
		describeStreamPredictResultResponse.setTotalNum(context.longValue("DescribeStreamPredictResultResponse.TotalNum"));
		describeStreamPredictResultResponse.setCurrentPage(context.longValue("DescribeStreamPredictResultResponse.CurrentPage"));
		describeStreamPredictResultResponse.setPageSize(context.longValue("DescribeStreamPredictResultResponse.PageSize"));
		describeStreamPredictResultResponse.setNextPageToken(context.stringValue("DescribeStreamPredictResultResponse.NextPageToken"));

		List<StreamPredictData> streamPredictDatas = new ArrayList<StreamPredictData>();
		for (int i = 0; i < context.lengthValue("DescribeStreamPredictResultResponse.StreamPredictDatas.Length"); i++) {
			StreamPredictData streamPredictData = new StreamPredictData();
			streamPredictData.setPredictId(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictId"));
			streamPredictData.setModelId(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].ModelId"));
			streamPredictData.setDataUrl(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].DataUrl"));
			streamPredictData.setStreamTimestamp(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].StreamTimestamp"));
			streamPredictData.setPredictTime(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictTime"));
			streamPredictData.setStatus(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].Status"));

			List<ResultStatisticsItem> resultStatistics = new ArrayList<ResultStatisticsItem>();
			for (int j = 0; j < context.lengthValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].ResultStatistics.Length"); j++) {
				ResultStatisticsItem resultStatisticsItem = new ResultStatisticsItem();
				resultStatisticsItem.setTagId(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].ResultStatistics["+ j +"].TagId"));
				resultStatisticsItem.setTagName(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].ResultStatistics["+ j +"].TagName"));
				resultStatisticsItem.setCount(context.longValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].ResultStatistics["+ j +"].Count"));

				resultStatistics.add(resultStatisticsItem);
			}
			streamPredictData.setResultStatistics(resultStatistics);

			List<PredictionResult> predictionResults = new ArrayList<PredictionResult>();
			for (int j = 0; j < context.lengthValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults.Length"); j++) {
				PredictionResult predictionResult = new PredictionResult();
				predictionResult.setTagId(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].TagId"));
				predictionResult.setTagName(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].TagName"));
				predictionResult.setProbability(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].Probability"));
				predictionResult.setOverlap(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].Overlap"));
				predictionResult.setRegionType(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].RegionType"));

				Region region = new Region();
				region.setLeft(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].Region.Left"));
				region.setTop(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].Region.Top"));
				region.setWidth(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].Region.Width"));
				region.setHeight(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].Region.Height"));
				predictionResult.setRegion(region);

				Properties properties = new Properties();
				properties.setWithGloves(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].Properties.WithGloves"));
				properties.setWithGlovesProbability(context.stringValue("DescribeStreamPredictResultResponse.StreamPredictDatas["+ i +"].PredictionResults["+ j +"].Properties.WithGlovesProbability"));
				predictionResult.setProperties(properties);

				predictionResults.add(predictionResult);
			}
			streamPredictData.setPredictionResults(predictionResults);

			streamPredictDatas.add(streamPredictData);
		}
		describeStreamPredictResultResponse.setStreamPredictDatas(streamPredictDatas);
	 
	 	return describeStreamPredictResultResponse;
	}
}