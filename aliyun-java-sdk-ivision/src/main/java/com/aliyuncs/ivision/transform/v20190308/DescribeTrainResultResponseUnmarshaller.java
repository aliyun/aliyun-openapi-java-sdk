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

import com.aliyuncs.ivision.model.v20190308.DescribeTrainResultResponse;
import com.aliyuncs.ivision.model.v20190308.DescribeTrainResultResponse.TrainResult;
import com.aliyuncs.ivision.model.v20190308.DescribeTrainResultResponse.TrainResult.TagResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTrainResultResponseUnmarshaller {

	public static DescribeTrainResultResponse unmarshall(DescribeTrainResultResponse describeTrainResultResponse, UnmarshallerContext context) {
		
		describeTrainResultResponse.setRequestId(context.stringValue("DescribeTrainResultResponse.RequestId"));

		TrainResult trainResult = new TrainResult();
		trainResult.setProjectId(context.stringValue("DescribeTrainResultResponse.TrainResult.ProjectId"));
		trainResult.setIterationId(context.stringValue("DescribeTrainResultResponse.TrainResult.IterationId"));
		trainResult.setIterationName(context.stringValue("DescribeTrainResultResponse.TrainResult.IterationName"));
		trainResult.setPrecision(context.stringValue("DescribeTrainResultResponse.TrainResult.Precision"));
		trainResult.setRecall(context.stringValue("DescribeTrainResultResponse.TrainResult.Recall"));
		trainResult.setMAP(context.stringValue("DescribeTrainResultResponse.TrainResult.MAP"));
		trainResult.setThreshold(context.stringValue("DescribeTrainResultResponse.TrainResult.Threshold"));
		trainResult.setStatus(context.stringValue("DescribeTrainResultResponse.TrainResult.Status"));
		trainResult.setStartTime(context.stringValue("DescribeTrainResultResponse.TrainResult.StartTime"));
		trainResult.setEndTime(context.stringValue("DescribeTrainResultResponse.TrainResult.EndTime"));
		trainResult.setErrorCode(context.stringValue("DescribeTrainResultResponse.TrainResult.ErrorCode"));
		trainResult.setErrorMessage(context.stringValue("DescribeTrainResultResponse.TrainResult.ErrorMessage"));

		List<TagResult> tagResults = new ArrayList<TagResult>();
		for (int i = 0; i < context.lengthValue("DescribeTrainResultResponse.TrainResult.TagResults.Length"); i++) {
			TagResult tagResult = new TagResult();
			tagResult.setTagId(context.stringValue("DescribeTrainResultResponse.TrainResult.TagResults["+ i +"].TagId"));
			tagResult.setTagName(context.stringValue("DescribeTrainResultResponse.TrainResult.TagResults["+ i +"].TagName"));
			tagResult.setPrecision(context.stringValue("DescribeTrainResultResponse.TrainResult.TagResults["+ i +"].Precision"));
			tagResult.setRecall(context.stringValue("DescribeTrainResultResponse.TrainResult.TagResults["+ i +"].Recall"));
			tagResult.setAP(context.stringValue("DescribeTrainResultResponse.TrainResult.TagResults["+ i +"].AP"));

			tagResults.add(tagResult);
		}
		trainResult.setTagResults(tagResults);
		describeTrainResultResponse.setTrainResult(trainResult);
	 
	 	return describeTrainResultResponse;
	}
}