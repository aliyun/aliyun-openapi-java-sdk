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

package com.aliyuncs.account_crm.transform.v20160606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.GetDingTalkUserOrgByAliyunTmpCodeResponse;
import com.aliyuncs.account_crm.model.v20160606.GetDingTalkUserOrgByAliyunTmpCodeResponse.Data;
import com.aliyuncs.account_crm.model.v20160606.GetDingTalkUserOrgByAliyunTmpCodeResponse.Data.OrgDtoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDingTalkUserOrgByAliyunTmpCodeResponseUnmarshaller {

	public static GetDingTalkUserOrgByAliyunTmpCodeResponse unmarshall(GetDingTalkUserOrgByAliyunTmpCodeResponse getDingTalkUserOrgByAliyunTmpCodeResponse, UnmarshallerContext _ctx) {
		
		getDingTalkUserOrgByAliyunTmpCodeResponse.setRequestId(_ctx.stringValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.RequestId"));
		getDingTalkUserOrgByAliyunTmpCodeResponse.setSuccess(_ctx.booleanValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.Success"));
		getDingTalkUserOrgByAliyunTmpCodeResponse.setCode(_ctx.stringValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.Code"));
		getDingTalkUserOrgByAliyunTmpCodeResponse.setHttpCode(_ctx.stringValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.HttpCode"));
		getDingTalkUserOrgByAliyunTmpCodeResponse.setMessage(_ctx.stringValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.Message"));

		Data data = new Data();
		data.setAssociatedUnionId(_ctx.stringValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.Data.AssociatedUnionId"));
		data.setNick(_ctx.stringValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.Data.Nick"));

		List<OrgDtoListItem> orgDtoList = new ArrayList<OrgDtoListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.Data.OrgDtoList.Length"); i++) {
			OrgDtoListItem orgDtoListItem = new OrgDtoListItem();
			orgDtoListItem.setOrgName(_ctx.stringValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.Data.OrgDtoList["+ i +"].OrgName"));
			orgDtoListItem.setOrgId(_ctx.stringValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.Data.OrgDtoList["+ i +"].OrgId"));
			orgDtoListItem.setCorpId(_ctx.stringValue("GetDingTalkUserOrgByAliyunTmpCodeResponse.Data.OrgDtoList["+ i +"].CorpId"));

			orgDtoList.add(orgDtoListItem);
		}
		data.setOrgDtoList(orgDtoList);
		getDingTalkUserOrgByAliyunTmpCodeResponse.setData(data);
	 
	 	return getDingTalkUserOrgByAliyunTmpCodeResponse;
	}
}