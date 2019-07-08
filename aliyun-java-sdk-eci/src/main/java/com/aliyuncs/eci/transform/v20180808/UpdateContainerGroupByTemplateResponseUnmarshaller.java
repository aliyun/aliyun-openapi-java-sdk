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

package com.aliyuncs.eci.transform.v20180808;

import com.aliyuncs.eci.model.v20180808.UpdateContainerGroupByTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateContainerGroupByTemplateResponseUnmarshaller {

	public static UpdateContainerGroupByTemplateResponse unmarshall(UpdateContainerGroupByTemplateResponse updateContainerGroupByTemplateResponse, UnmarshallerContext context) {
		
		updateContainerGroupByTemplateResponse.setRequestId(context.stringValue("UpdateContainerGroupByTemplateResponse.RequestId"));
	 
	 	return updateContainerGroupByTemplateResponse;
	}
}