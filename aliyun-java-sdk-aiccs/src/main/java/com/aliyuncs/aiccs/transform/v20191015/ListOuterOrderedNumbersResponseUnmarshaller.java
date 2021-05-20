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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.ListOuterOrderedNumbersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOuterOrderedNumbersResponseUnmarshaller {

	public static ListOuterOrderedNumbersResponse unmarshall(ListOuterOrderedNumbersResponse listOuterOrderedNumbersResponse, UnmarshallerContext _ctx) {
		
		listOuterOrderedNumbersResponse.setRequestId(_ctx.stringValue("ListOuterOrderedNumbersResponse.RequestId"));
		listOuterOrderedNumbersResponse.setMessage(_ctx.stringValue("ListOuterOrderedNumbersResponse.Message"));
		listOuterOrderedNumbersResponse.setCode(_ctx.stringValue("ListOuterOrderedNumbersResponse.Code"));

		List<String> numbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListOuterOrderedNumbersResponse.Numbers.Length"); i++) {
			numbers.add(_ctx.stringValue("ListOuterOrderedNumbersResponse.Numbers["+ i +"]"));
		}
		listOuterOrderedNumbersResponse.setNumbers(numbers);
	 
	 	return listOuterOrderedNumbersResponse;
	}
}