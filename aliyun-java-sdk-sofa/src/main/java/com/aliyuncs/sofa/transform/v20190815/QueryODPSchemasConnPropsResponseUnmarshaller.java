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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasConnPropsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPSchemasConnPropsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPSchemasConnPropsResponseUnmarshaller {

	public static QueryODPSchemasConnPropsResponse unmarshall(QueryODPSchemasConnPropsResponse queryODPSchemasConnPropsResponse, UnmarshallerContext _ctx) {
		
		queryODPSchemasConnPropsResponse.setRequestId(_ctx.stringValue("QueryODPSchemasConnPropsResponse.RequestId"));
		queryODPSchemasConnPropsResponse.setResultCode(_ctx.stringValue("QueryODPSchemasConnPropsResponse.ResultCode"));
		queryODPSchemasConnPropsResponse.setResultMessage(_ctx.stringValue("QueryODPSchemasConnPropsResponse.ResultMessage"));

		Data data = new Data();
		data.setAllowMinPoolTimeout(_ctx.booleanValue("QueryODPSchemasConnPropsResponse.Data.AllowMinPoolTimeout"));
		data.setBackgroundValidation(_ctx.booleanValue("QueryODPSchemasConnPropsResponse.Data.BackgroundValidation"));
		data.setBackgroundValidationMinutes(_ctx.longValue("QueryODPSchemasConnPropsResponse.Data.BackgroundValidationMinutes"));
		data.setBlockingTimeoutMillis(_ctx.longValue("QueryODPSchemasConnPropsResponse.Data.BlockingTimeoutMillis"));
		data.setIdleTimeoutMinutes(_ctx.longValue("QueryODPSchemasConnPropsResponse.Data.IdleTimeoutMinutes"));
		data.setMaxConn(_ctx.longValue("QueryODPSchemasConnPropsResponse.Data.MaxConn"));
		data.setMinConn(_ctx.longValue("QueryODPSchemasConnPropsResponse.Data.MinConn"));
		data.setNewConnectionSql(_ctx.stringValue("QueryODPSchemasConnPropsResponse.Data.NewConnectionSql"));
		data.setOthers(_ctx.stringValue("QueryODPSchemasConnPropsResponse.Data.Others"));
		data.setPrefill(_ctx.booleanValue("QueryODPSchemasConnPropsResponse.Data.Prefill"));
		data.setQueryTimeout(_ctx.longValue("QueryODPSchemasConnPropsResponse.Data.QueryTimeout"));
		data.setTestOnBorrow(_ctx.booleanValue("QueryODPSchemasConnPropsResponse.Data.TestOnBorrow"));
		data.setValidationQuery(_ctx.stringValue("QueryODPSchemasConnPropsResponse.Data.ValidationQuery"));
		data.setValidationQueryTimeout(_ctx.longValue("QueryODPSchemasConnPropsResponse.Data.ValidationQueryTimeout"));
		queryODPSchemasConnPropsResponse.setData(data);
	 
	 	return queryODPSchemasConnPropsResponse;
	}
}