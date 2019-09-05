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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListPrivacyNumberCallDetailsResponse;
import com.aliyuncs.ccc.model.v20170705.ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails;
import com.aliyuncs.ccc.model.v20170705.ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.PrivacyNumberCallDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivacyNumberCallDetailsResponseUnmarshaller {

	public static ListPrivacyNumberCallDetailsResponse unmarshall(ListPrivacyNumberCallDetailsResponse listPrivacyNumberCallDetailsResponse, UnmarshallerContext _ctx) {
		
		listPrivacyNumberCallDetailsResponse.setRequestId(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.RequestId"));
		listPrivacyNumberCallDetailsResponse.setSuccess(_ctx.booleanValue("ListPrivacyNumberCallDetailsResponse.Success"));
		listPrivacyNumberCallDetailsResponse.setCode(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.Code"));
		listPrivacyNumberCallDetailsResponse.setMessage(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.Message"));
		listPrivacyNumberCallDetailsResponse.setHttpStatusCode(_ctx.integerValue("ListPrivacyNumberCallDetailsResponse.HttpStatusCode"));

		PrivacyNumberCallDetails privacyNumberCallDetails = new PrivacyNumberCallDetails();
		privacyNumberCallDetails.setTotalCount(_ctx.integerValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.TotalCount"));
		privacyNumberCallDetails.setPageNumber(_ctx.integerValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.PageNumber"));
		privacyNumberCallDetails.setPageSize(_ctx.integerValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.PageSize"));

		List<PrivacyNumberCallDetail> list = new ArrayList<PrivacyNumberCallDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List.Length"); i++) {
			PrivacyNumberCallDetail privacyNumberCallDetail = new PrivacyNumberCallDetail();
			privacyNumberCallDetail.setAgentId(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].AgentId"));
			privacyNumberCallDetail.setAgentName(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].AgentName"));
			privacyNumberCallDetail.setContactId(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].ContactId"));
			privacyNumberCallDetail.setCallingNumber(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].CallingNumber"));
			privacyNumberCallDetail.setCalledNumber(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].CalledNumber"));
			privacyNumberCallDetail.setPrivacyNumber(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].PrivacyNumber"));
			privacyNumberCallDetail.setContactType(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].ContactType"));
			privacyNumberCallDetail.setResult(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].Result"));
			privacyNumberCallDetail.setDescription(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].Description"));
			privacyNumberCallDetail.setCallTime(_ctx.longValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].CallTime"));
			privacyNumberCallDetail.setStatus(_ctx.stringValue("ListPrivacyNumberCallDetailsResponse.PrivacyNumberCallDetails.List["+ i +"].Status"));

			list.add(privacyNumberCallDetail);
		}
		privacyNumberCallDetails.setList(list);
		listPrivacyNumberCallDetailsResponse.setPrivacyNumberCallDetails(privacyNumberCallDetails);
	 
	 	return listPrivacyNumberCallDetailsResponse;
	}
}