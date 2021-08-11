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

package com.aliyuncs.dyvmsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyvmsapi.model.v20170525.QueryCallInPoolTransferConfigResponse;
import com.aliyuncs.dyvmsapi.model.v20170525.QueryCallInPoolTransferConfigResponse.Data;
import com.aliyuncs.dyvmsapi.model.v20170525.QueryCallInPoolTransferConfigResponse.Data.DetailsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCallInPoolTransferConfigResponseUnmarshaller {

	public static QueryCallInPoolTransferConfigResponse unmarshall(QueryCallInPoolTransferConfigResponse queryCallInPoolTransferConfigResponse, UnmarshallerContext _ctx) {
		
		queryCallInPoolTransferConfigResponse.setRequestId(_ctx.stringValue("QueryCallInPoolTransferConfigResponse.RequestId"));
		queryCallInPoolTransferConfigResponse.setCode(_ctx.stringValue("QueryCallInPoolTransferConfigResponse.Code"));
		queryCallInPoolTransferConfigResponse.setMessage(_ctx.stringValue("QueryCallInPoolTransferConfigResponse.Message"));

		Data data = new Data();
		data.setTransferTimeout(_ctx.stringValue("QueryCallInPoolTransferConfigResponse.Data.TransferTimeout"));
		data.setCalledRouteMode(_ctx.stringValue("QueryCallInPoolTransferConfigResponse.Data.CalledRouteMode"));
		data.setGmtCreate(_ctx.longValue("QueryCallInPoolTransferConfigResponse.Data.GmtCreate"));

		List<DetailsItem> details = new ArrayList<DetailsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCallInPoolTransferConfigResponse.Data.Details.Length"); i++) {
			DetailsItem detailsItem = new DetailsItem();
			detailsItem.setCalled(_ctx.stringValue("QueryCallInPoolTransferConfigResponse.Data.Details["+ i +"].Called"));

			details.add(detailsItem);
		}
		data.setDetails(details);
		queryCallInPoolTransferConfigResponse.setData(data);
	 
	 	return queryCallInPoolTransferConfigResponse;
	}
}