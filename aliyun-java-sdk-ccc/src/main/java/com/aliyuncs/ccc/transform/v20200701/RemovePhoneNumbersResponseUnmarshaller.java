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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.RemovePhoneNumbersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemovePhoneNumbersResponseUnmarshaller {

	public static RemovePhoneNumbersResponse unmarshall(RemovePhoneNumbersResponse removePhoneNumbersResponse, UnmarshallerContext _ctx) {
		
		removePhoneNumbersResponse.setRequestId(_ctx.stringValue("RemovePhoneNumbersResponse.RequestId"));
		removePhoneNumbersResponse.setCode(_ctx.stringValue("RemovePhoneNumbersResponse.Code"));
		removePhoneNumbersResponse.setData(_ctx.stringValue("RemovePhoneNumbersResponse.Data"));
		removePhoneNumbersResponse.setHttpStatusCode(_ctx.integerValue("RemovePhoneNumbersResponse.HttpStatusCode"));
		removePhoneNumbersResponse.setMessage(_ctx.stringValue("RemovePhoneNumbersResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemovePhoneNumbersResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("RemovePhoneNumbersResponse.Params["+ i +"]"));
		}
		removePhoneNumbersResponse.setParams(params);

		List<String> failureList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemovePhoneNumbersResponse.FailureList.Length"); i++) {
			failureList.add(_ctx.stringValue("RemovePhoneNumbersResponse.FailureList["+ i +"]"));
		}
		removePhoneNumbersResponse.setFailureList(failureList);
	 
	 	return removePhoneNumbersResponse;
	}
}