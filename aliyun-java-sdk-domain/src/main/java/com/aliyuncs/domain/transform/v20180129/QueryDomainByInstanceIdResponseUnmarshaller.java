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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryDomainByInstanceIdResponse;
import com.aliyuncs.domain.model.v20180129.QueryDomainByInstanceIdResponse.TagItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainByInstanceIdResponseUnmarshaller {

	public static QueryDomainByInstanceIdResponse unmarshall(QueryDomainByInstanceIdResponse queryDomainByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		queryDomainByInstanceIdResponse.setRequestId(_ctx.stringValue("QueryDomainByInstanceIdResponse.RequestId"));
		queryDomainByInstanceIdResponse.setEmail(_ctx.stringValue("QueryDomainByInstanceIdResponse.Email"));
		queryDomainByInstanceIdResponse.setRegistrationDate(_ctx.stringValue("QueryDomainByInstanceIdResponse.RegistrationDate"));
		queryDomainByInstanceIdResponse.setRegistrationDateLong(_ctx.longValue("QueryDomainByInstanceIdResponse.RegistrationDateLong"));
		queryDomainByInstanceIdResponse.setRealNameStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.RealNameStatus"));
		queryDomainByInstanceIdResponse.setPremium(_ctx.booleanValue("QueryDomainByInstanceIdResponse.Premium"));
		queryDomainByInstanceIdResponse.setDomainNameVerificationStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.DomainNameVerificationStatus"));
		queryDomainByInstanceIdResponse.setExpirationDateLong(_ctx.longValue("QueryDomainByInstanceIdResponse.ExpirationDateLong"));
		queryDomainByInstanceIdResponse.setTransferOutStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.TransferOutStatus"));
		queryDomainByInstanceIdResponse.setZhRegistrantOrganization(_ctx.stringValue("QueryDomainByInstanceIdResponse.ZhRegistrantOrganization"));
		queryDomainByInstanceIdResponse.setEmailVerificationClientHold(_ctx.booleanValue("QueryDomainByInstanceIdResponse.EmailVerificationClientHold"));
		queryDomainByInstanceIdResponse.setEmailVerificationStatus(_ctx.integerValue("QueryDomainByInstanceIdResponse.EmailVerificationStatus"));
		queryDomainByInstanceIdResponse.setRegistrantOrganization(_ctx.stringValue("QueryDomainByInstanceIdResponse.RegistrantOrganization"));
		queryDomainByInstanceIdResponse.setTransferProhibitionLock(_ctx.stringValue("QueryDomainByInstanceIdResponse.TransferProhibitionLock"));
		queryDomainByInstanceIdResponse.setDomainNameProxyService(_ctx.booleanValue("QueryDomainByInstanceIdResponse.DomainNameProxyService"));
		queryDomainByInstanceIdResponse.setRegistrantType(_ctx.stringValue("QueryDomainByInstanceIdResponse.RegistrantType"));
		queryDomainByInstanceIdResponse.setRegistrantUpdatingStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.RegistrantUpdatingStatus"));
		queryDomainByInstanceIdResponse.setDomainName(_ctx.stringValue("QueryDomainByInstanceIdResponse.DomainName"));
		queryDomainByInstanceIdResponse.setInstanceId(_ctx.stringValue("QueryDomainByInstanceIdResponse.InstanceId"));
		queryDomainByInstanceIdResponse.setZhRegistrantName(_ctx.stringValue("QueryDomainByInstanceIdResponse.ZhRegistrantName"));
		queryDomainByInstanceIdResponse.setExpirationDate(_ctx.stringValue("QueryDomainByInstanceIdResponse.ExpirationDate"));
		queryDomainByInstanceIdResponse.setRegistrantName(_ctx.stringValue("QueryDomainByInstanceIdResponse.RegistrantName"));
		queryDomainByInstanceIdResponse.setUserId(_ctx.stringValue("QueryDomainByInstanceIdResponse.UserId"));
		queryDomainByInstanceIdResponse.setUpdateProhibitionLock(_ctx.stringValue("QueryDomainByInstanceIdResponse.UpdateProhibitionLock"));
		queryDomainByInstanceIdResponse.setDomainGroupId(_ctx.longValue("QueryDomainByInstanceIdResponse.DomainGroupId"));
		queryDomainByInstanceIdResponse.setRemark(_ctx.stringValue("QueryDomainByInstanceIdResponse.Remark"));
		queryDomainByInstanceIdResponse.setDomainGroupName(_ctx.stringValue("QueryDomainByInstanceIdResponse.DomainGroupName"));
		queryDomainByInstanceIdResponse.setExpirationDateStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.ExpirationDateStatus"));
		queryDomainByInstanceIdResponse.setExpirationCurrDateDiff(_ctx.integerValue("QueryDomainByInstanceIdResponse.ExpirationCurrDateDiff"));
		queryDomainByInstanceIdResponse.setDomainType(_ctx.stringValue("QueryDomainByInstanceIdResponse.DomainType"));
		queryDomainByInstanceIdResponse.setDomainStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.DomainStatus"));
		queryDomainByInstanceIdResponse.setResourceGroupId(_ctx.stringValue("QueryDomainByInstanceIdResponse.ResourceGroupId"));
		queryDomainByInstanceIdResponse.setDomainLifecycleStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.DomainLifecycleStatus"));
		queryDomainByInstanceIdResponse.setPrivacyServiceStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.PrivacyServiceStatus"));

		List<String> dnsList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainByInstanceIdResponse.DnsList.Length"); i++) {
			dnsList.add(_ctx.stringValue("QueryDomainByInstanceIdResponse.DnsList["+ i +"]"));
		}
		queryDomainByInstanceIdResponse.setDnsList(dnsList);

		List<TagItem> tag = new ArrayList<TagItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainByInstanceIdResponse.Tag.Length"); i++) {
			TagItem tagItem = new TagItem();
			tagItem.setKey(_ctx.stringValue("QueryDomainByInstanceIdResponse.Tag["+ i +"].Key"));
			tagItem.setValue(_ctx.stringValue("QueryDomainByInstanceIdResponse.Tag["+ i +"].Value"));

			tag.add(tagItem);
		}
		queryDomainByInstanceIdResponse.setTag(tag);
	 
	 	return queryDomainByInstanceIdResponse;
	}
}