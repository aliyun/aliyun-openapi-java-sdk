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

package com.aliyuncs.crm.transform.v20150408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.crm.model.v20150408.QueryCustomerLabelResponse;
import com.aliyuncs.crm.model.v20150408.QueryCustomerLabelResponse.CustomerLabel;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomerLabelResponseUnmarshaller {

	public static QueryCustomerLabelResponse unmarshall(QueryCustomerLabelResponse queryCustomerLabelResponse, UnmarshallerContext context) {
		
		queryCustomerLabelResponse.setSuccess(context.booleanValue("QueryCustomerLabelResponse.Success"));
		queryCustomerLabelResponse.setCode(context.stringValue("QueryCustomerLabelResponse.Code"));
		queryCustomerLabelResponse.setMessage(context.stringValue("QueryCustomerLabelResponse.Message"));

		List<CustomerLabel> data = new ArrayList<CustomerLabel>();
		for (int i = 0; i < context.lengthValue("QueryCustomerLabelResponse.Data.Length"); i++) {
			CustomerLabel customerLabel = new CustomerLabel();
			customerLabel.setLabel(context.stringValue("QueryCustomerLabelResponse.Data["+ i +"].Label"));
			customerLabel.setLabelSeries(context.stringValue("QueryCustomerLabelResponse.Data["+ i +"].LabelSeries"));

			data.add(customerLabel);
		}
		queryCustomerLabelResponse.setData(data);
	 
	 	return queryCustomerLabelResponse;
	}
}