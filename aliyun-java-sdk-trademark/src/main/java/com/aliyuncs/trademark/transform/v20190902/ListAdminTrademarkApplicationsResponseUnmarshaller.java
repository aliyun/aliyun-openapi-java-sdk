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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.ListAdminTrademarkApplicationsResponse;
import com.aliyuncs.trademark.model.v20190902.ListAdminTrademarkApplicationsResponse.TrademarkApplication;
import com.aliyuncs.trademark.model.v20190902.ListAdminTrademarkApplicationsResponse.TrademarkApplication.FirstClassification;
import com.aliyuncs.trademark.model.v20190902.ListAdminTrademarkApplicationsResponse.TrademarkApplication.ThirdClassificationItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAdminTrademarkApplicationsResponseUnmarshaller {

	public static ListAdminTrademarkApplicationsResponse unmarshall(ListAdminTrademarkApplicationsResponse listAdminTrademarkApplicationsResponse, UnmarshallerContext _ctx) {
		
		listAdminTrademarkApplicationsResponse.setRequestId(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.RequestId"));
		listAdminTrademarkApplicationsResponse.setPageSize(_ctx.integerValue("ListAdminTrademarkApplicationsResponse.PageSize"));
		listAdminTrademarkApplicationsResponse.setPageNumber(_ctx.integerValue("ListAdminTrademarkApplicationsResponse.PageNumber"));
		listAdminTrademarkApplicationsResponse.setTotalCount(_ctx.integerValue("ListAdminTrademarkApplicationsResponse.TotalCount"));

		List<TrademarkApplication> trademarkApplications = new ArrayList<TrademarkApplication>();
		for (int i = 0; i < _ctx.lengthValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications.Length"); i++) {
			TrademarkApplication trademarkApplication = new TrademarkApplication();
			trademarkApplication.setTrademarkName(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].TrademarkName"));
			trademarkApplication.setOrderPrice(_ctx.floatValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].OrderPrice"));
			trademarkApplication.setUpdateTime(_ctx.longValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].UpdateTime"));
			trademarkApplication.setCreateTime(_ctx.longValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].CreateTime"));
			trademarkApplication.setAuthorizationUrl(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].AuthorizationUrl"));
			trademarkApplication.setUserId(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].UserId"));
			trademarkApplication.setApplicationType(_ctx.integerValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ApplicationType"));
			trademarkApplication.setBizId(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].BizId"));
			trademarkApplication.setServicePrice(_ctx.floatValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ServicePrice"));
			trademarkApplication.setApplicantName(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ApplicantName"));
			trademarkApplication.setTrademarkIcon(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].TrademarkIcon"));
			trademarkApplication.setApplicantId(_ctx.longValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ApplicantId"));
			trademarkApplication.setSupplementId(_ctx.longValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].SupplementId"));
			trademarkApplication.setApplicationStatus(_ctx.integerValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ApplicationStatus"));
			trademarkApplication.setTrademarkNumber(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].TrademarkNumber"));
			trademarkApplication.setNote(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].Note"));
			trademarkApplication.setPrincipalName(_ctx.integerValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].PrincipalName"));
			trademarkApplication.setSupplementStatus(_ctx.integerValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].SupplementStatus"));
			trademarkApplication.setTotalPrice(_ctx.floatValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].TotalPrice"));
			trademarkApplication.setOrderId(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].OrderId"));
			trademarkApplication.setSystemVersion(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].SystemVersion"));

			List<String> flags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].Flags.Length"); j++) {
				flags.add(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].Flags["+ j +"]"));
			}
			trademarkApplication.setFlags(flags);

			FirstClassification firstClassification = new FirstClassification();
			firstClassification.setClassificationName(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].FirstClassification.ClassificationName"));
			firstClassification.setClassificationCode(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].FirstClassification.ClassificationCode"));
			trademarkApplication.setFirstClassification(firstClassification);

			List<ThirdClassificationItem> thirdClassification = new ArrayList<ThirdClassificationItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ThirdClassification.Length"); j++) {
				ThirdClassificationItem thirdClassificationItem = new ThirdClassificationItem();
				thirdClassificationItem.setClassificationName(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ThirdClassification["+ j +"].ClassificationName"));
				thirdClassificationItem.setClassificationCode(_ctx.stringValue("ListAdminTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ThirdClassification["+ j +"].ClassificationCode"));

				thirdClassification.add(thirdClassificationItem);
			}
			trademarkApplication.setThirdClassification(thirdClassification);

			trademarkApplications.add(trademarkApplication);
		}
		listAdminTrademarkApplicationsResponse.setTrademarkApplications(trademarkApplications);
	 
	 	return listAdminTrademarkApplicationsResponse;
	}
}