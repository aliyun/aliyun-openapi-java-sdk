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

package com.aliyuncs.teslastream.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslastream.model.v20180115.BatchGetPluginConfigInfoResponse;
import com.aliyuncs.teslastream.model.v20180115.BatchGetPluginConfigInfoResponse.Plugin;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchGetPluginConfigInfoResponseUnmarshaller {

	public static BatchGetPluginConfigInfoResponse unmarshall(BatchGetPluginConfigInfoResponse batchGetPluginConfigInfoResponse, UnmarshallerContext context) {
		
		batchGetPluginConfigInfoResponse.setRequestId(context.stringValue("BatchGetPluginConfigInfoResponse.RequestId"));
		batchGetPluginConfigInfoResponse.setCode(context.integerValue("BatchGetPluginConfigInfoResponse.Code"));
		batchGetPluginConfigInfoResponse.setMessage(context.stringValue("BatchGetPluginConfigInfoResponse.Message"));

		List<Plugin> data = new ArrayList<Plugin>();
		for (int i = 0; i < context.lengthValue("BatchGetPluginConfigInfoResponse.Data.Length"); i++) {
			Plugin plugin = new Plugin();
			plugin.setPluginProperties(context.stringValue("BatchGetPluginConfigInfoResponse.Data["+ i +"].PluginProperties"));
			plugin.setPluginUniqKey(context.stringValue("BatchGetPluginConfigInfoResponse.Data["+ i +"].PluginUniqKey"));

			data.add(plugin);
		}
		batchGetPluginConfigInfoResponse.setData(data);
	 
	 	return batchGetPluginConfigInfoResponse;
	}
}