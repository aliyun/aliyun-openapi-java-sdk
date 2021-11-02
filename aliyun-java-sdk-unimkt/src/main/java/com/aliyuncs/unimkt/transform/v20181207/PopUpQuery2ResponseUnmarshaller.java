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

package com.aliyuncs.unimkt.transform.v20181207;

import com.aliyuncs.unimkt.model.v20181207.PopUpQuery2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class PopUpQuery2ResponseUnmarshaller {

	public static PopUpQuery2Response unmarshall(PopUpQuery2Response popUpQuery2Response, UnmarshallerContext _ctx) {
		
		popUpQuery2Response.setRequestId(_ctx.stringValue("PopUpQuery2Response.RequestId"));
		popUpQuery2Response.setStatus(_ctx.booleanValue("PopUpQuery2Response.Status"));
		popUpQuery2Response.setMsg(_ctx.stringValue("PopUpQuery2Response.Msg"));
		popUpQuery2Response.setErrorCode(_ctx.stringValue("PopUpQuery2Response.ErrorCode"));
		popUpQuery2Response.setUrl(_ctx.stringValue("PopUpQuery2Response.Url"));
	 
	 	return popUpQuery2Response;
	}
}