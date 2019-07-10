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

	public static GetFileDimensionResponse unmarshall(GetFileDimensionResponse getFileDimensionResponse, UnmarshallerContext _ctx) {
		
		getFileDimensionResponse.setRequestId(_ctx.stringValue("GetFileDimensionResponse.RequestId"));
		getFileDimensionResponse.setSuccess(_ctx.booleanValue("GetFileDimensionResponse.Success"));
		getFileDimensionResponse.setCode(_ctx.stringValue("GetFileDimensionResponse.Code"));
		getFileDimensionResponse.setMessage(_ctx.stringValue("GetFileDimensionResponse.Message"));
		getFileDimensionResponse.setPageSize(_ctx.integerValue("GetFileDimensionResponse.PageSize"));
		getFileDimensionResponse.setDataSize(_ctx.integerValue("GetFileDimensionResponse.DataSize"));
		getFileDimensionResponse.setTotalCount(_ctx.integerValue("GetFileDimensionResponse.TotalCount"));

		List<TaskResultReviewInfo> data = new ArrayList<TaskResultReviewInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetFileDimensionResponse.Data.Length"); i++) {
			TaskResultReviewInfo taskResultReviewInfo = new TaskResultReviewInfo();
			taskResultReviewInfo.setBucketName(_ctx.stringValue("GetFileDimensionResponse.Data["+ i +"].BucketName"));
			taskResultReviewInfo.setFileName(_ctx.stringValue("GetFileDimensionResponse.Data["+ i +"].FileName"));
			taskResultReviewInfo.setHitNumber(_ctx.integerValue("GetFileDimensionResponse.Data["+ i +"].HitNumber"));
			taskResultReviewInfo.setNextVid(_ctx.stringValue("GetFileDimensionResponse.Data["+ i +"].NextVid"));
			taskResultReviewInfo.setIsHitRule(_ctx.booleanValue("GetFileDimensionResponse.Data["+ i +"].IsHitRule"));
			taskResultReviewInfo.setVid(_ctx.stringValue("GetFileDimensionResponse.Data["+ i +"].Vid"));
			taskResultReviewInfo.setHitRule(_ctx.booleanValue("GetFileDimensionResponse.Data["+ i +"].HitRule"));
			taskResultReviewInfo.setFileMergeName(_ctx.stringValue("GetFileDimensionResponse.Data["+ i +"].FileMergeName"));
			taskResultReviewInfo.setStatus(_ctx.integerValue("GetFileDimensionResponse.Data["+ i +"].Status"));
			taskResultReviewInfo.setRealViolationNumber(_ctx.integerValue("GetFileDimensionResponse.Data["+ i +"].RealViolationNumber"));
			taskResultReviewInfo.setHandTaskFile(_ctx.booleanValue("GetFileDimensionResponse.Data["+ i +"].HandTaskFile"));
			taskResultReviewInfo.setReviewAccuracyRate(_ctx.floatValue("GetFileDimensionResponse.Data["+ i +"].ReviewAccuracyRate"));
			taskResultReviewInfo.setTotalScore(_ctx.integerValue("GetFileDimensionResponse.Data["+ i +"].TotalScore"));
			taskResultReviewInfo.setPreVid(_ctx.stringValue("GetFileDimensionResponse.Data["+ i +"].PreVid"));
			taskResultReviewInfo.setTaskId(_ctx.stringValue("GetFileDimensionResponse.Data["+ i +"].TaskId"));
			taskResultReviewInfo.setCheckNumber(_ctx.integerValue("GetFileDimensionResponse.Data["+ i +"].CheckNumber"));
			taskResultReviewInfo.setDataType(_ctx.integerValue("GetFileDimensionResponse.Data["+ i +"].DataType"));

			List<String> hitRuleSet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetFileDimensionResponse.Data["+ i +"].HitRuleSet.Length"); j++) {
				hitRuleSet.add(_ctx.stringValue("GetFileDimensionResponse.Data["+ i +"].HitRuleSet["+ j +"]"));
			}
			taskResultReviewInfo.setHitRuleSet(hitRuleSet);

			data.add(taskResultReviewInfo);
		}
		getFileDimensionResponse.setData(data);
	 
	 	return getFileDimensionResponse;
	}
}