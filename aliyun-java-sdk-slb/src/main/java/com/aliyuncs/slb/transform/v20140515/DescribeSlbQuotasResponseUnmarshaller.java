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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeSlbQuotasResponse;
import com.aliyuncs.slb.model.v20140515.DescribeSlbQuotasResponse.Quota;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlbQuotasResponseUnmarshaller {

	public static DescribeSlbQuotasResponse unmarshall(DescribeSlbQuotasResponse describeSlbQuotasResponse, UnmarshallerContext context) {
		
		describeSlbQuotasResponse.setRequestId(context.stringValue("DescribeSlbQuotasResponse.RequestId"));

		List<Quota> quotas = new ArrayList<Quota>();
		for (int i = 0; i < context.lengthValue("DescribeSlbQuotasResponse.Quotas.Length"); i++) {
			Quota quota = new Quota();
			quota.setMax(context.stringValue("DescribeSlbQuotasResponse.Quotas["+ i +"].Max"));
			quota.setQuotaName(context.stringValue("DescribeSlbQuotasResponse.Quotas["+ i +"].QuotaName"));
			quota.setComment(context.stringValue("DescribeSlbQuotasResponse.Quotas["+ i +"].Comment"));

			quotas.add(quota);
		}
		describeSlbQuotasResponse.setQuotas(quotas);
	 
	 	return describeSlbQuotasResponse;
	}
}