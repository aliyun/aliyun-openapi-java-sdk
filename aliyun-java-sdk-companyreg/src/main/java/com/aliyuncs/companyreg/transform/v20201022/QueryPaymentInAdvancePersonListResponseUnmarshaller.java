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

package com.aliyuncs.companyreg.transform.v20201022;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20201022.QueryPaymentInAdvancePersonListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPaymentInAdvancePersonListResponseUnmarshaller {

	public static QueryPaymentInAdvancePersonListResponse unmarshall(QueryPaymentInAdvancePersonListResponse queryPaymentInAdvancePersonListResponse, UnmarshallerContext _ctx) {
		
		queryPaymentInAdvancePersonListResponse.setRequestId(_ctx.stringValue("QueryPaymentInAdvancePersonListResponse.RequestId"));

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryPaymentInAdvancePersonListResponse.List.Length"); i++) {
			list.add(_ctx.stringValue("QueryPaymentInAdvancePersonListResponse.List["+ i +"]"));
		}
		queryPaymentInAdvancePersonListResponse.setList(list);
	 
	 	return queryPaymentInAdvancePersonListResponse;
	}
}