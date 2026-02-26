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

package com.aliyuncs.selectdb.transform.v20230522;

import com.aliyuncs.selectdb.model.v20230522.RestartDBClusterResponse;
import com.aliyuncs.selectdb.model.v20230522.RestartDBClusterResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartDBClusterResponseUnmarshaller {

	public static RestartDBClusterResponse unmarshall(RestartDBClusterResponse restartDBClusterResponse, UnmarshallerContext _ctx) {
		
		restartDBClusterResponse.setRequestId(_ctx.stringValue("RestartDBClusterResponse.RequestId"));

		Data data = new Data();
		data.setDBInstanceId(_ctx.stringValue("RestartDBClusterResponse.Data.DBInstanceId"));
		data.setDBClusterId(_ctx.stringValue("RestartDBClusterResponse.Data.DBClusterId"));
		restartDBClusterResponse.setData(data);
	 
	 	return restartDBClusterResponse;
	}
}