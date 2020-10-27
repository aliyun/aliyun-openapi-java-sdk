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

package com.aliyuncs.cloudesl.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20180801.SearchApServiceResponse;
import com.aliyuncs.cloudesl.model.v20180801.SearchApServiceResponse.ApInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchApServiceResponseUnmarshaller {

	public static SearchApServiceResponse unmarshall(SearchApServiceResponse searchApServiceResponse, UnmarshallerContext _ctx) {
		
		searchApServiceResponse.setRequestId(_ctx.stringValue("SearchApServiceResponse.RequestId"));
		searchApServiceResponse.setSuccess(_ctx.booleanValue("SearchApServiceResponse.Success"));
		searchApServiceResponse.setMessage(_ctx.stringValue("SearchApServiceResponse.Message"));
		searchApServiceResponse.setErrorCode(_ctx.stringValue("SearchApServiceResponse.ErrorCode"));
		searchApServiceResponse.setTotalCount(_ctx.integerValue("SearchApServiceResponse.TotalCount"));
		searchApServiceResponse.setPageNumber(_ctx.integerValue("SearchApServiceResponse.PageNumber"));
		searchApServiceResponse.setPageSize(_ctx.integerValue("SearchApServiceResponse.PageSize"));

		List<ApInfo> items = new ArrayList<ApInfo>();
		for (int i = 0; i < _ctx.lengthValue("SearchApServiceResponse.Items.Length"); i++) {
			ApInfo apInfo = new ApInfo();
			apInfo.setIsActivate(_ctx.booleanValue("SearchApServiceResponse.Items["+ i +"].IsActivate"));
			apInfo.setMac(_ctx.stringValue("SearchApServiceResponse.Items["+ i +"].Mac"));
			apInfo.setModel(_ctx.stringValue("SearchApServiceResponse.Items["+ i +"].Model"));
			apInfo.setStatus(_ctx.booleanValue("SearchApServiceResponse.Items["+ i +"].Status"));

			items.add(apInfo);
		}
		searchApServiceResponse.setItems(items);
	 
	 	return searchApServiceResponse;
	}
}