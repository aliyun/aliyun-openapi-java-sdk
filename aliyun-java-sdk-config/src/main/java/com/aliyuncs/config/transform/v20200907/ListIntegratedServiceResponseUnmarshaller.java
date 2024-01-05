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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.ListIntegratedServiceResponse;
import com.aliyuncs.config.model.v20200907.ListIntegratedServiceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIntegratedServiceResponseUnmarshaller {

	public static ListIntegratedServiceResponse unmarshall(ListIntegratedServiceResponse listIntegratedServiceResponse, UnmarshallerContext _ctx) {
		
		listIntegratedServiceResponse.setRequestId(_ctx.stringValue("ListIntegratedServiceResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIntegratedServiceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAccountId(_ctx.longValue("ListIntegratedServiceResponse.Data["+ i +"].AccountId"));
			dataItem.setServiceName(_ctx.stringValue("ListIntegratedServiceResponse.Data["+ i +"].ServiceName"));
			dataItem.setServiceCode(_ctx.stringValue("ListIntegratedServiceResponse.Data["+ i +"].ServiceCode"));
			dataItem.setStatus(_ctx.booleanValue("ListIntegratedServiceResponse.Data["+ i +"].Status"));
			dataItem.setIntegratedTypes(_ctx.stringValue("ListIntegratedServiceResponse.Data["+ i +"].IntegratedTypes"));

			data.add(dataItem);
		}
		listIntegratedServiceResponse.setData(data);
	 
	 	return listIntegratedServiceResponse;
	}
}