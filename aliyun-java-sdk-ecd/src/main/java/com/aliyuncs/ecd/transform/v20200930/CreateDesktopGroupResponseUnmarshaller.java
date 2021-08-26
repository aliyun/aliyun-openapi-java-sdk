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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.CreateDesktopGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDesktopGroupResponseUnmarshaller {

	public static CreateDesktopGroupResponse unmarshall(CreateDesktopGroupResponse createDesktopGroupResponse, UnmarshallerContext _ctx) {
		
		createDesktopGroupResponse.setRequestId(_ctx.stringValue("CreateDesktopGroupResponse.RequestId"));
		createDesktopGroupResponse.setDesktopGroupId(_ctx.stringValue("CreateDesktopGroupResponse.DesktopGroupId"));

		List<String> orderIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateDesktopGroupResponse.OrderIds.Length"); i++) {
			orderIds.add(_ctx.stringValue("CreateDesktopGroupResponse.OrderIds["+ i +"]"));
		}
		createDesktopGroupResponse.setOrderIds(orderIds);
	 
	 	return createDesktopGroupResponse;
	}
}