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

import com.aliyuncs.eflo.model.v20220530.UpdateVpdResponse;
import com.aliyuncs.eflo.model.v20220530.UpdateVpdResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateVpdResponseUnmarshaller {

	public static UpdateVpdResponse unmarshall(UpdateVpdResponse updateVpdResponse, UnmarshallerContext _ctx) {
		
		updateVpdResponse.setRequestId(_ctx.stringValue("UpdateVpdResponse.RequestId"));
		updateVpdResponse.setCode(_ctx.integerValue("UpdateVpdResponse.Code"));
		updateVpdResponse.setMessage(_ctx.stringValue("UpdateVpdResponse.Message"));

		Content content = new Content();
		content.setVpdId(_ctx.stringValue("UpdateVpdResponse.Content.VpdId"));
		updateVpdResponse.setContent(content);
	 
	 	return updateVpdResponse;
	}
}