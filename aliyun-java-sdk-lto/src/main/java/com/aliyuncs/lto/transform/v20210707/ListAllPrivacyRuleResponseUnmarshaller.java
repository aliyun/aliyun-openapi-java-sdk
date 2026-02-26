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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListAllPrivacyRuleResponse;
import com.aliyuncs.lto.model.v20210707.ListAllPrivacyRuleResponse.PrivacyRuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllPrivacyRuleResponseUnmarshaller {

	public static ListAllPrivacyRuleResponse unmarshall(ListAllPrivacyRuleResponse listAllPrivacyRuleResponse, UnmarshallerContext _ctx) {
		
		listAllPrivacyRuleResponse.setRequestId(_ctx.stringValue("ListAllPrivacyRuleResponse.RequestId"));
		listAllPrivacyRuleResponse.setCode(_ctx.stringValue("ListAllPrivacyRuleResponse.Code"));
		listAllPrivacyRuleResponse.setHttpStatusCode(_ctx.integerValue("ListAllPrivacyRuleResponse.HttpStatusCode"));
		listAllPrivacyRuleResponse.setMessage(_ctx.stringValue("ListAllPrivacyRuleResponse.Message"));
		listAllPrivacyRuleResponse.setSuccess(_ctx.booleanValue("ListAllPrivacyRuleResponse.Success"));

		List<PrivacyRuleInfo> data = new ArrayList<PrivacyRuleInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAllPrivacyRuleResponse.Data.Length"); i++) {
			PrivacyRuleInfo privacyRuleInfo = new PrivacyRuleInfo();
			privacyRuleInfo.setName(_ctx.stringValue("ListAllPrivacyRuleResponse.Data["+ i +"].Name"));
			privacyRuleInfo.setPrivacyRuleId(_ctx.stringValue("ListAllPrivacyRuleResponse.Data["+ i +"].PrivacyRuleId"));

			data.add(privacyRuleInfo);
		}
		listAllPrivacyRuleResponse.setData(data);
	 
	 	return listAllPrivacyRuleResponse;
	}
}