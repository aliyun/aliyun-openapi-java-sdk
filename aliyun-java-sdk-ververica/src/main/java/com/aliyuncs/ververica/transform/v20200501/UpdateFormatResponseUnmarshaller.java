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

package com.aliyuncs.ververica.transform.v20200501;

import com.aliyuncs.ververica.model.v20200501.UpdateFormatResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFormatResponseUnmarshaller {

	public static UpdateFormatResponse unmarshall(UpdateFormatResponse updateFormatResponse, UnmarshallerContext _ctx) {
		
		updateFormatResponse.setSuccess(_ctx.booleanValue("UpdateFormatResponse.success"));
		updateFormatResponse.setData(_ctx.stringValue("UpdateFormatResponse.data"));
		updateFormatResponse.setRequestId(_ctx.stringValue("UpdateFormatResponse.requestId"));
	 
	 	return updateFormatResponse;
	}
}