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

package com.aliyuncs.pairecservice.transform.v20221213;

import com.aliyuncs.pairecservice.model.v20221213.GetInstanceResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResourceResponseUnmarshaller {

	public static GetInstanceResourceResponse unmarshall(GetInstanceResourceResponse getInstanceResourceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResourceResponse.setRequestId(_ctx.stringValue("GetInstanceResourceResponse.RequestId"));
		getInstanceResourceResponse.setResourceId(_ctx.stringValue("GetInstanceResourceResponse.ResourceId"));
		getInstanceResourceResponse.setCategory(_ctx.stringValue("GetInstanceResourceResponse.Category"));
		getInstanceResourceResponse.setGroup(_ctx.stringValue("GetInstanceResourceResponse.Group"));
		getInstanceResourceResponse.setType(_ctx.stringValue("GetInstanceResourceResponse.Type"));
		getInstanceResourceResponse.setUri(_ctx.stringValue("GetInstanceResourceResponse.Uri"));
		getInstanceResourceResponse.setConfig(_ctx.stringValue("GetInstanceResourceResponse.Config"));
		getInstanceResourceResponse.setGmtCreateTime(_ctx.stringValue("GetInstanceResourceResponse.GmtCreateTime"));
		getInstanceResourceResponse.setGmtModifiedTime(_ctx.stringValue("GetInstanceResourceResponse.GmtModifiedTime"));
	 
	 	return getInstanceResourceResponse;
	}
}