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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceConsoleScreenResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryInstanceConsoleScreenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryInstanceConsoleScreenResponseUnmarshaller {

	public static OpsQueryInstanceConsoleScreenResponse unmarshall(OpsQueryInstanceConsoleScreenResponse opsQueryInstanceConsoleScreenResponse, UnmarshallerContext _ctx) {
		
		opsQueryInstanceConsoleScreenResponse.setRequestId(_ctx.stringValue("OpsQueryInstanceConsoleScreenResponse.RequestId"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("OpsQueryInstanceConsoleScreenResponse.Data.InstanceId"));
		data.setContent(_ctx.stringValue("OpsQueryInstanceConsoleScreenResponse.Data.Content"));
		data.setTimestamp(_ctx.stringValue("OpsQueryInstanceConsoleScreenResponse.Data.Timestamp"));
		data.setLength(_ctx.integerValue("OpsQueryInstanceConsoleScreenResponse.Data.Length"));
		opsQueryInstanceConsoleScreenResponse.setData(data);
	 
	 	return opsQueryInstanceConsoleScreenResponse;
	}
}