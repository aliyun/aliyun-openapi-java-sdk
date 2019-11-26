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

import com.aliyuncs.dyvms.model.v20170620.CopyRobotv2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopyRobotv2ResponseUnmarshaller {

	public static CopyRobotv2Response unmarshall(CopyRobotv2Response copyRobotv2Response, UnmarshallerContext _ctx) {
		
		copyRobotv2Response.setRequestId(_ctx.stringValue("CopyRobotv2Response.RequestId"));
		copyRobotv2Response.setCode(_ctx.stringValue("CopyRobotv2Response.code"));
		copyRobotv2Response.setData(_ctx.stringValue("CopyRobotv2Response.data"));
	 
	 	return copyRobotv2Response;
	}
}