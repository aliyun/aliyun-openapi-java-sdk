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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.DescribeTenantBindNumberResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeTenantBindNumberResponse.Data;
import com.aliyuncs.outboundbot.model.v20191226.DescribeTenantBindNumberResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTenantBindNumberResponseUnmarshaller {

	public static DescribeTenantBindNumberResponse unmarshall(DescribeTenantBindNumberResponse describeTenantBindNumberResponse, UnmarshallerContext _ctx) {
		
		describeTenantBindNumberResponse.setRequestId(_ctx.stringValue("DescribeTenantBindNumberResponse.RequestId"));
		describeTenantBindNumberResponse.setSuccess(_ctx.booleanValue("DescribeTenantBindNumberResponse.Success"));
		describeTenantBindNumberResponse.setCode(_ctx.stringValue("DescribeTenantBindNumberResponse.Code"));
		describeTenantBindNumberResponse.setMessage(_ctx.stringValue("DescribeTenantBindNumberResponse.Message"));
		describeTenantBindNumberResponse.setHttpStatusCode(_ctx.integerValue("DescribeTenantBindNumberResponse.HttpStatusCode"));

		Data data = new Data();

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantBindNumberResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setInstanceId(_ctx.stringValue("DescribeTenantBindNumberResponse.Data.List["+ i +"].InstanceId"));
			listItem.setInstanceName(_ctx.stringValue("DescribeTenantBindNumberResponse.Data.List["+ i +"].InstanceName"));
			listItem.setIsBinding(_ctx.booleanValue("DescribeTenantBindNumberResponse.Data.List["+ i +"].IsBinding"));

			list.add(listItem);
		}
		data.setList(list);
		describeTenantBindNumberResponse.setData(data);
	 
	 	return describeTenantBindNumberResponse;
	}
}