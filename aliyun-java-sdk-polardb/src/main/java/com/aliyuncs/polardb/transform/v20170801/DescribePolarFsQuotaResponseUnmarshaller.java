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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribePolarFsQuotaResponse;
import com.aliyuncs.polardb.model.v20170801.DescribePolarFsQuotaResponse.PolicyItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolarFsQuotaResponseUnmarshaller {

	public static DescribePolarFsQuotaResponse unmarshall(DescribePolarFsQuotaResponse describePolarFsQuotaResponse, UnmarshallerContext _ctx) {
		
		describePolarFsQuotaResponse.setRequestId(_ctx.stringValue("DescribePolarFsQuotaResponse.RequestId"));
		describePolarFsQuotaResponse.setPolarFsInstanceId(_ctx.stringValue("DescribePolarFsQuotaResponse.PolarFsInstanceId"));
		describePolarFsQuotaResponse.setQuotaNameMatch(_ctx.stringValue("DescribePolarFsQuotaResponse.QuotaNameMatch"));
		describePolarFsQuotaResponse.setPatternMatch(_ctx.stringValue("DescribePolarFsQuotaResponse.PatternMatch"));
		describePolarFsQuotaResponse.setPageSize(_ctx.stringValue("DescribePolarFsQuotaResponse.PageSize"));
		describePolarFsQuotaResponse.setPageNumber(_ctx.stringValue("DescribePolarFsQuotaResponse.PageNumber"));
		describePolarFsQuotaResponse.setTotalRecordCount(_ctx.stringValue("DescribePolarFsQuotaResponse.TotalRecordCount"));
		describePolarFsQuotaResponse.setPageRecordCount(_ctx.stringValue("DescribePolarFsQuotaResponse.PageRecordCount"));

		List<PolicyItem> policyItems = new ArrayList<PolicyItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolarFsQuotaResponse.PolicyItems.Length"); i++) {
			PolicyItem policyItem = new PolicyItem();
			policyItem.setId(_ctx.longValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].Id"));
			policyItem.setName(_ctx.stringValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].Name"));
			policyItem.setDescription(_ctx.stringValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].Description"));
			policyItem.setInclude(_ctx.stringValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].Include"));
			policyItem.setExclude(_ctx.stringValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].Exclude"));
			policyItem.setSizeLimit(_ctx.longValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].SizeLimit"));
			policyItem.setFileCountLimit(_ctx.longValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].FileCountLimit"));
			policyItem.setAccessTTL(_ctx.longValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].AccessTTL"));
			policyItem.setChangeTTL(_ctx.longValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].ChangeTTL"));
			policyItem.setPriority(_ctx.integerValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].Priority"));
			policyItem.setEnabled(_ctx.booleanValue("DescribePolarFsQuotaResponse.PolicyItems["+ i +"].Enabled"));

			policyItems.add(policyItem);
		}
		describePolarFsQuotaResponse.setPolicyItems(policyItems);
	 
	 	return describePolarFsQuotaResponse;
	}
}