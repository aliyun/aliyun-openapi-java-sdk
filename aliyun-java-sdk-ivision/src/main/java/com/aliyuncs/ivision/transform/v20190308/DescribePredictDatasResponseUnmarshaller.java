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

import com.aliyuncs.ivision.model.v20190308.DescribePredictDatasResponse;
import com.aliyuncs.ivision.model.v20190308.DescribePredictDatasResponse.PredictData;
import com.aliyuncs.ivision.model.v20190308.DescribePredictDatasResponse.PredictData.PredictionResult;
import com.aliyuncs.ivision.model.v20190308.DescribePredictDatasResponse.PredictData.PredictionResult.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePredictDatasResponseUnmarshaller {

	public static DescribePredictDatasResponse unmarshall(DescribePredictDatasResponse describePredictDatasResponse, UnmarshallerContext context) {
		
		describePredictDatasResponse.setRequestId(context.stringValue("DescribePredictDatasResponse.RequestId"));
		describePredictDatasResponse.setTotalNum(context.longValue("DescribePredictDatasResponse.TotalNum"));
		describePredictDatasResponse.setCurrentPage(context.longValue("DescribePredictDatasResponse.CurrentPage"));
		describePredictDatasResponse.setPageSize(context.longValue("DescribePredictDatasResponse.PageSize"));
		describePredictDatasResponse.setNextPageToken(context.stringValue("DescribePredictDatasResponse.NextPageToken"));

		List<PredictData> predictDatas = new ArrayList<PredictData>();
		for (int i = 0; i < context.lengthValue("DescribePredictDatasResponse.PredictDatas.Length"); i++) {
			PredictData predictData = new PredictData();
			predictData.setProjectId(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].ProjectId"));
			predictData.setIterationId(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].IterationId"));
			predictData.setDataId(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].DataId"));
			predictData.setDataName(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].DataName"));
			predictData.setDataUrl(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].DataUrl"));
			predictData.setCreationTime(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].CreationTime"));
			predictData.setStatus(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].Status"));
			predictData.setErrorCode(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].ErrorCode"));
			predictData.setErrorMessage(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].ErrorMessage"));

			List<PredictionResult> predictionResults = new ArrayList<PredictionResult>();
			for (int j = 0; j < context.lengthValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults.Length"); j++) {
				PredictionResult predictionResult = new PredictionResult();
				predictionResult.setTagId(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults["+ j +"].TagId"));
				predictionResult.setTagName(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults["+ j +"].TagName"));
				predictionResult.setProbability(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults["+ j +"].Probability"));
				predictionResult.setOverlap(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults["+ j +"].Overlap"));
				predictionResult.setRegionType(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults["+ j +"].RegionType"));
				predictionResult.setProperties(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults["+ j +"].Properties"));

				Region region = new Region();
				region.setLeft(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults["+ j +"].Region.Left"));
				region.setTop(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults["+ j +"].Region.Top"));
				region.setWidth(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults["+ j +"].Region.Width"));
				region.setHeight(context.stringValue("DescribePredictDatasResponse.PredictDatas["+ i +"].PredictionResults["+ j +"].Region.Height"));
				predictionResult.setRegion(region);

				predictionResults.add(predictionResult);
			}
			predictData.setPredictionResults(predictionResults);

			predictDatas.add(predictData);
		}
		describePredictDatasResponse.setPredictDatas(predictDatas);
	 
	 	return describePredictDatasResponse;
	}
}