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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.DescribeHanaRetentionSettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaRetentionSettingResponseUnmarshaller {

	public static DescribeHanaRetentionSettingResponse unmarshall(DescribeHanaRetentionSettingResponse describeHanaRetentionSettingResponse, UnmarshallerContext _ctx) {
		
		describeHanaRetentionSettingResponse.setRequestId(_ctx.stringValue("DescribeHanaRetentionSettingResponse.RequestId"));
		describeHanaRetentionSettingResponse.setVaultId(_ctx.stringValue("DescribeHanaRetentionSettingResponse.VaultId"));
		describeHanaRetentionSettingResponse.setSchedule(_ctx.stringValue("DescribeHanaRetentionSettingResponse.Schedule"));
		describeHanaRetentionSettingResponse.setSuccess(_ctx.booleanValue("DescribeHanaRetentionSettingResponse.Success"));
		describeHanaRetentionSettingResponse.setDatabaseName(_ctx.stringValue("DescribeHanaRetentionSettingResponse.DatabaseName"));
		describeHanaRetentionSettingResponse.setLastExecuteTime(_ctx.longValue("DescribeHanaRetentionSettingResponse.LastExecuteTime"));
		describeHanaRetentionSettingResponse.setDisabled(_ctx.booleanValue("DescribeHanaRetentionSettingResponse.Disabled"));
		describeHanaRetentionSettingResponse.setCode(_ctx.stringValue("DescribeHanaRetentionSettingResponse.Code"));
		describeHanaRetentionSettingResponse.setRetentionDays(_ctx.longValue("DescribeHanaRetentionSettingResponse.RetentionDays"));
		describeHanaRetentionSettingResponse.setMessage(_ctx.stringValue("DescribeHanaRetentionSettingResponse.Message"));
		describeHanaRetentionSettingResponse.setClusterId(_ctx.stringValue("DescribeHanaRetentionSettingResponse.ClusterId"));
	 
	 	return describeHanaRetentionSettingResponse;
	}
}