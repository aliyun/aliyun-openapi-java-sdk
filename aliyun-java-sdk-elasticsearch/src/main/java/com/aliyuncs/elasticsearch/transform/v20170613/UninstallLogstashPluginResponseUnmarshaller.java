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

import com.aliyuncs.elasticsearch.model.v20170613.UninstallLogstashPluginResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UninstallLogstashPluginResponseUnmarshaller {

	public static UninstallLogstashPluginResponse unmarshall(UninstallLogstashPluginResponse uninstallLogstashPluginResponse, UnmarshallerContext _ctx) {
		
		uninstallLogstashPluginResponse.setRequestId(_ctx.stringValue("UninstallLogstashPluginResponse.RequestId"));
		uninstallLogstashPluginResponse.setHeaders(_ctx.mapValue("UninstallLogstashPluginResponse.Headers"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UninstallLogstashPluginResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("UninstallLogstashPluginResponse.Result["+ i +"]"));
		}
		uninstallLogstashPluginResponse.setResult(result);
	 
	 	return uninstallLogstashPluginResponse;
	}
}