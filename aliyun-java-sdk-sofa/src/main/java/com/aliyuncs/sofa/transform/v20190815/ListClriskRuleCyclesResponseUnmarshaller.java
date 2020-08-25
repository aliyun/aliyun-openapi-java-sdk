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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListClriskRuleCyclesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClriskRuleCyclesResponseUnmarshaller {

	public static ListClriskRuleCyclesResponse unmarshall(ListClriskRuleCyclesResponse listClriskRuleCyclesResponse, UnmarshallerContext _ctx) {
		
		listClriskRuleCyclesResponse.setRequestId(_ctx.stringValue("ListClriskRuleCyclesResponse.RequestId"));
		listClriskRuleCyclesResponse.setResultCode(_ctx.stringValue("ListClriskRuleCyclesResponse.ResultCode"));
		listClriskRuleCyclesResponse.setResultMessage(_ctx.stringValue("ListClriskRuleCyclesResponse.ResultMessage"));

		List<String> cycles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListClriskRuleCyclesResponse.Cycles.Length"); i++) {
			cycles.add(_ctx.stringValue("ListClriskRuleCyclesResponse.Cycles["+ i +"]"));
		}
		listClriskRuleCyclesResponse.setCycles(cycles);
	 
	 	return listClriskRuleCyclesResponse;
	}
}