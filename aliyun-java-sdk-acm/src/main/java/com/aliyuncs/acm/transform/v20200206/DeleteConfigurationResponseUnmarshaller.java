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

package com.aliyuncs.acm.transform.v20200206;

import com.aliyuncs.acm.model.v20200206.DeleteConfigurationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteConfigurationResponseUnmarshaller {

	public static DeleteConfigurationResponse unmarshall(DeleteConfigurationResponse deleteConfigurationResponse, UnmarshallerContext _ctx) {
		
		deleteConfigurationResponse.setRequestId(_ctx.stringValue("DeleteConfigurationResponse.RequestId"));
		deleteConfigurationResponse.setCode(_ctx.stringValue("DeleteConfigurationResponse.Code"));
		deleteConfigurationResponse.setMessage(_ctx.stringValue("DeleteConfigurationResponse.Message"));
	 
	 	return deleteConfigurationResponse;
	}
}