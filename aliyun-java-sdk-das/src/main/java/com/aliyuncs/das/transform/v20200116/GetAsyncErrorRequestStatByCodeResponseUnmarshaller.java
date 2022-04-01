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

import com.aliyuncs.das.model.v20200116.GetAsyncErrorRequestStatByCodeResponse;
import com.aliyuncs.das.model.v20200116.GetAsyncErrorRequestStatByCodeResponse.Data;
import com.aliyuncs.das.model.v20200116.GetAsyncErrorRequestStatByCodeResponse.Data.Stat;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAsyncErrorRequestStatByCodeResponseUnmarshaller {

	public static GetAsyncErrorRequestStatByCodeResponse unmarshall(GetAsyncErrorRequestStatByCodeResponse getAsyncErrorRequestStatByCodeResponse, UnmarshallerContext _ctx) {
		
		getAsyncErrorRequestStatByCodeResponse.setRequestId(_ctx.stringValue("GetAsyncErrorRequestStatByCodeResponse.RequestId"));
		getAsyncErrorRequestStatByCodeResponse.setCode(_ctx.longValue("GetAsyncErrorRequestStatByCodeResponse.Code"));
		getAsyncErrorRequestStatByCodeResponse.setMessage(_ctx.stringValue("GetAsyncErrorRequestStatByCodeResponse.Message"));
		getAsyncErrorRequestStatByCodeResponse.setSuccess(_ctx.booleanValue("GetAsyncErrorRequestStatByCodeResponse.Success"));

		Data data = new Data();
		data.setFail(_ctx.booleanValue("GetAsyncErrorRequestStatByCodeResponse.Data.fail"));
		data.setIsFinish(_ctx.booleanValue("GetAsyncErrorRequestStatByCodeResponse.Data.isFinish"));
		data.setResultId(_ctx.stringValue("GetAsyncErrorRequestStatByCodeResponse.Data.resultId"));
		data.setState(_ctx.stringValue("GetAsyncErrorRequestStatByCodeResponse.Data.state"));
		data.setTimestamp(_ctx.longValue("GetAsyncErrorRequestStatByCodeResponse.Data.timestamp"));
		data.setComplete(_ctx.booleanValue("GetAsyncErrorRequestStatByCodeResponse.Data.complete"));

		List<Stat> result = new ArrayList<Stat>();
		for (int i = 0; i < _ctx.lengthValue("GetAsyncErrorRequestStatByCodeResponse.Data.result.Length"); i++) {
			Stat stat = new Stat();
			stat.setInstanceId(_ctx.stringValue("GetAsyncErrorRequestStatByCodeResponse.Data.result["+ i +"].instanceId"));
			stat.setErrorCode(_ctx.stringValue("GetAsyncErrorRequestStatByCodeResponse.Data.result["+ i +"].errorCode"));
			stat.setCount(_ctx.integerValue("GetAsyncErrorRequestStatByCodeResponse.Data.result["+ i +"].count"));

			result.add(stat);
		}
		data.setResult(result);
		getAsyncErrorRequestStatByCodeResponse.setData(data);
	 
	 	return getAsyncErrorRequestStatByCodeResponse;
	}
}