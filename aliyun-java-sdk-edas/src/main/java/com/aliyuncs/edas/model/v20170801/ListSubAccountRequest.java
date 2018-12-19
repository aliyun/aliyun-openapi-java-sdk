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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListSubAccountRequest extends RoaAcsRequest<ListSubAccountResponse> {
	
	public ListSubAccountRequest() {
		super("Edas", "2017-08-01", "ListSubAccount", "edas");
		setUriPattern("/pop/v5/account/sub_account_list");
		setMethod(MethodType.POST);
	}

	@Override
	public Class<ListSubAccountResponse> getResponseClass() {
		return ListSubAccountResponse.class;
	}

}
