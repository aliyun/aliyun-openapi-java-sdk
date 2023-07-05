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

import com.aliyuncs.advisor_share.model.v20180608.GetSubDomainListResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetSubDomainListResponse.SubDomains;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubDomainListResponseUnmarshaller {

	public static GetSubDomainListResponse unmarshall(GetSubDomainListResponse getSubDomainListResponse, UnmarshallerContext _ctx) {
		
		getSubDomainListResponse.setRequestId(_ctx.stringValue("GetSubDomainListResponse.RequestId"));

		List<SubDomains> data = new ArrayList<SubDomains>();
		for (int i = 0; i < _ctx.lengthValue("GetSubDomainListResponse.Data.Length"); i++) {
			SubDomains subDomains = new SubDomains();
			subDomains.setStatus(_ctx.stringValue("GetSubDomainListResponse.Data["+ i +"].Status"));
			subDomains.setDomain(_ctx.stringValue("GetSubDomainListResponse.Data["+ i +"].Domain"));

			data.add(subDomains);
		}
		getSubDomainListResponse.setData(data);
	 
	 	return getSubDomainListResponse;
	}
}