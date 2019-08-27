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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.GetSupportedOpsCommandResponse;
import com.aliyuncs.emr.model.v20160408.GetSupportedOpsCommandResponse.OpsCommandCategory;
import com.aliyuncs.emr.model.v20160408.GetSupportedOpsCommandResponse.OpsCommandCategory.OpsCommandInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupportedOpsCommandResponseUnmarshaller {

	public static GetSupportedOpsCommandResponse unmarshall(GetSupportedOpsCommandResponse getSupportedOpsCommandResponse, UnmarshallerContext _ctx) {
		
		getSupportedOpsCommandResponse.setRequestId(_ctx.stringValue("GetSupportedOpsCommandResponse.RequestId"));

		List<OpsCommandCategory> list = new ArrayList<OpsCommandCategory>();
		for (int i = 0; i < _ctx.lengthValue("GetSupportedOpsCommandResponse.List.Length"); i++) {
			OpsCommandCategory opsCommandCategory = new OpsCommandCategory();
			opsCommandCategory.setCategory(_ctx.stringValue("GetSupportedOpsCommandResponse.List["+ i +"].Category"));

			List<OpsCommandInfo> commandList = new ArrayList<OpsCommandInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetSupportedOpsCommandResponse.List["+ i +"].CommandList.Length"); j++) {
				OpsCommandInfo opsCommandInfo = new OpsCommandInfo();
				opsCommandInfo.setId(_ctx.stringValue("GetSupportedOpsCommandResponse.List["+ i +"].CommandList["+ j +"].Id"));
				opsCommandInfo.setName(_ctx.stringValue("GetSupportedOpsCommandResponse.List["+ i +"].CommandList["+ j +"].Name"));
				opsCommandInfo.setDiscription(_ctx.stringValue("GetSupportedOpsCommandResponse.List["+ i +"].CommandList["+ j +"].Discription"));
				opsCommandInfo.setTargetType(_ctx.stringValue("GetSupportedOpsCommandResponse.List["+ i +"].CommandList["+ j +"].TargetType"));
				opsCommandInfo.setParams(_ctx.stringValue("GetSupportedOpsCommandResponse.List["+ i +"].CommandList["+ j +"].Params"));

				commandList.add(opsCommandInfo);
			}
			opsCommandCategory.setCommandList(commandList);

			list.add(opsCommandCategory);
		}
		getSupportedOpsCommandResponse.setList(list);
	 
	 	return getSupportedOpsCommandResponse;
	}
}