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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GenerateDISyncTaskConfigForUpdatingResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GenerateDISyncTaskConfigForUpdatingResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateDISyncTaskConfigForUpdatingResponseUnmarshaller {

	public static GenerateDISyncTaskConfigForUpdatingResponse unmarshall(GenerateDISyncTaskConfigForUpdatingResponse generateDISyncTaskConfigForUpdatingResponse, UnmarshallerContext _ctx) {
		
		generateDISyncTaskConfigForUpdatingResponse.setRequestId(_ctx.stringValue("GenerateDISyncTaskConfigForUpdatingResponse.RequestId"));
		generateDISyncTaskConfigForUpdatingResponse.setSuccess(_ctx.booleanValue("GenerateDISyncTaskConfigForUpdatingResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GenerateDISyncTaskConfigForUpdatingResponse.Data.Status"));
		data.setProcessId(_ctx.longValue("GenerateDISyncTaskConfigForUpdatingResponse.Data.ProcessId"));
		data.setMessage(_ctx.stringValue("GenerateDISyncTaskConfigForUpdatingResponse.Data.Message"));
		generateDISyncTaskConfigForUpdatingResponse.setData(data);
	 
	 	return generateDISyncTaskConfigForUpdatingResponse;
	}
}