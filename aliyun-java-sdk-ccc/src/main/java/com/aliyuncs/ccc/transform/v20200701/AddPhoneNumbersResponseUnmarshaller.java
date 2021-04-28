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

import com.aliyuncs.ccc.model.v20200701.AddPhoneNumbersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPhoneNumbersResponseUnmarshaller {

	public static AddPhoneNumbersResponse unmarshall(AddPhoneNumbersResponse addPhoneNumbersResponse, UnmarshallerContext _ctx) {
		
		addPhoneNumbersResponse.setRequestId(_ctx.stringValue("AddPhoneNumbersResponse.RequestId"));
		addPhoneNumbersResponse.setCode(_ctx.stringValue("AddPhoneNumbersResponse.Code"));
		addPhoneNumbersResponse.setHttpStatusCode(_ctx.integerValue("AddPhoneNumbersResponse.HttpStatusCode"));
		addPhoneNumbersResponse.setMessage(_ctx.stringValue("AddPhoneNumbersResponse.Message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddPhoneNumbersResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("AddPhoneNumbersResponse.Data["+ i +"]"));
		}
		addPhoneNumbersResponse.setData(data);
	 
	 	return addPhoneNumbersResponse;
	}
}