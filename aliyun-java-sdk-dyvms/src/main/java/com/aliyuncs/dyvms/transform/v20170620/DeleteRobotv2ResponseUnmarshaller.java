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

import com.aliyuncs.dyvms.model.v20170620.DeleteRobotv2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRobotv2ResponseUnmarshaller {

	public static DeleteRobotv2Response unmarshall(DeleteRobotv2Response deleteRobotv2Response, UnmarshallerContext _ctx) {
		
		deleteRobotv2Response.setRequestId(_ctx.stringValue("DeleteRobotv2Response.RequestId"));
		deleteRobotv2Response.setCode(_ctx.stringValue("DeleteRobotv2Response.code"));
		deleteRobotv2Response.setData(_ctx.stringValue("DeleteRobotv2Response.data"));
	 
	 	return deleteRobotv2Response;
	}
}