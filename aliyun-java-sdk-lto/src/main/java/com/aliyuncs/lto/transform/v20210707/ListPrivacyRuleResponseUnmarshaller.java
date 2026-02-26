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

import com.aliyuncs.lto.model.v20210707.ListPrivacyRuleResponse;
import com.aliyuncs.lto.model.v20210707.ListPrivacyRuleResponse.Data;
import com.aliyuncs.lto.model.v20210707.ListPrivacyRuleResponse.Data.PrivacyRuleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivacyRuleResponseUnmarshaller {

	public static ListPrivacyRuleResponse unmarshall(ListPrivacyRuleResponse listPrivacyRuleResponse, UnmarshallerContext _ctx) {
		
		listPrivacyRuleResponse.setRequestId(_ctx.stringValue("ListPrivacyRuleResponse.RequestId"));
		listPrivacyRuleResponse.setCode(_ctx.stringValue("ListPrivacyRuleResponse.Code"));
		listPrivacyRuleResponse.setHttpStatusCode(_ctx.integerValue("ListPrivacyRuleResponse.HttpStatusCode"));
		listPrivacyRuleResponse.setMessage(_ctx.stringValue("ListPrivacyRuleResponse.Message"));
		listPrivacyRuleResponse.setSuccess(_ctx.booleanValue("ListPrivacyRuleResponse.Success"));

		Data data = new Data();
		data.setNum(_ctx.integerValue("ListPrivacyRuleResponse.Data.Num"));
		data.setTotal(_ctx.integerValue("ListPrivacyRuleResponse.Data.Total"));
		data.setSize(_ctx.integerValue("ListPrivacyRuleResponse.Data.Size"));

		List<PrivacyRuleInfo> pageData = new ArrayList<PrivacyRuleInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListPrivacyRuleResponse.Data.PageData.Length"); i++) {
			PrivacyRuleInfo privacyRuleInfo = new PrivacyRuleInfo();
			privacyRuleInfo.setStatus(_ctx.stringValue("ListPrivacyRuleResponse.Data.PageData["+ i +"].Status"));
			privacyRuleInfo.setCurrentUser(_ctx.booleanValue("ListPrivacyRuleResponse.Data.PageData["+ i +"].CurrentUser"));
			privacyRuleInfo.setAlgType(_ctx.stringValue("ListPrivacyRuleResponse.Data.PageData["+ i +"].AlgType"));
			privacyRuleInfo.setRemark(_ctx.stringValue("ListPrivacyRuleResponse.Data.PageData["+ i +"].Remark"));
			privacyRuleInfo.setMemberName(_ctx.stringValue("ListPrivacyRuleResponse.Data.PageData["+ i +"].MemberName"));
			privacyRuleInfo.setPrivacyRuleId(_ctx.stringValue("ListPrivacyRuleResponse.Data.PageData["+ i +"].PrivacyRuleId"));
			privacyRuleInfo.setName(_ctx.stringValue("ListPrivacyRuleResponse.Data.PageData["+ i +"].Name"));
			privacyRuleInfo.setAlgImpl(_ctx.stringValue("ListPrivacyRuleResponse.Data.PageData["+ i +"].AlgImpl"));

			pageData.add(privacyRuleInfo);
		}
		data.setPageData(pageData);
		listPrivacyRuleResponse.setData(data);
	 
	 	return listPrivacyRuleResponse;
	}
}