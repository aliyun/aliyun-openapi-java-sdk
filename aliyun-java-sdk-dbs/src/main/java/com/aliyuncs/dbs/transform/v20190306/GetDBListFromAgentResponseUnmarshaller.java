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

package com.aliyuncs.dbs.transform.v20190306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbs.model.v20190306.GetDBListFromAgentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDBListFromAgentResponseUnmarshaller {

	public static GetDBListFromAgentResponse unmarshall(GetDBListFromAgentResponse getDBListFromAgentResponse, UnmarshallerContext _ctx) {
		
		getDBListFromAgentResponse.setRequestId(_ctx.stringValue("GetDBListFromAgentResponse.RequestId"));
		getDBListFromAgentResponse.setSuccess(_ctx.booleanValue("GetDBListFromAgentResponse.Success"));
		getDBListFromAgentResponse.setErrCode(_ctx.stringValue("GetDBListFromAgentResponse.ErrCode"));
		getDBListFromAgentResponse.setErrMessage(_ctx.stringValue("GetDBListFromAgentResponse.ErrMessage"));
		getDBListFromAgentResponse.setHttpStatusCode(_ctx.integerValue("GetDBListFromAgentResponse.HttpStatusCode"));

		List<String> dbList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDBListFromAgentResponse.DbList.Length"); i++) {
			dbList.add(_ctx.stringValue("GetDBListFromAgentResponse.DbList["+ i +"]"));
		}
		getDBListFromAgentResponse.setDbList(dbList);
	 
	 	return getDBListFromAgentResponse;
	}
}