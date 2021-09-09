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

package com.aliyuncs.companyreg.transform.v20200306;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20200306.ListProduceAuthorizationResponse;
import com.aliyuncs.companyreg.model.v20200306.ListProduceAuthorizationResponse.ProduceAuthorizations;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProduceAuthorizationResponseUnmarshaller {

	public static ListProduceAuthorizationResponse unmarshall(ListProduceAuthorizationResponse listProduceAuthorizationResponse, UnmarshallerContext _ctx) {
		
		listProduceAuthorizationResponse.setRequestId(_ctx.stringValue("ListProduceAuthorizationResponse.RequestId"));
		listProduceAuthorizationResponse.setCurrentPageNum(_ctx.integerValue("ListProduceAuthorizationResponse.CurrentPageNum"));
		listProduceAuthorizationResponse.setPageSize(_ctx.integerValue("ListProduceAuthorizationResponse.PageSize"));
		listProduceAuthorizationResponse.setTotalItemNum(_ctx.integerValue("ListProduceAuthorizationResponse.TotalItemNum"));
		listProduceAuthorizationResponse.setTotalPageNum(_ctx.integerValue("ListProduceAuthorizationResponse.TotalPageNum"));
		listProduceAuthorizationResponse.setSuccess(_ctx.booleanValue("ListProduceAuthorizationResponse.Success"));

		List<ProduceAuthorizations> data = new ArrayList<ProduceAuthorizations>();
		for (int i = 0; i < _ctx.lengthValue("ListProduceAuthorizationResponse.Data.Length"); i++) {
			ProduceAuthorizations produceAuthorizations = new ProduceAuthorizations();
			produceAuthorizations.setAuthorizedUserId(_ctx.stringValue("ListProduceAuthorizationResponse.Data["+ i +"].AuthorizedUserId"));
			produceAuthorizations.setAuthorizedUserName(_ctx.stringValue("ListProduceAuthorizationResponse.Data["+ i +"].AuthorizedUserName"));

			data.add(produceAuthorizations);
		}
		listProduceAuthorizationResponse.setData(data);
	 
	 	return listProduceAuthorizationResponse;
	}
}