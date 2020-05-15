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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListPreChecksResponse;
import com.aliyuncs.iovcc.model.v20180501.ListPreChecksResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPreChecksResponseUnmarshaller {

	public static ListPreChecksResponse unmarshall(ListPreChecksResponse listPreChecksResponse, UnmarshallerContext _ctx) {
		
		listPreChecksResponse.setRequestId(_ctx.stringValue("ListPreChecksResponse.RequestId"));

		List<Result> preChecks = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListPreChecksResponse.PreChecks.Length"); i++) {
			Result result = new Result();
			result.setKey(_ctx.stringValue("ListPreChecksResponse.PreChecks["+ i +"].Key"));
			result.setLink(_ctx.stringValue("ListPreChecksResponse.PreChecks["+ i +"].Link"));
			result.setPrice(_ctx.stringValue("ListPreChecksResponse.PreChecks["+ i +"].Price"));
			result.setState(_ctx.stringValue("ListPreChecksResponse.PreChecks["+ i +"].State"));

			preChecks.add(result);
		}
		listPreChecksResponse.setPreChecks(preChecks);
	 
	 	return listPreChecksResponse;
	}
}