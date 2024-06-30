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

package com.aliyuncs.quotas.transform.v20200510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quotas.model.v20200510.CreateQuotaApplicationsForTemplateResponse;
import com.aliyuncs.quotas.model.v20200510.CreateQuotaApplicationsForTemplateResponse.FailResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateQuotaApplicationsForTemplateResponseUnmarshaller {

	public static CreateQuotaApplicationsForTemplateResponse unmarshall(CreateQuotaApplicationsForTemplateResponse createQuotaApplicationsForTemplateResponse, UnmarshallerContext _ctx) {
		
		createQuotaApplicationsForTemplateResponse.setRequestId(_ctx.stringValue("CreateQuotaApplicationsForTemplateResponse.RequestId"));
		createQuotaApplicationsForTemplateResponse.setBatchQuotaApplicationId(_ctx.stringValue("CreateQuotaApplicationsForTemplateResponse.BatchQuotaApplicationId"));

		List<String> aliyunUids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateQuotaApplicationsForTemplateResponse.AliyunUids.Length"); i++) {
			aliyunUids.add(_ctx.stringValue("CreateQuotaApplicationsForTemplateResponse.AliyunUids["+ i +"]"));
		}
		createQuotaApplicationsForTemplateResponse.setAliyunUids(aliyunUids);

		List<FailResultsItem> failResults = new ArrayList<FailResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateQuotaApplicationsForTemplateResponse.FailResults.Length"); i++) {
			FailResultsItem failResultsItem = new FailResultsItem();
			failResultsItem.setAliyunUid(_ctx.stringValue("CreateQuotaApplicationsForTemplateResponse.FailResults["+ i +"].AliyunUid"));
			failResultsItem.setReason(_ctx.stringValue("CreateQuotaApplicationsForTemplateResponse.FailResults["+ i +"].Reason"));

			failResults.add(failResultsItem);
		}
		createQuotaApplicationsForTemplateResponse.setFailResults(failResults);
	 
	 	return createQuotaApplicationsForTemplateResponse;
	}
}