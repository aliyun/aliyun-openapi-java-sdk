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

import com.aliyuncs.ccc.model.v20200701.AddPersonalNumbersToUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPersonalNumbersToUserResponseUnmarshaller {

	public static AddPersonalNumbersToUserResponse unmarshall(AddPersonalNumbersToUserResponse addPersonalNumbersToUserResponse, UnmarshallerContext _ctx) {
		
		addPersonalNumbersToUserResponse.setRequestId(_ctx.stringValue("AddPersonalNumbersToUserResponse.RequestId"));
		addPersonalNumbersToUserResponse.setCode(_ctx.stringValue("AddPersonalNumbersToUserResponse.Code"));
		addPersonalNumbersToUserResponse.setHttpStatusCode(_ctx.integerValue("AddPersonalNumbersToUserResponse.HttpStatusCode"));
		addPersonalNumbersToUserResponse.setMessage(_ctx.stringValue("AddPersonalNumbersToUserResponse.Message"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddPersonalNumbersToUserResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("AddPersonalNumbersToUserResponse.Data["+ i +"]"));
		}
		addPersonalNumbersToUserResponse.setData(data);
	 
	 	return addPersonalNumbersToUserResponse;
	}
}