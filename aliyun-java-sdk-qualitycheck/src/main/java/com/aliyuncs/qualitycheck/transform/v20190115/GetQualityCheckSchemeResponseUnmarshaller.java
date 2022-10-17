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

import com.aliyuncs.qualitycheck.model.v20190115.GetQualityCheckSchemeResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetQualityCheckSchemeResponse.Data;
import com.aliyuncs.qualitycheck.model.v20190115.GetQualityCheckSchemeResponse.Data.SchemeCheckTypeListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityCheckSchemeResponseUnmarshaller {

	public static GetQualityCheckSchemeResponse unmarshall(GetQualityCheckSchemeResponse getQualityCheckSchemeResponse, UnmarshallerContext _ctx) {
		
		getQualityCheckSchemeResponse.setRequestId(_ctx.stringValue("GetQualityCheckSchemeResponse.RequestId"));
		getQualityCheckSchemeResponse.setSuccess(_ctx.booleanValue("GetQualityCheckSchemeResponse.Success"));
		getQualityCheckSchemeResponse.setCode(_ctx.stringValue("GetQualityCheckSchemeResponse.Code"));
		getQualityCheckSchemeResponse.setMessage(_ctx.stringValue("GetQualityCheckSchemeResponse.Message"));
		getQualityCheckSchemeResponse.setHttpStatusCode(_ctx.integerValue("GetQualityCheckSchemeResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityCheckSchemeResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("GetQualityCheckSchemeResponse.Messages["+ i +"]"));
		}
		getQualityCheckSchemeResponse.setMessages(messages);

		Data data = new Data();
		data.setSchemeId(_ctx.longValue("GetQualityCheckSchemeResponse.Data.SchemeId"));
		data.setName(_ctx.stringValue("GetQualityCheckSchemeResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetQualityCheckSchemeResponse.Data.Description"));
		data.setSchemeTemplateId(_ctx.longValue("GetQualityCheckSchemeResponse.Data.SchemeTemplateId"));
		data.setDataType(_ctx.integerValue("GetQualityCheckSchemeResponse.Data.DataType"));
		data.setType(_ctx.integerValue("GetQualityCheckSchemeResponse.Data.Type"));
		data.setTemplateType(_ctx.integerValue("GetQualityCheckSchemeResponse.Data.TemplateType"));
		data.setStatus(_ctx.integerValue("GetQualityCheckSchemeResponse.Data.Status"));
		data.setCreateUserName(_ctx.stringValue("GetQualityCheckSchemeResponse.Data.CreateUserName"));
		data.setCreateTime(_ctx.stringValue("GetQualityCheckSchemeResponse.Data.CreateTime"));
		data.setUpdateUserName(_ctx.stringValue("GetQualityCheckSchemeResponse.Data.UpdateUserName"));
		data.setUpdateTime(_ctx.stringValue("GetQualityCheckSchemeResponse.Data.UpdateTime"));
		data.setVersion(_ctx.longValue("GetQualityCheckSchemeResponse.Data.Version"));
		data.setPublishContent(_ctx.stringValue("GetQualityCheckSchemeResponse.Data.PublishContent"));

		List<String> ruleIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityCheckSchemeResponse.Data.RuleIds.Length"); i++) {
			ruleIds.add(_ctx.stringValue("GetQualityCheckSchemeResponse.Data.RuleIds["+ i +"]"));
		}
		data.setRuleIds(ruleIds);

		List<String> ruleList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityCheckSchemeResponse.Data.RuleList.Length"); i++) {
			ruleList.add(_ctx.stringValue("GetQualityCheckSchemeResponse.Data.RuleList["+ i +"]"));
		}
		data.setRuleList(ruleList);

		List<SchemeCheckTypeListItem> schemeCheckTypeList = new ArrayList<SchemeCheckTypeListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetQualityCheckSchemeResponse.Data.SchemeCheckTypeList.Length"); i++) {
			SchemeCheckTypeListItem schemeCheckTypeListItem = new SchemeCheckTypeListItem();
			schemeCheckTypeListItem.setCheckType(_ctx.longValue("GetQualityCheckSchemeResponse.Data.SchemeCheckTypeList["+ i +"].CheckType"));
			schemeCheckTypeListItem.setCheckName(_ctx.stringValue("GetQualityCheckSchemeResponse.Data.SchemeCheckTypeList["+ i +"].CheckName"));
			schemeCheckTypeListItem.setSourceScore(_ctx.integerValue("GetQualityCheckSchemeResponse.Data.SchemeCheckTypeList["+ i +"].SourceScore"));
			schemeCheckTypeListItem.setScore(_ctx.integerValue("GetQualityCheckSchemeResponse.Data.SchemeCheckTypeList["+ i +"].Score"));
			schemeCheckTypeListItem.setEnable(_ctx.integerValue("GetQualityCheckSchemeResponse.Data.SchemeCheckTypeList["+ i +"].Enable"));
			schemeCheckTypeListItem.setSchemeId(_ctx.longValue("GetQualityCheckSchemeResponse.Data.SchemeCheckTypeList["+ i +"].SchemeId"));

			schemeCheckTypeList.add(schemeCheckTypeListItem);
		}
		data.setSchemeCheckTypeList(schemeCheckTypeList);
		getQualityCheckSchemeResponse.setData(data);
	 
	 	return getQualityCheckSchemeResponse;
	}
}