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

package com.aliyuncs.idrsservice.transform.v20200630;

import com.aliyuncs.idrsservice.model.v20200630.UpdateSlrConfigurationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSlrConfigurationResponseUnmarshaller {

	public static UpdateSlrConfigurationResponse unmarshall(UpdateSlrConfigurationResponse updateSlrConfigurationResponse, UnmarshallerContext _ctx) {
		
		updateSlrConfigurationResponse.setRequestId(_ctx.stringValue("UpdateSlrConfigurationResponse.RequestId"));
		updateSlrConfigurationResponse.setCode(_ctx.stringValue("UpdateSlrConfigurationResponse.Code"));
		updateSlrConfigurationResponse.setMessage(_ctx.stringValue("UpdateSlrConfigurationResponse.Message"));
	 
	 	return updateSlrConfigurationResponse;
	}
}