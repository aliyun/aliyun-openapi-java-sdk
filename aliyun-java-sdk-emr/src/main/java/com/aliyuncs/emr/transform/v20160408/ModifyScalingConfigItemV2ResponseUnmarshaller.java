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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.ModifyScalingConfigItemV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyScalingConfigItemV2ResponseUnmarshaller {

	public static ModifyScalingConfigItemV2Response unmarshall(ModifyScalingConfigItemV2Response modifyScalingConfigItemV2Response, UnmarshallerContext _ctx) {
		
		modifyScalingConfigItemV2Response.setRequestId(_ctx.stringValue("ModifyScalingConfigItemV2Response.RequestId"));
		modifyScalingConfigItemV2Response.setData(_ctx.booleanValue("ModifyScalingConfigItemV2Response.Data"));
	 
	 	return modifyScalingConfigItemV2Response;
	}
}