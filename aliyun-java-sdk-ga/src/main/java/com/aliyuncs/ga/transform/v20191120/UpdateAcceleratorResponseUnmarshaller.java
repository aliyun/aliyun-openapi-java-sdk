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

package com.aliyuncs.ga.transform.v20191120;

import com.aliyuncs.ga.model.v20191120.UpdateAcceleratorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAcceleratorResponseUnmarshaller {

	public static UpdateAcceleratorResponse unmarshall(UpdateAcceleratorResponse updateAcceleratorResponse, UnmarshallerContext _ctx) {
		
		updateAcceleratorResponse.setRequestId(_ctx.stringValue("UpdateAcceleratorResponse.RequestId"));
	 
	 	return updateAcceleratorResponse;
	}
}