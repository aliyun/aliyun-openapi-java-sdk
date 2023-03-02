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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetKillInstanceSessionTaskResultResponse;
import com.aliyuncs.das.model.v20200116.GetKillInstanceSessionTaskResultResponse.Data;
import com.aliyuncs.das.model.v20200116.GetKillInstanceSessionTaskResultResponse.Data.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKillInstanceSessionTaskResultResponseUnmarshaller {

	public static GetKillInstanceSessionTaskResultResponse unmarshall(GetKillInstanceSessionTaskResultResponse getKillInstanceSessionTaskResultResponse, UnmarshallerContext _ctx) {
		
		getKillInstanceSessionTaskResultResponse.setRequestId(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.RequestId"));
		getKillInstanceSessionTaskResultResponse.setCode(_ctx.longValue("GetKillInstanceSessionTaskResultResponse.Code"));
		getKillInstanceSessionTaskResultResponse.setMessage(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Message"));
		getKillInstanceSessionTaskResultResponse.setSuccess(_ctx.booleanValue("GetKillInstanceSessionTaskResultResponse.Success"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.TaskId"));
		data.setUserId(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.UserId"));
		data.setInstanceId(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.InstanceId"));
		data.setTaskState(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.TaskState"));
		data.setKillSuccessCount(_ctx.longValue("GetKillInstanceSessionTaskResultResponse.Data.KillSuccessCount"));
		data.setKillFailCount(_ctx.longValue("GetKillInstanceSessionTaskResultResponse.Data.KillFailCount"));
		data.setIgnoredUserSessionCount(_ctx.longValue("GetKillInstanceSessionTaskResultResponse.Data.IgnoredUserSessionCount"));

		List<Long> sessions = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetKillInstanceSessionTaskResultResponse.Data.Sessions.Length"); i++) {
			sessions.add(_ctx.longValue("GetKillInstanceSessionTaskResultResponse.Data.Sessions["+ i +"]"));
		}
		data.setSessions(sessions);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetKillInstanceSessionTaskResultResponse.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].Id"));
			resultItem.setUser(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].User"));
			resultItem.setHost(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].Host"));
			resultItem.setDb(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].Db"));
			resultItem.setCommand(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].Command"));
			resultItem.setTime(_ctx.longValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].Time"));
			resultItem.setState(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].State"));
			resultItem.setInfo(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].Info"));
			resultItem.setActive(_ctx.booleanValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].Active"));
			resultItem.setTaskId(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].TaskId"));
			resultItem.setReason(_ctx.stringValue("GetKillInstanceSessionTaskResultResponse.Data.Result["+ i +"].Reason"));

			result.add(resultItem);
		}
		data.setResult(result);
		getKillInstanceSessionTaskResultResponse.setData(data);
	 
	 	return getKillInstanceSessionTaskResultResponse;
	}
}