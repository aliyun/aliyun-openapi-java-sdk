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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListAllSystemContractResponse;
import com.aliyuncs.lto.model.v20210707.ListAllSystemContractResponse.SystemContractInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAllSystemContractResponseUnmarshaller {

	public static ListAllSystemContractResponse unmarshall(ListAllSystemContractResponse listAllSystemContractResponse, UnmarshallerContext _ctx) {
		
		listAllSystemContractResponse.setRequestId(_ctx.stringValue("ListAllSystemContractResponse.RequestId"));
		listAllSystemContractResponse.setCode(_ctx.stringValue("ListAllSystemContractResponse.Code"));
		listAllSystemContractResponse.setHttpStatusCode(_ctx.integerValue("ListAllSystemContractResponse.HttpStatusCode"));
		listAllSystemContractResponse.setMessage(_ctx.stringValue("ListAllSystemContractResponse.Message"));
		listAllSystemContractResponse.setSuccess(_ctx.booleanValue("ListAllSystemContractResponse.Success"));

		List<SystemContractInfo> data = new ArrayList<SystemContractInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListAllSystemContractResponse.Data.Length"); i++) {
			SystemContractInfo systemContractInfo = new SystemContractInfo();
			systemContractInfo.setName(_ctx.stringValue("ListAllSystemContractResponse.Data["+ i +"].Name"));
			systemContractInfo.setSystemContractId(_ctx.stringValue("ListAllSystemContractResponse.Data["+ i +"].SystemContractId"));

			data.add(systemContractInfo);
		}
		listAllSystemContractResponse.setData(data);
	 
	 	return listAllSystemContractResponse;
	}
}