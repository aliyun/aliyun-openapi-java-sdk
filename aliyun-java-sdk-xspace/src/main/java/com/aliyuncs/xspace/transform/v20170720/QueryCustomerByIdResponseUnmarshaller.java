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

import com.aliyuncs.xspace.model.v20170720.QueryCustomerByIdResponse;
import com.aliyuncs.xspace.model.v20170720.QueryCustomerByIdResponse.Data;
import com.aliyuncs.xspace.model.v20170720.QueryCustomerByIdResponse.Data.CustomizeFields;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomerByIdResponseUnmarshaller {

	public static QueryCustomerByIdResponse unmarshall(QueryCustomerByIdResponse queryCustomerByIdResponse, UnmarshallerContext context) {
		
		queryCustomerByIdResponse.setRequestId(context.stringValue("QueryCustomerByIdResponse.RequestId"));
		queryCustomerByIdResponse.setSuccess(context.booleanValue("QueryCustomerByIdResponse.Success"));
		queryCustomerByIdResponse.setCode(context.stringValue("QueryCustomerByIdResponse.Code"));
		queryCustomerByIdResponse.setMessage(context.stringValue("QueryCustomerByIdResponse.Message"));

		Data data = new Data();
		data.setId(context.stringValue("QueryCustomerByIdResponse.Data.Id"));
		data.setNick(context.stringValue("QueryCustomerByIdResponse.Data.Nick"));
		data.setRealName(context.stringValue("QueryCustomerByIdResponse.Data.RealName"));
		data.setEmail(context.stringValue("QueryCustomerByIdResponse.Data.Email"));
		data.setPhone(context.stringValue("QueryCustomerByIdResponse.Data.Phone"));
		data.setGender(context.stringValue("QueryCustomerByIdResponse.Data.Gender"));
		data.setPhoto(context.stringValue("QueryCustomerByIdResponse.Data.Photo"));
		data.setDetail(context.stringValue("QueryCustomerByIdResponse.Data.Detail"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryCustomerByIdResponse.Data.Tags.Length"); i++) {
			tags.add(context.stringValue("QueryCustomerByIdResponse.Data.Tags["+ i +"]"));
		}
		data.setTags(tags);

		CustomizeFields customizeFields = new CustomizeFields();
		customizeFields.setCid(context.stringValue("QueryCustomerByIdResponse.Data.CustomizeFields.Cid"));
		customizeFields.setAbcUrl(context.stringValue("QueryCustomerByIdResponse.Data.CustomizeFields.AbcUrl"));

		List<String> associatePersonList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryCustomerByIdResponse.Data.CustomizeFields.AssociatePersonList.Length"); i++) {
			associatePersonList.add(context.stringValue("QueryCustomerByIdResponse.Data.CustomizeFields.AssociatePersonList["+ i +"]"));
		}
		customizeFields.setAssociatePersonList(associatePersonList);
		data.setCustomizeFields(customizeFields);
		queryCustomerByIdResponse.setData(data);
	 
	 	return queryCustomerByIdResponse;
	}
}