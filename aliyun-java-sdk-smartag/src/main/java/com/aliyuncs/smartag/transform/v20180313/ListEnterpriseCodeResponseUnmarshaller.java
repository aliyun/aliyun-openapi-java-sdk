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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.ListEnterpriseCodeResponse;
import com.aliyuncs.smartag.model.v20180313.ListEnterpriseCodeResponse.EnterpriseCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEnterpriseCodeResponseUnmarshaller {

	public static ListEnterpriseCodeResponse unmarshall(ListEnterpriseCodeResponse listEnterpriseCodeResponse, UnmarshallerContext _ctx) {
		
		listEnterpriseCodeResponse.setRequestId(_ctx.stringValue("ListEnterpriseCodeResponse.RequestId"));
		listEnterpriseCodeResponse.setTotalCount(_ctx.integerValue("ListEnterpriseCodeResponse.TotalCount"));
		listEnterpriseCodeResponse.setNextToken(_ctx.stringValue("ListEnterpriseCodeResponse.NextToken"));
		listEnterpriseCodeResponse.setMaxResults(_ctx.integerValue("ListEnterpriseCodeResponse.MaxResults"));

		List<EnterpriseCode> enterpriseCodes = new ArrayList<EnterpriseCode>();
		for (int i = 0; i < _ctx.lengthValue("ListEnterpriseCodeResponse.EnterpriseCodes.Length"); i++) {
			EnterpriseCode enterpriseCode = new EnterpriseCode();
			enterpriseCode.setIsDefault(_ctx.booleanValue("ListEnterpriseCodeResponse.EnterpriseCodes["+ i +"].IsDefault"));
			enterpriseCode.setSmartAGCount(_ctx.integerValue("ListEnterpriseCodeResponse.EnterpriseCodes["+ i +"].SmartAGCount"));
			enterpriseCode.setEnterpriseCode(_ctx.stringValue("ListEnterpriseCodeResponse.EnterpriseCodes["+ i +"].EnterpriseCode"));

			enterpriseCodes.add(enterpriseCode);
		}
		listEnterpriseCodeResponse.setEnterpriseCodes(enterpriseCodes);
	 
	 	return listEnterpriseCodeResponse;
	}
}