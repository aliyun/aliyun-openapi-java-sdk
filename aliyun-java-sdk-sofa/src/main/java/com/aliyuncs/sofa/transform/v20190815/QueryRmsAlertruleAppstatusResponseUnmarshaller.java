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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertruleAppstatusResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlertruleAppstatusResponse.Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAlertruleAppstatusResponseUnmarshaller {

	public static QueryRmsAlertruleAppstatusResponse unmarshall(QueryRmsAlertruleAppstatusResponse queryRmsAlertruleAppstatusResponse, UnmarshallerContext _ctx) {
		
		queryRmsAlertruleAppstatusResponse.setRequestId(_ctx.stringValue("QueryRmsAlertruleAppstatusResponse.RequestId"));
		queryRmsAlertruleAppstatusResponse.setResultCode(_ctx.stringValue("QueryRmsAlertruleAppstatusResponse.ResultCode"));
		queryRmsAlertruleAppstatusResponse.setResultMessage(_ctx.stringValue("QueryRmsAlertruleAppstatusResponse.ResultMessage"));

		Response response = new Response();

		List<String> itemTypeAlerting = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlertruleAppstatusResponse.Response.ItemTypeAlerting.Length"); i++) {
			itemTypeAlerting.add(_ctx.stringValue("QueryRmsAlertruleAppstatusResponse.Response.ItemTypeAlerting["+ i +"]"));
		}
		response.setItemTypeAlerting(itemTypeAlerting);

		List<String> itemTypeConfigured = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlertruleAppstatusResponse.Response.ItemTypeConfigured.Length"); i++) {
			itemTypeConfigured.add(_ctx.stringValue("QueryRmsAlertruleAppstatusResponse.Response.ItemTypeConfigured["+ i +"]"));
		}
		response.setItemTypeConfigured(itemTypeConfigured);

		List<String> itemTypeNotConfigured = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlertruleAppstatusResponse.Response.ItemTypeNotConfigured.Length"); i++) {
			itemTypeNotConfigured.add(_ctx.stringValue("QueryRmsAlertruleAppstatusResponse.Response.ItemTypeNotConfigured["+ i +"]"));
		}
		response.setItemTypeNotConfigured(itemTypeNotConfigured);
		queryRmsAlertruleAppstatusResponse.setResponse(response);
	 
	 	return queryRmsAlertruleAppstatusResponse;
	}
}