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

package com.aliyuncs.airec.transform.v20181012;

import com.aliyuncs.airec.model.v20181012.DescribeDiversifyResponse;
import com.aliyuncs.airec.model.v20181012.DescribeDiversifyResponse.Result;
import com.aliyuncs.airec.model.v20181012.DescribeDiversifyResponse.Result.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiversifyResponseUnmarshaller {

	public static DescribeDiversifyResponse unmarshall(DescribeDiversifyResponse describeDiversifyResponse, UnmarshallerContext _ctx) {
		
		describeDiversifyResponse.setRequestId(_ctx.stringValue("DescribeDiversifyResponse.RequestId"));
		describeDiversifyResponse.setCode(_ctx.stringValue("DescribeDiversifyResponse.Code"));
		describeDiversifyResponse.setMessage(_ctx.stringValue("DescribeDiversifyResponse.Message"));

		Result result = new Result();
		result.setName(_ctx.stringValue("DescribeDiversifyResponse.Result.Name"));
		result.setGmtCreate(_ctx.stringValue("DescribeDiversifyResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("DescribeDiversifyResponse.Result.GmtModified"));

		Parameter parameter = new Parameter();
		parameter.setCategoryIndex(_ctx.integerValue("DescribeDiversifyResponse.Result.Parameter.CategoryIndex"));
		parameter.setWindow(_ctx.integerValue("DescribeDiversifyResponse.Result.Parameter.Window"));
		result.setParameter(parameter);
		describeDiversifyResponse.setResult(result);
	 
	 	return describeDiversifyResponse;
	}
}