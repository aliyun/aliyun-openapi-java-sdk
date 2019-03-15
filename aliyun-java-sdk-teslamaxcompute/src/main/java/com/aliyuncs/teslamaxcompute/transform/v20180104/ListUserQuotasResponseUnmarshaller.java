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

package com.aliyuncs.teslamaxcompute.transform.v20180104;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teslamaxcompute.model.v20180104.ListUserQuotasResponse;
import com.aliyuncs.teslamaxcompute.model.v20180104.ListUserQuotasResponse.Data;
import com.aliyuncs.teslamaxcompute.model.v20180104.ListUserQuotasResponse.Data.Error;
import com.aliyuncs.teslamaxcompute.model.v20180104.ListUserQuotasResponse.Data.Quotas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserQuotasResponseUnmarshaller {

	public static ListUserQuotasResponse unmarshall(ListUserQuotasResponse listUserQuotasResponse, UnmarshallerContext context) {
		
		listUserQuotasResponse.setRequestId(context.stringValue("ListUserQuotasResponse.RequestId"));
		listUserQuotasResponse.setMessage(context.stringValue("ListUserQuotasResponse.Message"));
		listUserQuotasResponse.setCode(context.integerValue("ListUserQuotasResponse.Code"));

		Data data = new Data();

		Error error = new Error();
		error.setCode(context.stringValue("ListUserQuotasResponse.Data.Error.Code"));
		error.setMessage(context.stringValue("ListUserQuotasResponse.Data.Error.Message"));
		error.setTimestamp(context.stringValue("ListUserQuotasResponse.Data.Error.Timestamp"));
		data.setError(error);

		List<Quotas> detail = new ArrayList<Quotas>();
		for (int i = 0; i < context.lengthValue("ListUserQuotasResponse.Data.Detail.Length"); i++) {
			Quotas quotas = new Quotas();
			quotas.setQuotaid(context.longValue("ListUserQuotasResponse.Data.Detail["+ i +"].Quotaid"));
			quotas.setCluster(context.stringValue("ListUserQuotasResponse.Data.Detail["+ i +"].Cluster"));
			quotas.setRegion(context.stringValue("ListUserQuotasResponse.Data.Detail["+ i +"].Region"));
			quotas.setName(context.stringValue("ListUserQuotasResponse.Data.Detail["+ i +"].Name"));
			quotas.setParentid(context.longValue("ListUserQuotasResponse.Data.Detail["+ i +"].Parentid"));
			quotas.setNick(context.stringValue("ListUserQuotasResponse.Data.Detail["+ i +"].Nick"));

			detail.add(quotas);
		}
		data.setDetail(detail);
		listUserQuotasResponse.setData(data);
	 
	 	return listUserQuotasResponse;
	}
}