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

package com.aliyuncs.commondriver.transform.v20160712;

import com.aliyuncs.commondriver.model.v20160712.GetPlanItemSpecificationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPlanItemSpecificationResponseUnmarshaller {

	public static GetPlanItemSpecificationResponse unmarshall(GetPlanItemSpecificationResponse getPlanItemSpecificationResponse, UnmarshallerContext _ctx) {
		
		getPlanItemSpecificationResponse.setRequestId(_ctx.stringValue("GetPlanItemSpecificationResponse.RequestId"));
		getPlanItemSpecificationResponse.setCode(_ctx.stringValue("GetPlanItemSpecificationResponse.Code"));
		getPlanItemSpecificationResponse.setData(_ctx.stringValue("GetPlanItemSpecificationResponse.Data"));
		getPlanItemSpecificationResponse.setSuccess(_ctx.booleanValue("GetPlanItemSpecificationResponse.Success"));
	 
	 	return getPlanItemSpecificationResponse;
	}
}