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

package com.aliyuncs.xspace.transform.v20170720;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xspace.model.v20170720.QueryCustomerByPhoneResponse;
import com.aliyuncs.xspace.model.v20170720.QueryCustomerByPhoneResponse.DataItem;
import com.aliyuncs.xspace.model.v20170720.QueryCustomerByPhoneResponse.DataItem.CustomizeFields;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomerByPhoneResponseUnmarshaller {

	public static QueryCustomerByPhoneResponse unmarshall(QueryCustomerByPhoneResponse queryCustomerByPhoneResponse, UnmarshallerContext context) {
		
		queryCustomerByPhoneResponse.setRequestId(context.stringValue("QueryCustomerByPhoneResponse.RequestId"));
		queryCustomerByPhoneResponse.setSuccess(context.booleanValue("QueryCustomerByPhoneResponse.Success"));
		queryCustomerByPhoneResponse.setCode(context.stringValue("QueryCustomerByPhoneResponse.Code"));
		queryCustomerByPhoneResponse.setMessage(context.stringValue("QueryCustomerByPhoneResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("QueryCustomerByPhoneResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDetail(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].Detail"));
			dataItem.setPhoto(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].Photo"));
			dataItem.setId(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].Id"));
			dataItem.setPhone(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].Phone"));
			dataItem.setGender(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].Gender"));
			dataItem.setEmail(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].Email"));
			dataItem.setNick(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].Nick"));
			dataItem.setRealName(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].RealName"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryCustomerByPhoneResponse.Data["+ i +"].Tags.Length"); j++) {
				tags.add(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].Tags["+ j +"]"));
			}
			dataItem.setTags(tags);

			CustomizeFields customizeFields = new CustomizeFields();
			customizeFields.setCid(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].CustomizeFields.Cid"));
			customizeFields.setAbcUrl(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].CustomizeFields.AbcUrl"));

			List<String> associatePersonList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryCustomerByPhoneResponse.Data["+ i +"].CustomizeFields.AssociatePersonList.Length"); j++) {
				associatePersonList.add(context.stringValue("QueryCustomerByPhoneResponse.Data["+ i +"].CustomizeFields.AssociatePersonList["+ j +"]"));
			}
			customizeFields.setAssociatePersonList(associatePersonList);
			dataItem.setCustomizeFields(customizeFields);

			data.add(dataItem);
		}
		queryCustomerByPhoneResponse.setData(data);
	 
	 	return queryCustomerByPhoneResponse;
	}
}