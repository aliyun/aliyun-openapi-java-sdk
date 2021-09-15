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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.SetEnvironmentDefaultDomainResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.SetEnvironmentDefaultDomainResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetEnvironmentDefaultDomainResponseUnmarshaller {

	public static SetEnvironmentDefaultDomainResponse unmarshall(SetEnvironmentDefaultDomainResponse setEnvironmentDefaultDomainResponse, UnmarshallerContext _ctx) {
		
		setEnvironmentDefaultDomainResponse.setRequestId(_ctx.stringValue("SetEnvironmentDefaultDomainResponse.RequestId"));

		Data data = new Data();
		data.setDefaultMasterDomain(_ctx.stringValue("SetEnvironmentDefaultDomainResponse.Data.DefaultMasterDomain"));
		data.setStaticDomainApplied(_ctx.booleanValue("SetEnvironmentDefaultDomainResponse.Data.StaticDomainApplied"));
		data.setDefaultStaticDomain(_ctx.stringValue("SetEnvironmentDefaultDomainResponse.Data.DefaultStaticDomain"));
		data.setStaticDomain(_ctx.stringValue("SetEnvironmentDefaultDomainResponse.Data.StaticDomain"));
		data.setConfigChanged(_ctx.booleanValue("SetEnvironmentDefaultDomainResponse.Data.ConfigChanged"));
		data.setMasterDomain(_ctx.stringValue("SetEnvironmentDefaultDomainResponse.Data.MasterDomain"));
		data.setMasterDomainApplied(_ctx.booleanValue("SetEnvironmentDefaultDomainResponse.Data.MasterDomainApplied"));
		setEnvironmentDefaultDomainResponse.setData(data);
	 
	 	return setEnvironmentDefaultDomainResponse;
	}
}