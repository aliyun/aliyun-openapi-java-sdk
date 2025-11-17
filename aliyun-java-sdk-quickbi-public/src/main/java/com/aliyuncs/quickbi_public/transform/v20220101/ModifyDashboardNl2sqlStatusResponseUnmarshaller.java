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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.ModifyDashboardNl2sqlStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDashboardNl2sqlStatusResponseUnmarshaller {

	public static ModifyDashboardNl2sqlStatusResponse unmarshall(ModifyDashboardNl2sqlStatusResponse modifyDashboardNl2sqlStatusResponse, UnmarshallerContext _ctx) {
		
		modifyDashboardNl2sqlStatusResponse.setRequestId(_ctx.stringValue("ModifyDashboardNl2sqlStatusResponse.RequestId"));
		modifyDashboardNl2sqlStatusResponse.setSuccess(_ctx.booleanValue("ModifyDashboardNl2sqlStatusResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ModifyDashboardNl2sqlStatusResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("ModifyDashboardNl2sqlStatusResponse.Result["+ i +"]"));
		}
		modifyDashboardNl2sqlStatusResponse.setResult(result);
	 
	 	return modifyDashboardNl2sqlStatusResponse;
	}
}