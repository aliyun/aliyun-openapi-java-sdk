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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DeleteMaskingRulesResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMaskingRulesResponseUnmarshaller {

	public static DeleteMaskingRulesResponse unmarshall(DeleteMaskingRulesResponse deleteMaskingRulesResponse, UnmarshallerContext _ctx) {
		
		deleteMaskingRulesResponse.setRequestId(_ctx.stringValue("DeleteMaskingRulesResponse.RequestId"));
		deleteMaskingRulesResponse.setData(_ctx.mapValue("DeleteMaskingRulesResponse.Data"));
		deleteMaskingRulesResponse.setMessage(_ctx.stringValue("DeleteMaskingRulesResponse.Message"));
		deleteMaskingRulesResponse.setSuccess(_ctx.stringValue("DeleteMaskingRulesResponse.Success"));
	 
	 	return deleteMaskingRulesResponse;
	}
}