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

import com.aliyuncs.hbr.model.v20170908.DescribeHanaBackupSettingResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaBackupSettingResponse.HanaBackupSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaBackupSettingResponseUnmarshaller {

	public static DescribeHanaBackupSettingResponse unmarshall(DescribeHanaBackupSettingResponse describeHanaBackupSettingResponse, UnmarshallerContext _ctx) {
		
		describeHanaBackupSettingResponse.setRequestId(_ctx.stringValue("DescribeHanaBackupSettingResponse.RequestId"));
		describeHanaBackupSettingResponse.setSuccess(_ctx.booleanValue("DescribeHanaBackupSettingResponse.Success"));
		describeHanaBackupSettingResponse.setCode(_ctx.stringValue("DescribeHanaBackupSettingResponse.Code"));
		describeHanaBackupSettingResponse.setMessage(_ctx.stringValue("DescribeHanaBackupSettingResponse.Message"));

		HanaBackupSetting hanaBackupSetting = new HanaBackupSetting();
		hanaBackupSetting.setDatabaseName(_ctx.stringValue("DescribeHanaBackupSettingResponse.HanaBackupSetting.DatabaseName"));
		hanaBackupSetting.setEnableAutoLogBackup(_ctx.booleanValue("DescribeHanaBackupSettingResponse.HanaBackupSetting.EnableAutoLogBackup"));
		hanaBackupSetting.setDataBackupParameterFile(_ctx.stringValue("DescribeHanaBackupSettingResponse.HanaBackupSetting.DataBackupParameterFile"));
		hanaBackupSetting.setLogBackupParameterFile(_ctx.stringValue("DescribeHanaBackupSettingResponse.HanaBackupSetting.LogBackupParameterFile"));
		hanaBackupSetting.setLogBackupUsingBackint(_ctx.booleanValue("DescribeHanaBackupSettingResponse.HanaBackupSetting.LogBackupUsingBackint"));
		hanaBackupSetting.setLogBackupTimeout(_ctx.longValue("DescribeHanaBackupSettingResponse.HanaBackupSetting.LogBackupTimeout"));
		hanaBackupSetting.setCatalogBackupUsingBackint(_ctx.booleanValue("DescribeHanaBackupSettingResponse.HanaBackupSetting.CatalogBackupUsingBackint"));
		hanaBackupSetting.setCatalogBackupParameterFile(_ctx.stringValue("DescribeHanaBackupSettingResponse.HanaBackupSetting.CatalogBackupParameterFile"));
		describeHanaBackupSettingResponse.setHanaBackupSetting(hanaBackupSetting);
	 
	 	return describeHanaBackupSettingResponse;
	}
}