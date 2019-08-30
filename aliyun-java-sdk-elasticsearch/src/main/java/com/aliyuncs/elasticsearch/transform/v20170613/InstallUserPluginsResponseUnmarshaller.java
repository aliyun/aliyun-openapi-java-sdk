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

import com.aliyuncs.elasticsearch.model.v20170613.InstallUserPluginsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InstallUserPluginsResponseUnmarshaller {

	public static InstallUserPluginsResponse unmarshall(InstallUserPluginsResponse installUserPluginsResponse, UnmarshallerContext _ctx) {
		
		installUserPluginsResponse.setRequestId(_ctx.stringValue("InstallUserPluginsResponse.RequestId"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("InstallUserPluginsResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("InstallUserPluginsResponse.Result["+ i +"]"));
		}
		installUserPluginsResponse.setResult(result);
	 
	 	return installUserPluginsResponse;
	}
}