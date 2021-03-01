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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetInstanceResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetInstanceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));
		getInstanceResponse.setErrorCode(_ctx.stringValue("GetInstanceResponse.ErrorCode"));
		getInstanceResponse.setErrorMessage(_ctx.stringValue("GetInstanceResponse.ErrorMessage"));
		getInstanceResponse.setSuccess(_ctx.booleanValue("GetInstanceResponse.Success"));

		Instance instance = new Instance();
		instance.setInstanceSource(_ctx.stringValue("GetInstanceResponse.Instance.InstanceSource"));
		instance.setInstanceId(_ctx.stringValue("GetInstanceResponse.Instance.InstanceId"));
		instance.setDatabasePassword(_ctx.stringValue("GetInstanceResponse.Instance.DatabasePassword"));
		instance.setPort(_ctx.integerValue("GetInstanceResponse.Instance.Port"));
		instance.setHost(_ctx.stringValue("GetInstanceResponse.Instance.Host"));
		instance.setExportTimeout(_ctx.integerValue("GetInstanceResponse.Instance.ExportTimeout"));
		instance.setDdlOnline(_ctx.integerValue("GetInstanceResponse.Instance.DdlOnline"));
		instance.setEnvType(_ctx.stringValue("GetInstanceResponse.Instance.EnvType"));
		instance.setSid(_ctx.stringValue("GetInstanceResponse.Instance.Sid"));
		instance.setUseDsql(_ctx.integerValue("GetInstanceResponse.Instance.UseDsql"));
		instance.setEcsInstanceId(_ctx.stringValue("GetInstanceResponse.Instance.EcsInstanceId"));
		instance.setDbaId(_ctx.stringValue("GetInstanceResponse.Instance.DbaId"));
		instance.setVpcId(_ctx.stringValue("GetInstanceResponse.Instance.VpcId"));
		instance.setEcsRegion(_ctx.stringValue("GetInstanceResponse.Instance.EcsRegion"));
		instance.setInstanceAlias(_ctx.stringValue("GetInstanceResponse.Instance.InstanceAlias"));
		instance.setState(_ctx.stringValue("GetInstanceResponse.Instance.State"));
		instance.setDatabaseUser(_ctx.stringValue("GetInstanceResponse.Instance.DatabaseUser"));
		instance.setInstanceType(_ctx.stringValue("GetInstanceResponse.Instance.InstanceType"));
		instance.setDbaNickName(_ctx.stringValue("GetInstanceResponse.Instance.DbaNickName"));
		instance.setDataLinkName(_ctx.stringValue("GetInstanceResponse.Instance.DataLinkName"));
		instance.setQueryTimeout(_ctx.integerValue("GetInstanceResponse.Instance.QueryTimeout"));
		instance.setSafeRuleId(_ctx.stringValue("GetInstanceResponse.Instance.SafeRuleId"));

		List<String> ownerNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Instance.OwnerNameList.Length"); i++) {
			ownerNameList.add(_ctx.stringValue("GetInstanceResponse.Instance.OwnerNameList["+ i +"]"));
		}
		instance.setOwnerNameList(ownerNameList);

		List<String> ownerIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Instance.OwnerIdList.Length"); i++) {
			ownerIdList.add(_ctx.stringValue("GetInstanceResponse.Instance.OwnerIdList["+ i +"]"));
		}
		instance.setOwnerIdList(ownerIdList);
		getInstanceResponse.setInstance(instance);
	 
	 	return getInstanceResponse;
	}
}