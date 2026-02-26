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

package com.aliyuncs.btripopen.transform.v20220517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.btripopen.model.v20220517.ScanMsgListResponse;
import com.aliyuncs.btripopen.model.v20220517.ScanMsgListResponse.ModuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScanMsgListResponseUnmarshaller {

	public static ScanMsgListResponse unmarshall(ScanMsgListResponse scanMsgListResponse, UnmarshallerContext _ctx) {
		
		scanMsgListResponse.setRequestId(_ctx.stringValue("ScanMsgListResponse.RequestId"));
		scanMsgListResponse.setSuccess(_ctx.booleanValue("ScanMsgListResponse.Success"));
		scanMsgListResponse.setCode(_ctx.integerValue("ScanMsgListResponse.Code"));
		scanMsgListResponse.setMsg(_ctx.stringValue("ScanMsgListResponse.Msg"));
		scanMsgListResponse.setExtMsg(_ctx.stringValue("ScanMsgListResponse.ExtMsg"));

		List<ModuleItem> module = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("ScanMsgListResponse.Module.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setSequenceId(_ctx.longValue("ScanMsgListResponse.Module["+ i +"].SequenceId"));
			moduleItem.setBiz(_ctx.stringValue("ScanMsgListResponse.Module["+ i +"].Biz"));
			moduleItem.setContent(_ctx.stringValue("ScanMsgListResponse.Module["+ i +"].Content"));
			moduleItem.setSendTime(_ctx.stringValue("ScanMsgListResponse.Module["+ i +"].SendTime"));
			moduleItem.setHaveRedDot(_ctx.booleanValue("ScanMsgListResponse.Module["+ i +"].HaveRedDot"));
			moduleItem.setUnReadCount(_ctx.integerValue("ScanMsgListResponse.Module["+ i +"].UnReadCount"));
			moduleItem.setShowMsg(_ctx.booleanValue("ScanMsgListResponse.Module["+ i +"].ShowMsg"));

			module.add(moduleItem);
		}
		scanMsgListResponse.setModule(module);
	 
	 	return scanMsgListResponse;
	}
}