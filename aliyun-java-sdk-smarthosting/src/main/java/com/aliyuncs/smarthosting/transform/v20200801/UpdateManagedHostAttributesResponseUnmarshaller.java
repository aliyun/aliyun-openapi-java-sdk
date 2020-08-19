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

package com.aliyuncs.smarthosting.transform.v20200801;

import com.aliyuncs.smarthosting.model.v20200801.UpdateManagedHostAttributesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateManagedHostAttributesResponseUnmarshaller {

	public static UpdateManagedHostAttributesResponse unmarshall(UpdateManagedHostAttributesResponse updateManagedHostAttributesResponse, UnmarshallerContext _ctx) {
		
		updateManagedHostAttributesResponse.setRequestId(_ctx.stringValue("UpdateManagedHostAttributesResponse.RequestId"));
	 
	 	return updateManagedHostAttributesResponse;
	}
}