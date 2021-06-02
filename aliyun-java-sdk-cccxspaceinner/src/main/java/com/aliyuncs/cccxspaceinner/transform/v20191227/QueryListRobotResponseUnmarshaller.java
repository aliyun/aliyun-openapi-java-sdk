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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cccxspaceinner.model.v20191227.QueryListRobotResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryListRobotResponse.Data;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryListRobotResponse.Data.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryListRobotResponseUnmarshaller {

	public static QueryListRobotResponse unmarshall(QueryListRobotResponse queryListRobotResponse, UnmarshallerContext _ctx) {
		
		queryListRobotResponse.setMessage(_ctx.stringValue("QueryListRobotResponse.Message"));
		queryListRobotResponse.setCode(_ctx.integerValue("QueryListRobotResponse.Code"));
		queryListRobotResponse.setSuccess(_ctx.booleanValue("QueryListRobotResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("QueryListRobotResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("QueryListRobotResponse.Data.PageSize"));
		data.setRowCount(_ctx.integerValue("QueryListRobotResponse.Data.RowCount"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryListRobotResponse.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setName(_ctx.stringValue("QueryListRobotResponse.Data.Result["+ i +"].Name"));
			resultItem.setIntroduction(_ctx.stringValue("QueryListRobotResponse.Data.Result["+ i +"].Introduction"));
			resultItem.setSecret(_ctx.stringValue("QueryListRobotResponse.Data.Result["+ i +"].Secret"));
			resultItem.setAccountId(_ctx.longValue("QueryListRobotResponse.Data.Result["+ i +"].AccountId"));
			resultItem.setAccountType(_ctx.integerValue("QueryListRobotResponse.Data.Result["+ i +"].AccountType"));
			resultItem.setSource(_ctx.stringValue("QueryListRobotResponse.Data.Result["+ i +"].Source"));
			resultItem.setAppType(_ctx.integerValue("QueryListRobotResponse.Data.Result["+ i +"].AppType"));
			resultItem.setExt(_ctx.stringValue("QueryListRobotResponse.Data.Result["+ i +"].Ext"));
			resultItem.setStatus(_ctx.integerValue("QueryListRobotResponse.Data.Result["+ i +"].Status"));
			resultItem.setAppKey(_ctx.stringValue("QueryListRobotResponse.Data.Result["+ i +"].AppKey"));
			resultItem.setBuKey(_ctx.stringValue("QueryListRobotResponse.Data.Result["+ i +"].BuKey"));
			resultItem.setBuName(_ctx.stringValue("QueryListRobotResponse.Data.Result["+ i +"].BuName"));
			resultItem.setCorpId(_ctx.stringValue("QueryListRobotResponse.Data.Result["+ i +"].CorpId"));

			result.add(resultItem);
		}
		data.setResult(result);
		queryListRobotResponse.setData(data);
	 
	 	return queryListRobotResponse;
	}
}