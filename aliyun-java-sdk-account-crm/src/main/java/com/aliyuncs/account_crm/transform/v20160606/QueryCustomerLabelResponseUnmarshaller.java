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

package com.aliyuncs.account_crm.transform.v20160606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.QueryCustomerLabelResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryCustomerLabelResponse.CustomerLabel;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomerLabelResponseUnmarshaller {

	public static QueryCustomerLabelResponse unmarshall(QueryCustomerLabelResponse queryCustomerLabelResponse, UnmarshallerContext _ctx) {
		
		queryCustomerLabelResponse.setRequestId(_ctx.stringValue("QueryCustomerLabelResponse.RequestId"));
		queryCustomerLabelResponse.setCode(_ctx.stringValue("QueryCustomerLabelResponse.Code"));
		queryCustomerLabelResponse.setMessage(_ctx.stringValue("QueryCustomerLabelResponse.Message"));
		queryCustomerLabelResponse.setSuccess(_ctx.booleanValue("QueryCustomerLabelResponse.Success"));

		List<CustomerLabel> data = new ArrayList<CustomerLabel>();
		for (int i = 0; i < _ctx.lengthValue("QueryCustomerLabelResponse.Data.Length"); i++) {
			CustomerLabel customerLabel = new CustomerLabel();
			customerLabel.setLabel(_ctx.stringValue("QueryCustomerLabelResponse.Data["+ i +"].Label"));
			customerLabel.setLabelSeries(_ctx.stringValue("QueryCustomerLabelResponse.Data["+ i +"].LabelSeries"));

			data.add(customerLabel);
		}
		queryCustomerLabelResponse.setData(data);
	 
	 	return queryCustomerLabelResponse;
	}
}