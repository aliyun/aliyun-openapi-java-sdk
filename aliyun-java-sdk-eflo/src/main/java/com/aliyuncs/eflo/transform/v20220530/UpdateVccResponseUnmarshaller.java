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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.UpdateVccResponse;
import com.aliyuncs.eflo.model.v20220530.UpdateVccResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateVccResponseUnmarshaller {

	public static UpdateVccResponse unmarshall(UpdateVccResponse updateVccResponse, UnmarshallerContext _ctx) {
		
		updateVccResponse.setRequestId(_ctx.stringValue("UpdateVccResponse.RequestId"));
		updateVccResponse.setCode(_ctx.integerValue("UpdateVccResponse.Code"));
		updateVccResponse.setMessage(_ctx.stringValue("UpdateVccResponse.Message"));

		Content content = new Content();
		content.setVccId(_ctx.stringValue("UpdateVccResponse.Content.VccId"));
		updateVccResponse.setContent(content);
	 
	 	return updateVccResponse;
	}
}