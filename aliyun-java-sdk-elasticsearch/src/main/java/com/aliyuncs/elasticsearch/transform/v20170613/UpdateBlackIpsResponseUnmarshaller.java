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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.UpdateBlackIpsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateBlackIpsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateBlackIpsResponseUnmarshaller {

	public static UpdateBlackIpsResponse unmarshall(UpdateBlackIpsResponse updateBlackIpsResponse, UnmarshallerContext context) {
		
		updateBlackIpsResponse.setRequestId(context.stringValue("UpdateBlackIpsResponse.RequestId"));

		Result result = new Result();

		List<String> esIPBlacklist = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("UpdateBlackIpsResponse.Result.esIPBlacklist.Length"); i++) {
			esIPBlacklist.add(context.stringValue("UpdateBlackIpsResponse.Result.esIPBlacklist["+ i +"]"));
		}
		result.setEsIPBlacklist(esIPBlacklist);
		updateBlackIpsResponse.setResult(result);
	 
	 	return updateBlackIpsResponse;
	}
}