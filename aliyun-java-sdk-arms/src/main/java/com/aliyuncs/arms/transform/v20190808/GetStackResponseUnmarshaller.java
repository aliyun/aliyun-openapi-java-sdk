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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetStackResponse;
import com.aliyuncs.arms.model.v20190808.GetStackResponse.StackInfoItem;
import com.aliyuncs.arms.model.v20190808.GetStackResponse.StackInfoItem.ExtInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStackResponseUnmarshaller {

	public static GetStackResponse unmarshall(GetStackResponse getStackResponse, UnmarshallerContext _ctx) {
		
		getStackResponse.setRequestId(_ctx.stringValue("GetStackResponse.RequestId"));

		List<StackInfoItem> stackInfo = new ArrayList<StackInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("GetStackResponse.StackInfo.Length"); i++) {
			StackInfoItem stackInfoItem = new StackInfoItem();
			stackInfoItem.setStartTime(_ctx.longValue("GetStackResponse.StackInfo["+ i +"].StartTime"));
			stackInfoItem.setDuration(_ctx.longValue("GetStackResponse.StackInfo["+ i +"].Duration"));
			stackInfoItem.setRpcId(_ctx.stringValue("GetStackResponse.StackInfo["+ i +"].RpcId"));
			stackInfoItem.setServiceName(_ctx.stringValue("GetStackResponse.StackInfo["+ i +"].ServiceName"));
			stackInfoItem.setApi(_ctx.stringValue("GetStackResponse.StackInfo["+ i +"].Api"));
			stackInfoItem.setException(_ctx.stringValue("GetStackResponse.StackInfo["+ i +"].Exception"));
			stackInfoItem.setLine(_ctx.stringValue("GetStackResponse.StackInfo["+ i +"].Line"));

			ExtInfo extInfo = new ExtInfo();
			extInfo.setType(_ctx.stringValue("GetStackResponse.StackInfo["+ i +"].ExtInfo.Type"));
			extInfo.setInfo(_ctx.stringValue("GetStackResponse.StackInfo["+ i +"].ExtInfo.Info"));
			stackInfoItem.setExtInfo(extInfo);

			stackInfo.add(stackInfoItem);
		}
		getStackResponse.setStackInfo(stackInfo);
	 
	 	return getStackResponse;
	}
}