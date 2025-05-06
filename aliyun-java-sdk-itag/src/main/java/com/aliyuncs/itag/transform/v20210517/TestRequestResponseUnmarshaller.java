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

import com.aliyuncs.itag.model.v20210517.TestRequestResponse;
import com.aliyuncs.itag.model.v20210517.TestRequestResponse.Result;
import com.aliyuncs.itag.model.v20210517.TestRequestResponse.Result.TrueResponseItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestRequestResponseUnmarshaller {

	public static TestRequestResponse unmarshall(TestRequestResponse testRequestResponse, UnmarshallerContext _ctx) {
		
		testRequestResponse.setRequestId(_ctx.stringValue("TestRequestResponse.RequestId"));
		testRequestResponse.setCode(_ctx.integerValue("TestRequestResponse.Code"));
		testRequestResponse.setMsg(_ctx.stringValue("TestRequestResponse.Msg"));
		testRequestResponse.setErrInfo(_ctx.stringValue("TestRequestResponse.ErrInfo"));
		testRequestResponse.setSucc(_ctx.booleanValue("TestRequestResponse.Succ"));
		testRequestResponse.setRt(_ctx.longValue("TestRequestResponse.Rt"));
		testRequestResponse.setHost(_ctx.stringValue("TestRequestResponse.Host"));
		testRequestResponse.setErrorCode(_ctx.stringValue("TestRequestResponse.ErrorCode"));

		Result result = new Result();
		result.setOriginResponse(_ctx.stringValue("TestRequestResponse.Result.OriginResponse"));

		List<TrueResponseItem> trueResponse = new ArrayList<TrueResponseItem>();
		for (int i = 0; i < _ctx.lengthValue("TestRequestResponse.Result.TrueResponse.Length"); i++) {
			TrueResponseItem trueResponseItem = new TrueResponseItem();
			trueResponseItem.setResultKey(_ctx.stringValue("TestRequestResponse.Result.TrueResponse["+ i +"].ResultKey"));
			trueResponseItem.setResultPath(_ctx.stringValue("TestRequestResponse.Result.TrueResponse["+ i +"].ResultPath"));

			trueResponse.add(trueResponseItem);
		}
		result.setTrueResponse(trueResponse);
		testRequestResponse.setResult(result);
	 
	 	return testRequestResponse;
	}
}