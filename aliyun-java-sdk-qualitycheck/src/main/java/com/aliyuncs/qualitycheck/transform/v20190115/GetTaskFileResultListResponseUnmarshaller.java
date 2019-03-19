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

import com.aliyuncs.qualitycheck.model.v20190115.GetTaskFileResultListResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetTaskFileResultListResponse.TaskResultReviewInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskFileResultListResponseUnmarshaller {

	public static GetTaskFileResultListResponse unmarshall(GetTaskFileResultListResponse getTaskFileResultListResponse, UnmarshallerContext context) {
		
		getTaskFileResultListResponse.setRequestId(context.stringValue("GetTaskFileResultListResponse.RequestId"));
		getTaskFileResultListResponse.setSuccess(context.booleanValue("GetTaskFileResultListResponse.Success"));
		getTaskFileResultListResponse.setCode(context.stringValue("GetTaskFileResultListResponse.Code"));
		getTaskFileResultListResponse.setMessage(context.stringValue("GetTaskFileResultListResponse.Message"));
		getTaskFileResultListResponse.setPageSize(context.integerValue("GetTaskFileResultListResponse.PageSize"));
		getTaskFileResultListResponse.setDataSize(context.integerValue("GetTaskFileResultListResponse.DataSize"));
		getTaskFileResultListResponse.setTotalCount(context.integerValue("GetTaskFileResultListResponse.TotalCount"));

		List<TaskResultReviewInfo> data = new ArrayList<TaskResultReviewInfo>();
		for (int i = 0; i < context.lengthValue("GetTaskFileResultListResponse.Data.Length"); i++) {
			TaskResultReviewInfo taskResultReviewInfo = new TaskResultReviewInfo();
			taskResultReviewInfo.setBucketName(context.stringValue("GetTaskFileResultListResponse.Data["+ i +"].BucketName"));
			taskResultReviewInfo.setFileName(context.stringValue("GetTaskFileResultListResponse.Data["+ i +"].FileName"));
			taskResultReviewInfo.setHitNumber(context.integerValue("GetTaskFileResultListResponse.Data["+ i +"].HitNumber"));
			taskResultReviewInfo.setNextVid(context.stringValue("GetTaskFileResultListResponse.Data["+ i +"].NextVid"));
			taskResultReviewInfo.setIsHitRule(context.booleanValue("GetTaskFileResultListResponse.Data["+ i +"].IsHitRule"));
			taskResultReviewInfo.setVid(context.stringValue("GetTaskFileResultListResponse.Data["+ i +"].Vid"));
			taskResultReviewInfo.setHitRule(context.booleanValue("GetTaskFileResultListResponse.Data["+ i +"].HitRule"));
			taskResultReviewInfo.setFileMergeName(context.stringValue("GetTaskFileResultListResponse.Data["+ i +"].FileMergeName"));
			taskResultReviewInfo.setStatus(context.integerValue("GetTaskFileResultListResponse.Data["+ i +"].Status"));
			taskResultReviewInfo.setRealViolationNumber(context.integerValue("GetTaskFileResultListResponse.Data["+ i +"].RealViolationNumber"));
			taskResultReviewInfo.setHandTaskFile(context.booleanValue("GetTaskFileResultListResponse.Data["+ i +"].HandTaskFile"));
			taskResultReviewInfo.setReviewAccuracyRate(context.floatValue("GetTaskFileResultListResponse.Data["+ i +"].ReviewAccuracyRate"));
			taskResultReviewInfo.setTotalScore(context.integerValue("GetTaskFileResultListResponse.Data["+ i +"].TotalScore"));
			taskResultReviewInfo.setPreVid(context.stringValue("GetTaskFileResultListResponse.Data["+ i +"].PreVid"));
			taskResultReviewInfo.setTaskId(context.stringValue("GetTaskFileResultListResponse.Data["+ i +"].TaskId"));
			taskResultReviewInfo.setCheckNumber(context.integerValue("GetTaskFileResultListResponse.Data["+ i +"].CheckNumber"));
			taskResultReviewInfo.setDataType(context.integerValue("GetTaskFileResultListResponse.Data["+ i +"].DataType"));

			List<String> hitRuleSet = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetTaskFileResultListResponse.Data["+ i +"].HitRuleSet.Length"); j++) {
				hitRuleSet.add(context.stringValue("GetTaskFileResultListResponse.Data["+ i +"].HitRuleSet["+ j +"]"));
			}
			taskResultReviewInfo.setHitRuleSet(hitRuleSet);

			data.add(taskResultReviewInfo);
		}
		getTaskFileResultListResponse.setData(data);
	 
	 	return getTaskFileResultListResponse;
	}
}