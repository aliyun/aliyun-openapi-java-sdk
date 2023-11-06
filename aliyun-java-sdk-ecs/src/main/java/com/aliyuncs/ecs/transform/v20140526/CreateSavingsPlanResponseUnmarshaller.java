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

package com.aliyuncs.ecs.transform.v20140526;

import com.aliyuncs.ecs.model.v20140526.CreateSavingsPlanResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSavingsPlanResponseUnmarshaller {

	public static CreateSavingsPlanResponse unmarshall(CreateSavingsPlanResponse createSavingsPlanResponse, UnmarshallerContext _ctx) {
		
		createSavingsPlanResponse.setRequestId(_ctx.stringValue("CreateSavingsPlanResponse.RequestId"));
		createSavingsPlanResponse.setSavingsPlanId(_ctx.stringValue("CreateSavingsPlanResponse.SavingsPlanId"));
		createSavingsPlanResponse.setOrderId(_ctx.stringValue("CreateSavingsPlanResponse.OrderId"));
	 
	 	return createSavingsPlanResponse;
	}
}