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

import com.aliyuncs.das.model.v20200116.GetRedisAllSessionResponse;
import com.aliyuncs.das.model.v20200116.GetRedisAllSessionResponse.Data;
import com.aliyuncs.das.model.v20200116.GetRedisAllSessionResponse.Data.SessionsItem;
import com.aliyuncs.das.model.v20200116.GetRedisAllSessionResponse.Data.SourceStatsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRedisAllSessionResponseUnmarshaller {

	public static GetRedisAllSessionResponse unmarshall(GetRedisAllSessionResponse getRedisAllSessionResponse, UnmarshallerContext _ctx) {
		
		getRedisAllSessionResponse.setRequestId(_ctx.stringValue("GetRedisAllSessionResponse.RequestId"));
		getRedisAllSessionResponse.setCode(_ctx.longValue("GetRedisAllSessionResponse.Code"));
		getRedisAllSessionResponse.setMessage(_ctx.stringValue("GetRedisAllSessionResponse.Message"));
		getRedisAllSessionResponse.setSuccess(_ctx.booleanValue("GetRedisAllSessionResponse.Success"));

		Data data = new Data();
		data.setTimestamp(_ctx.longValue("GetRedisAllSessionResponse.Data.Timestamp"));
		data.setTotal(_ctx.longValue("GetRedisAllSessionResponse.Data.Total"));

		List<SessionsItem> sessions = new ArrayList<SessionsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRedisAllSessionResponse.Data.Sessions.Length"); i++) {
			SessionsItem sessionsItem = new SessionsItem();
			sessionsItem.setSub(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Sub"));
			sessionsItem.setPsub(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Psub"));
			sessionsItem.setIdle(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Idle"));
			sessionsItem.setFlags(_ctx.stringValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Flags"));
			sessionsItem.setOll(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Oll"));
			sessionsItem.setQbufFree(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].QbufFree"));
			sessionsItem.setMulti(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Multi"));
			sessionsItem.setOmem(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Omem"));
			sessionsItem.setQbuf(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Qbuf"));
			sessionsItem.setName(_ctx.stringValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Name"));
			sessionsItem.setObl(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Obl"));
			sessionsItem.setClient(_ctx.stringValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Client"));
			sessionsItem.setCmd(_ctx.stringValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Cmd"));
			sessionsItem.setId(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Id"));
			sessionsItem.setAddr(_ctx.stringValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Addr"));
			sessionsItem.setNodeId(_ctx.stringValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].NodeId"));
			sessionsItem.setAge(_ctx.stringValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Age"));
			sessionsItem.setDb(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Db"));
			sessionsItem.setEvents(_ctx.stringValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Events"));
			sessionsItem.setFd(_ctx.longValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].Fd"));
			sessionsItem.setClientDesc(_ctx.stringValue("GetRedisAllSessionResponse.Data.Sessions["+ i +"].ClientDesc"));

			sessions.add(sessionsItem);
		}
		data.setSessions(sessions);

		List<SourceStatsItem> sourceStats = new ArrayList<SourceStatsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRedisAllSessionResponse.Data.SourceStats.Length"); i++) {
			SourceStatsItem sourceStatsItem = new SourceStatsItem();
			sourceStatsItem.setKey(_ctx.stringValue("GetRedisAllSessionResponse.Data.SourceStats["+ i +"].Key"));
			sourceStatsItem.setCount(_ctx.stringValue("GetRedisAllSessionResponse.Data.SourceStats["+ i +"].Count"));

			List<Long> ids = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetRedisAllSessionResponse.Data.SourceStats["+ i +"].Ids.Length"); j++) {
				ids.add(_ctx.longValue("GetRedisAllSessionResponse.Data.SourceStats["+ i +"].Ids["+ j +"]"));
			}
			sourceStatsItem.setIds(ids);

			sourceStats.add(sourceStatsItem);
		}
		data.setSourceStats(sourceStats);
		getRedisAllSessionResponse.setData(data);
	 
	 	return getRedisAllSessionResponse;
	}
}