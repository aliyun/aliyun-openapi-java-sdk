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

package com.aliyuncs.mopen.transform.v20180211;

import com.aliyuncs.mopen.model.v20180211.MopenCreateGroupResponse;
import com.aliyuncs.mopen.model.v20180211.MopenCreateGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class MopenCreateGroupResponseUnmarshaller {

	public static MopenCreateGroupResponse unmarshall(MopenCreateGroupResponse mopenCreateGroupResponse, UnmarshallerContext context) {
		
		mopenCreateGroupResponse.setCode(context.integerValue("MopenCreateGroupResponse.Code"));
		mopenCreateGroupResponse.setSuccess(context.stringValue("MopenCreateGroupResponse.Success"));
		mopenCreateGroupResponse.setDescription(context.stringValue("MopenCreateGroupResponse.Description"));
		mopenCreateGroupResponse.setMessage(context.stringValue("MopenCreateGroupResponse.Message"));
		mopenCreateGroupResponse.setResqusetId(context.stringValue("MopenCreateGroupResponse.ResqusetId"));

		Data data = new Data();
		data.setGroupId(context.stringValue("MopenCreateGroupResponse.Data.GroupId"));
		mopenCreateGroupResponse.setData(data);
	 
	 	return mopenCreateGroupResponse;
	}
}