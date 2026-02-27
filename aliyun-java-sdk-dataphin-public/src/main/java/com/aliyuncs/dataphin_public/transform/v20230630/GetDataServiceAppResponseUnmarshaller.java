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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppResponse.Data.Owner;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceAppResponseUnmarshaller {

	public static GetDataServiceAppResponse unmarshall(GetDataServiceAppResponse getDataServiceAppResponse, UnmarshallerContext _ctx) {
		
		getDataServiceAppResponse.setRequestId(_ctx.stringValue("GetDataServiceAppResponse.RequestId"));
		getDataServiceAppResponse.setMessage(_ctx.stringValue("GetDataServiceAppResponse.Message"));
		getDataServiceAppResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceAppResponse.HttpStatusCode"));
		getDataServiceAppResponse.setCode(_ctx.stringValue("GetDataServiceAppResponse.Code"));
		getDataServiceAppResponse.setSuccess(_ctx.booleanValue("GetDataServiceAppResponse.Success"));

		Data data = new Data();
		data.setAppId(_ctx.integerValue("GetDataServiceAppResponse.Data.AppId"));
		data.setIpWhitelist(_ctx.stringValue("GetDataServiceAppResponse.Data.IpWhitelist"));
		data.setAppKey(_ctx.stringValue("GetDataServiceAppResponse.Data.AppKey"));
		data.setScenarios(_ctx.stringValue("GetDataServiceAppResponse.Data.Scenarios"));
		data.setAppSecret(_ctx.stringValue("GetDataServiceAppResponse.Data.AppSecret"));
		data.setAppGroup(_ctx.stringValue("GetDataServiceAppResponse.Data.AppGroup"));
		data.setAppName(_ctx.stringValue("GetDataServiceAppResponse.Data.AppName"));
		data.setIpWhitelistStatus(_ctx.booleanValue("GetDataServiceAppResponse.Data.IpWhitelistStatus"));

		List<Owner> ownerList = new ArrayList<Owner>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceAppResponse.Data.OwnerList.Length"); i++) {
			Owner owner = new Owner();
			owner.setId(_ctx.stringValue("GetDataServiceAppResponse.Data.OwnerList["+ i +"].Id"));
			owner.setName(_ctx.stringValue("GetDataServiceAppResponse.Data.OwnerList["+ i +"].Name"));

			ownerList.add(owner);
		}
		data.setOwnerList(ownerList);
		getDataServiceAppResponse.setData(data);
	 
	 	return getDataServiceAppResponse;
	}
}