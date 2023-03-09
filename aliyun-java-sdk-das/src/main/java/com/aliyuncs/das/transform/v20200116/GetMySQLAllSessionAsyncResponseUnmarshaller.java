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

import com.aliyuncs.das.model.v20200116.GetMySQLAllSessionAsyncResponse;
import com.aliyuncs.das.model.v20200116.GetMySQLAllSessionAsyncResponse.Data;
import com.aliyuncs.das.model.v20200116.GetMySQLAllSessionAsyncResponse.Data.SessionData;
import com.aliyuncs.das.model.v20200116.GetMySQLAllSessionAsyncResponse.Data.SessionData.ClientStatsItem;
import com.aliyuncs.das.model.v20200116.GetMySQLAllSessionAsyncResponse.Data.SessionData.DbStatsItem;
import com.aliyuncs.das.model.v20200116.GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionListItem;
import com.aliyuncs.das.model.v20200116.GetMySQLAllSessionAsyncResponse.Data.SessionData.UserStatsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMySQLAllSessionAsyncResponseUnmarshaller {

	public static GetMySQLAllSessionAsyncResponse unmarshall(GetMySQLAllSessionAsyncResponse getMySQLAllSessionAsyncResponse, UnmarshallerContext _ctx) {
		
		getMySQLAllSessionAsyncResponse.setRequestId(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.RequestId"));
		getMySQLAllSessionAsyncResponse.setCode(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Code"));
		getMySQLAllSessionAsyncResponse.setMessage(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Message"));
		getMySQLAllSessionAsyncResponse.setSuccess(_ctx.booleanValue("GetMySQLAllSessionAsyncResponse.Success"));

		Data data = new Data();
		data.setFail(_ctx.booleanValue("GetMySQLAllSessionAsyncResponse.Data.Fail"));
		data.setResultId(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.ResultId"));
		data.setIsFinish(_ctx.booleanValue("GetMySQLAllSessionAsyncResponse.Data.IsFinish"));
		data.setState(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.State"));
		data.setComplete(_ctx.booleanValue("GetMySQLAllSessionAsyncResponse.Data.Complete"));
		data.setTimestamp(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.Timestamp"));

		SessionData sessionData = new SessionData();
		sessionData.setTotalSessionCount(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.TotalSessionCount"));
		sessionData.setActiveSessionCount(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.ActiveSessionCount"));
		sessionData.setMaxActiveTime(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.MaxActiveTime"));
		sessionData.setTimeStamp(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.TimeStamp"));

		List<SessionListItem> sessionList = new ArrayList<SessionListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList.Length"); i++) {
			SessionListItem sessionListItem = new SessionListItem();
			sessionListItem.setSessionId(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].SessionId"));
			sessionListItem.setUser(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].User"));
			sessionListItem.setClient(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].Client"));
			sessionListItem.setDbName(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].DbName"));
			sessionListItem.setCommand(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].Command"));
			sessionListItem.setTime(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].Time"));
			sessionListItem.setState(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].State"));
			sessionListItem.setSqlText(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].SqlText"));
			sessionListItem.setUserClientAlias(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].UserClientAlias"));
			sessionListItem.setTrxId(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].TrxId"));
			sessionListItem.setTrxDuration(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.SessionList["+ i +"].TrxDuration"));

			sessionList.add(sessionListItem);
		}
		sessionData.setSessionList(sessionList);

		List<UserStatsItem> userStats = new ArrayList<UserStatsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.UserStats.Length"); i++) {
			UserStatsItem userStatsItem = new UserStatsItem();
			userStatsItem.setKey(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.UserStats["+ i +"].Key"));
			userStatsItem.setTotalCount(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.UserStats["+ i +"].TotalCount"));
			userStatsItem.setActiveCount(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.UserStats["+ i +"].ActiveCount"));

			List<Long> threadIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.UserStats["+ i +"].ThreadIdList.Length"); j++) {
				threadIdList.add(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.UserStats["+ i +"].ThreadIdList["+ j +"]"));
			}
			userStatsItem.setThreadIdList(threadIdList);

			List<String> userList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.UserStats["+ i +"].UserList.Length"); j++) {
				userList.add(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.UserStats["+ i +"].UserList["+ j +"]"));
			}
			userStatsItem.setUserList(userList);

			userStats.add(userStatsItem);
		}
		sessionData.setUserStats(userStats);

		List<ClientStatsItem> clientStats = new ArrayList<ClientStatsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.ClientStats.Length"); i++) {
			ClientStatsItem clientStatsItem = new ClientStatsItem();
			clientStatsItem.setKey(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.ClientStats["+ i +"].Key"));
			clientStatsItem.setTotalCount(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.ClientStats["+ i +"].TotalCount"));
			clientStatsItem.setActiveCount(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.ClientStats["+ i +"].ActiveCount"));

			List<Long> threadIdList1 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.ClientStats["+ i +"].ThreadIdList.Length"); j++) {
				threadIdList1.add(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.ClientStats["+ i +"].ThreadIdList["+ j +"]"));
			}
			clientStatsItem.setThreadIdList1(threadIdList1);

			List<String> userList2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.ClientStats["+ i +"].UserList.Length"); j++) {
				userList2.add(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.ClientStats["+ i +"].UserList["+ j +"]"));
			}
			clientStatsItem.setUserList2(userList2);

			clientStats.add(clientStatsItem);
		}
		sessionData.setClientStats(clientStats);

		List<DbStatsItem> dbStats = new ArrayList<DbStatsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.DbStats.Length"); i++) {
			DbStatsItem dbStatsItem = new DbStatsItem();
			dbStatsItem.setKey(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.DbStats["+ i +"].Key"));
			dbStatsItem.setTotalCount(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.DbStats["+ i +"].TotalCount"));
			dbStatsItem.setActiveCount(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.DbStats["+ i +"].ActiveCount"));

			List<Long> threadIdList3 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.DbStats["+ i +"].ThreadIdList.Length"); j++) {
				threadIdList3.add(_ctx.longValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.DbStats["+ i +"].ThreadIdList["+ j +"]"));
			}
			dbStatsItem.setThreadIdList3(threadIdList3);

			List<String> userList4 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.DbStats["+ i +"].UserList.Length"); j++) {
				userList4.add(_ctx.stringValue("GetMySQLAllSessionAsyncResponse.Data.SessionData.DbStats["+ i +"].UserList["+ j +"]"));
			}
			dbStatsItem.setUserList4(userList4);

			dbStats.add(dbStatsItem);
		}
		sessionData.setDbStats(dbStats);
		data.setSessionData(sessionData);
		getMySQLAllSessionAsyncResponse.setData(data);
	 
	 	return getMySQLAllSessionAsyncResponse;
	}
}