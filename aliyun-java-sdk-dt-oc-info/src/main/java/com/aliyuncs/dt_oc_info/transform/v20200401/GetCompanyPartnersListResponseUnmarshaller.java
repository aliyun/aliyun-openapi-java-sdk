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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.GetCompanyPartnersListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCompanyPartnersListResponseUnmarshaller {

	public static GetCompanyPartnersListResponse unmarshall(GetCompanyPartnersListResponse getCompanyPartnersListResponse, UnmarshallerContext _ctx) {
		
		getCompanyPartnersListResponse.setRequestId(_ctx.stringValue("GetCompanyPartnersListResponse.RequestId"));
		getCompanyPartnersListResponse.setCode(_ctx.integerValue("GetCompanyPartnersListResponse.Code"));
		getCompanyPartnersListResponse.setMessage(_ctx.stringValue("GetCompanyPartnersListResponse.Message"));
		getCompanyPartnersListResponse.setTotal(_ctx.integerValue("GetCompanyPartnersListResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCompanyPartnersListResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetCompanyPartnersListResponse.Data["+ i +"]"));
		}
		getCompanyPartnersListResponse.setData(data);
	 
	 	return getCompanyPartnersListResponse;
	}
}