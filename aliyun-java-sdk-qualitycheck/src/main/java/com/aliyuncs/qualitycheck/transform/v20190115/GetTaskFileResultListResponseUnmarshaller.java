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

	public static GetTaskFileResultListResponse unmarshall(GetTaskFileResultListResponse getTaskFileResultListResponse, UnmarshallerContext _ctx) {
		
		getTaskFileResultListResponse.setRequestId(_ctx.stringValue("GetTaskFileResultListResponse.RequestId"));
		getTaskFileResultListResponse.setSuccess(_ctx.booleanValue("GetTaskFileResultListResponse.Success"));
		getTaskFileResultListResponse.setCode(_ctx.stringValue("GetTaskFileResultListResponse.Code"));
		getTaskFileResultListResponse.setMessage(_ctx.stringValue("GetTaskFileResultListResponse.Message"));
		getTaskFileResultListResponse.setPageSize(_ctx.integerValue("GetTaskFileResultListResponse.PageSize"));
		getTaskFileResultListResponse.setDataSize(_ctx.integerValue("GetTaskFileResultListResponse.DataSize"));
		getTaskFileResultListResponse.setTotalCount(_ctx.integerValue("GetTaskFileResultListResponse.TotalCount"));

		List<TaskResultReviewInfo> data = new ArrayList<TaskResultReviewInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskFileResultListResponse.Data.Length"); i++) {
			TaskResultReviewInfo taskResultReviewInfo = new TaskResultReviewInfo();
			taskResultReviewInfo.setBucketName(_ctx.stringValue("GetTaskFileResultListResponse.Data["+ i +"].BucketName"));
			taskResultReviewInfo.setFileName(_ctx.stringValue("GetTaskFileResultListResponse.Data["+ i +"].FileName"));
			taskResultReviewInfo.setHitNumber(_ctx.integerValue("GetTaskFileResultListResponse.Data["+ i +"].HitNumber"));
			taskResultReviewInfo.setNextVid(_ctx.stringValue("GetTaskFileResultListResponse.Data["+ i +"].NextVid"));
			taskResultReviewInfo.setIsHitRule(_ctx.booleanValue("GetTaskFileResultListResponse.Data["+ i +"].IsHitRule"));
			taskResultReviewInfo.setVid(_ctx.stringValue("GetTaskFileResultListResponse.Data["+ i +"].Vid"));
			taskResultReviewInfo.setHitRule(_ctx.booleanValue("GetTaskFileResultListResponse.Data["+ i +"].HitRule"));
			taskResultReviewInfo.setFileMergeName(_ctx.stringValue("GetTaskFileResultListResponse.Data["+ i +"].FileMergeName"));
			taskResultReviewInfo.setStatus(_ctx.integerValue("GetTaskFileResultListResponse.Data["+ i +"].Status"));
			taskResultReviewInfo.setRealViolationNumber(_ctx.integerValue("GetTaskFileResultListResponse.Data["+ i +"].RealViolationNumber"));
			taskResultReviewInfo.setHandTaskFile(_ctx.booleanValue("GetTaskFileResultListResponse.Data["+ i +"].HandTaskFile"));
			taskResultReviewInfo.setReviewAccuracyRate(_ctx.floatValue("GetTaskFileResultListResponse.Data["+ i +"].ReviewAccuracyRate"));
			taskResultReviewInfo.setTotalScore(_ctx.integerValue("GetTaskFileResultListResponse.Data["+ i +"].TotalScore"));
			taskResultReviewInfo.setPreVid(_ctx.stringValue("GetTaskFileResultListResponse.Data["+ i +"].PreVid"));
			taskResultReviewInfo.setTaskId(_ctx.stringValue("GetTaskFileResultListResponse.Data["+ i +"].TaskId"));
			taskResultReviewInfo.setCheckNumber(_ctx.integerValue("GetTaskFileResultListResponse.Data["+ i +"].CheckNumber"));
			taskResultReviewInfo.setDataType(_ctx.integerValue("GetTaskFileResultListResponse.Data["+ i +"].DataType"));

			List<String> hitRuleSet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskFileResultListResponse.Data["+ i +"].HitRuleSet.Length"); j++) {
				hitRuleSet.add(_ctx.stringValue("GetTaskFileResultListResponse.Data["+ i +"].HitRuleSet["+ j +"]"));
			}
			taskResultReviewInfo.setHitRuleSet(hitRuleSet);

			data.add(taskResultReviewInfo);
		}
		getTaskFileResultListResponse.setData(data);
	 
	 	return getTaskFileResultListResponse;
	}
}