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

package com.aliyuncs.sophonsoar.transform.v20220728;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sophonsoar.model.v20220728.DescribeGroupProductionsResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeGroupProductionsResponse.DataItem;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeGroupProductionsResponse.DataItem.Production;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeGroupProductionsResponse.DataItem.Production.PolicyListItem;
import com.aliyuncs.sophonsoar.model.v20220728.DescribeGroupProductionsResponse.Page;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupProductionsResponseUnmarshaller {

	public static DescribeGroupProductionsResponse unmarshall(DescribeGroupProductionsResponse describeGroupProductionsResponse, UnmarshallerContext _ctx) {
		
		describeGroupProductionsResponse.setRequestId(_ctx.stringValue("DescribeGroupProductionsResponse.RequestId"));

		Page page = new Page();
		page.setTotalCount(_ctx.integerValue("DescribeGroupProductionsResponse.Page.TotalCount"));
		page.setPageNumber(_ctx.integerValue("DescribeGroupProductionsResponse.Page.PageNumber"));
		page.setPageSize(_ctx.integerValue("DescribeGroupProductionsResponse.Page.PageSize"));
		describeGroupProductionsResponse.setPage(page);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupProductionsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setGroupName(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].GroupName"));

			List<Production> productions = new ArrayList<Production>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions.Length"); j++) {
				Production production = new Production();
				production.setCode(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].Code"));
				production.setName(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].Name"));
				production.setShortName(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].ShortName"));
				production.setDescription(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].Description"));
				production.setGroup(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].Group"));
				production.setDefaultVersion(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].DefaultVersion"));
				production.setDefaultDomain(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].DefaultDomain"));
				production.setRamCode(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].RamCode"));
				production.setSource(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].Source"));

				List<String> versions = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].Versions.Length"); k++) {
					versions.add(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].Versions["+ k +"]"));
				}
				production.setVersions(versions);

				List<String> fullDomains = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].FullDomains.Length"); k++) {
					fullDomains.add(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].FullDomains["+ k +"]"));
				}
				production.setFullDomains(fullDomains);

				List<PolicyListItem> policyList = new ArrayList<PolicyListItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].PolicyList.Length"); k++) {
					PolicyListItem policyListItem = new PolicyListItem();
					policyListItem.setPolicyName(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].PolicyList["+ k +"].PolicyName"));
					policyListItem.setType(_ctx.stringValue("DescribeGroupProductionsResponse.Data["+ i +"].Productions["+ j +"].PolicyList["+ k +"].Type"));

					policyList.add(policyListItem);
				}
				production.setPolicyList(policyList);

				productions.add(production);
			}
			dataItem.setProductions(productions);

			data.add(dataItem);
		}
		describeGroupProductionsResponse.setData(data);
	 
	 	return describeGroupProductionsResponse;
	}
}