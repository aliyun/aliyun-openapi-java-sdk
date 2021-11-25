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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetPatentOverviewInfoResponse;
import com.aliyuncs.copyright.model.v20190123.GetPatentOverviewInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatentOverviewInfoResponseUnmarshaller {

	public static GetPatentOverviewInfoResponse unmarshall(GetPatentOverviewInfoResponse getPatentOverviewInfoResponse, UnmarshallerContext _ctx) {
		
		getPatentOverviewInfoResponse.setRequestId(_ctx.stringValue("GetPatentOverviewInfoResponse.RequestId"));
		getPatentOverviewInfoResponse.setSuccess(_ctx.booleanValue("GetPatentOverviewInfoResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPatentOverviewInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFamingCount(_ctx.integerValue("GetPatentOverviewInfoResponse.Data["+ i +"].FamingCount"));
			dataItem.setShiyongCount(_ctx.integerValue("GetPatentOverviewInfoResponse.Data["+ i +"].ShiyongCount"));
			dataItem.setTotal(_ctx.integerValue("GetPatentOverviewInfoResponse.Data["+ i +"].Total"));
			dataItem.setUserType(_ctx.stringValue("GetPatentOverviewInfoResponse.Data["+ i +"].UserType"));
			dataItem.setWaiguanCount(_ctx.integerValue("GetPatentOverviewInfoResponse.Data["+ i +"].WaiguanCount"));

			data.add(dataItem);
		}
		getPatentOverviewInfoResponse.setData(data);
	 
	 	return getPatentOverviewInfoResponse;
	}
}