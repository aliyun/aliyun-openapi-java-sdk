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

package com.aliyuncs.nas.transform.v20170626;

import com.aliyuncs.nas.model.v20170626.GetRecycleBinAttributeResponse;
import com.aliyuncs.nas.model.v20170626.GetRecycleBinAttributeResponse.RecycleBinAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRecycleBinAttributeResponseUnmarshaller {

	public static GetRecycleBinAttributeResponse unmarshall(GetRecycleBinAttributeResponse getRecycleBinAttributeResponse, UnmarshallerContext _ctx) {
		
		getRecycleBinAttributeResponse.setRequestId(_ctx.stringValue("GetRecycleBinAttributeResponse.RequestId"));

		RecycleBinAttribute recycleBinAttribute = new RecycleBinAttribute();
		recycleBinAttribute.setSize(_ctx.longValue("GetRecycleBinAttributeResponse.RecycleBinAttribute.Size"));
		recycleBinAttribute.setStatus(_ctx.stringValue("GetRecycleBinAttributeResponse.RecycleBinAttribute.Status"));
		recycleBinAttribute.setReservedDays(_ctx.longValue("GetRecycleBinAttributeResponse.RecycleBinAttribute.ReservedDays"));
		recycleBinAttribute.setEnableTime(_ctx.stringValue("GetRecycleBinAttributeResponse.RecycleBinAttribute.EnableTime"));
		getRecycleBinAttributeResponse.setRecycleBinAttribute(recycleBinAttribute);
	 
	 	return getRecycleBinAttributeResponse;
	}
}