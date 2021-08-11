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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyvmsapi.model.v20170525.ListOrderedNumbersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOrderedNumbersResponseUnmarshaller {

	public static ListOrderedNumbersResponse unmarshall(ListOrderedNumbersResponse listOrderedNumbersResponse, UnmarshallerContext _ctx) {
		
		listOrderedNumbersResponse.setRequestId(_ctx.stringValue("ListOrderedNumbersResponse.RequestId"));
		listOrderedNumbersResponse.setCode(_ctx.stringValue("ListOrderedNumbersResponse.Code"));
		listOrderedNumbersResponse.setMessage(_ctx.stringValue("ListOrderedNumbersResponse.Message"));

		List<String> numbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListOrderedNumbersResponse.Numbers.Length"); i++) {
			numbers.add(_ctx.stringValue("ListOrderedNumbersResponse.Numbers["+ i +"]"));
		}
		listOrderedNumbersResponse.setNumbers(numbers);
	 
	 	return listOrderedNumbersResponse;
	}
}