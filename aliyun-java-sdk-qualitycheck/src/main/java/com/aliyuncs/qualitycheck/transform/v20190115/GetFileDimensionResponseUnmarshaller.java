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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.GetFileDimensionResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetFileDimensionResponse.TaskResultReviewInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileDimensionResponseUnmarshaller {

	public static GetFileDimensionResponse unmarshall(GetFileDimensionResponse getFileDimensionResponse, UnmarshallerContext context) {
		
		getFileDimensionResponse.setRequestId(context.stringValue("GetFileDimensionResponse.RequestId"));
		getFileDimensionResponse.setSuccess(context.booleanValue("GetFileDimensionResponse.Success"));
		getFileDimensionResponse.setCode(context.stringValue("GetFileDimensionResponse.Code"));
		getFileDimensionResponse.setMessage(context.stringValue("GetFileDimensionResponse.Message"));
		getFileDimensionResponse.setPageSize(context.integerValue("GetFileDimensionResponse.PageSize"));
		getFileDimensionResponse.setDataSize(context.integerValue("GetFileDimensionResponse.DataSize"));
		getFileDimensionResponse.setTotalCount(context.integerValue("GetFileDimensionResponse.TotalCount"));

		List<TaskResultReviewInfo> data = new ArrayList<TaskResultReviewInfo>();
		for (int i = 0; i < context.lengthValue("GetFileDimensionResponse.Data.Length"); i++) {
			TaskResultReviewInfo taskResultReviewInfo = new TaskResultReviewInfo();
			taskResultReviewInfo.setBucketName(context.stringValue("GetFileDimensionResponse.Data["+ i +"].BucketName"));
			taskResultReviewInfo.setFileName(context.stringValue("GetFileDimensionResponse.Data["+ i +"].FileName"));
			taskResultReviewInfo.setHitNumber(context.integerValue("GetFileDimensionResponse.Data["+ i +"].HitNumber"));
			taskResultReviewInfo.setNextVid(context.stringValue("GetFileDimensionResponse.Data["+ i +"].NextVid"));
			taskResultReviewInfo.setIsHitRule(context.booleanValue("GetFileDimensionResponse.Data["+ i +"].IsHitRule"));
			taskResultReviewInfo.setVid(context.stringValue("GetFileDimensionResponse.Data["+ i +"].Vid"));
			taskResultReviewInfo.setHitRule(context.booleanValue("GetFileDimensionResponse.Data["+ i +"].HitRule"));
			taskResultReviewInfo.setFileMergeName(context.stringValue("GetFileDimensionResponse.Data["+ i +"].FileMergeName"));
			taskResultReviewInfo.setStatus(context.integerValue("GetFileDimensionResponse.Data["+ i +"].Status"));
			taskResultReviewInfo.setRealViolationNumber(context.integerValue("GetFileDimensionResponse.Data["+ i +"].RealViolationNumber"));
			taskResultReviewInfo.setHandTaskFile(context.booleanValue("GetFileDimensionResponse.Data["+ i +"].HandTaskFile"));
			taskResultReviewInfo.setReviewAccuracyRate(context.floatValue("GetFileDimensionResponse.Data["+ i +"].ReviewAccuracyRate"));
			taskResultReviewInfo.setTotalScore(context.integerValue("GetFileDimensionResponse.Data["+ i +"].TotalScore"));
			taskResultReviewInfo.setPreVid(context.stringValue("GetFileDimensionResponse.Data["+ i +"].PreVid"));
			taskResultReviewInfo.setTaskId(context.stringValue("GetFileDimensionResponse.Data["+ i +"].TaskId"));
			taskResultReviewInfo.setCheckNumber(context.integerValue("GetFileDimensionResponse.Data["+ i +"].CheckNumber"));
			taskResultReviewInfo.setDataType(context.integerValue("GetFileDimensionResponse.Data["+ i +"].DataType"));

			List<String> hitRuleSet = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetFileDimensionResponse.Data["+ i +"].HitRuleSet.Length"); j++) {
				hitRuleSet.add(context.stringValue("GetFileDimensionResponse.Data["+ i +"].HitRuleSet["+ j +"]"));
			}
			taskResultReviewInfo.setHitRuleSet(hitRuleSet);

			data.add(taskResultReviewInfo);
		}
		getFileDimensionResponse.setData(data);
	 
	 	return getFileDimensionResponse;
	}
}