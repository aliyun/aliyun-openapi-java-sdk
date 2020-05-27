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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.RemoveAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveAppResponseUnmarshaller {

	public static RemoveAppResponse unmarshall(RemoveAppResponse removeAppResponse, UnmarshallerContext _ctx) {
		
		removeAppResponse.setRequestId(_ctx.stringValue("RemoveAppResponse.requestId"));

		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < _ctx.lengthValue("RemoveAppResponse.result.Length"); i++) {
			result.add(_ctx.integerValue("RemoveAppResponse.result["+ i +"]"));
		}
		removeAppResponse.setResult(result);
	 
	 	return removeAppResponse;
	}
}