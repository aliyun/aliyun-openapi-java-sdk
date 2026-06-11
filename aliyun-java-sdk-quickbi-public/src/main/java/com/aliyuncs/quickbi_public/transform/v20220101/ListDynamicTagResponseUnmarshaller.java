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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.ListDynamicTagResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListDynamicTagResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDynamicTagResponseUnmarshaller {

	public static ListDynamicTagResponse unmarshall(ListDynamicTagResponse listDynamicTagResponse, UnmarshallerContext _ctx) {
		
		listDynamicTagResponse.setRequestId(_ctx.stringValue("ListDynamicTagResponse.RequestId"));
		listDynamicTagResponse.setSuccess(_ctx.booleanValue("ListDynamicTagResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListDynamicTagResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setOrganizationId(_ctx.stringValue("ListDynamicTagResponse.Result["+ i +"].OrganizationId"));
			data.setConfigId(_ctx.stringValue("ListDynamicTagResponse.Result["+ i +"].ConfigId"));
			data.setConfigName(_ctx.stringValue("ListDynamicTagResponse.Result["+ i +"].ConfigName"));
			data.setDsId(_ctx.stringValue("ListDynamicTagResponse.Result["+ i +"].DsId"));
			data.setTableName(_ctx.stringValue("ListDynamicTagResponse.Result["+ i +"].TableName"));
			data.setColumnName(_ctx.stringValue("ListDynamicTagResponse.Result["+ i +"].ColumnName"));
			data.setRelatedAttribute(_ctx.integerValue("ListDynamicTagResponse.Result["+ i +"].RelatedAttribute"));

			result.add(data);
		}
		listDynamicTagResponse.setResult(result);
	 
	 	return listDynamicTagResponse;
	}
}