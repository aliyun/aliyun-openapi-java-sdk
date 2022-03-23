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

package com.aliyuncs.copyright.transform.v20190123;

import com.aliyuncs.copyright.model.v20190123.GetUpgradeWorkResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUpgradeWorkResponseUnmarshaller {

	public static GetUpgradeWorkResponse unmarshall(GetUpgradeWorkResponse getUpgradeWorkResponse, UnmarshallerContext _ctx) {
		
		getUpgradeWorkResponse.setRequestId(_ctx.stringValue("GetUpgradeWorkResponse.RequestId"));
		getUpgradeWorkResponse.setModifiedTime(_ctx.longValue("GetUpgradeWorkResponse.ModifiedTime"));
		getUpgradeWorkResponse.setNewSku(_ctx.stringValue("GetUpgradeWorkResponse.NewSku"));
		getUpgradeWorkResponse.setSuccess(_ctx.booleanValue("GetUpgradeWorkResponse.Success"));
		getUpgradeWorkResponse.setCreateTime(_ctx.longValue("GetUpgradeWorkResponse.CreateTime"));
		getUpgradeWorkResponse.setWorkId(_ctx.longValue("GetUpgradeWorkResponse.WorkId"));
		getUpgradeWorkResponse.setOldSku(_ctx.stringValue("GetUpgradeWorkResponse.OldSku"));
		getUpgradeWorkResponse.setWorkStatus(_ctx.integerValue("GetUpgradeWorkResponse.WorkStatus"));
		getUpgradeWorkResponse.setReason(_ctx.stringValue("GetUpgradeWorkResponse.Reason"));
	 
	 	return getUpgradeWorkResponse;
	}
}