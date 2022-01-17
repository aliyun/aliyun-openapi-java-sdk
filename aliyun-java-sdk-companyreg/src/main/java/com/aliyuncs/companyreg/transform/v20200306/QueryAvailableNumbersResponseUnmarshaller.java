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

package com.aliyuncs.companyreg.transform.v20200306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20200306.QueryAvailableNumbersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAvailableNumbersResponseUnmarshaller {

	public static QueryAvailableNumbersResponse unmarshall(QueryAvailableNumbersResponse queryAvailableNumbersResponse, UnmarshallerContext _ctx) {
		
		queryAvailableNumbersResponse.setRequestId(_ctx.stringValue("QueryAvailableNumbersResponse.RequestId"));
		queryAvailableNumbersResponse.setErrorMsg(_ctx.stringValue("QueryAvailableNumbersResponse.ErrorMsg"));
		queryAvailableNumbersResponse.setErrorCode(_ctx.stringValue("QueryAvailableNumbersResponse.ErrorCode"));
		queryAvailableNumbersResponse.setSuccess(_ctx.booleanValue("QueryAvailableNumbersResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryAvailableNumbersResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("QueryAvailableNumbersResponse.Data["+ i +"]"));
		}
		queryAvailableNumbersResponse.setData(data);
	 
	 	return queryAvailableNumbersResponse;
	}
}