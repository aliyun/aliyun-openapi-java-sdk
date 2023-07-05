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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetDomainListResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetDomainListResponse.Domains;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDomainListResponseUnmarshaller {

	public static GetDomainListResponse unmarshall(GetDomainListResponse getDomainListResponse, UnmarshallerContext _ctx) {
		
		getDomainListResponse.setRequestId(_ctx.stringValue("GetDomainListResponse.RequestId"));

		List<Domains> data = new ArrayList<Domains>();
		for (int i = 0; i < _ctx.lengthValue("GetDomainListResponse.Data.Length"); i++) {
			Domains domains = new Domains();
			domains.setDomain(_ctx.stringValue("GetDomainListResponse.Data["+ i +"].Domain"));

			data.add(domains);
		}
		getDomainListResponse.setData(data);
	 
	 	return getDomainListResponse;
	}
}