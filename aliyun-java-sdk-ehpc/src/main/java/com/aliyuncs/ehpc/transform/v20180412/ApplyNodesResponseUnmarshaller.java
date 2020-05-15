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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ApplyNodesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyNodesResponseUnmarshaller {

	public static ApplyNodesResponse unmarshall(ApplyNodesResponse applyNodesResponse, UnmarshallerContext _ctx) {
		
		applyNodesResponse.setRequestId(_ctx.stringValue("ApplyNodesResponse.RequestId"));
		applyNodesResponse.setDetail(_ctx.stringValue("ApplyNodesResponse.Detail"));

		List<String> instanceIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ApplyNodesResponse.InstanceIds.Length"); i++) {
			instanceIds.add(_ctx.stringValue("ApplyNodesResponse.InstanceIds["+ i +"]"));
		}
		applyNodesResponse.setInstanceIds(instanceIds);
	 
	 	return applyNodesResponse;
	}
}