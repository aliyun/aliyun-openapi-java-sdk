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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorityTemplateResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListAuthorityTemplateResponse.AuthorityTemplateView;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAuthorityTemplateResponseUnmarshaller {

	public static ListAuthorityTemplateResponse unmarshall(ListAuthorityTemplateResponse listAuthorityTemplateResponse, UnmarshallerContext _ctx) {
		
		listAuthorityTemplateResponse.setRequestId(_ctx.stringValue("ListAuthorityTemplateResponse.RequestId"));
		listAuthorityTemplateResponse.setErrorCode(_ctx.stringValue("ListAuthorityTemplateResponse.ErrorCode"));
		listAuthorityTemplateResponse.setErrorMessage(_ctx.stringValue("ListAuthorityTemplateResponse.ErrorMessage"));
		listAuthorityTemplateResponse.setSuccess(_ctx.booleanValue("ListAuthorityTemplateResponse.Success"));
		listAuthorityTemplateResponse.setTid(_ctx.longValue("ListAuthorityTemplateResponse.Tid"));
		listAuthorityTemplateResponse.setTotalCount(_ctx.longValue("ListAuthorityTemplateResponse.TotalCount"));

		List<AuthorityTemplateView> authorityTemplateViewList = new ArrayList<AuthorityTemplateView>();
		for (int i = 0; i < _ctx.lengthValue("ListAuthorityTemplateResponse.AuthorityTemplateViewList.Length"); i++) {
			AuthorityTemplateView authorityTemplateView = new AuthorityTemplateView();
			authorityTemplateView.setTemplateId(_ctx.longValue("ListAuthorityTemplateResponse.AuthorityTemplateViewList["+ i +"].TemplateId"));
			authorityTemplateView.setCreatorId(_ctx.longValue("ListAuthorityTemplateResponse.AuthorityTemplateViewList["+ i +"].CreatorId"));
			authorityTemplateView.setName(_ctx.stringValue("ListAuthorityTemplateResponse.AuthorityTemplateViewList["+ i +"].Name"));
			authorityTemplateView.setDescription(_ctx.stringValue("ListAuthorityTemplateResponse.AuthorityTemplateViewList["+ i +"].Description"));
			authorityTemplateView.setCreateTime(_ctx.stringValue("ListAuthorityTemplateResponse.AuthorityTemplateViewList["+ i +"].CreateTime"));

			authorityTemplateViewList.add(authorityTemplateView);
		}
		listAuthorityTemplateResponse.setAuthorityTemplateViewList(authorityTemplateViewList);
	 
	 	return listAuthorityTemplateResponse;
	}
}