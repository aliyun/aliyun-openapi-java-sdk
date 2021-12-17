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

package com.aliyuncs.nas.transform.v20170626;

import com.aliyuncs.nas.model.v20170626.DescribeSmbAclResponse;
import com.aliyuncs.nas.model.v20170626.DescribeSmbAclResponse.Acl;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmbAclResponseUnmarshaller {

	public static DescribeSmbAclResponse unmarshall(DescribeSmbAclResponse describeSmbAclResponse, UnmarshallerContext _ctx) {
		
		describeSmbAclResponse.setRequestId(_ctx.stringValue("DescribeSmbAclResponse.RequestId"));

		Acl acl = new Acl();
		acl.setAuthMethod(_ctx.stringValue("DescribeSmbAclResponse.Acl.AuthMethod"));
		acl.setEnableAnonymousAccess(_ctx.booleanValue("DescribeSmbAclResponse.Acl.EnableAnonymousAccess"));
		acl.setEnabled(_ctx.booleanValue("DescribeSmbAclResponse.Acl.Enabled"));
		acl.setEncryptData(_ctx.booleanValue("DescribeSmbAclResponse.Acl.EncryptData"));
		acl.setRejectUnencryptedAccess(_ctx.booleanValue("DescribeSmbAclResponse.Acl.RejectUnencryptedAccess"));
		acl.setSuperAdminSid(_ctx.stringValue("DescribeSmbAclResponse.Acl.SuperAdminSid"));
		acl.setHomeDirPath(_ctx.stringValue("DescribeSmbAclResponse.Acl.HomeDirPath"));
		describeSmbAclResponse.setAcl(acl);
	 
	 	return describeSmbAclResponse;
	}
}