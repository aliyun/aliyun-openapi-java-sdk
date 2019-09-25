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

	public static GetResultReviewListResponse unmarshall(GetResultReviewListResponse getResultReviewListResponse, UnmarshallerContext _ctx) {
		
		getResultReviewListResponse.setRequestId(_ctx.stringValue("GetResultReviewListResponse.RequestId"));
		getResultReviewListResponse.setSuccess(_ctx.booleanValue("GetResultReviewListResponse.Success"));
		getResultReviewListResponse.setCode(_ctx.stringValue("GetResultReviewListResponse.Code"));
		getResultReviewListResponse.setMessage(_ctx.stringValue("GetResultReviewListResponse.Message"));
		getResultReviewListResponse.setPageSize(_ctx.integerValue("GetResultReviewListResponse.PageSize"));
		getResultReviewListResponse.setDataSize(_ctx.integerValue("GetResultReviewListResponse.DataSize"));
		getResultReviewListResponse.setTotalCount(_ctx.integerValue("GetResultReviewListResponse.TotalCount"));

		List<TaskResultReviewInfo> data = new ArrayList<TaskResultReviewInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetResultReviewListResponse.Data.Length"); i++) {
			TaskResultReviewInfo taskResultReviewInfo = new TaskResultReviewInfo();
			taskResultReviewInfo.setBucketName(_ctx.stringValue("GetResultReviewListResponse.Data["+ i +"].BucketName"));
			taskResultReviewInfo.setFileName(_ctx.stringValue("GetResultReviewListResponse.Data["+ i +"].FileName"));
			taskResultReviewInfo.setHitNumber(_ctx.integerValue("GetResultReviewListResponse.Data["+ i +"].HitNumber"));
			taskResultReviewInfo.setNextVid(_ctx.stringValue("GetResultReviewListResponse.Data["+ i +"].NextVid"));
			taskResultReviewInfo.setIsHitRule(_ctx.booleanValue("GetResultReviewListResponse.Data["+ i +"].IsHitRule"));
			taskResultReviewInfo.setVid(_ctx.stringValue("GetResultReviewListResponse.Data["+ i +"].Vid"));
			taskResultReviewInfo.setHitRule(_ctx.booleanValue("GetResultReviewListResponse.Data["+ i +"].HitRule"));
			taskResultReviewInfo.setFileMergeName(_ctx.stringValue("GetResultReviewListResponse.Data["+ i +"].FileMergeName"));
			taskResultReviewInfo.setStatus(_ctx.integerValue("GetResultReviewListResponse.Data["+ i +"].Status"));
			taskResultReviewInfo.setRealViolationNumber(_ctx.integerValue("GetResultReviewListResponse.Data["+ i +"].RealViolationNumber"));
			taskResultReviewInfo.setHandTaskFile(_ctx.booleanValue("GetResultReviewListResponse.Data["+ i +"].HandTaskFile"));
			taskResultReviewInfo.setReviewAccuracyRate(_ctx.floatValue("GetResultReviewListResponse.Data["+ i +"].ReviewAccuracyRate"));
			taskResultReviewInfo.setTotalScore(_ctx.integerValue("GetResultReviewListResponse.Data["+ i +"].TotalScore"));
			taskResultReviewInfo.setPreVid(_ctx.stringValue("GetResultReviewListResponse.Data["+ i +"].PreVid"));
			taskResultReviewInfo.setTaskId(_ctx.stringValue("GetResultReviewListResponse.Data["+ i +"].TaskId"));
			taskResultReviewInfo.setCheckNumber(_ctx.integerValue("GetResultReviewListResponse.Data["+ i +"].CheckNumber"));
			taskResultReviewInfo.setDataType(_ctx.integerValue("GetResultReviewListResponse.Data["+ i +"].DataType"));

			List<String> hitRuleSet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetResultReviewListResponse.Data["+ i +"].HitRuleSet.Length"); j++) {
				hitRuleSet.add(_ctx.stringValue("GetResultReviewListResponse.Data["+ i +"].HitRuleSet["+ j +"]"));
			}
			taskResultReviewInfo.setHitRuleSet(hitRuleSet);

			data.add(taskResultReviewInfo);
		}
		getResultReviewListResponse.setData(data);
	 
	 	return getResultReviewListResponse;
	}
}