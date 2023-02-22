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

import com.aliyuncs.sas.model.v20181203.GetClientUserDefineRuleResponse;
import com.aliyuncs.sas.model.v20181203.GetClientUserDefineRuleResponse.UserDefineRuleDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClientUserDefineRuleResponseUnmarshaller {

	public static GetClientUserDefineRuleResponse unmarshall(GetClientUserDefineRuleResponse getClientUserDefineRuleResponse, UnmarshallerContext _ctx) {
		
		getClientUserDefineRuleResponse.setRequestId(_ctx.stringValue("GetClientUserDefineRuleResponse.RequestId"));

		UserDefineRuleDetail userDefineRuleDetail = new UserDefineRuleDetail();
		userDefineRuleDetail.setType(_ctx.integerValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.Type"));
		userDefineRuleDetail.setActionType(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.ActionType"));
		userDefineRuleDetail.setGmtCreate(_ctx.longValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.GmtCreate"));
		userDefineRuleDetail.setMd5List(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.Md5List"));
		userDefineRuleDetail.setGmtModified(_ctx.longValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.GmtModified"));
		userDefineRuleDetail.setName(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.Name"));
		userDefineRuleDetail.setId(_ctx.longValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.Id"));
		userDefineRuleDetail.setProcPath(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.ProcPath"));
		userDefineRuleDetail.setCmdline(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.Cmdline"));
		userDefineRuleDetail.setPlatform(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.Platform"));
		userDefineRuleDetail.setIP(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.IP"));
		userDefineRuleDetail.setPort(_ctx.integerValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.Port"));
		userDefineRuleDetail.setFilePath(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.FilePath"));
		userDefineRuleDetail.setNewFilePath(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.NewFilePath"));
		userDefineRuleDetail.setRegistryKey(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.RegistryKey"));
		userDefineRuleDetail.setRegistryContent(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.RegistryContent"));
		userDefineRuleDetail.setParentProcPath(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.ParentProcPath"));
		userDefineRuleDetail.setParentCmdline(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.ParentCmdline"));
		userDefineRuleDetail.setPortStr(_ctx.stringValue("GetClientUserDefineRuleResponse.UserDefineRuleDetail.PortStr"));
		getClientUserDefineRuleResponse.setUserDefineRuleDetail(userDefineRuleDetail);
	 
	 	return getClientUserDefineRuleResponse;
	}
}