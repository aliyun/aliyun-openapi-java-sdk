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

package com.aliyuncs.companyreg.transform.v20190508;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20190508.ListIcpApplicationsResponse;
import com.aliyuncs.companyreg.model.v20190508.ListIcpApplicationsResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIcpApplicationsResponseUnmarshaller {

	public static ListIcpApplicationsResponse unmarshall(ListIcpApplicationsResponse listIcpApplicationsResponse, UnmarshallerContext _ctx) {
		
		listIcpApplicationsResponse.setRequestId(_ctx.stringValue("ListIcpApplicationsResponse.RequestId"));
		listIcpApplicationsResponse.setPageNumber(_ctx.integerValue("ListIcpApplicationsResponse.PageNumber"));
		listIcpApplicationsResponse.setPageSize(_ctx.integerValue("ListIcpApplicationsResponse.PageSize"));
		listIcpApplicationsResponse.setSource(_ctx.stringValue("ListIcpApplicationsResponse.Source"));
		listIcpApplicationsResponse.setTotalCount(_ctx.integerValue("ListIcpApplicationsResponse.TotalCount"));

		List<Application> applications = new ArrayList<Application>();
		for (int i = 0; i < _ctx.lengthValue("ListIcpApplicationsResponse.Applications.Length"); i++) {
			Application application = new Application();
			application.setType(_ctx.integerValue("ListIcpApplicationsResponse.Applications["+ i +"].Type"));
			application.setOrderPrice(_ctx.floatValue("ListIcpApplicationsResponse.Applications["+ i +"].OrderPrice"));
			application.setUpdateTime(_ctx.longValue("ListIcpApplicationsResponse.Applications["+ i +"].UpdateTime"));
			application.setDomain(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].Domain"));
			application.setProduceVersion(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].ProduceVersion"));
			application.setActionType(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].ActionType"));
			application.setUserId(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].UserId"));
			application.setApplicationType(_ctx.integerValue("ListIcpApplicationsResponse.Applications["+ i +"].ApplicationType"));
			application.setBizId(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].BizId"));
			application.setPartnerCode(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].PartnerCode"));
			application.setIncludeForeignInvestment(_ctx.booleanValue("ListIcpApplicationsResponse.Applications["+ i +"].IncludeForeignInvestment"));
			application.setIntentionBizId(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].IntentionBizId"));
			application.setCompanyAddress(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].CompanyAddress"));
			application.setLegalPersonName(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].LegalPersonName"));
			application.setVersion(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].Version"));
			application.setApplicationStatus(_ctx.integerValue("ListIcpApplicationsResponse.Applications["+ i +"].ApplicationStatus"));
			application.setCompanyArea(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].CompanyArea"));
			application.setOrderId(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].OrderId"));
			application.setCompanyName(_ctx.stringValue("ListIcpApplicationsResponse.Applications["+ i +"].CompanyName"));

			applications.add(application);
		}
		listIcpApplicationsResponse.setApplications(applications);
	 
	 	return listIcpApplicationsResponse;
	}
}