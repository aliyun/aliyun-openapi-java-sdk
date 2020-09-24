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

package com.aliyuncs.sales_leads.transform.v20200907;

import com.aliyuncs.sales_leads.model.v20200907.CreateStrategyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStrategyResponseUnmarshaller {

	public static CreateStrategyResponse unmarshall(CreateStrategyResponse createStrategyResponse, UnmarshallerContext _ctx) {
		
		createStrategyResponse.setData(_ctx.longValue("CreateStrategyResponse.Data"));
		createStrategyResponse.setSuccess(_ctx.booleanValue("CreateStrategyResponse.Success"));
		createStrategyResponse.setErrorMessage(_ctx.stringValue("CreateStrategyResponse.ErrorMessage"));
		createStrategyResponse.setErrorCode(_ctx.stringValue("CreateStrategyResponse.ErrorCode"));
	 
	 	return createStrategyResponse;
	}
}