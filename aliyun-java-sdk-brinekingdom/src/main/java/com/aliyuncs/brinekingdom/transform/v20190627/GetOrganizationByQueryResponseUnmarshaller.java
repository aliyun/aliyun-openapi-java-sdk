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

package com.aliyuncs.brinekingdom.transform.v20190627;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.GetOrganizationByQueryResponse;
import com.aliyuncs.brinekingdom.model.v20190627.GetOrganizationByQueryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrganizationByQueryResponseUnmarshaller {

	public static GetOrganizationByQueryResponse unmarshall(GetOrganizationByQueryResponse getOrganizationByQueryResponse, UnmarshallerContext _ctx) {
		
		getOrganizationByQueryResponse.setRequestId(_ctx.stringValue("GetOrganizationByQueryResponse.RequestId"));
		getOrganizationByQueryResponse.set_Class(_ctx.stringValue("GetOrganizationByQueryResponse.Class"));
		getOrganizationByQueryResponse.setErrorMessage(_ctx.stringValue("GetOrganizationByQueryResponse.ErrorMessage"));
		getOrganizationByQueryResponse.setSuccess(_ctx.booleanValue("GetOrganizationByQueryResponse.Success"));
		getOrganizationByQueryResponse.setResultCode(_ctx.stringValue("GetOrganizationByQueryResponse.ResultCode"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetOrganizationByQueryResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setBusinessType(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].BusinessType"));
			data.setBusinessTypeName(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].BusinessTypeName"));
			data.set_Class(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].Class"));
			data.setDivision(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].Division"));
			data.setGmtCreate(_ctx.longValue("GetOrganizationByQueryResponse.Result["+ i +"].GmtCreate"));
			data.setGmtModified(_ctx.longValue("GetOrganizationByQueryResponse.Result["+ i +"].GmtModified"));
			data.setId(_ctx.longValue("GetOrganizationByQueryResponse.Result["+ i +"].Id"));
			data.setOrgName(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].OrgName"));
			data.setOrgRemark(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].OrgRemark"));
			data.setProduct1(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].Product1"));
			data.setProduct1Name(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].Product1Name"));
			data.setProduct2(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].Product2"));
			data.setProduct2Name(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].Product2Name"));
			data.setRequireType(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].RequireType"));
			data.setRequireTypeName(_ctx.stringValue("GetOrganizationByQueryResponse.Result["+ i +"].RequireTypeName"));

			result.add(data);
		}
		getOrganizationByQueryResponse.setResult(result);
	 
	 	return getOrganizationByQueryResponse;
	}
}