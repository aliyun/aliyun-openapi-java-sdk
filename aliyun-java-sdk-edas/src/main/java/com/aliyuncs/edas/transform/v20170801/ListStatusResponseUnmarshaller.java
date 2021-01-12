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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListStatusResponse;
import com.aliyuncs.edas.model.v20170801.ListStatusResponse.Results;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStatusResponseUnmarshaller {

	public static ListStatusResponse unmarshall(ListStatusResponse listStatusResponse, UnmarshallerContext _ctx) {
		
		listStatusResponse.setRequestId(_ctx.stringValue("ListStatusResponse.RequestId"));
		listStatusResponse.setCode(_ctx.integerValue("ListStatusResponse.Code"));
		listStatusResponse.setMessage(_ctx.stringValue("ListStatusResponse.Message"));
		listStatusResponse.setSuccess(_ctx.booleanValue("ListStatusResponse.Success"));

		List<Results> data = new ArrayList<Results>();
		for (int i = 0; i < _ctx.lengthValue("ListStatusResponse.Data.Length"); i++) {
			Results results = new Results();
			results.setRegion(_ctx.stringValue("ListStatusResponse.Data["+ i +"].Region"));
			results.setNamespaceId(_ctx.stringValue("ListStatusResponse.Data["+ i +"].NamespaceId"));
			results.setTenantId(_ctx.stringValue("ListStatusResponse.Data["+ i +"].TenantId"));
			results.setSource(_ctx.stringValue("ListStatusResponse.Data["+ i +"].Source"));
			results.setAccountId(_ctx.stringValue("ListStatusResponse.Data["+ i +"].AccountId"));
			results.setAppId(_ctx.stringValue("ListStatusResponse.Data["+ i +"].AppId"));
			results.setIp(_ctx.stringValue("ListStatusResponse.Data["+ i +"].Ip"));
			results.setPodName(_ctx.stringValue("ListStatusResponse.Data["+ i +"].PodName"));
			results.setStatus(_ctx.stringValue("ListStatusResponse.Data["+ i +"].Status"));

			data.add(results);
		}
		listStatusResponse.setData(data);
	 
	 	return listStatusResponse;
	}
}