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

import com.aliyuncs.trademark.model.v20190902.ListTrademarkApplicationsResponse;
import com.aliyuncs.trademark.model.v20190902.ListTrademarkApplicationsResponse.TrademarkApplication;
import com.aliyuncs.trademark.model.v20190902.ListTrademarkApplicationsResponse.TrademarkApplication.FirstClassification;
import com.aliyuncs.trademark.model.v20190902.ListTrademarkApplicationsResponse.TrademarkApplication.ThirdClassificationItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrademarkApplicationsResponseUnmarshaller {

	public static ListTrademarkApplicationsResponse unmarshall(ListTrademarkApplicationsResponse listTrademarkApplicationsResponse, UnmarshallerContext _ctx) {
		
		listTrademarkApplicationsResponse.setRequestId(_ctx.stringValue("ListTrademarkApplicationsResponse.RequestId"));
		listTrademarkApplicationsResponse.setTotalCount(_ctx.integerValue("ListTrademarkApplicationsResponse.TotalCount"));
		listTrademarkApplicationsResponse.setPageNumber(_ctx.integerValue("ListTrademarkApplicationsResponse.PageNumber"));
		listTrademarkApplicationsResponse.setPageSize(_ctx.integerValue("ListTrademarkApplicationsResponse.PageSize"));

		List<TrademarkApplication> trademarkApplications = new ArrayList<TrademarkApplication>();
		for (int i = 0; i < _ctx.lengthValue("ListTrademarkApplicationsResponse.TrademarkApplications.Length"); i++) {
			TrademarkApplication trademarkApplication = new TrademarkApplication();
			trademarkApplication.setBizId(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].BizId"));
			trademarkApplication.setOrderId(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].OrderId"));
			trademarkApplication.setApplicantName(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ApplicantName"));
			trademarkApplication.setTrademarkIcon(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].TrademarkIcon"));
			trademarkApplication.setTrademarkName(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].TrademarkName"));
			trademarkApplication.setTrademarkNumber(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].TrademarkNumber"));
			trademarkApplication.setCreateTime(_ctx.longValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].CreateTime"));
			trademarkApplication.setApplicationType(_ctx.integerValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ApplicationType"));
			trademarkApplication.setApplicationStatus(_ctx.integerValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ApplicationStatus"));
			trademarkApplication.setUserId(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].UserId"));
			trademarkApplication.setOrderPrice(_ctx.floatValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].OrderPrice"));
			trademarkApplication.setApplicantId(_ctx.longValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ApplicantId"));
			trademarkApplication.setAuthorizationUrl(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].AuthorizationUrl"));
			trademarkApplication.setNote(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].Note"));
			trademarkApplication.setUpdateTime(_ctx.longValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].UpdateTime"));
			trademarkApplication.setSupplementStatus(_ctx.integerValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].SupplementStatus"));
			trademarkApplication.setSupplementId(_ctx.longValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].SupplementId"));
			trademarkApplication.setTotalPrice(_ctx.floatValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].TotalPrice"));
			trademarkApplication.setServicePrice(_ctx.floatValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ServicePrice"));

			List<String> flags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].Flags.Length"); j++) {
				flags.add(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].Flags["+ j +"]"));
			}
			trademarkApplication.setFlags(flags);

			FirstClassification firstClassification = new FirstClassification();
			firstClassification.setClassificationCode(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].FirstClassification.ClassificationCode"));
			firstClassification.setClassificationName(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].FirstClassification.ClassificationName"));
			trademarkApplication.setFirstClassification(firstClassification);

			List<ThirdClassificationItem> thirdClassification = new ArrayList<ThirdClassificationItem>();
			for (int j = 0; j < _ctx.lengthValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ThirdClassification.Length"); j++) {
				ThirdClassificationItem thirdClassificationItem = new ThirdClassificationItem();
				thirdClassificationItem.setClassificationCode(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ThirdClassification["+ j +"].ClassificationCode"));
				thirdClassificationItem.setClassificationName(_ctx.stringValue("ListTrademarkApplicationsResponse.TrademarkApplications["+ i +"].ThirdClassification["+ j +"].ClassificationName"));

				thirdClassification.add(thirdClassificationItem);
			}
			trademarkApplication.setThirdClassification(thirdClassification);

			trademarkApplications.add(trademarkApplication);
		}
		listTrademarkApplicationsResponse.setTrademarkApplications(trademarkApplications);
	 
	 	return listTrademarkApplicationsResponse;
	}
}