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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.UpdateRobotv2KnowledgeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRobotv2KnowledgeResponseUnmarshaller {

	public static UpdateRobotv2KnowledgeResponse unmarshall(UpdateRobotv2KnowledgeResponse updateRobotv2KnowledgeResponse, UnmarshallerContext _ctx) {
		
		updateRobotv2KnowledgeResponse.setRequestId(_ctx.stringValue("UpdateRobotv2KnowledgeResponse.RequestId"));
		updateRobotv2KnowledgeResponse.setCode(_ctx.stringValue("UpdateRobotv2KnowledgeResponse.code"));
		updateRobotv2KnowledgeResponse.setData(_ctx.stringValue("UpdateRobotv2KnowledgeResponse.data"));
	 
	 	return updateRobotv2KnowledgeResponse;
	}
}