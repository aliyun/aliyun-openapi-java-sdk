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

package com.aliyuncs.eds_aic.transform.v20230930;

import com.aliyuncs.eds_aic.model.v20230930.UpdateCustomImageNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCustomImageNameResponseUnmarshaller {

	public static UpdateCustomImageNameResponse unmarshall(UpdateCustomImageNameResponse updateCustomImageNameResponse, UnmarshallerContext _ctx) {
		
		updateCustomImageNameResponse.setRequestId(_ctx.stringValue("UpdateCustomImageNameResponse.RequestId"));
		updateCustomImageNameResponse.setData(_ctx.booleanValue("UpdateCustomImageNameResponse.Data"));
	 
	 	return updateCustomImageNameResponse;
	}
}