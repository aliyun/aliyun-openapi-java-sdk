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

package com.aliyuncs.itag.transform.v20210517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.SamplingSubUserTaskListResponse;
import com.aliyuncs.itag.model.v20210517.SamplingSubUserTaskListResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SamplingSubUserTaskListResponseUnmarshaller {

	public static SamplingSubUserTaskListResponse unmarshall(SamplingSubUserTaskListResponse samplingSubUserTaskListResponse, UnmarshallerContext _ctx) {
		
		samplingSubUserTaskListResponse.setRequestId(_ctx.stringValue("SamplingSubUserTaskListResponse.RequestId"));
		samplingSubUserTaskListResponse.setCode(_ctx.integerValue("SamplingSubUserTaskListResponse.Code"));
		samplingSubUserTaskListResponse.setMsg(_ctx.stringValue("SamplingSubUserTaskListResponse.Msg"));
		samplingSubUserTaskListResponse.setErrInfo(_ctx.stringValue("SamplingSubUserTaskListResponse.ErrInfo"));
		samplingSubUserTaskListResponse.setSucc(_ctx.booleanValue("SamplingSubUserTaskListResponse.Succ"));
		samplingSubUserTaskListResponse.setRt(_ctx.longValue("SamplingSubUserTaskListResponse.Rt"));
		samplingSubUserTaskListResponse.setHost(_ctx.stringValue("SamplingSubUserTaskListResponse.Host"));
		samplingSubUserTaskListResponse.setErrorCode(_ctx.stringValue("SamplingSubUserTaskListResponse.ErrorCode"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("SamplingSubUserTaskListResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTaskId(_ctx.stringValue("SamplingSubUserTaskListResponse.Result["+ i +"].TaskId"));
			resultItem.setTaskName(_ctx.stringValue("SamplingSubUserTaskListResponse.Result["+ i +"].TaskName"));
			resultItem.setUserTaskId(_ctx.stringValue("SamplingSubUserTaskListResponse.Result["+ i +"].UserTaskId"));
			resultItem.setState(_ctx.stringValue("SamplingSubUserTaskListResponse.Result["+ i +"].State"));
			resultItem.setSampleUserName(_ctx.stringValue("SamplingSubUserTaskListResponse.Result["+ i +"].SampleUserName"));
			resultItem.setBaseInfo(_ctx.stringValue("SamplingSubUserTaskListResponse.Result["+ i +"].BaseInfo"));
			resultItem.setTotalItemCount(_ctx.longValue("SamplingSubUserTaskListResponse.Result["+ i +"].TotalItemCount"));
			resultItem.setFinishedItemCount(_ctx.longValue("SamplingSubUserTaskListResponse.Result["+ i +"].FinishedItemCount"));
			resultItem.setType(_ctx.stringValue("SamplingSubUserTaskListResponse.Result["+ i +"].Type"));
			resultItem.setAllowOperate(_ctx.booleanValue("SamplingSubUserTaskListResponse.Result["+ i +"].AllowOperate"));

			result.add(resultItem);
		}
		samplingSubUserTaskListResponse.setResult(result);
	 
	 	return samplingSubUserTaskListResponse;
	}
}