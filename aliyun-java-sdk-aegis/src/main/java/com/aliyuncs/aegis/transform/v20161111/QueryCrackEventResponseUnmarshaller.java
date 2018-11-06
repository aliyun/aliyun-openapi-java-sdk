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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.QueryCrackEventResponse;
import com.aliyuncs.aegis.model.v20161111.QueryCrackEventResponse.Data;
import com.aliyuncs.aegis.model.v20161111.QueryCrackEventResponse.Data.Entity;
import com.aliyuncs.aegis.model.v20161111.QueryCrackEventResponse.Data.PageInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCrackEventResponseUnmarshaller {

	public static QueryCrackEventResponse unmarshall(QueryCrackEventResponse queryCrackEventResponse, UnmarshallerContext context) {
		
		queryCrackEventResponse.setRequestId(context.stringValue("QueryCrackEventResponse.requestId"));
		queryCrackEventResponse.setCode(context.stringValue("QueryCrackEventResponse.Code"));
		queryCrackEventResponse.setSuccess(context.booleanValue("QueryCrackEventResponse.Success"));
		queryCrackEventResponse.setMessage(context.stringValue("QueryCrackEventResponse.Message"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(context.integerValue("QueryCrackEventResponse.Data.PageInfo.CurrentPage"));
		pageInfo.setPageSize(context.integerValue("QueryCrackEventResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalCount(context.integerValue("QueryCrackEventResponse.Data.PageInfo.TotalCount"));
		pageInfo.setCount(context.integerValue("QueryCrackEventResponse.Data.PageInfo.Count"));
		data.setPageInfo(pageInfo);

		List<Entity> list = new ArrayList<Entity>();
		for (int i = 0; i < context.lengthValue("QueryCrackEventResponse.Data.List.Length"); i++) {
			Entity entity = new Entity();
			entity.setUuid(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].Uuid"));
			entity.setAttackTime(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].AttackTime"));
			entity.setAttackType(context.integerValue("QueryCrackEventResponse.Data.List["+ i +"].AttackType"));
			entity.setAttackTypeName(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].AttackTypeName"));
			entity.setBuyVersion(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].BuyVersion"));
			entity.setCrackSourceIp(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].CrackSourceIp"));
			entity.setCrackTimes(context.integerValue("QueryCrackEventResponse.Data.List["+ i +"].CrackTimes"));
			entity.setGroupId(context.integerValue("QueryCrackEventResponse.Data.List["+ i +"].GroupId"));
			entity.setInstanceName(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].InstanceName"));
			entity.setInstanceId(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].InstanceId"));
			entity.setIp(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].Ip"));
			entity.setRegion(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].Region"));
			entity.setStatus(context.integerValue("QueryCrackEventResponse.Data.List["+ i +"].Status"));
			entity.setStatusName(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].StatusName"));
			entity.setLocation(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].Location"));
			entity.setInWhite(context.integerValue("QueryCrackEventResponse.Data.List["+ i +"].InWhite"));
			entity.setUserName(context.stringValue("QueryCrackEventResponse.Data.List["+ i +"].UserName"));

			list.add(entity);
		}
		data.setList(list);
		queryCrackEventResponse.setData(data);
	 
	 	return queryCrackEventResponse;
	}
}