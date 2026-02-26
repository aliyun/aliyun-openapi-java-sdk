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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListAgentlessRegionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentlessRegionResponseUnmarshaller {

	public static ListAgentlessRegionResponse unmarshall(ListAgentlessRegionResponse listAgentlessRegionResponse, UnmarshallerContext _ctx) {
		
		listAgentlessRegionResponse.setRequestId(_ctx.stringValue("ListAgentlessRegionResponse.RequestId"));

		List<String> regionList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentlessRegionResponse.RegionList.Length"); i++) {
			regionList.add(_ctx.stringValue("ListAgentlessRegionResponse.RegionList["+ i +"]"));
		}
		listAgentlessRegionResponse.setRegionList(regionList);
	 
	 	return listAgentlessRegionResponse;
	}
}