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

import com.aliyuncs.elasticsearch.model.v20170613.UpdateWhiteIpsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.UpdateWhiteIpsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWhiteIpsResponseUnmarshaller {

	public static UpdateWhiteIpsResponse unmarshall(UpdateWhiteIpsResponse updateWhiteIpsResponse, UnmarshallerContext _ctx) {
		
		updateWhiteIpsResponse.setRequestId(_ctx.stringValue("UpdateWhiteIpsResponse.RequestId"));

		Result result = new Result();

		List<String> esIPWhitelist = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateWhiteIpsResponse.Result.esIPWhitelist.Length"); i++) {
			esIPWhitelist.add(_ctx.stringValue("UpdateWhiteIpsResponse.Result.esIPWhitelist["+ i +"]"));
		}
		result.setEsIPWhitelist(esIPWhitelist);
		updateWhiteIpsResponse.setResult(result);
	 
	 	return updateWhiteIpsResponse;
	}
}