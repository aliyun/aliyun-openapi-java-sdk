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

package com.aliyuncs.eiam.transform.v20211201;

import com.aliyuncs.eiam.model.v20211201.SetForgetPasswordConfigurationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetForgetPasswordConfigurationResponseUnmarshaller {

	public static SetForgetPasswordConfigurationResponse unmarshall(SetForgetPasswordConfigurationResponse setForgetPasswordConfigurationResponse, UnmarshallerContext _ctx) {
		
		setForgetPasswordConfigurationResponse.setRequestId(_ctx.stringValue("SetForgetPasswordConfigurationResponse.RequestId"));
	 
	 	return setForgetPasswordConfigurationResponse;
	}
}