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

import com.aliyuncs.qualitycheck.model.v20190115.GetResultReviewListResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetResultReviewListResponse.TaskResultReviewInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResultReviewListResponseUnmarshaller {

	public static GetResultReviewListResponse unmarshall(GetResultReviewListResponse getResultReviewListResponse, UnmarshallerContext context) {
		
		getResultReviewListResponse.setRequestId(context.stringValue("GetResultReviewListResponse.RequestId"));
		getResultReviewListResponse.setSuccess(context.booleanValue("GetResultReviewListResponse.Success"));
		getResultReviewListResponse.setCode(context.stringValue("GetResultReviewListResponse.Code"));
		getResultReviewListResponse.setMessage(context.stringValue("GetResultReviewListResponse.Message"));
		getResultReviewListResponse.setPageSize(context.integerValue("GetResultReviewListResponse.PageSize"));
		getResultReviewListResponse.setDataSize(context.integerValue("GetResultReviewListResponse.DataSize"));
		getResultReviewListResponse.setTotalCount(context.integerValue("GetResultReviewListResponse.TotalCount"));

		List<TaskResultReviewInfo> data = new ArrayList<TaskResultReviewInfo>();
		for (int i = 0; i < context.lengthValue("GetResultReviewListResponse.Data.Length"); i++) {
			TaskResultReviewInfo taskResultReviewInfo = new TaskResultReviewInfo();
			taskResultReviewInfo.setBucketName(context.stringValue("GetResultReviewListResponse.Data["+ i +"].BucketName"));
			taskResultReviewInfo.setFileName(context.stringValue("GetResultReviewListResponse.Data["+ i +"].FileName"));
			taskResultReviewInfo.setHitNumber(context.integerValue("GetResultReviewListResponse.Data["+ i +"].HitNumber"));
			taskResultReviewInfo.setNextVid(context.stringValue("GetResultReviewListResponse.Data["+ i +"].NextVid"));
			taskResultReviewInfo.setIsHitRule(context.booleanValue("GetResultReviewListResponse.Data["+ i +"].IsHitRule"));
			taskResultReviewInfo.setVid(context.stringValue("GetResultReviewListResponse.Data["+ i +"].Vid"));
			taskResultReviewInfo.setHitRule(context.booleanValue("GetResultReviewListResponse.Data["+ i +"].HitRule"));
			taskResultReviewInfo.setFileMergeName(context.stringValue("GetResultReviewListResponse.Data["+ i +"].FileMergeName"));
			taskResultReviewInfo.setStatus(context.integerValue("GetResultReviewListResponse.Data["+ i +"].Status"));
			taskResultReviewInfo.setRealViolationNumber(context.integerValue("GetResultReviewListResponse.Data["+ i +"].RealViolationNumber"));
			taskResultReviewInfo.setHandTaskFile(context.booleanValue("GetResultReviewListResponse.Data["+ i +"].HandTaskFile"));
			taskResultReviewInfo.setReviewAccuracyRate(context.floatValue("GetResultReviewListResponse.Data["+ i +"].ReviewAccuracyRate"));
			taskResultReviewInfo.setTotalScore(context.integerValue("GetResultReviewListResponse.Data["+ i +"].TotalScore"));
			taskResultReviewInfo.setPreVid(context.stringValue("GetResultReviewListResponse.Data["+ i +"].PreVid"));
			taskResultReviewInfo.setTaskId(context.stringValue("GetResultReviewListResponse.Data["+ i +"].TaskId"));
			taskResultReviewInfo.setCheckNumber(context.integerValue("GetResultReviewListResponse.Data["+ i +"].CheckNumber"));
			taskResultReviewInfo.setDataType(context.integerValue("GetResultReviewListResponse.Data["+ i +"].DataType"));

			List<String> hitRuleSet = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetResultReviewListResponse.Data["+ i +"].HitRuleSet.Length"); j++) {
				hitRuleSet.add(context.stringValue("GetResultReviewListResponse.Data["+ i +"].HitRuleSet["+ j +"]"));
			}
			taskResultReviewInfo.setHitRuleSet(hitRuleSet);

			data.add(taskResultReviewInfo);
		}
		getResultReviewListResponse.setData(data);
	 
	 	return getResultReviewListResponse;
	}
}