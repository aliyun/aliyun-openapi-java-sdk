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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetAsyncErrorRequestListByCodeResponse;
import com.aliyuncs.das.model.v20200116.GetAsyncErrorRequestListByCodeResponse.Data;
import com.aliyuncs.das.model.v20200116.GetAsyncErrorRequestListByCodeResponse.Data.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAsyncErrorRequestListByCodeResponseUnmarshaller {

	public static GetAsyncErrorRequestListByCodeResponse unmarshall(GetAsyncErrorRequestListByCodeResponse getAsyncErrorRequestListByCodeResponse, UnmarshallerContext _ctx) {
		
		getAsyncErrorRequestListByCodeResponse.setRequestId(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.RequestId"));
		getAsyncErrorRequestListByCodeResponse.setCode(_ctx.longValue("GetAsyncErrorRequestListByCodeResponse.Code"));
		getAsyncErrorRequestListByCodeResponse.setMessage(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.Message"));
		getAsyncErrorRequestListByCodeResponse.setSuccess(_ctx.booleanValue("GetAsyncErrorRequestListByCodeResponse.Success"));

		Data data = new Data();
		data.setFail(_ctx.booleanValue("GetAsyncErrorRequestListByCodeResponse.Data.fail"));
		data.setResultId(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.Data.resultId"));
		data.setIsFinish(_ctx.booleanValue("GetAsyncErrorRequestListByCodeResponse.Data.isFinish"));
		data.setState(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.Data.state"));
		data.setComplete(_ctx.booleanValue("GetAsyncErrorRequestListByCodeResponse.Data.complete"));
		data.setTimestamp(_ctx.longValue("GetAsyncErrorRequestListByCodeResponse.Data.timestamp"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAsyncErrorRequestListByCodeResponse.Data.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setSqlId(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.Data.result["+ i +"].sqlId"));
			resultItem.setInstanceId(_ctx.stringValue("GetAsyncErrorRequestListByCodeResponse.Data.result["+ i +"].instanceId"));

			result.add(resultItem);
		}
		data.setResult(result);
		getAsyncErrorRequestListByCodeResponse.setData(data);
	 
	 	return getAsyncErrorRequestListByCodeResponse;
	}
}