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

package com.aliyuncs.actiontrail.transform.v20200706;

import com.aliyuncs.actiontrail.model.v20200706.GetAccessKeyLastUsedInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccessKeyLastUsedInfoResponseUnmarshaller {

	public static GetAccessKeyLastUsedInfoResponse unmarshall(GetAccessKeyLastUsedInfoResponse getAccessKeyLastUsedInfoResponse, UnmarshallerContext _ctx) {
		
		getAccessKeyLastUsedInfoResponse.setRequestId(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.RequestId"));
		getAccessKeyLastUsedInfoResponse.setAccessKeyId(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.AccessKeyId"));
		getAccessKeyLastUsedInfoResponse.setAccountId(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.AccountId"));
		getAccessKeyLastUsedInfoResponse.setOwnerId(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.OwnerId"));
		getAccessKeyLastUsedInfoResponse.setUserName(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.UserName"));
		getAccessKeyLastUsedInfoResponse.setAccountType(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.AccountType"));
		getAccessKeyLastUsedInfoResponse.setUsedTimestamp(_ctx.longValue("GetAccessKeyLastUsedInfoResponse.UsedTimestamp"));
		getAccessKeyLastUsedInfoResponse.setDetail(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.Detail"));
		getAccessKeyLastUsedInfoResponse.setSource(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.Source"));
		getAccessKeyLastUsedInfoResponse.setServiceName(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.ServiceName"));
		getAccessKeyLastUsedInfoResponse.setServiceNameCn(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.ServiceNameCn"));
		getAccessKeyLastUsedInfoResponse.setServiceNameEn(_ctx.stringValue("GetAccessKeyLastUsedInfoResponse.ServiceNameEn"));
	 
	 	return getAccessKeyLastUsedInfoResponse;
	}
}