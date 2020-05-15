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

import com.aliyuncs.iovcc.model.v20180501.ListClientPluginsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListClientPluginsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClientPluginsResponseUnmarshaller {

	public static ListClientPluginsResponse unmarshall(ListClientPluginsResponse listClientPluginsResponse, UnmarshallerContext _ctx) {
		
		listClientPluginsResponse.setRequestId(_ctx.stringValue("ListClientPluginsResponse.RequestId"));

		List<Result> clientPlugins = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListClientPluginsResponse.ClientPlugins.Length"); i++) {
			Result result = new Result();
			result.setName(_ctx.stringValue("ListClientPluginsResponse.ClientPlugins["+ i +"].Name"));
			result.setPkgName(_ctx.stringValue("ListClientPluginsResponse.ClientPlugins["+ i +"].PkgName"));

			clientPlugins.add(result);
		}
		listClientPluginsResponse.setClientPlugins(clientPlugins);
	 
	 	return listClientPluginsResponse;
	}
}