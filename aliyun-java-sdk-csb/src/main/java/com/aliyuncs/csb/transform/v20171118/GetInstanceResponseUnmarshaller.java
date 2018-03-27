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

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext context) {
		
		getInstanceResponse.setRequestId(context.stringValue("GetInstanceResponse.RequestId"));
		getInstanceResponse.setCode(context.integerValue("GetInstanceResponse.Code"));
		getInstanceResponse.setMessage(context.stringValue("GetInstanceResponse.Message"));

		Data data = new Data();

		Instance instance = new Instance();
		instance.setApprLevel(context.integerValue("GetInstanceResponse.Data.Instance.ApprLevel"));
		instance.setApprUser1(context.stringValue("GetInstanceResponse.Data.Instance.ApprUser1"));
		instance.setApprUser2(context.stringValue("GetInstanceResponse.Data.Instance.ApprUser2"));
		instance.setBrokerVpcId(context.stringValue("GetInstanceResponse.Data.Instance.BrokerVpcId"));
		instance.setBrokerVpcName(context.stringValue("GetInstanceResponse.Data.Instance.BrokerVpcName"));
		instance.setClientVpcId(context.stringValue("GetInstanceResponse.Data.Instance.ClientVpcId"));
		instance.setClientVpcName(context.stringValue("GetInstanceResponse.Data.Instance.ClientVpcName"));
		instance.setClusterMembers(context.integerValue("GetInstanceResponse.Data.Instance.ClusterMembers"));
		instance.setCredentialGroup(context.longValue("GetInstanceResponse.Data.Instance.CredentialGroup"));
		instance.setCsbAccountId(context.stringValue("GetInstanceResponse.Data.Instance.CsbAccountId"));
		instance.setCsbId(context.longValue("GetInstanceResponse.Data.Instance.CsbId"));
		instance.setDbStatus(context.integerValue("GetInstanceResponse.Data.Instance.DbStatus"));
		instance.setDescription(context.stringValue("GetInstanceResponse.Data.Instance.Description"));
		instance.setFrontStatus(context.stringValue("GetInstanceResponse.Data.Instance.FrontStatus"));
		instance.setGmtCreate(context.longValue("GetInstanceResponse.Data.Instance.GmtCreate"));
		instance.setGmtModified(context.longValue("GetInstanceResponse.Data.Instance.GmtModified"));
		instance.setId(context.longValue("GetInstanceResponse.Data.Instance.Id"));
		instance.setInstanceCategory(context.integerValue("GetInstanceResponse.Data.Instance.InstanceCategory"));
		instance.setInstanceType(context.integerValue("GetInstanceResponse.Data.Instance.InstanceType"));
		instance.setIpList(context.stringValue("GetInstanceResponse.Data.Instance.IpList"));
		instance.setIsImported(context.booleanValue("GetInstanceResponse.Data.Instance.IsImported"));
		instance.setIsPublic(context.booleanValue("GetInstanceResponse.Data.Instance.IsPublic"));
		instance.setName(context.stringValue("GetInstanceResponse.Data.Instance.Name"));
		instance.setOwnerId(context.stringValue("GetInstanceResponse.Data.Instance.OwnerId"));
		instance.setSentinelCtlStr(context.stringValue("GetInstanceResponse.Data.Instance.SentinelCtlStr"));
		instance.setSentinelCtrl(context.longValue("GetInstanceResponse.Data.Instance.SentinelCtrl"));
		instance.setSentinelGridInterval(context.integerValue("GetInstanceResponse.Data.Instance.SentinelGridInterval"));
		instance.setSentinelQps(context.longValue("GetInstanceResponse.Data.Instance.SentinelQps"));
		instance.setStatus(context.stringValue("GetInstanceResponse.Data.Instance.Status"));
		instance.setStatusCode(context.integerValue("GetInstanceResponse.Data.Instance.StatusCode"));
		instance.setTenantId(context.stringValue("GetInstanceResponse.Data.Instance.TenantId"));
		instance.setTestable(context.booleanValue("GetInstanceResponse.Data.Instance.Testable"));
		instance.setUserId(context.stringValue("GetInstanceResponse.Data.Instance.UserId"));
		instance.setVisible(context.booleanValue("GetInstanceResponse.Data.Instance.Visible"));
		instance.setVpcName(context.stringValue("GetInstanceResponse.Data.Instance.VpcName"));
		data.setInstance(instance);
		getInstanceResponse.setData(data);
	 
	 	return getInstanceResponse;
	}
}