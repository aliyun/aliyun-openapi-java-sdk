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

package com.aliyuncs.csb.transform.v20171118;

import com.aliyuncs.csb.model.v20171118.GetInstanceResponse;
import com.aliyuncs.csb.model.v20171118.GetInstanceResponse.Data;
import com.aliyuncs.csb.model.v20171118.GetInstanceResponse.Data.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));
		getInstanceResponse.setCode(_ctx.integerValue("GetInstanceResponse.Code"));
		getInstanceResponse.setMessage(_ctx.stringValue("GetInstanceResponse.Message"));

		Data data = new Data();

		Instance instance = new Instance();
		instance.setApprLevel(_ctx.integerValue("GetInstanceResponse.Data.Instance.ApprLevel"));
		instance.setApprUser1(_ctx.stringValue("GetInstanceResponse.Data.Instance.ApprUser1"));
		instance.setApprUser2(_ctx.stringValue("GetInstanceResponse.Data.Instance.ApprUser2"));
		instance.setBrokerVpcId(_ctx.stringValue("GetInstanceResponse.Data.Instance.BrokerVpcId"));
		instance.setBrokerVpcName(_ctx.stringValue("GetInstanceResponse.Data.Instance.BrokerVpcName"));
		instance.setClientVpcId(_ctx.stringValue("GetInstanceResponse.Data.Instance.ClientVpcId"));
		instance.setClientVpcName(_ctx.stringValue("GetInstanceResponse.Data.Instance.ClientVpcName"));
		instance.setClusterMembers(_ctx.integerValue("GetInstanceResponse.Data.Instance.ClusterMembers"));
		instance.setCredentialGroup(_ctx.longValue("GetInstanceResponse.Data.Instance.CredentialGroup"));
		instance.setCsbAccountId(_ctx.stringValue("GetInstanceResponse.Data.Instance.CsbAccountId"));
		instance.setCsbId(_ctx.longValue("GetInstanceResponse.Data.Instance.CsbId"));
		instance.setDbStatus(_ctx.integerValue("GetInstanceResponse.Data.Instance.DbStatus"));
		instance.setDescription(_ctx.stringValue("GetInstanceResponse.Data.Instance.Description"));
		instance.setFrontStatus(_ctx.stringValue("GetInstanceResponse.Data.Instance.FrontStatus"));
		instance.setGmtCreate(_ctx.longValue("GetInstanceResponse.Data.Instance.GmtCreate"));
		instance.setGmtModified(_ctx.longValue("GetInstanceResponse.Data.Instance.GmtModified"));
		instance.setId(_ctx.longValue("GetInstanceResponse.Data.Instance.Id"));
		instance.setInstanceCategory(_ctx.integerValue("GetInstanceResponse.Data.Instance.InstanceCategory"));
		instance.setInstanceType(_ctx.integerValue("GetInstanceResponse.Data.Instance.InstanceType"));
		instance.setIpList(_ctx.stringValue("GetInstanceResponse.Data.Instance.IpList"));
		instance.setIsImported(_ctx.booleanValue("GetInstanceResponse.Data.Instance.IsImported"));
		instance.setIsPublic(_ctx.booleanValue("GetInstanceResponse.Data.Instance.IsPublic"));
		instance.setName(_ctx.stringValue("GetInstanceResponse.Data.Instance.Name"));
		instance.setOwnerId(_ctx.stringValue("GetInstanceResponse.Data.Instance.OwnerId"));
		instance.setSentinelCtlStr(_ctx.stringValue("GetInstanceResponse.Data.Instance.SentinelCtlStr"));
		instance.setSentinelCtrl(_ctx.longValue("GetInstanceResponse.Data.Instance.SentinelCtrl"));
		instance.setSentinelGridInterval(_ctx.integerValue("GetInstanceResponse.Data.Instance.SentinelGridInterval"));
		instance.setSentinelQps(_ctx.longValue("GetInstanceResponse.Data.Instance.SentinelQps"));
		instance.setStatus(_ctx.stringValue("GetInstanceResponse.Data.Instance.Status"));
		instance.setStatusCode(_ctx.integerValue("GetInstanceResponse.Data.Instance.StatusCode"));
		instance.setTenantId(_ctx.stringValue("GetInstanceResponse.Data.Instance.TenantId"));
		instance.setTestable(_ctx.booleanValue("GetInstanceResponse.Data.Instance.Testable"));
		instance.setUserId(_ctx.stringValue("GetInstanceResponse.Data.Instance.UserId"));
		instance.setVisible(_ctx.booleanValue("GetInstanceResponse.Data.Instance.Visible"));
		instance.setVpcName(_ctx.stringValue("GetInstanceResponse.Data.Instance.VpcName"));
		data.setInstance(instance);
		getInstanceResponse.setData(data);
	 
	 	return getInstanceResponse;
	}
}