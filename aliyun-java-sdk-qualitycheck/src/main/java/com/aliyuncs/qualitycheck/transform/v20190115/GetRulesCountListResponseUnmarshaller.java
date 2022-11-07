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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.GetRulesCountListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRulesCountListResponseUnmarshaller {

	public static GetRulesCountListResponse unmarshall(GetRulesCountListResponse getRulesCountListResponse, UnmarshallerContext _ctx) {
		
		getRulesCountListResponse.setRequestId(_ctx.stringValue("GetRulesCountListResponse.RequestId"));
		getRulesCountListResponse.setTotalCount(_ctx.integerValue("GetRulesCountListResponse.TotalCount"));
		getRulesCountListResponse.setBusinessType(_ctx.integerValue("GetRulesCountListResponse.BusinessType"));
		getRulesCountListResponse.setCount(_ctx.integerValue("GetRulesCountListResponse.Count"));
		getRulesCountListResponse.setCurrentPage(_ctx.integerValue("GetRulesCountListResponse.CurrentPage"));
		getRulesCountListResponse.setPageSize(_ctx.integerValue("GetRulesCountListResponse.PageSize"));
		getRulesCountListResponse.setPageNumber(_ctx.integerValue("GetRulesCountListResponse.PageNumber"));
		getRulesCountListResponse.setSuccess(_ctx.booleanValue("GetRulesCountListResponse.Success"));
		getRulesCountListResponse.setCode(_ctx.stringValue("GetRulesCountListResponse.Code"));
		getRulesCountListResponse.setMessage(_ctx.stringValue("GetRulesCountListResponse.Message"));
		getRulesCountListResponse.setHttpStatusCode(_ctx.integerValue("GetRulesCountListResponse.HttpStatusCode"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRulesCountListResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetRulesCountListResponse.Data["+ i +"]"));
		}
		getRulesCountListResponse.setData(data);

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetRulesCountListResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("GetRulesCountListResponse.Messages["+ i +"]"));
		}
		getRulesCountListResponse.setMessages(messages);
	 
	 	return getRulesCountListResponse;
	}
}