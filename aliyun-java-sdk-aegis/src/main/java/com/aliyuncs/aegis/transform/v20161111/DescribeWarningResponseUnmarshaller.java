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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeWarningResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWarningResponse.Warning;
import com.aliyuncs.aegis.model.v20161111.DescribeWarningResponse.Warning.Detail;
import com.aliyuncs.aegis.model.v20161111.DescribeWarningResponse.Warning.Detail.DetailItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWarningResponseUnmarshaller {

	public static DescribeWarningResponse unmarshall(DescribeWarningResponse describeWarningResponse, UnmarshallerContext context) {
		
		describeWarningResponse.setRequestId(context.stringValue("DescribeWarningResponse.RequestId"));
		describeWarningResponse.setCount(context.integerValue("DescribeWarningResponse.Count"));
		describeWarningResponse.setPageSize(context.integerValue("DescribeWarningResponse.PageSize"));
		describeWarningResponse.setTotalCount(context.integerValue("DescribeWarningResponse.TotalCount"));
		describeWarningResponse.setCurrentPage(context.integerValue("DescribeWarningResponse.CurrentPage"));

		List<Warning> warnings = new ArrayList<Warning>();
		for (int i = 0; i < context.lengthValue("DescribeWarningResponse.Warnings.Length"); i++) {
			Warning warning = new Warning();
			warning.setRiskWarningId(context.longValue("DescribeWarningResponse.Warnings["+ i +"].RiskWarningId"));
			warning.setRiskName(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].RiskName"));
			warning.setUuid(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].Uuid"));
			warning.setRirstFoundTime(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].RirstFoundTime"));
			warning.setLastFoundTime(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].LastFoundTime"));
			warning.setLevel(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].Level"));
			warning.setTypeName(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].TypeName"));
			warning.setSubTypeName(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].SubTypeName"));
			warning.setTypeAlias(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].TypeAlias"));
			warning.setSubTypeAlias(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].SubTypeAlias"));
			warning.setStatus(context.integerValue("DescribeWarningResponse.Warnings["+ i +"].Status"));

			List<Detail> details = new ArrayList<Detail>();
			for (int j = 0; j < context.lengthValue("DescribeWarningResponse.Warnings["+ i +"].Details.Length"); j++) {
				Detail detail = new Detail();

				List<DetailItem> detailItems = new ArrayList<DetailItem>();
				for (int k = 0; k < context.lengthValue("DescribeWarningResponse.Warnings["+ i +"].Details["+ j +"].DetailItems.Length"); k++) {
					DetailItem detailItem = new DetailItem();
					detailItem.setName(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].Details["+ j +"].DetailItems["+ k +"].name"));
					detailItem.setValue(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].Details["+ j +"].DetailItems["+ k +"].value"));
					detailItem.setType(context.stringValue("DescribeWarningResponse.Warnings["+ i +"].Details["+ j +"].DetailItems["+ k +"].type"));

					detailItems.add(detailItem);
				}
				detail.setDetailItems(detailItems);

				details.add(detail);
			}
			warning.setDetails(details);

			warnings.add(warning);
		}
		describeWarningResponse.setWarnings(warnings);
	 
	 	return describeWarningResponse;
	}
}