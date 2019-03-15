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

package com.aliyuncs.cr.model.v20160607;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateUserSourceAccountRequest extends RoaAcsRequest<CreateUserSourceAccountResponse> {
	
	public CreateUserSourceAccountRequest() {
		super("cr", "2016-06-07", "CreateUserSourceAccount", "cr");
		setUriPattern("/users/sourceAccount");
		setMethod(MethodType.PUT);
	}

	@Override
	public Class<CreateUserSourceAccountResponse> getResponseClass() {
		return CreateUserSourceAccountResponse.class;
	}

}
